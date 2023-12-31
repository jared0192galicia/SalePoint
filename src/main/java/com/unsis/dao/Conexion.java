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

    /**
     * Connect with postgress dataBase
     * @return 
     */
    public static Connection getConexion() {
        if (conexion == null) {
            try {

                // Load credentials of enviroment file
                Dotenv env = Dotenv.load();

                String user = env.get("USER_NAME");
                String pass = env.get("PASSWORD_SERVER");
                String dataBase = env.get("DATA_BASE");
                String port = env.get("PORT");
                if (port == null) {
                    port = "5432";
                }

                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:" + port + "/" + dataBase, user, pass);

            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("Error de conexion\n" + e.getMessage());
            }
        }
        return conexion;
    }

    public static void closeConecction() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }
}
