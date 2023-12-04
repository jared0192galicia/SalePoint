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
        if (account.getAccessList() == null) {
            account.setAccessList(new ArrayList<Access>());
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
            List<Access> attachedAccessList = new ArrayList<Access>();
            for (Access accessListAccessToAttach : account.getAccessList()) {
                accessListAccessToAttach = em.getReference(accessListAccessToAttach.getClass(), accessListAccessToAttach.getId());
                attachedAccessList.add(accessListAccessToAttach);
            }
            account.setAccessList(attachedAccessList);
            em.persist(account);
            if (idempleado != null) {
                Account oldAccountOfIdempleado = idempleado.getAccount();
                if (oldAccountOfIdempleado != null) {
                    oldAccountOfIdempleado.setIdempleado(null);
                    oldAccountOfIdempleado = em.merge(oldAccountOfIdempleado);
                }
                idempleado.setAccount(account);
                idempleado = em.merge(idempleado);
            }
            for (Access accessListAccess : account.getAccessList()) {
                Account oldIdcuentaOfAccessListAccess = accessListAccess.getIdcuenta();
                accessListAccess.setIdcuenta(account);
                accessListAccess = em.merge(accessListAccess);
                if (oldIdcuentaOfAccessListAccess != null) {
                    oldIdcuentaOfAccessListAccess.getAccessList().remove(accessListAccess);
                    oldIdcuentaOfAccessListAccess = em.merge(oldIdcuentaOfAccessListAccess);
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
            List<Access> accessListOld = persistentAccount.getAccessList();
            List<Access> accessListNew = account.getAccessList();
            if (idempleadoNew != null) {
                idempleadoNew = em.getReference(idempleadoNew.getClass(), idempleadoNew.getId());
                account.setIdempleado(idempleadoNew);
            }
            List<Access> attachedAccessListNew = new ArrayList<Access>();
            for (Access accessListNewAccessToAttach : accessListNew) {
                accessListNewAccessToAttach = em.getReference(accessListNewAccessToAttach.getClass(), accessListNewAccessToAttach.getId());
                attachedAccessListNew.add(accessListNewAccessToAttach);
            }
            accessListNew = attachedAccessListNew;
            account.setAccessList(accessListNew);
            account = em.merge(account);
            if (idempleadoOld != null && !idempleadoOld.equals(idempleadoNew)) {
                idempleadoOld.setAccount(null);
                idempleadoOld = em.merge(idempleadoOld);
            }
            if (idempleadoNew != null && !idempleadoNew.equals(idempleadoOld)) {
                Account oldAccountOfIdempleado = idempleadoNew.getAccount();
                if (oldAccountOfIdempleado != null) {
                    oldAccountOfIdempleado.setIdempleado(null);
                    oldAccountOfIdempleado = em.merge(oldAccountOfIdempleado);
                }
                idempleadoNew.setAccount(account);
                idempleadoNew = em.merge(idempleadoNew);
            }
            for (Access accessListOldAccess : accessListOld) {
                if (!accessListNew.contains(accessListOldAccess)) {
                    accessListOldAccess.setIdcuenta(null);
                    accessListOldAccess = em.merge(accessListOldAccess);
                }
            }
            for (Access accessListNewAccess : accessListNew) {
                if (!accessListOld.contains(accessListNewAccess)) {
                    Account oldIdcuentaOfAccessListNewAccess = accessListNewAccess.getIdcuenta();
                    accessListNewAccess.setIdcuenta(account);
                    accessListNewAccess = em.merge(accessListNewAccess);
                    if (oldIdcuentaOfAccessListNewAccess != null && !oldIdcuentaOfAccessListNewAccess.equals(account)) {
                        oldIdcuentaOfAccessListNewAccess.getAccessList().remove(accessListNewAccess);
                        oldIdcuentaOfAccessListNewAccess = em.merge(oldIdcuentaOfAccessListNewAccess);
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
                idempleado.setAccount(null);
                idempleado = em.merge(idempleado);
            }
            List<Access> accessList = account.getAccessList();
            for (Access accessListAccess : accessList) {
                accessListAccess.setIdcuenta(null);
                accessListAccess = em.merge(accessListAccess);
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
