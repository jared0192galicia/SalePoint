package com.unsis.controller;

import com.unsis.clases.Session;
import com.unsis.dao.ConstantsDao;
import com.unsis.models.constants.Constants;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jared
 */
public class ConstantsController {

    ConstantsDao dao = new ConstantsDao();

    public ArrayList<Constants.Section> loadSections() {
        ArrayList<Constants.Section> sections = new ArrayList<>();

        ResultSet rs = dao.queryLoadSections(Session.getAccount().getUsuario());

        if (rs == null) return null;

        try {
            while (rs.next()) {
                sections.add(new Constants.Section(rs.getString("seccion"), rs.getString("area"),
                        rs.getString("descripcion"), 0));
            }
        } catch (SQLException e) {
            System.err.println("Error in constants\n" + e.getMessage());
        }

        return sections;
    }

}
