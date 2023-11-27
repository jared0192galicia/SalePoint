package com.unsis.puntoVenta;

import com.unsis.controller.EmpleadoJpaController;
import com.unsis.models.constants.Constants;
import com.unsis.models.entity.Empleado;
import com.unsis.view.panel.FirstEjecutation;
import com.unsis.view.panel.Login;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jared
 */
public class PuntoVenta {

    public static void main(String[] args) {

        /*
         * Código para realizar inserciones
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(Constants.PU_NAME);

        EmpleadoJpaController cont = new EmpleadoJpaController(emf);
        cont.create(new Empleado.Builder()
                .withNumEmpleado(1031)
                .withNombre("Juan")
                .withApellidoPaterno("Pérez")
                .withApellidoMaterno("Gómez")
                .withFechaNacimiento(new Date(2023, 9, 4)) // Debes definir esta fecha
                .withCorreo("juan@example.com")
                .withTelefono("1234567890")
                .withFechaIngreso(new Date(2023, 9, 4)) // Debes definir esta fecha
                .withEstado("Activo")
                .withPuesto("Test JPA")
                .build());
         */
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

        if (environment != null) {
            System.out.println("ENVIRONMENT = " + environment);
        }
        return true;
    }
}
