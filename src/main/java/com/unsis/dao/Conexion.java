package com.unsis.dao;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author labtecweb10
 */
public class Conexion {

    private static Connection conexion;

    public static Connection getConexion() {
        if (conexion == null) {
            try {

                // Load credentials of enviroment file
                Dotenv env = Dotenv.load();
                String environment = env.get("ENVIRONMENT");

                String user = env.get("USER_NAME");
                String pass = env.get("PASSWORD_SERVER");
                String dataBase = env.get("DATA_BASE");

                System.out.println("Cadena: " + user + " " + pass + " " + dataBase);
                System.out.println(environment);

                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/" + dataBase, user, pass);

            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("Error de conexion\n" + e.getMessage());
            }
        }
        System.out.println(conexion);
        return conexion;
    }

    public static void closeConecction() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }
}
