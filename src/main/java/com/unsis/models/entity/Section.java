/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jared
 */
@Entity
@Table(name = "\"Section\"")
@NamedQueries({
    @NamedQuery(name = "Section.findAll", query = "SELECT s FROM Section s"),
    @NamedQuery(name = "Section.findById", query = "SELECT s FROM Section s WHERE s.id = :id"),
    @NamedQuery(name = "Section.findByNombre", query = "SELECT s FROM Section s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Section.findByDescripcion", query = "SELECT s FROM Section s WHERE s.descripcion = :descripcion")})
public class Section implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idseccion")
    private List<Access> accessList;
    @JoinColumn(name = "idarea", referencedColumnName = "id")
    @ManyToOne
    private Area idarea;

    public Section() {
    }

    public Section(Section sectionToCopy) {
        this.id = sectionToCopy.id;
        this.nombre = sectionToCopy.nombre;
        this.descripcion = sectionToCopy.descripcion;
        if (sectionToCopy.accessList != null) {
            this.accessList = new ArrayList<>(sectionToCopy.accessList);
        }
        this.idarea = sectionToCopy.idarea;
    }

    public Section(Integer id) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Access> getAccessList() {
        return accessList;
    }

    public void setAccessList(List<Access> accessList) {
        this.accessList = accessList;
    }

    public Area getIdarea() {
        return idarea;
    }

    public void setIdarea(Area idarea) {
        this.idarea = idarea;
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
        if (!(object instanceof Section)) {
            return false;
        }
        Section other = (Section) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.models.entity.Section[ id=" + id + " ]";
    }

}
