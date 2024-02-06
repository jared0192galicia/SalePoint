package com.unsis.controller;

import com.unsis.dao.Conexion;
import com.unsis.models.entity.Account;
import com.unsis.models.entity.Expenses;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jared
 */
public class ExpensesConsult {
    Connection conexion = Conexion.getConexion();
    JpaController jpa = new JpaController();
    public List<Expenses> getExpensesByMonthAndCategory(int month, String categoria) {
        List<Expenses> expensesList = new ArrayList<>();
        try {
            String query = "SELECT * FROM \"Expenses\" WHERE EXTRACT(MONTH FROM \"date\") = ? AND \"categoria\" = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
                preparedStatement.setInt(1, month);
                preparedStatement.setString(2, categoria);

                 try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Expenses expense = new Expenses.Builder()
                                .id(resultSet.getInt("id"))
                                .date(resultSet.getDate("date"))
                                .usuario(jpa.findEntityById(resultSet.getInt("idaccount"), Account.class))
                                .descripcion(resultSet.getString("descripcion"))
                                .categoria(resultSet.getString("categoria"))
                                .monto(resultSet.getFloat("monto"))
                                .comprobante(resultSet.getString("comprobante"))
                                .build();

                        expensesList.add(expense);
                    }
                }
            }
            return expensesList;
        } catch (SQLException e) {
            System.err.println("Error al consultar Gastos\n" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
