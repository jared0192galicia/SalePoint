/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.unsis.view.panel;

import com.unsis.view.Main;

/**
 *
 * @author labtecweb09
 */
public class MainMenu extends javax.swing.JPanel {

    private final Main mainWindow;

    /**
     * Creates new form Venta
     *
     * @param mainWindow
     */
    public MainMenu(Main mainWindow) {
        initComponents();

        this.mainWindow = mainWindow;
        this.setSize(1700, 861);
        this.setBounds(217, 0, this.getWidth(), this.getHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonInventory = new javax.swing.JButton();
        buttonHumanResources = new javax.swing.JButton();
        buttonConta = new javax.swing.JButton();
        buttonSales = new javax.swing.JButton();
        buttonSalePoint = new javax.swing.JButton();
        buttonSettings = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Jaldi", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 56, 112));
        jLabel2.setText("Bienvenido Jared");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, 46));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonInventory.setBackground(new java.awt.Color(51, 153, 255));
        buttonInventory.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        buttonInventory.setForeground(new java.awt.Color(255, 255, 255));
        buttonInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventario.png"))); // NOI18N
        buttonInventory.setText("Inventario");
        buttonInventory.setBorder(null);
        buttonInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonInventory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonInventory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInventoryActionPerformed(evt);
            }
        });
        jPanel1.add(buttonInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, 240, 160));

        buttonHumanResources.setBackground(new java.awt.Color(255, 153, 204));
        buttonHumanResources.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        buttonHumanResources.setForeground(new java.awt.Color(255, 255, 255));
        buttonHumanResources.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursoshumanos.png"))); // NOI18N
        buttonHumanResources.setText("Recursos Humanos");
        buttonHumanResources.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHumanResources.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonHumanResources.setIconTextGap(0);
        buttonHumanResources.setPreferredSize(new java.awt.Dimension(76, 79));
        buttonHumanResources.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonHumanResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHumanResourcesActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHumanResources, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 45, 260, 160));

        buttonConta.setBackground(new java.awt.Color(0, 153, 0));
        buttonConta.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        buttonConta.setForeground(new java.awt.Color(255, 255, 255));
        buttonConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contabilidad.png"))); // NOI18N
        buttonConta.setText("Contabilidad");
        buttonConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonConta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonContaActionPerformed(evt);
            }
        });
        jPanel1.add(buttonConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 45, 240, 160));

        buttonSales.setBackground(new java.awt.Color(102, 102, 255));
        buttonSales.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        buttonSales.setForeground(new java.awt.Color(255, 255, 255));
        buttonSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventas.png"))); // NOI18N
        buttonSales.setText("Ventas");
        buttonSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalesActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 45, 230, 160));

        buttonSalePoint.setBackground(new java.awt.Color(0, 204, 102));
        buttonSalePoint.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        buttonSalePoint.setForeground(new java.awt.Color(255, 255, 255));
        buttonSalePoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntodeventa.png"))); // NOI18N
        buttonSalePoint.setText("Punto de Venta");
        buttonSalePoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSalePoint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSalePoint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSalePoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalePointActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSalePoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 45, 230, 160));

        buttonSettings.setBackground(new java.awt.Color(255, 153, 51));
        buttonSettings.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        buttonSettings.setForeground(new java.awt.Color(255, 255, 255));
        buttonSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajustes.png"))); // NOI18N
        buttonSettings.setText("Ajustes");
        buttonSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSettings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSettings.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSettingsActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 45, 220, 160));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 1590, 250));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Kevin Arnold Cortés Pacheco");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel14.setText("07 de Noviembre");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 520, 540, 400));

        jLabel25.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(7, 56, 112));
        jLabel25.setText("Noticias");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 213, -1));

        jLabel26.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(7, 56, 112));
        jLabel26.setText("¡Ajuste en los productos de tipo bebidas!");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 520, -1));

        jButton7.setBackground(new java.awt.Color(51, 153, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Descubre más");
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("   ●  A partir de la proxima semana a las bebidas de la marca Boing tendran un aumento de precios del\n          5% por pieza, los cambios se haran automaticamente en el sistema.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 750, 100));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 1110, 270));

        jLabel23.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(7, 56, 112));
        jLabel23.setText("Cumpleaños");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 410, 213, -1));

        jLabel24.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(7, 56, 112));
        jLabel24.setText("Noticias");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 213, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(7, 56, 112));
        jLabel1.setText("Kevin Arnold Cortés Pacheco");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ellipse 22.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 210));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pastel.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 260, 100, 90));

        jLabel5.setForeground(new java.awt.Color(7, 56, 112));
        jLabel5.setText("07 de Noviembre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 450, 270, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInventoryActionPerformed
        mainWindow.setView("Lista Productos");
    }//GEN-LAST:event_buttonInventoryActionPerformed

    private void buttonHumanResourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHumanResourcesActionPerformed
        mainWindow.setView("Lista Empleados");
    }//GEN-LAST:event_buttonHumanResourcesActionPerformed

    private void buttonContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonContaActionPerformed
        mainWindow.setView("Corte de caja");
    }//GEN-LAST:event_buttonContaActionPerformed

    private void buttonSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalesActionPerformed
        mainWindow.setView("Ordenes entrantes");
    }//GEN-LAST:event_buttonSalesActionPerformed

    private void buttonSalePointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalePointActionPerformed
        mainWindow.setView("Punto de Venta");
    }//GEN-LAST:event_buttonSalePointActionPerformed

    private void buttonSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSettingsActionPerformed
        mainWindow.setView("Ajustes del generales");
    }//GEN-LAST:event_buttonSettingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonHumanResources;
    private javax.swing.JButton buttonInventory;
    private javax.swing.JButton buttonSalePoint;
    private javax.swing.JButton buttonSales;
    private javax.swing.JButton buttonSettings;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
