package com.unsis.puntoVenta;

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
            new Login().setVisible(true);

        } else {
            new RegisterCompany().setVisible(true);

        }

        System.out.println("End of the execution");
    }

    private boolean loadedMarch() {
        return true;
    }
}
