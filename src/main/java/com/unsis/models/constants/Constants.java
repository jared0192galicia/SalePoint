package com.unsis.models.constants;

import com.unsis.controller.ConstantsController;
import java.util.ArrayList;

/**
 *
 * @author jared
 */
public class Constants {

    public static String PU_NAME = "com.unsis_puntoVenta_jar_1.0-SNAPSHOTPU";
    public static ArrayList<Section> sections = new ArrayList<>();
    public static final String PATH_PROFILE= "./src/main/resources/profiles";

    public static void fillContants() {
        sections = new ConstantsController().loadSections();
    }

    public static boolean accessTo(String secction) {
        for (Section item : sections) {
            if (item.nombre.equals(secction)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method for get all areas of the user permise
     *
     * @return ArrayList with all areas with acces
     */
    public static ArrayList<String> getAreas() {
        ArrayList<String> areas = new ArrayList<>();

        for (Section section : sections) {
            areas.add(section.area);
        }

        return areas;
    }

    /**
     * Method for get all sections of the user permise
     *
     * @return ArrayList with all areas with acces
     */
    public static ArrayList<String[][]> getSecctions() {
        ArrayList<String[][]> sectionsAcces = new ArrayList<>();

        for (Section section : sections) {
            String[][] aux = {
                {section.area, section.nombre}
            };
            sectionsAcces.add(aux);
        }

        return sectionsAcces;
    }

    /**
     * Method for get all sections of the user permise
     *
     * @param area area de la que se quieren obtener las areas
     * @return ArrayList with all areas with acces
     */
    public static ArrayList<String> getSecctionsOf(String area) {
        ArrayList<String> sectionsAcces = new ArrayList<>();

        for (Section section : sections) {
            if (section.area.equals(area)) {
                sectionsAcces.add(section.nombre);
            }
        }

        return sectionsAcces;
    }

    public static class Section {

        private String nombre;
        private String area;
        private String descripcion;
        private int id;

        /**
         *
         * @param nombre
         * @param area
         * @param descripcion
         * @param id
         */
        public Section(String nombre, String area, String descripcion, int id) {
            this.nombre = nombre;
            this.area = area;
            this.descripcion = descripcion;
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
