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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author jared
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
        if (section.getAccessList() == null) {
            section.setAccessList(new ArrayList<Access>());
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
            List<Access> attachedAccessList = new ArrayList<Access>();
            for (Access accessListAccessToAttach : section.getAccessList()) {
                accessListAccessToAttach = em.getReference(accessListAccessToAttach.getClass(), accessListAccessToAttach.getId());
                attachedAccessList.add(accessListAccessToAttach);
            }
            section.setAccessList(attachedAccessList);
            em.persist(section);
            if (idarea != null) {
                idarea.getSectionList().add(section);
                idarea = em.merge(idarea);
            }
            for (Access accessListAccess : section.getAccessList()) {
                Section oldIdseccionOfAccessListAccess = accessListAccess.getIdseccion();
                accessListAccess.setIdseccion(section);
                accessListAccess = em.merge(accessListAccess);
                if (oldIdseccionOfAccessListAccess != null) {
                    oldIdseccionOfAccessListAccess.getAccessList().remove(accessListAccess);
                    oldIdseccionOfAccessListAccess = em.merge(oldIdseccionOfAccessListAccess);
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
            List<Access> accessListOld = persistentSection.getAccessList();
            List<Access> accessListNew = section.getAccessList();
            if (idareaNew != null) {
                idareaNew = em.getReference(idareaNew.getClass(), idareaNew.getId());
                section.setIdarea(idareaNew);
            }
            List<Access> attachedAccessListNew = new ArrayList<Access>();
            for (Access accessListNewAccessToAttach : accessListNew) {
                accessListNewAccessToAttach = em.getReference(accessListNewAccessToAttach.getClass(), accessListNewAccessToAttach.getId());
                attachedAccessListNew.add(accessListNewAccessToAttach);
            }
            accessListNew = attachedAccessListNew;
            section.setAccessList(accessListNew);
            section = em.merge(section);
            if (idareaOld != null && !idareaOld.equals(idareaNew)) {
                idareaOld.getSectionList().remove(section);
                idareaOld = em.merge(idareaOld);
            }
            if (idareaNew != null && !idareaNew.equals(idareaOld)) {
                idareaNew.getSectionList().add(section);
                idareaNew = em.merge(idareaNew);
            }
            for (Access accessListOldAccess : accessListOld) {
                if (!accessListNew.contains(accessListOldAccess)) {
                    accessListOldAccess.setIdseccion(null);
                    accessListOldAccess = em.merge(accessListOldAccess);
                }
            }
            for (Access accessListNewAccess : accessListNew) {
                if (!accessListOld.contains(accessListNewAccess)) {
                    Section oldIdseccionOfAccessListNewAccess = accessListNewAccess.getIdseccion();
                    accessListNewAccess.setIdseccion(section);
                    accessListNewAccess = em.merge(accessListNewAccess);
                    if (oldIdseccionOfAccessListNewAccess != null && !oldIdseccionOfAccessListNewAccess.equals(section)) {
                        oldIdseccionOfAccessListNewAccess.getAccessList().remove(accessListNewAccess);
                        oldIdseccionOfAccessListNewAccess = em.merge(oldIdseccionOfAccessListNewAccess);
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
                idarea.getSectionList().remove(section);
                idarea = em.merge(idarea);
            }
            List<Access> accessList = section.getAccessList();
            for (Access accessListAccess : accessList) {
                accessListAccess.setIdseccion(null);
                accessListAccess = em.merge(accessListAccess);
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
