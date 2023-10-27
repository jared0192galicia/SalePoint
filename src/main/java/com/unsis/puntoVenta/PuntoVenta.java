package com.unsis.puntoVenta;

import com.unsis.view.Main;
import com.unsis.view.panel.Login;
import com.unsis.view.panel.RegisterCompany;

/**
 *
 * @author jared
 */
public class PuntoVenta {

    public static void main(String[] args) {
        PuntoVenta entryPoint = new PuntoVenta();

        if (entryPoint.loadedMarch()) {
            Login loginWindow = new Login();
            loginWindow.setVisible(true);

            // Agregar un bucle para pausar la ejecución hasta que la ventana se cierre
            while (loginWindow.isVisible()) {
                try {
                    Thread.sleep(100); // Pausa por 100 milisegundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            RegisterCompany registerCompanyWindow = new RegisterCompany();
            registerCompanyWindow.setVisible(true);

            // Agregar un bucle para pausar la ejecución hasta que la ventana se cierre
            while (registerCompanyWindow.isVisible()) {
                try {
                    Thread.sleep(100); // Pausa por 100 milisegundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        new Main(new String[]{"1", "2", "3", "4"}).setVisible(true);
        System.out.println("End of the execution");
    }

    private boolean loadedMarch() {
        return true;
    }
}
