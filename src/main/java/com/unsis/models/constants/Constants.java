package com.unsis.models.constants;

import java.util.ArrayList;

/**
 *
 * @author jared
 */
public class Constants {

    public static ArrayList<Section> sections = new ArrayList<>();

    public static void fillContants() {
        //                         Nombre             Area                  Descripcion                   id
        sections.add(new Section("Lista Empleados", "Recursos Humanos", "Accede a la lista de empleados", 0));
        sections.add(new Section("Corte de caja", "Contabilidad", "Reliza tu corte de caja", 1));
        sections.add(new Section("Ordenes entrantes", "Ventas", "Accede a la lista de pedidos mas reciente", 2));
        sections.add(new Section("Alta de Empleado", "Recursos Humanos", "Registra un nuevo empleado", 3));
        sections.add(new Section("Alta de Producto", "Almacen", "Registra un producto nuevo", 4));
        sections.add(new Section("Punto de Venta", "Ventas", "Reliza las ventas del dia", 5));

        sections.add(new Section("Lista Productos", "Almacen", "Accede a la lista de los productos", 6));
        sections.add(new Section("Gastos", "Contabilidad", "Registra los gastos permitidos", 7));

        sections.add(new Section("Ajustes del aplicativo", "Ajustes", "Ajustes del programa", 8));
        sections.add(new Section("Ajuste de valores", "Ajustes", "Ajusta los valores del programa", 9));
        sections.add(new Section("Contabilidad", "Contabilidad", "Menu de contabilidad", 10));
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
