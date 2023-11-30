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
import com.unsis.models.entity.Area;
import com.unsis.models.entity.Access;
import com.unsis.models.entity.Section;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author labtecweb10
 */
public class SectionJpaController implements Serializable {

    public SectionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Section section) {
        if (section.getAccessCollection() == null) {
            section.setAccessCollection(new ArrayList<Access>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Area idarea = section.getIdarea();
            if (idarea != null) {
                idarea = em.getReference(idarea.getClass(), idarea.getId());
                section.setIdarea(idarea);
            }
            Collection<Access> attachedAccessCollection = new ArrayList<Access>();
            for (Access accessCollectionAccessToAttach : section.getAccessCollection()) {
                accessCollectionAccessToAttach = em.getReference(accessCollectionAccessToAttach.getClass(), accessCollectionAccessToAttach.getId());
                attachedAccessCollection.add(accessCollectionAccessToAttach);
            }
            section.setAccessCollection(attachedAccessCollection);
            em.persist(section);
            if (idarea != null) {
                idarea.getSectionCollection().add(section);
                idarea = em.merge(idarea);
            }
            for (Access accessCollectionAccess : section.getAccessCollection()) {
                Section oldIdseccionOfAccessCollectionAccess = accessCollectionAccess.getIdseccion();
                accessCollectionAccess.setIdseccion(section);
                accessCollectionAccess = em.merge(accessCollectionAccess);
                if (oldIdseccionOfAccessCollectionAccess != null) {
                    oldIdseccionOfAccessCollectionAccess.getAccessCollection().remove(accessCollectionAccess);
                    oldIdseccionOfAccessCollectionAccess = em.merge(oldIdseccionOfAccessCollectionAccess);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Section section) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Section persistentSection = em.find(Section.class, section.getId());
            Area idareaOld = persistentSection.getIdarea();
            Area idareaNew = section.getIdarea();
            Collection<Access> accessCollectionOld = persistentSection.getAccessCollection();
            Collection<Access> accessCollectionNew = section.getAccessCollection();
            if (idareaNew != null) {
                idareaNew = em.getReference(idareaNew.getClass(), idareaNew.getId());
                section.setIdarea(idareaNew);
            }
            Collection<Access> attachedAccessCollectionNew = new ArrayList<Access>();
            for (Access accessCollectionNewAccessToAttach : accessCollectionNew) {
                accessCollectionNewAccessToAttach = em.getReference(accessCollectionNewAccessToAttach.getClass(), accessCollectionNewAccessToAttach.getId());
                attachedAccessCollectionNew.add(accessCollectionNewAccessToAttach);
            }
            accessCollectionNew = attachedAccessCollectionNew;
            section.setAccessCollection(accessCollectionNew);
            section = em.merge(section);
            if (idareaOld != null && !idareaOld.equals(idareaNew)) {
                idareaOld.getSectionCollection().remove(section);
                idareaOld = em.merge(idareaOld);
            }
            if (idareaNew != null && !idareaNew.equals(idareaOld)) {
                idareaNew.getSectionCollection().add(section);
                idareaNew = em.merge(idareaNew);
            }
            for (Access accessCollectionOldAccess : accessCollectionOld) {
                if (!accessCollectionNew.contains(accessCollectionOldAccess)) {
                    accessCollectionOldAccess.setIdseccion(null);
                    accessCollectionOldAccess = em.merge(accessCollectionOldAccess);
                }
            }
            for (Access accessCollectionNewAccess : accessCollectionNew) {
                if (!accessCollectionOld.contains(accessCollectionNewAccess)) {
                    Section oldIdseccionOfAccessCollectionNewAccess = accessCollectionNewAccess.getIdseccion();
                    accessCollectionNewAccess.setIdseccion(section);
                    accessCollectionNewAccess = em.merge(accessCollectionNewAccess);
                    if (oldIdseccionOfAccessCollectionNewAccess != null && !oldIdseccionOfAccessCollectionNewAccess.equals(section)) {
                        oldIdseccionOfAccessCollectionNewAccess.getAccessCollection().remove(accessCollectionNewAccess);
                        oldIdseccionOfAccessCollectionNewAccess = em.merge(oldIdseccionOfAccessCollectionNewAccess);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = section.getId();
                if (findSection(id) == null) {
                    throw new NonexistentEntityException("The section with id " + id + " no longer exists.");
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
            Section section;
            try {
                section = em.getReference(Section.class, id);
                section.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The section with id " + id + " no longer exists.", enfe);
            }
            Area idarea = section.getIdarea();
            if (idarea != null) {
                idarea.getSectionCollection().remove(section);
                idarea = em.merge(idarea);
            }
            Collection<Access> accessCollection = section.getAccessCollection();
            for (Access accessCollectionAccess : accessCollection) {
                accessCollectionAccess.setIdseccion(null);
                accessCollectionAccess = em.merge(accessCollectionAccess);
            }
            em.remove(section);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Section> findSectionEntities() {
        return findSectionEntities(true, -1, -1);
    }

    public List<Section> findSectionEntities(int maxResults, int firstResult) {
        return findSectionEntities(false, maxResults, firstResult);
    }

    private List<Section> findSectionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Section.class));
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

    public Section findSection(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Section.class, id);
        } finally {
            em.close();
        }
    }

    public int getSectionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Section> rt = cq.from(Section.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
