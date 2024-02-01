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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author labtecweb04
 */
@Entity
@Table(name = "\"Flavors\"")
@NamedQueries({
    @NamedQuery(name = "Flavors.findAll", query = "SELECT f FROM Flavors f"),
    @NamedQuery(name = "Flavors.findById", query = "SELECT f FROM Flavors f WHERE f.id = :id"),
    @NamedQuery(name = "Flavors.findByIdproducto", query = "SELECT f FROM Flavors f WHERE f.idproducto = :idproducto"),
    @NamedQuery(name = "Flavors.findBySabor", query = "SELECT f FROM Flavors f WHERE f.sabor = :sabor")})
public class Flavors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idproducto")
    private Integer idproducto;
    @Column(name = "sabor")
    private String sabor;

    public Flavors() {
    }

    public Flavors(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProduct() {
        return idproducto;
    }

    public void setIdProduct(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
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
        if (!(object instanceof Flavors)) {
            return false;
        }
        Flavors other = (Flavors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.models.entity.Flavors[ id=" + id + " ]";
    }

    public static class Builder {

        private Flavors flavors;

        public Builder() {
            this.flavors = new Flavors();
        }

        public Builder withIdProduct(Integer idproduct) {
            flavors.setIdProduct(idproduct);
            return this;
        }

        public Builder withSabor(String sabor) {
            flavors.setSabor(sabor);
            return this;
        }

        public Flavors build() {
            return flavors;
        }
    }
}
