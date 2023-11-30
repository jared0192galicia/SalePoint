/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.controller;

import com.unsis.controller.exceptions.NonexistentEntityException;
import com.unsis.models.entity.Area;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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
public class AreaJpaController implements Serializable {

    public AreaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Area area) {
        if (area.getSectionCollection() == null) {
            area.setSectionCollection(new ArrayList<Section>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Section> attachedSectionCollection = new ArrayList<Section>();
            for (Section sectionCollectionSectionToAttach : area.getSectionCollection()) {
                sectionCollectionSectionToAttach = em.getReference(sectionCollectionSectionToAttach.getClass(), sectionCollectionSectionToAttach.getId());
                attachedSectionCollection.add(sectionCollectionSectionToAttach);
            }
            area.setSectionCollection(attachedSectionCollection);
            em.persist(area);
            for (Section sectionCollectionSection : area.getSectionCollection()) {
                Area oldIdareaOfSectionCollectionSection = sectionCollectionSection.getIdarea();
                sectionCollectionSection.setIdarea(area);
                sectionCollectionSection = em.merge(sectionCollectionSection);
                if (oldIdareaOfSectionCollectionSection != null) {
                    oldIdareaOfSectionCollectionSection.getSectionCollection().remove(sectionCollectionSection);
                    oldIdareaOfSectionCollectionSection = em.merge(oldIdareaOfSectionCollectionSection);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Area area) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Area persistentArea = em.find(Area.class, area.getId());
            Collection<Section> sectionCollectionOld = persistentArea.getSectionCollection();
            Collection<Section> sectionCollectionNew = area.getSectionCollection();
            Collection<Section> attachedSectionCollectionNew = new ArrayList<Section>();
            for (Section sectionCollectionNewSectionToAttach : sectionCollectionNew) {
                sectionCollectionNewSectionToAttach = em.getReference(sectionCollectionNewSectionToAttach.getClass(), sectionCollectionNewSectionToAttach.getId());
                attachedSectionCollectionNew.add(sectionCollectionNewSectionToAttach);
            }
            sectionCollectionNew = attachedSectionCollectionNew;
            area.setSectionCollection(sectionCollectionNew);
            area = em.merge(area);
            for (Section sectionCollectionOldSection : sectionCollectionOld) {
                if (!sectionCollectionNew.contains(sectionCollectionOldSection)) {
                    sectionCollectionOldSection.setIdarea(null);
                    sectionCollectionOldSection = em.merge(sectionCollectionOldSection);
                }
            }
            for (Section sectionCollectionNewSection : sectionCollectionNew) {
                if (!sectionCollectionOld.contains(sectionCollectionNewSection)) {
                    Area oldIdareaOfSectionCollectionNewSection = sectionCollectionNewSection.getIdarea();
                    sectionCollectionNewSection.setIdarea(area);
                    sectionCollectionNewSection = em.merge(sectionCollectionNewSection);
                    if (oldIdareaOfSectionCollectionNewSection != null && !oldIdareaOfSectionCollectionNewSection.equals(area)) {
                        oldIdareaOfSectionCollectionNewSection.getSectionCollection().remove(sectionCollectionNewSection);
                        oldIdareaOfSectionCollectionNewSection = em.merge(oldIdareaOfSectionCollectionNewSection);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = area.getId();
                if (findArea(id) == null) {
                    throw new NonexistentEntityException("The area with id " + id + " no longer exists.");
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
            Area area;
            try {
                area = em.getReference(Area.class, id);
                area.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The area with id " + id + " no longer exists.", enfe);
            }
            Collection<Section> sectionCollection = area.getSectionCollection();
            for (Section sectionCollectionSection : sectionCollection) {
                sectionCollectionSection.setIdarea(null);
                sectionCollectionSection = em.merge(sectionCollectionSection);
            }
            em.remove(area);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Area> findAreaEntities() {
        return findAreaEntities(true, -1, -1);
    }

    public List<Area> findAreaEntities(int maxResults, int firstResult) {
        return findAreaEntities(false, maxResults, firstResult);
    }

    private List<Area> findAreaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Area.class));
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

    public Area findArea(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Area.class, id);
        } finally {
            em.close();
        }
    }

    public int getAreaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Area> rt = cq.from(Area.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
