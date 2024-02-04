package com.unsis.clases;

import com.unsis.models.constants.Constants;
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

        String name = "-1";
        // Eventos para teclas F1-F12
        switch (keyCode) {
            case 112 -> {
                name = "Lista Empleados";
            }
            case 113 -> {
                name = "Alta de Empleado";
            }
            case 114 -> {
                name = "Alta de Producto";
            }
            case 115 -> {
                name = "Lista Productos";
            }
            case 116 -> {
                name = "Ordenes entrantes";
            }
            case 117 -> {
                name = "Punto de Venta";
            }
            case 118 -> {
                name = "Ajustes del generales";
            }
            case 119 -> {
                name = "Corte de caja";
            }
            case 120 -> {
                name = "Gastos";
            }
        }

        if (!name.equals("-1") && Constants.accessTo(name)) {
            this.window.setView(name);
            this.window.addPanelHistory(name);
        }
    }
}
