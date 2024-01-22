package com.unsis.clases;

public class Stack<T> {
     private Nodo<T> cima;
     private T defaultValue;

    public Stack() {
        this.cima = null;
    }

    public Stack(T defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * Agrega un nuevo elemento en la pila
     * @param data Elemento a ingresar
     */
    public void add(T data) {
        Nodo nuevoNodo = new Nodo(data);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    /**
     * Elimina el primer elemento de la pila y lo retorna
     * @return Primer elemento en la pila
     */
    public T pop() {
        if (cima == null) {
            if (defaultValue != null) {
                return defaultValue;
            }
            
            System.err.println("Stack void");
        }
        
        T datoDesapilado = cima.dato;
        cima = cima.siguiente;
        return datoDesapilado;
    }

    /**
     * Imprime la pila en orden
     */
    public void print() {
        Nodo actual = cima;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
    public T getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(T defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    private class Nodo<T> {
    
    T dato;
    Nodo siguiente;

    Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
}
