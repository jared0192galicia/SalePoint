package com.unsis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jared
 */
public class ConstantsDao {

    private final Connection cn = Conexion.getConexion();

    public ResultSet queryLoadSections(String user) {
        String query = "SELECT \"Section\".nombre as seccion, "
                + "\"Area\".nombre as area, "
                + "\"Section\".descripcion as descripcion FROM \"Access\" "
                + "LEFT JOIN \"Account\" on \"Account\".id = \"Access\".idcuenta "
                + "LEFT JOIN \"Section\" on \"Section\".id = \"Access\".idseccion "
                + "LEFT JOIN \"Area\" on \"Area\".id = \"Section\".idarea "
                + "WHERE \"Account\".usuario = ?";

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
