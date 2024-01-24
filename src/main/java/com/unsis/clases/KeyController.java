package com.unsis.clases;

import com.unsis.view.Main;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author labtecweb10
 */
public class KeyController extends KeyAdapter {

    private final Main window;

    public KeyController(Main window) {
        this.window = window;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Lógica para el evento de tecla presionada
        int keyCode = e.getKeyCode();
        System.out.print("Tecla presionada: " + e.getKeyChar());
        System.out.println(" Codigo: " + keyCode);

        // Eventos para teclas F1-F12
        switch (keyCode) {
            case 112 ->
                this.window.setView("Lista Empleados");
            case 113 -> {
                this.window.setView("Alta de Empleado");
            }
            case 114 -> {
                this.window.setView("Alta de Producto");
            }
            case 115 -> {
                this.window.setView("Lista Productos");
            }
            case 116 -> {
                this.window.setView("Ordenes entrantes");
            }
            case 117 -> {
                this.window.setView("Punto de Venta");
            }
            case 118 -> {
                this.window.setView("Ajustes del generales");
            }
            case 119 -> {
                this.window.setView("Corte de caja");
            }
            case 120 -> {
                this.window.setView("Gastos");
            }
            case 121 -> {
            }
            case 122 -> {
            }
            case 123 -> {
            }
        }
    }
}
