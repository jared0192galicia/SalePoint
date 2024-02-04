/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.controller;

import com.unsis.controller.exceptions.NonexistentEntityException;
import com.unsis.models.entity.Product;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.unsis.models.entity.Sales;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author labtecweb04
 */
public class ProductJpaController implements Serializable {

    public ProductJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Product product) {
        if (product.getSalesCollection() == null) {
            product.setSalesCollection(new ArrayList<Sales>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Sales> attachedSalesCollection = new ArrayList<Sales>();
            for (Sales salesCollectionSalesToAttach : product.getSalesCollection()) {
                salesCollectionSalesToAttach = em.getReference(salesCollectionSalesToAttach.getClass(), salesCollectionSalesToAttach.getId());
                attachedSalesCollection.add(salesCollectionSalesToAttach);
            }
            product.setSalesCollection(attachedSalesCollection);
            em.persist(product);
            for (Sales salesCollectionSales : product.getSalesCollection()) {
                Product oldIdproductoOfSalesCollectionSales = salesCollectionSales.getIdproducto();
                salesCollectionSales.setIdproducto(product);
                salesCollectionSales = em.merge(salesCollectionSales);
                if (oldIdproductoOfSalesCollectionSales != null) {
                    oldIdproductoOfSalesCollectionSales.getSalesCollection().remove(salesCollectionSales);
                    oldIdproductoOfSalesCollectionSales = em.merge(oldIdproductoOfSalesCollectionSales);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Product product) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Product persistentProduct = em.find(Product.class, product.getId());
            Collection<Sales> salesCollectionOld = persistentProduct.getSalesCollection();
            Collection<Sales> salesCollectionNew = product.getSalesCollection();
            Collection<Sales> attachedSalesCollectionNew = new ArrayList<Sales>();
            for (Sales salesCollectionNewSalesToAttach : salesCollectionNew) {
                salesCollectionNewSalesToAttach = em.getReference(salesCollectionNewSalesToAttach.getClass(), salesCollectionNewSalesToAttach.getId());
                attachedSalesCollectionNew.add(salesCollectionNewSalesToAttach);
            }
            salesCollectionNew = attachedSalesCollectionNew;
            product.setSalesCollection(salesCollectionNew);
            product = em.merge(product);
            for (Sales salesCollectionOldSales : salesCollectionOld) {
                if (!salesCollectionNew.contains(salesCollectionOldSales)) {
                    salesCollectionOldSales.setIdproducto(null);
                    salesCollectionOldSales = em.merge(salesCollectionOldSales);
                }
            }
            for (Sales salesCollectionNewSales : salesCollectionNew) {
                if (!salesCollectionOld.contains(salesCollectionNewSales)) {
                    Product oldIdproductoOfSalesCollectionNewSales = salesCollectionNewSales.getIdproducto();
                    salesCollectionNewSales.setIdproducto(product);
                    salesCollectionNewSales = em.merge(salesCollectionNewSales);
                    if (oldIdproductoOfSalesCollectionNewSales != null && !oldIdproductoOfSalesCollectionNewSales.equals(product)) {
                        oldIdproductoOfSalesCollectionNewSales.getSalesCollection().remove(salesCollectionNewSales);
                        oldIdproductoOfSalesCollectionNewSales = em.merge(oldIdproductoOfSalesCollectionNewSales);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = product.getId();
                if (findProduct(id) == null) {
                    throw new NonexistentEntityException("The product with id " + id + " no longer exists.");
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
            Product product;
            try {
                product = em.getReference(Product.class, id);
                product.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The product with id " + id + " no longer exists.", enfe);
            }
            Collection<Sales> salesCollection = product.getSalesCollection();
            for (Sales salesCollectionSales : salesCollection) {
                salesCollectionSales.setIdproducto(null);
                salesCollectionSales = em.merge(salesCollectionSales);
            }
            em.remove(product);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Product> findProductEntities() {
        return findProductEntities(true, -1, -1);
    }

    public List<Product> findProductEntities(int maxResults, int firstResult) {
        return findProductEntities(false, maxResults, firstResult);
    }

    private List<Product> findProductEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Product.class));
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

    public Product findProduct(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Product.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Product> rt = cq.from(Product.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
