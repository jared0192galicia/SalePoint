/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.unsis.view.panel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jared
 */
public class HumanResourcesPanel extends javax.swing.JPanel {

    /**
     * Creates new form HumanResourcesPanel
     */
    public HumanResourcesPanel() {
        initComponents();

        // Obtener el JTableHeader (encabezado de la tabla)
        JTableHeader tableHeader = table.getTableHeader();

        // Crear un renderizador de encabezado personalizado
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER); // Alineación del texto en el encabezado
        headerRenderer.setVerticalAlignment(SwingConstants.CENTER);
        headerRenderer.setBackground(Color.WHITE); // Cambia el color de fondo del encabezado
        headerRenderer.setForeground(Color.DARK_GRAY); // Cambia el color del texto del encabezado
        headerRenderer.setFont(new Font("Arial", Font.BOLD, 20)); // Cambia el color del texto del encabezado

        // Asignar el renderizador personalizado al encabezado
        tableHeader.setDefaultRenderer(headerRenderer);
        
        TableColumnModel modelColumn =  table.getColumnModel();
        modelColumn.setColumnMargin(35);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonCreate = new javax.swing.JButton();
        buttonExport = new javax.swing.JButton();
        buttonModify = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(240, 240, 240));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        buttonCreate.setBackground(new java.awt.Color(255, 255, 255));
        buttonCreate.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonCreate.setForeground(new java.awt.Color(0, 153, 0));
        buttonCreate.setText("+ Alta");
        buttonCreate.setBorder(BorderFactory.createLineBorder(new Color(0,153,0), 2));
        buttonCreate.setContentAreaFilled(false);

        buttonExport.setBackground(new java.awt.Color(0, 102, 0));
        buttonExport.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonExport.setForeground(new java.awt.Color(255, 255, 255));
        buttonExport.setText("+ Exportar");
        buttonExport.setBorder(null);

        buttonModify.setBackground(new java.awt.Color(255, 255, 255));
        buttonModify.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonModify.setForeground(new java.awt.Color(51, 102, 255));
        buttonModify.setText("+ Modificación");
        buttonModify.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        buttonModify.setContentAreaFilled(false);

        buttonDelete.setBackground(new java.awt.Color(255, 255, 255));
        buttonDelete.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(255, 0, 51));
        buttonDelete.setText("+ Eliminar");
        buttonDelete.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        buttonDelete.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonModify)
                .addGap(18, 18, 18)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addComponent(buttonExport, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExport, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(buttonModify, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número Empleado", "Nombre", "Apellidos", "Area", "Estatus"
            }
        ));
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setShowGrid(true);
        table.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 699, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonExport;
    private javax.swing.JButton buttonModify;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
