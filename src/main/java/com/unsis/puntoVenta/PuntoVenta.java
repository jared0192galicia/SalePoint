package com.unsis.puntoVenta;

import com.unsis.view.panel.FirstEjecutation;
import com.unsis.view.panel.Login;
import io.github.cdimascio.dotenv.Dotenv;

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
            new FirstEjecutation().setVisible(true);
        }
    }

    /**
     *
     * @return
     */
    private boolean loadedMarch() {
        Dotenv env = Dotenv.load();
        String environment = env.get("ENVIRONMENT");

        String user = env.get("USER_NAME");
        String pass = env.get("PASSWORD_SERVER");
        String dataBase = env.get("DATA_BASE");

        System.out.println("Cadena: " + user + " " + pass + " " + dataBase);
        if (environment != null) {
            System.out.println("ENVIRONMENT = " + environment);
        }
        return true;
    }
}
