package com.unsis.puntoVenta;

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
        Dotenv env = Dotenv.load();
        String environment = env.get("ENVIRONMENT");

        if (environment != null) {
            System.out.println("ENVIRONMENT = " + environment);
        }
    }

    /**
     *
     * @return
     */
    private boolean loadedMarch() {
        Company company = new JpaController().findEntityById(1, Company.class);
        System.out.println(company);
        
        if (company == null) {
            return false;
        }
        return !company.getName().equals("");
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
