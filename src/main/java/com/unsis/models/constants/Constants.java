package com.unsis.models.constants;

import com.unsis.controller.ConstantsController;
import java.util.ArrayList;

/**
 *
 * @author jared
 */
public class Constants {

    public static ArrayList<Section> sections = new ArrayList<>();

    public static void fillContants() {
        sections = new ConstantsController().loadSecctions();
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
