package com.unsis.puntoVenta;

import com.unsis.clases.Tools;
import com.unsis.controller.JpaController;
import com.unsis.models.entity.Company;
import com.unsis.view.panel.FirstEjecutation;
import com.unsis.view.panel.Login;
import io.github.cdimascio.dotenv.Dotenv;

/**
 *
 * @author jared
 */
public class PuntoVenta {

    public PuntoVenta() {
        try {
            Dotenv env = Dotenv.load();
            String environment = env.get("ENVIRONMENT");

            if (environment != null) {
                System.out.println("ENVIRONMENT = " + environment);
            }

        } catch (Exception e) {
            System.err.println("No se ah encontrado el archivo de dependencias");
        }
        Tools.generateTicket();
    }

    /**
     * Compara si ya existe registrada una marca
     *
     * @return
     */
    private boolean loadedMarch() {
        try {
//            new JpaController().findAllEntities(Company.class).get(0);
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {

        PuntoVenta entryPoint = new PuntoVenta();

        if (entryPoint.loadedMarch()) {
            new Login().setVisible(true);

        } else {
            new FirstEjecutation().setVisible(true);
        }
    }
}
