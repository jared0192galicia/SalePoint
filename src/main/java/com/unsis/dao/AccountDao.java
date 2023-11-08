package com.unsis.dao;

import com.unsis.models.entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author labtecweb10
 */
public class AccountDao {

    private final Connection cn = Conexion.getConexion();

    public Account auth(String user) {

        String query = "SELECT * FROM \"cuenta\" WHERE usuario = ?";
        try (PreparedStatement pst = cn.prepareStatement(query)) {
            pst.setString(1, user);
            
            ResultSet rs = pst.executeQuery();  

            while (rs.next()) {
                System.out.println(rs.getString("numcuenta"));
                return new Account();
            }
        } catch (Exception e) {
            System.err.println("Error in select user: " + e.getMessage() + " for \n" + e.getCause().toString());
        }

        return null;
    }
}
