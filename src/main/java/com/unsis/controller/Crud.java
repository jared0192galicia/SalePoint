package com.unsis.controller;

/**
 *
 * @author jared
 * @param <T>
 */
public interface Crud<T> {
    
    public boolean create(T obj);

    public boolean update(T obj);

    public boolean select(T obj);

    public boolean delete(T obj);
}
