package com.unsis.controller;

import com.unsis.models.entity.Account;

/**
 *
 * @author labtecweb10
 */
public class Crud<T> {

    public Crud(T obj) {
        
    }

    public boolean create(T obj) {
        return true;
    }

    public boolean update(T obj) {
        return true;
    }

    public boolean select(T obj) {
        return true;
    }

    public boolean delete(T obj) {
        return true;
    }

    public boolean verify(T obj) {
        return true;
    }

    public boolean fill(T obj) {
        
        return (obj.getClass().equals(Account.class));
    }
}
