package com.unsis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author labtecweb10
 */
public class InventoryDao {

    private final Connection cn = Conexion.getConexion();

    public ResultSet queryLoadSections(String user) {
        String query = """
                SELECT * FROM "Sales" LEFT JOIN "Product" ON "Product".codigobarra = "Sales".idproducto 
                LEFT JOIN "Flavors" ON "Flavors".idproducto = "Product".id WHERE "idventa" = 10002;""";

        try {
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, user);

            return pst.executeQuery();
        } catch (SQLException e) {
            System.err.println("Error get access: " + e.getMessage());
        }

        return null;
    }
}
