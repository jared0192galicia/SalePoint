/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jared
 */
@Entity
@Table(name = "\"Expenses\"")
@NamedQueries({
    @NamedQuery(name = "Expenses.findAll", query = "SELECT e FROM Expenses e"),
    @NamedQuery(name = "Expenses.findById", query = "SELECT e FROM Expenses e WHERE e.id = :id"),
    @NamedQuery(name = "Expenses.findByDate", query = "SELECT e FROM Expenses e WHERE e.date = :date"),
    @NamedQuery(name = "Expenses.findByDescripcion", query = "SELECT e FROM Expenses e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Expenses.findByCategoria", query = "SELECT e FROM Expenses e WHERE e.categoria = :categoria"),
    @NamedQuery(name = "Expenses.findByMonto", query = "SELECT e FROM Expenses e WHERE e.monto = :monto"),
    @NamedQuery(name = "Expenses.findByComprobante", query = "SELECT e FROM Expenses e WHERE e.comprobante = :comprobante")})
public class Expenses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "categoria")
    private String categoria;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private Float monto;
    @Column(name = "comprobante")
    private String comprobante;
    @ManyToOne
    @JoinColumn(name = "idaccount", referencedColumnName = "id")
    private Account idaccount;

    public Expenses() {
    }

    public Expenses(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expenses)) {
            return false;
        }
        Expenses other = (Expenses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.models.entity.Expenses[ id=" + id + " ]";
    }

    private void setIdempleado(Account idaccount) {
        this.idaccount = idaccount;
    }

    public static class Builder {

        private final Expenses expenses;

        public Builder() {
            expenses = new Expenses();
        }

        public Builder id(Integer id) {
            expenses.setId(id);
            return this;
        }

        public Builder date(Date date) {
            expenses.setDate(date);
            return this;
        }

        public Builder descripcion(String descripcion) {
            expenses.setDescripcion(descripcion);
            return this;
        }

        public Builder categoria(String categoria) {
            expenses.setCategoria(categoria);
            return this;
        }

        public Builder monto(Float monto) {
            expenses.setMonto(monto);
            return this;
        }

        public Builder comprobante(String comprobante) {
            expenses.setComprobante(comprobante);
            return this;
        }

        public Builder usuario(Account idaccount) {
            expenses.setIdempleado(idaccount);
            return this;
        }

        public Expenses build() {
            return expenses;
        }
    }
}
