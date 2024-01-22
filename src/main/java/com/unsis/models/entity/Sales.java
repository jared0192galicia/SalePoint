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
 * @author labtecweb04
 */
@Entity
@Table(name = "Sales")
@NamedQueries({
    @NamedQuery(name = "Sales.findAll", query = "SELECT s FROM Sales s"),
    @NamedQuery(name = "Sales.findById", query = "SELECT s FROM Sales s WHERE s.id = :id"),
    @NamedQuery(name = "Sales.findByIdventa", query = "SELECT s FROM Sales s WHERE s.idventa = :idventa"),
    @NamedQuery(name = "Sales.findByTipoorden", query = "SELECT s FROM Sales s WHERE s.tipoorden = :tipoorden"),
    @NamedQuery(name = "Sales.findByComentarios", query = "SELECT s FROM Sales s WHERE s.comentarios = :comentarios"),
    @NamedQuery(name = "Sales.findByNombrecomprador", query = "SELECT s FROM Sales s WHERE s.nombrecomprador = :nombrecomprador"),
    @NamedQuery(name = "Sales.findByCodigobarra", query = "SELECT s FROM Sales s WHERE s.codigobarra = :codigobarra")})
public class Sales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idventa")
    private Integer idventa;
    @Column(name = "tipoorden")
    private String tipoorden;
    @Column(name = "comentarios")
    private String comentarios;
    @Column(name = "nombrecomprador")
    private String nombrecomprador;
    @Column(name = "codigobarra")
    private String codigobarra;
    @JoinColumn(name = "idproducto", referencedColumnName = "codigobarra")
    @ManyToOne
    private Product idproducto;

    public Sales() {
    }

    public Sales(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    public String getTipoorden() {
        return tipoorden;
    }

    public void setTipoorden(String tipoorden) {
        this.tipoorden = tipoorden;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getNombrecomprador() {
        return nombrecomprador;
    }

    public void setNombrecomprador(String nombrecomprador) {
        this.nombrecomprador = nombrecomprador;
    }

    public String getCodigobarra() {
        return codigobarra;
    }

    public void setCodigobarra(String codigobarra) {
        this.codigobarra = codigobarra;
    }

    public Product getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Product idproducto) {
        this.idproducto = idproducto;
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
        if (!(object instanceof Sales)) {
            return false;
        }
        Sales other = (Sales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.models.entity.Sales[ id=" + id + " ]";
    }
    
     public static class Builder {
        private Sales sales;

        public Builder() {
            sales = new Sales();
        }

        public Builder withId(Integer id) {
            sales.id = id;
            return this;
        }

        public Builder withIdVenta(Integer idVenta) {
            sales.idventa = idVenta;
            return this;
        }

        public Builder withIdProducto(Product idProducto) {
            sales.idproducto = idProducto;
            return this;
        }
        
        public Builder withTipoOrden(String tipoOrden) {
            sales.tipoorden = tipoOrden;
            return this;
        }

        public Builder withNombreComp(String nombreComprador) {
            sales.nombrecomprador = nombreComprador;
            return this;
        }

        public Builder withComentarios(String coments) {
            sales.comentarios = coments;
            return this;
        }

        public Builder withCodigoBarras(String codigoBarras) {
            sales.codigobarra = codigoBarras;
            return this;
        }

        public Sales build() {
            return sales;
        }
    }
    
    
}
