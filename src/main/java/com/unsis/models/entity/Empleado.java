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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author labtecweb10
 */
@Entity
@Table(name = "empleado")
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findById", query = "SELECT e FROM Empleado e WHERE e.id = :id"),
    @NamedQuery(name = "Empleado.findByNumempleado", query = "SELECT e FROM Empleado e WHERE e.numempleado = :numempleado"),
    @NamedQuery(name = "Empleado.findByNombre", query = "SELECT e FROM Empleado e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleado.findByApellidop", query = "SELECT e FROM Empleado e WHERE e.apellidop = :apellidop"),
    @NamedQuery(name = "Empleado.findByApellidom", query = "SELECT e FROM Empleado e WHERE e.apellidom = :apellidom"),
    @NamedQuery(name = "Empleado.findByFechanac", query = "SELECT e FROM Empleado e WHERE e.fechanac = :fechanac"),
    @NamedQuery(name = "Empleado.findByCorreo", query = "SELECT e FROM Empleado e WHERE e.correo = :correo"),
    @NamedQuery(name = "Empleado.findByTelefono", query = "SELECT e FROM Empleado e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Empleado.findByFechaing", query = "SELECT e FROM Empleado e WHERE e.fechaing = :fechaing"),
    @NamedQuery(name = "Empleado.findByEstado", query = "SELECT e FROM Empleado e WHERE e.estado = :estado"),
    @NamedQuery(name = "Empleado.findByPuesto", query = "SELECT e FROM Empleado e WHERE e.puesto = :puesto")})
public class Empleado implements Serializable {

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

    public Empleado() {
    }

    public Empleado(Integer id) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.models.entity.Empleado[ id=" + id + " ]";
    }
    
    // Clase interna estática para construir instancias de Empleado
    public static class Builder {
        private Empleado empleado;

        public Builder() {
            empleado = new Empleado();
        }

        public Builder withId(Integer id) {
            empleado.setId(id);
            return this;
        }

        public Builder withNumEmpleado(Integer numEmpleado) {
            empleado.setNumempleado(numEmpleado);
            return this;
        }

        public Builder withNombre(String nombre) {
            empleado.setNombre(nombre);
            return this;
        }

        public Builder withApellidoPaterno(String apellidoPaterno) {
            empleado.setApellidop(apellidoPaterno);
            return this;
        }

        public Builder withApellidoMaterno(String apellidoMaterno) {
            empleado.setApellidom(apellidoMaterno);
            return this;
        }

        public Builder withFechaNacimiento(Date fechaNacimiento) {
            empleado.setFechanac(fechaNacimiento);
            return this;
        }

        public Builder withCorreo(String correo) {
            empleado.setCorreo(correo);
            return this;
        }

        public Builder withTelefono(String telefono) {
            empleado.setTelefono(telefono);
            return this;
        }

        public Builder withFechaIngreso(Date fechaIngreso) {
            empleado.setFechaing(fechaIngreso);
            return this;
        }

        public Builder withEstado(String estado) {
            empleado.setEstado(estado);
            return this;
        }

        public Builder withPuesto(String puesto) {
            empleado.setPuesto(puesto);
            return this;
        }

        public Empleado build() {
            return empleado;
        }
    }
}
