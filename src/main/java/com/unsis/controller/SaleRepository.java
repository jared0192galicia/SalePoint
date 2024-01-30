package com.unsis.controller;

import com.unsis.models.entity.Sales;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;
import javax.persistence.TemporalType;

public class SaleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Sales> findSalesByFecha(Date fecha) {
        return entityManager.createQuery(
                "SELECT s FROM Sales s "
                + "LEFT JOIN FETCH s.idproducto p "
                + "LEFT JOIN FETCH p.salesCollection "
                + "LEFT JOIN FETCH Flavors f ON f.idproducto = p.id "
                + "WHERE DATE(s.fechahora) = :fecha", Sales.class)
                .setParameter("fecha", fecha, TemporalType.DATE)
                .getResultList();
    }

}
