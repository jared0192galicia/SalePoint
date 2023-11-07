/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.controller;


public class controllerAccount<T> implements Crud<T> {
    
    public controllerAccount(T obj) {
    }

    @Override
    public boolean create(T obj) {
        return true;
    }

    @Override
    public boolean update(T obj) {
        return true;
    }

    @Override
    public boolean select(T obj) {
        return true;
    }

    @Override
    public boolean delete(T obj) {
        return true;
    }
    
    /**
     *
     * @param user
     * @param pass
     * @return
     */
    public boolean auth (String user, String pass) {
        return true;
    }
    
}
