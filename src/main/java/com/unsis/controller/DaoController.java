package com.unsis.controller;

import com.unsis.clases.Tools;
import com.unsis.dao.InventoryDao;
import com.unsis.models.entity.Sales;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author labtecweb10
 */
public class DaoController {

    private final InventoryDao dao = new InventoryDao();

    public ArrayList sendMessage(String mail, String code) {
        ArrayList<Sales> sales = new ArrayList<>();
        try {
            ResultSet rs = dao.queryLoadSections("");
            while (rs.next()) {
                
            }

            return sales;
        } catch (SQLException ex) {
            Logger.getLogger(DaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sales;
    }
}
