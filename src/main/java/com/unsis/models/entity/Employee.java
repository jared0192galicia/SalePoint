/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.models.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author labtecweb10
 */
@Entity
@Table(name = "Employee")
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id"),
    @NamedQuery(name = "Employee.findByNumempleado", query = "SELECT e FROM Employee e WHERE e.numempleado = :numempleado"),
    @NamedQuery(name = "Employee.findByNombre", query = "SELECT e FROM Employee e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Employee.findByApellidop", query = "SELECT e FROM Employee e WHERE e.apellidop = :apellidop"),
    @NamedQuery(name = "Employee.findByApellidom", query = "SELECT e FROM Employee e WHERE e.apellidom = :apellidom"),
    @NamedQuery(name = "Employee.findByFechanac", query = "SELECT e FROM Employee e WHERE e.fechanac = :fechanac"),
    @NamedQuery(name = "Employee.findByCorreo", query = "SELECT e FROM Employee e WHERE e.correo = :correo"),
    @NamedQuery(name = "Employee.findByTelefono", query = "SELECT e FROM Employee e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Employee.findByFechaing", query = "SELECT e FROM Employee e WHERE e.fechaing = :fechaing"),
    @NamedQuery(name = "Employee.findByEstado", query = "SELECT e FROM Employee e WHERE e.estado = :estado"),
    @NamedQuery(name = "Employee.findByPuesto", query = "SELECT e FROM Employee e WHERE e.puesto = :puesto")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "numempleado")
    private Integer numempleado;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidop")
    private String apellidop;
    @Column(name = "apellidom")
    private String apellidom;
    @Column(name = "fechanac")
    @Temporal(TemporalType.DATE)
    private Date fechanac;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fechaing")
    @Temporal(TemporalType.DATE)
    private Date fechaing;
    @Column(name = "estado")
    private String estado;
    @Column(name = "puesto")
    private String puesto;
    @OneToMany(mappedBy = "idempleado")
    private Collection<Account> accountCollection;

    public Employee() {
    }

    public Employee(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumempleado() {
        return numempleado;
    }

    public void setNumempleado(Integer numempleado) {
        this.numempleado = numempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaing() {
        return fechaing;
    }

    public void setFechaing(Date fechaing) {
        this.fechaing = fechaing;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Collection<Account> getAccountCollection() {
        return accountCollection;
    }

    public void setAccountCollection(Collection<Account> accountCollection) {
        this.accountCollection = accountCollection;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.models.entity.Employee[ id=" + id + " ]";
    }
    
}
