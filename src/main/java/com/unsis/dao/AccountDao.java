package com.unsis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author labtecweb10
 */
public class AccountDao {

    private final Connection cn = Conexion.getConexion();

    public boolean auth(String user, String pass) {

        String query = "SELECT * FROM \"usuario\" WHERE name = ?";
        try (PreparedStatement pst = cn.prepareStatement(query)) {
            pst.setString(1, user);
            
            ResultSet rs = pst.executeQuery(); 

            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
            }
        } catch (Exception e) {
        }

        return true;
    }
}
