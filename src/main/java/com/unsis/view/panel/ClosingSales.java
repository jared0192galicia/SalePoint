package com.unsis.view.panel;

import com.unsis.clases.Session;
import com.unsis.controller.SaleRepository;
import com.unsis.models.entity.Sales;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jared
 */
public class ClosingSales extends javax.swing.JPanel {

    /**
     * Creates new form ClosingSales
     */
    public ClosingSales() {
        initComponents();

        // Obtener el JTableHeader (encabezado de la tabla)
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(32, 136, 203));
        table.getTableHeader().setForeground(Color.WHITE);

        
    }

    /**
     * Crea y muestra un modelo de tabla con la información de los empleados
     */
//    public void showModel() {
//        // Llamada al método findAllEntities para obtener la lista de empleados
//        ArrayList<Sales> sales = (ArrayList<Sales>) new SaleRepository().findSalesByFecha(new Date());
////        employeeList = employees;
//
//        // Configuración del modelo de la tabla
//        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
//        // Eliminar filas existentes
//        tableModel.setRowCount(0);
//        table.setModel(tableModel);
//
//        for (com.unsis.models.entity.Sales sale : sales) {
//            Object[] rowData = {
//                sale.getNumempleado(),
//                sale.getNombre(),
//                sale.getApellidop() + " " + employee.getApellidom(),
//                sale.getPuesto(),
//                sale.getEstado()
//            };
//            tableModel.addRow(rowData);
//        }
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        labelDate = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelSaldoTotal = new javax.swing.JLabel();
        buttonConfirm = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Descripcion", "Cantidad", "Precio por pz", "Total"
            }
        ));
        table.setSelectionBackground(new java.awt.Color(0, 102, 102));
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 650, 550));

        labelDate.setFont(new java.awt.Font("Chandas", 1, 18)); // NOI18N
        labelDate.setForeground(new java.awt.Color(51, 51, 51));
        labelDate.setText(" Fecha: 18/10/2023");
        jPanel1.add(labelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 220, -1));

        labelUser.setFont(new java.awt.Font("Chandas", 1, 18)); // NOI18N
        labelUser.setForeground(new java.awt.Color(51, 51, 51));
        labelUser.setText(" Usuario: ");
        jPanel1.add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 210, 450, -1));

        jLabel4.setFont(new java.awt.Font("Chandas", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText(" Saldo a mantener en caja: 2,000.00");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 390, -1));

        labelSaldoTotal.setFont(new java.awt.Font("Chandas", 1, 18)); // NOI18N
        labelSaldoTotal.setForeground(new java.awt.Color(51, 51, 51));
        labelSaldoTotal.setText(" Saldo total en caja: $10,000.00");
        jPanel1.add(labelSaldoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 360, -1));

        buttonConfirm.setBackground(new java.awt.Color(51, 102, 255));
        buttonConfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonConfirm.setForeground(new java.awt.Color(255, 255, 255));
        buttonConfirm.setText("Confirmar corte");
        jPanel1.add(buttonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 420, 230, 40));

        jLabel6.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(82, 146, 222));
        jLabel6.setText("Movimientos de caja");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 290, -1));

        jLabel3.setFont(new java.awt.Font("Jaldi", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 56, 112));
        jLabel3.setText("Corte de Caja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String user = Session.getAccount().getIdempleado().getNombre() + " " + Session.getAccount().getIdempleado().getApellidop();
        labelUser.setText("Usuario: " + user);
        labelDate.setText("Fecha: " + new SimpleDateFormat("dd/MM/yy").format(new Date()));
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConfirm;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelSaldoTotal;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
