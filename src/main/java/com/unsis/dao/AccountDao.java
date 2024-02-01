package com.unsis.dao;

import com.unsis.models.entity.Account;
import com.unsis.models.entity.Employee;
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
                        .withIdEmpleado(findEmployeeByNumEmpleado(rs.getInt("idEmpleado")))
                        .build();
                System.out.println(findEmployeeByNumEmpleado(rs.getInt("idEmpleado")));
                return account;
            }
        } catch (Exception e) {
            System.err.println("Error in select user: " + e.getMessage());
        }

        return null;
    }

    public Employee findEmployeeByNumEmpleado(int numEmpleado) {
        String query = "SELECT * FROM \"Employee\" WHERE id = ?";

        try (PreparedStatement pst = cn.prepareStatement(query)) {
            pst.setInt(1, numEmpleado);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("entro");
                Employee employee = new Employee.Builder()
                        .withId(rs.getInt("id"))
                        .withNumEmpleado(rs.getInt("numEmpleado"))
                        .withNombre(rs.getString("nombre"))
                        .withApellidoP(rs.getString("apellidoP"))
                        .withApellidoM(rs.getString("apellidoM"))
                        .withFechaNac(rs.getDate("fechaNac"))
                        .withCorreo(rs.getString("correo"))
                        .withTelefono(rs.getString("telefono"))
                        .withFechaIng(rs.getDate("fechaIng"))
                        .withEstado(rs.getString("estado"))
                        .withPuesto(rs.getString("puesto"))
                        .build();

                return employee;
            }
        } catch (Exception e) {
            System.err.println("Error in select employee by numEmpleado: " + e.getMessage());
        }

        return null;
    }

    /**
     * Verifica si un correo pertenece a una cuenta
     *
     * @param mail correo a verificar
     * @return boolean, true si el correo esta registrado y falso en caso
     * contrario
     */
    public String isRegister(String mail) {
        String query = """
                        SELECT "usuario" as USER FROM "Account" 
                        LEFT JOIN "Employee" ON idempleado = "Account".id
                        WHERE correo = ?
                       """;

        try (PreparedStatement pst = cn.prepareStatement(query)) {
            pst.setString(1, mail);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return rs.getString("USER");
            }
        } catch (Exception e) {
            System.err.println("Error in search mail: " + e.getMessage());
        }
        return "-1";
    }
}
