/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.models.entity;

import java.io.Serializable;
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

/**
 *
 * @author jared
 */
@Entity
@Table(name = "Access")
@NamedQueries({
    @NamedQuery(name = "Access.findAll", query = "SELECT a FROM Access a"),
    @NamedQuery(name = "Access.findById", query = "SELECT a FROM Access a WHERE a.id = :id")})
public class Access implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "idcuenta", referencedColumnName = "id")
    @ManyToOne
    private Account idcuenta;
    @JoinColumn(name = "idseccion", referencedColumnName = "id")
    @ManyToOne
    private Section idseccion;

    public Access() {
    }

    public Access(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Account getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(Account idcuenta) {
        this.idcuenta = idcuenta;
    }

    public Section getIdseccion() {
        return idseccion;
    }

    public void setIdseccion(Section idseccion) {
        this.idseccion = idseccion;
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
        if (!(object instanceof Access)) {
            return false;
        }
        Access other = (Access) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.models.entity.Access[ id=" + id + " ]";
    }
    
    public static class Builder {
        private Integer id;
        private Account idcuenta;
        private Section idseccion;

        public Builder() {}

        public Builder withId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder withIdCuenta(Account idcuenta) {
            this.idcuenta = idcuenta;
            return this;
        }

        public Builder withIdSeccion(Section idseccion) {
            this.idseccion = idseccion;
            return this;
        }

        public Access build() {
            Access access = new Access();
            access.id = this.id;
            access.idcuenta = this.idcuenta;
            access.idseccion = this.idseccion;
            return access;
        }
    }
}
