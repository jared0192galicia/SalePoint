/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.models.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jared
 */
@Entity
@Table(name = "\"Account\"")
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.findById", query = "SELECT a FROM Account a WHERE a.id = :id"),
    @NamedQuery(name = "Account.findByNumcuenta", query = "SELECT a FROM Account a WHERE a.numcuenta = :numcuenta"),
    @NamedQuery(name = "Account.findByUsuario", query = "SELECT a FROM Account a WHERE a.usuario = :usuario"),
    @NamedQuery(name = "Account.findByContrasena", query = "SELECT a FROM Account a WHERE a.contrasena = :contrasena")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "numcuenta")
    private Integer numcuenta;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "contrasena")
    private String contrasena;
    @Column(name = "fotoperfil")
    private String fotoperfil;
    @JoinColumn(name = "idempleado", referencedColumnName = "id")
    @OneToOne
    private Employee idempleado;
    @OneToMany(mappedBy = "idcuenta")
    private List<Access> accessList;

    public Account() {
    }

    public Account(Integer id) {
        this.id = id;
    }

    public Account(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(Integer numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getFotoperfil() {
        return fotoperfil;
    }

    public void setFotoperfil(String fotoperfil) {
        this.fotoperfil = fotoperfil;
    }
    
    public Employee getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Employee idempleado) {
        this.idempleado = idempleado;
    }

    public List<Access> getAccessList() {
        return accessList;
    }

    public void setAccessList(List<Access> accessList) {
        this.accessList = accessList;
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.models.entity.Account[ id=" + id + " ]";
    }
    
    // Inner static Builder class
    public static class Builder {
        private Account account;

        public Builder() {
            account = new Account();
        }

        public Builder withId(Integer id) {
            account.id = id;
            return this;
        }

        public Builder withNumCuenta(Integer numCuenta) {
            account.numcuenta = numCuenta;
            return this;
        }

        public Builder withUsuario(String usuario) {
            account.usuario = usuario;
            return this;
        }

        public Builder withFotoPerfil(String path) {
            account.fotoperfil = path;
            return this;
        }

        public Builder withContrasena(String contrasena) {
            account.contrasena = contrasena;
            return this;
        }

        public Builder withIdEmpleado(Employee idEmpleado) {
            account.idempleado = idEmpleado;
            return this;
        }

        public Builder withAccessList(List<Access> accessList) {
            account.accessList = accessList;
            return this;
        }

        public Account build() {
            return account;
        }
    }
}
