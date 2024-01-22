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
import com.unsis.models.entity.Account;
import com.unsis.models.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author labtecweb10
 */
public class EmployeeJpaController implements Serializable {

    public EmployeeJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Employee employee) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Account account = employee.getAccount();
            if (account != null && account.getId() != null) {
                account = em.getReference(account.getClass(), account.getId());
                employee.setAccount(account);
            }
            em.persist(employee);
            if (account != null) {
                Employee oldIdempleadoOfAccount = account.getIdempleado();
                if (oldIdempleadoOfAccount != null) {
                    oldIdempleadoOfAccount.setAccount(null);
                    oldIdempleadoOfAccount = em.merge(oldIdempleadoOfAccount);
                }
                account.setIdempleado(employee);
                account = em.merge(account);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Employee employee) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Employee persistentEmployee = em.find(Employee.class, employee.getId());
            Account accountOld = persistentEmployee.getAccount();
            Account accountNew = employee.getAccount();
            if (accountNew != null) {
                accountNew = em.getReference(accountNew.getClass(), accountNew.getId());
                employee.setAccount(accountNew);
            }
            employee = em.merge(employee);
            if (accountOld != null && !accountOld.equals(accountNew)) {
                accountOld.setIdempleado(null);
                accountOld = em.merge(accountOld);
            }
            if (accountNew != null && !accountNew.equals(accountOld)) {
                Employee oldIdempleadoOfAccount = accountNew.getIdempleado();
                if (oldIdempleadoOfAccount != null) {
                    oldIdempleadoOfAccount.setAccount(null);
                    oldIdempleadoOfAccount = em.merge(oldIdempleadoOfAccount);
                }
                accountNew.setIdempleado(employee);
                accountNew = em.merge(accountNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = employee.getId();
                if (findEmployee(id) == null) {
                    throw new NonexistentEntityException("The employee with id " + id + " no longer exists.");
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
            Employee employee;
            try {
                employee = em.getReference(Employee.class, id);
                employee.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The employee with id " + id + " no longer exists.", enfe);
            }
            Account account = employee.getAccount();
            if (account != null) {
                account.setIdempleado(null);
                account = em.merge(account);
            }
            em.remove(employee);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Employee> findEmployeeEntities() {
        return findEmployeeEntities(true, -1, -1);
    }

    public List<Employee> findEmployeeEntities(int maxResults, int firstResult) {
        return findEmployeeEntities(false, maxResults, firstResult);
    }

    private List<Employee> findEmployeeEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Employee.class));
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

    public Employee findEmployee(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Employee.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmployeeCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Employee> rt = cq.from(Employee.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
