package com.unsis.controller;

import com.unsis.models.constants.Constants;
import java.util.ArrayList;

/**
 *
 * @author jared
 */
public class ConstantsController  {
    
    public ArrayList<Constants.Section> loadSecctions () {
        ArrayList<Constants.Section> sections = new ArrayList<>();
        sections.add(new Constants.Section("Lista Empleados", "Recursos Humanos", "Accede a la lista de empleados", 0));
        sections.add(new Constants.Section("Corte de caja", "Contabilidad", "Reliza tu corte de caja", 1));
        sections.add(new Constants.Section("Ordenes entrantes", "Ventas", "Accede a la lista de pedidos mas reciente", 2));
        sections.add(new Constants.Section("Alta de Empleado", "Recursos Humanos", "Registra un nuevo empleado", 3));
        sections.add(new Constants.Section("Alta de Producto", "Almacen", "Registra un producto nuevo", 4));
        sections.add(new Constants.Section("Punto de Venta", "Ventas", "Reliza las ventas del dia", 5));
        sections.add(new Constants.Section("Lista Productos", "Almacen", "Accede a la lista de los productos", 6));
        sections.add(new Constants.Section("Gastos", "Contabilidad", "Registra los gastos permitidos", 7));
        sections.add(new Constants.Section("Ajustes del generales", "Ajustes", "Ajusta valores del programa", 8));
        sections.add(new Constants.Section("Ajuste de valores", "Ajustes", "Ajusta los valores del programa", 9));
        sections.add(new Constants.Section("Contabilidad", "Contabilidad", "Menu de contabilidad", 10));
    
        return sections;
    }
}
