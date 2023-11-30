/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.controller;

import com.unsis.controller.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.unsis.models.entity.Employee;
import com.unsis.models.entity.Access;
import com.unsis.models.entity.Account;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author labtecweb10
 */
public class AccountJpaController implements Serializable {

    public AccountJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Account account) {
        if (account.getAccessCollection() == null) {
            account.setAccessCollection(new ArrayList<Access>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Employee idempleado = account.getIdempleado();
            if (idempleado != null) {
                idempleado = em.getReference(idempleado.getClass(), idempleado.getId());
                account.setIdempleado(idempleado);
            }
            Collection<Access> attachedAccessCollection = new ArrayList<Access>();
            for (Access accessCollectionAccessToAttach : account.getAccessCollection()) {
                accessCollectionAccessToAttach = em.getReference(accessCollectionAccessToAttach.getClass(), accessCollectionAccessToAttach.getId());
                attachedAccessCollection.add(accessCollectionAccessToAttach);
            }
            account.setAccessCollection(attachedAccessCollection);
            em.persist(account);
            if (idempleado != null) {
                idempleado.getAccountCollection().add(account);
                idempleado = em.merge(idempleado);
            }
            for (Access accessCollectionAccess : account.getAccessCollection()) {
                Account oldIdcuentaOfAccessCollectionAccess = accessCollectionAccess.getIdcuenta();
                accessCollectionAccess.setIdcuenta(account);
                accessCollectionAccess = em.merge(accessCollectionAccess);
                if (oldIdcuentaOfAccessCollectionAccess != null) {
                    oldIdcuentaOfAccessCollectionAccess.getAccessCollection().remove(accessCollectionAccess);
                    oldIdcuentaOfAccessCollectionAccess = em.merge(oldIdcuentaOfAccessCollectionAccess);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Account account) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Account persistentAccount = em.find(Account.class, account.getId());
            Employee idempleadoOld = persistentAccount.getIdempleado();
            Employee idempleadoNew = account.getIdempleado();
            Collection<Access> accessCollectionOld = persistentAccount.getAccessCollection();
            Collection<Access> accessCollectionNew = account.getAccessCollection();
            if (idempleadoNew != null) {
                idempleadoNew = em.getReference(idempleadoNew.getClass(), idempleadoNew.getId());
                account.setIdempleado(idempleadoNew);
            }
            Collection<Access> attachedAccessCollectionNew = new ArrayList<Access>();
            for (Access accessCollectionNewAccessToAttach : accessCollectionNew) {
                accessCollectionNewAccessToAttach = em.getReference(accessCollectionNewAccessToAttach.getClass(), accessCollectionNewAccessToAttach.getId());
                attachedAccessCollectionNew.add(accessCollectionNewAccessToAttach);
            }
            accessCollectionNew = attachedAccessCollectionNew;
            account.setAccessCollection(accessCollectionNew);
            account = em.merge(account);
            if (idempleadoOld != null && !idempleadoOld.equals(idempleadoNew)) {
                idempleadoOld.getAccountCollection().remove(account);
                idempleadoOld = em.merge(idempleadoOld);
            }
            if (idempleadoNew != null && !idempleadoNew.equals(idempleadoOld)) {
                idempleadoNew.getAccountCollection().add(account);
                idempleadoNew = em.merge(idempleadoNew);
            }
            for (Access accessCollectionOldAccess : accessCollectionOld) {
                if (!accessCollectionNew.contains(accessCollectionOldAccess)) {
                    accessCollectionOldAccess.setIdcuenta(null);
                    accessCollectionOldAccess = em.merge(accessCollectionOldAccess);
                }
            }
            for (Access accessCollectionNewAccess : accessCollectionNew) {
                if (!accessCollectionOld.contains(accessCollectionNewAccess)) {
                    Account oldIdcuentaOfAccessCollectionNewAccess = accessCollectionNewAccess.getIdcuenta();
                    accessCollectionNewAccess.setIdcuenta(account);
                    accessCollectionNewAccess = em.merge(accessCollectionNewAccess);
                    if (oldIdcuentaOfAccessCollectionNewAccess != null && !oldIdcuentaOfAccessCollectionNewAccess.equals(account)) {
                        oldIdcuentaOfAccessCollectionNewAccess.getAccessCollection().remove(accessCollectionNewAccess);
                        oldIdcuentaOfAccessCollectionNewAccess = em.merge(oldIdcuentaOfAccessCollectionNewAccess);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = account.getId();
                if (findAccount(id) == null) {
                    throw new NonexistentEntityException("The account with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Account account;
            try {
                account = em.getReference(Account.class, id);
                account.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The account with id " + id + " no longer exists.", enfe);
            }
            Employee idempleado = account.getIdempleado();
            if (idempleado != null) {
                idempleado.getAccountCollection().remove(account);
                idempleado = em.merge(idempleado);
            }
            Collection<Access> accessCollection = account.getAccessCollection();
            for (Access accessCollectionAccess : accessCollection) {
                accessCollectionAccess.setIdcuenta(null);
                accessCollectionAccess = em.merge(accessCollectionAccess);
            }
            em.remove(account);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Account> findAccountEntities() {
        return findAccountEntities(true, -1, -1);
    }

    public List<Account> findAccountEntities(int maxResults, int firstResult) {
        return findAccountEntities(false, maxResults, firstResult);
    }

    private List<Account> findAccountEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Account.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Account findAccount(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Account.class, id);
        } finally {
            em.close();
        }
    }

    public int getAccountCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Account> rt = cq.from(Account.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
