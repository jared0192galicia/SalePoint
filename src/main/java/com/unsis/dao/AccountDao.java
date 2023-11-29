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
                Account account = new Account.Builder(user, rs.getString("contrasena"))
                        .withNumber(rs.getString("telefono"))
                        .withNumEmploye(rs.getInt("numempleado"))
                        .withDateEntry(rs.getDate("fechaing"))
                        .withStatus("Activo".equals(rs.getString("estado")))
                        .withArea(rs.getString("puesto"))
                        .withPosition(rs.getString("puesto"))
                        .withName(rs.getString("nombre"))
                        .withMatherLastName(rs.getString("apellidom"))
                        .withFatherLastName(rs.getString("apellidop"))
                        .withBirthday(rs.getDate("fechanac"))
                        .withMail(rs.getString("correo"))
                        .withCell(rs.getString("telefono"))
                        .build();
                return account;
            }
        } catch (Exception e) {
            System.err.println("Error in select user: " + e.getMessage());
        }

        return null;
    }
}
