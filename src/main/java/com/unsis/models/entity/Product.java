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
 * @author labtecweb09
 */
@Entity
@Table(name = "Product")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findById", query = "SELECT p FROM Product p WHERE p.id = :id"),
    @NamedQuery(name = "Product.findByNombre", query = "SELECT p FROM Product p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Product.findByPreciocom", query = "SELECT p FROM Product p WHERE p.preciocom = :preciocom"),
    @NamedQuery(name = "Product.findByPrecioventa", query = "SELECT p FROM Product p WHERE p.precioventa = :precioventa"),
    @NamedQuery(name = "Product.findByCodigobarra", query = "SELECT p FROM Product p WHERE p.codigobarra = :codigobarra"),
    @NamedQuery(name = "Product.findByTipo", query = "SELECT p FROM Product p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Product.findByDescripcion", query = "SELECT p FROM Product p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Product.findByNumproducto", query = "SELECT p FROM Product p WHERE p.numproducto = :numproducto"),
    @NamedQuery(name = "Product.findByEstado", query = "SELECT p FROM Product p WHERE p.estado = :estado"),
    @NamedQuery(name = "Product.findByDisponible", query = "SELECT p FROM Product p WHERE p.disponible = :disponible"),
    @NamedQuery(name = "Product.findByVariante", query = "SELECT p FROM Product p WHERE p.variante = :variante")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preciocom")
    private Double preciocom;
    @Column(name = "precioventa")
    private Double precioventa;
    @Column(name = "codigobarra")
    private String codigobarra;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "numproducto")
    private Integer numproducto;
    @Column(name = "estado")
    private String estado;
    @Column(name = "disponible")
    private String disponible;
    @Column(name = "variante")
    private String variante;

    public Product() {
    }

    public Product(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPreciocom() {
        return preciocom;
    }

    public void setPreciocom(Double preciocom) {
        this.preciocom = preciocom;
    }

    public Double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(Double precioventa) {
        this.precioventa = precioventa;
    }

    public String getCodigobarra() {
        return codigobarra;
    }

    public void setCodigobarra(String codigobarra) {
        this.codigobarra = codigobarra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumproducto() {
        return numproducto;
    }

    public void setNumproducto(Integer numproducto) {
        this.numproducto = numproducto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.models.entity.Product[ id=" + id + " ]";
    }

    public static class Builder {
        private Product product;

        public Builder() {
            product = new Product();
        }

        public Builder withId(Integer id) {
          product.id = id;
            return this;
        }

        public Builder withNumProducto(Integer numProduct) {
            product.numproducto = numProduct;
            return this;
        }

        public Builder withNombre(String nombre) {
            product.nombre = nombre;
            return this;
        }

        public Builder withPreciocom(Double precioC) {
           product.preciocom = precioC;
            return this;
        }

        public Builder withPrecioventa(Double precioV) {
            product.precioventa = precioV;
            return this;
        }

        public Builder withCodigobarra(String codigoBarra) {
            product.codigobarra = codigoBarra;
            return this;
        }

        public Builder withTipo(String tipo) {
            product.tipo = tipo;
            return this;
        }

      
        public Builder withDescripcion(String descripcion) {
            product.descripcion = descripcion;
            return this;
        }

        public Builder withEstado(String estado) {
            product.estado = estado;
            return this;
        }

        public Builder withDisponible(String disponible) {
           product.disponible = disponible;
            return this;
        }

         public Builder withVariente(String variante) {
           product.variante = variante;
            return this;
        }
        public Product build() {
            return product;
        }
    }
    
}
