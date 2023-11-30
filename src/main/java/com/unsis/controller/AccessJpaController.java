/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.controller;

import com.unsis.controller.exceptions.NonexistentEntityException;
import com.unsis.models.entity.Access;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.unsis.models.entity.Account;
import com.unsis.models.entity.Section;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author labtecweb10
 */
public class AccessJpaController implements Serializable {

    public AccessJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Access access) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Account idcuenta = access.getIdcuenta();
            if (idcuenta != null) {
                idcuenta = em.getReference(idcuenta.getClass(), idcuenta.getId());
                access.setIdcuenta(idcuenta);
            }
            Section idseccion = access.getIdseccion();
            if (idseccion != null) {
                idseccion = em.getReference(idseccion.getClass(), idseccion.getId());
                access.setIdseccion(idseccion);
            }
            em.persist(access);
            if (idcuenta != null) {
                idcuenta.getAccessCollection().add(access);
                idcuenta = em.merge(idcuenta);
            }
            if (idseccion != null) {
                idseccion.getAccessCollection().add(access);
                idseccion = em.merge(idseccion);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Access access) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Access persistentAccess = em.find(Access.class, access.getId());
            Account idcuentaOld = persistentAccess.getIdcuenta();
            Account idcuentaNew = access.getIdcuenta();
            Section idseccionOld = persistentAccess.getIdseccion();
            Section idseccionNew = access.getIdseccion();
            if (idcuentaNew != null) {
                idcuentaNew = em.getReference(idcuentaNew.getClass(), idcuentaNew.getId());
                access.setIdcuenta(idcuentaNew);
            }
            if (idseccionNew != null) {
                idseccionNew = em.getReference(idseccionNew.getClass(), idseccionNew.getId());
                access.setIdseccion(idseccionNew);
            }
            access = em.merge(access);
            if (idcuentaOld != null && !idcuentaOld.equals(idcuentaNew)) {
                idcuentaOld.getAccessCollection().remove(access);
                idcuentaOld = em.merge(idcuentaOld);
            }
            if (idcuentaNew != null && !idcuentaNew.equals(idcuentaOld)) {
                idcuentaNew.getAccessCollection().add(access);
                idcuentaNew = em.merge(idcuentaNew);
            }
            if (idseccionOld != null && !idseccionOld.equals(idseccionNew)) {
                idseccionOld.getAccessCollection().remove(access);
                idseccionOld = em.merge(idseccionOld);
            }
            if (idseccionNew != null && !idseccionNew.equals(idseccionOld)) {
                idseccionNew.getAccessCollection().add(access);
                idseccionNew = em.merge(idseccionNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = access.getId();
                if (findAccess(id) == null) {
                    throw new NonexistentEntityException("The access with id " + id + " no longer exists.");
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
            Access access;
            try {
                access = em.getReference(Access.class, id);
                access.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The access with id " + id + " no longer exists.", enfe);
            }
            Account idcuenta = access.getIdcuenta();
            if (idcuenta != null) {
                idcuenta.getAccessCollection().remove(access);
                idcuenta = em.merge(idcuenta);
            }
            Section idseccion = access.getIdseccion();
            if (idseccion != null) {
                idseccion.getAccessCollection().remove(access);
                idseccion = em.merge(idseccion);
            }
            em.remove(access);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Access> findAccessEntities() {
        return findAccessEntities(true, -1, -1);
    }

    public List<Access> findAccessEntities(int maxResults, int firstResult) {
        return findAccessEntities(false, maxResults, firstResult);
    }

    private List<Access> findAccessEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Access.class));
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

    public Access findAccess(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Access.class, id);
        } finally {
            em.close();
        }
    }

    public int getAccessCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Access> rt = cq.from(Access.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
