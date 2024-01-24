package com.unsis.dao;

import com.unsis.models.entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author jared
 */
public class AccountDao {

    private final Connection cn = Conexion.getConexion();

    /**
     * Search the account with the requested user
     *
     * @param user user for search account
     * @return Object Account with data
     */
    public Account auth(String user) {
        String query = "SELECT * FROM \"Account\""
                + "LEFT JOIN \"Employee\" ON \"Account\".idempleado = \"Employee\".id WHERE usuario = ?";
        try (PreparedStatement pst = cn.prepareStatement(query)) {
            pst.setString(1, user);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Account account = new Account.Builder()
                        .withId(rs.getInt("id"))
                        .withNumCuenta(rs.getInt("numcuenta"))
                        .withUsuario(rs.getString("usuario"))
                        .withContrasena(rs.getString("contrasena"))
                        .build();
                return account;
            }
        } catch (Exception e) {
            System.err.println("Error in select user: " + e.getMessage());
        }

        return null;
    }

    /**
     * Verifica si un correo pertenece a una cuenta
     * @param mail correo a verificar
     * @return boolean, true si el correo esta registrado y falso en caso contrario
     */
    public boolean isRegister(String mail) {
        String query = """
                        SELECT "usuario" as USER FROM "Account" 
                        LEFT JOIN "Employee" ON idempleado = "Account".id
                        WHERE correo = ?
                       """;
        
        try (PreparedStatement pst = cn.prepareStatement(query)) {
            pst.setString(1, mail);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error in search mail: " + e.getMessage());
        }
        return false;
    }
}
