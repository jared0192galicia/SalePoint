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
        if (area.getSectionList() == null) {
            area.setSectionList(new ArrayList<Section>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Section> attachedSectionList = new ArrayList<Section>();
            for (Section sectionListSectionToAttach : area.getSectionList()) {
                sectionListSectionToAttach = em.getReference(sectionListSectionToAttach.getClass(), sectionListSectionToAttach.getId());
                attachedSectionList.add(sectionListSectionToAttach);
            }
            area.setSectionList(attachedSectionList);
            em.persist(area);
            for (Section sectionListSection : area.getSectionList()) {
                Area oldIdareaOfSectionListSection = sectionListSection.getIdarea();
                sectionListSection.setIdarea(area);
                sectionListSection = em.merge(sectionListSection);
                if (oldIdareaOfSectionListSection != null) {
                    oldIdareaOfSectionListSection.getSectionList().remove(sectionListSection);
                    oldIdareaOfSectionListSection = em.merge(oldIdareaOfSectionListSection);
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
            List<Section> sectionListOld = persistentArea.getSectionList();
            List<Section> sectionListNew = area.getSectionList();
            List<Section> attachedSectionListNew = new ArrayList<Section>();
            for (Section sectionListNewSectionToAttach : sectionListNew) {
                sectionListNewSectionToAttach = em.getReference(sectionListNewSectionToAttach.getClass(), sectionListNewSectionToAttach.getId());
                attachedSectionListNew.add(sectionListNewSectionToAttach);
            }
            sectionListNew = attachedSectionListNew;
            area.setSectionList(sectionListNew);
            area = em.merge(area);
            for (Section sectionListOldSection : sectionListOld) {
                if (!sectionListNew.contains(sectionListOldSection)) {
                    sectionListOldSection.setIdarea(null);
                    sectionListOldSection = em.merge(sectionListOldSection);
                }
            }
            for (Section sectionListNewSection : sectionListNew) {
                if (!sectionListOld.contains(sectionListNewSection)) {
                    Area oldIdareaOfSectionListNewSection = sectionListNewSection.getIdarea();
                    sectionListNewSection.setIdarea(area);
                    sectionListNewSection = em.merge(sectionListNewSection);
                    if (oldIdareaOfSectionListNewSection != null && !oldIdareaOfSectionListNewSection.equals(area)) {
                        oldIdareaOfSectionListNewSection.getSectionList().remove(sectionListNewSection);
                        oldIdareaOfSectionListNewSection = em.merge(oldIdareaOfSectionListNewSection);
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
            List<Section> sectionList = area.getSectionList();
            for (Section sectionListSection : sectionList) {
                sectionListSection.setIdarea(null);
                sectionListSection = em.merge(sectionListSection);
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
