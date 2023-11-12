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
        String query = "SELECT seccion.nombre as seccion, "
                + "area.nombre as area, "
                + "seccion.descripcion as descripcion FROM acceso "
                + "LEFT JOIN cuenta on cuenta.id = acceso.idcuenta "
                + "LEFT JOIN seccion on seccion.id = acceso.idseccion "
                + "LEFT JOIN area on area.id = seccion.idarea "
                + "WHERE cuenta.usuario = ?";

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
