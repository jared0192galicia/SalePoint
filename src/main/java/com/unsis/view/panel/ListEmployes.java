/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.unsis.view.panel;

import com.toedter.calendar.JCalendar;
import com.unsis.clases.Tools;
import com.unsis.controller.JpaController;
import com.unsis.models.entity.Access;
import com.unsis.models.entity.Account;
import com.unsis.models.entity.Employee;
import com.unsis.models.entity.Section;
import com.unsis.view.Main;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jared
 */
public class ListEmployes extends javax.swing.JPanel {

    private final Main mainWindow;
    private final JpaController jpaController;

    private final JCalendar dateIngres;
    private final JCalendar dateNac;
    private final JpaController controller;

    /**
     * Creates new form HumanResourcesPanel
     *
     * @param mainWindow
     */
    public ListEmployes(Main mainWindow) {
        initComponents();

        this.setBounds(217, 0, 1700, 512);
        fileChooser.setVisible(false);
        this.updateEmployee.setBounds(217, 0, 1200, 1500);
        // Obtener el JTableHeader (encabezado de la tabla)
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(32, 136, 203));
        table.getTableHeader().setForeground(Color.WHITE);

        controller = new JpaController();

        dateIngres = new JCalendar(new Date());
        dateIngres.setVisible(false);
        panelInternal.add(dateIngres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 230, 250));
        panelInternal.setComponentZOrder(dateIngres, 0);

        dateNac = new JCalendar(new Date());
        dateNac.setVisible(false);
        panelInternal.add(dateNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 400, 210));
        panelInternal.setComponentZOrder(dateNac, 0);
        
        this.mainWindow = mainWindow;
        this.jpaController = new JpaController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateEmployee = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        panelInternal = new javax.swing.JPanel();
        txtNumEmploy = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLastNameMaternal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLastNamePaternal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        buttonDiscard = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        buttonCalendarNac = new javax.swing.JToggleButton();
        txtNumberPhone = new javax.swing.JTextField();
        checkListProducts = new javax.swing.JCheckBox();
        checkSalePoint = new javax.swing.JCheckBox();
        checkOrders = new javax.swing.JCheckBox();
        checkSettingsApp = new javax.swing.JCheckBox();
        checkCourt = new javax.swing.JCheckBox();
        checkRegisterExpenses = new javax.swing.JCheckBox();
        checkExpensesHistory = new javax.swing.JCheckBox();
        checkListEmployes = new javax.swing.JCheckBox();
        checkUpdateEmployes = new javax.swing.JCheckBox();
        checkRegisterEmploy = new javax.swing.JCheckBox();
        checkUpdateProducts = new javax.swing.JCheckBox();
        checkRegisterProduct = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buttonSelectImage = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        buttonCalendarIngress = new javax.swing.JToggleButton();
        labelInvalidMail = new javax.swing.JLabel();
        labelInvalidPhone = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelInvalidUser = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        buttonCreate = new javax.swing.JButton();
        buttonExport = new javax.swing.JButton();
        buttonModify = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        panelInternal.setBackground(new java.awt.Color(255, 255, 255));
        panelInternal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumEmploy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumEmployKeyReleased(evt);
            }
        });
        panelInternal.add(txtNumEmploy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 150, 30));

        jLabel4.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(118, 125, 142));
        jLabel4.setText("Puesto");
        panelInternal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(118, 125, 142));
        jLabel5.setText("Apellido materno");
        panelInternal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        txtLastNameMaternal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameMaternalKeyReleased(evt);
            }
        });
        panelInternal.add(txtLastNameMaternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 170, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(118, 125, 142));
        jLabel6.setText("N.Empleado");
        panelInternal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(118, 125, 142));
        jLabel7.setText("Correo");
        panelInternal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        panelInternal.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 150, 30));

        jLabel8.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(118, 125, 142));
        jLabel8.setText("Telefono");
        panelInternal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(118, 125, 142));
        jLabel10.setText("Fecha Nacimiento");
        panelInternal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        panelInternal.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        jLabel11.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(118, 125, 142));
        jLabel11.setText("Apellido paterno");
        panelInternal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        txtLastNamePaternal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNamePaternalKeyReleased(evt);
            }
        });
        panelInternal.add(txtLastNamePaternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 170, 30));

        jLabel12.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(118, 125, 142));
        jLabel12.setText("Fecha Ingreso");
        panelInternal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(118, 125, 142));
        jLabel13.setText("Estado");
        panelInternal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        panelInternal.add(comboStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 140, 30));

        jLabel22.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(82, 146, 222));
        jLabel22.setText("Informacion personal");
        panelInternal.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, -1));

        jLabel23.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(118, 125, 142));
        jLabel23.setText("Nombre");
        panelInternal.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 40));

        buttonDiscard.setBackground(new java.awt.Color(153, 11, 11));
        buttonDiscard.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        buttonDiscard.setForeground(new java.awt.Color(255, 255, 255));
        buttonDiscard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconCircleMin.png"))); // NOI18N
        buttonDiscard.setText("Descartar");
        panelInternal.add(buttonDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 650, 210, 50));

        buttonSave.setBackground(new java.awt.Color(46, 125, 18));
        buttonSave.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(255, 255, 255));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        buttonSave.setText("Guardar");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        panelInternal.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 650, 220, 50));

        buttonCalendarNac.setText("-- : -- : ----");
        buttonCalendarNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalendarNacActionPerformed(evt);
            }
        });
        panelInternal.add(buttonCalendarNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 170, 30));

        txtNumberPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumberPhoneFocusLost(evt);
            }
        });
        panelInternal.add(txtNumberPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 170, 30));

        checkListProducts.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkListProducts.setForeground(new java.awt.Color(118, 125, 142));
        checkListProducts.setText("Lista de productos");
        checkListProducts.setName("4"); // NOI18N
        checkListProducts.setOpaque(false);
        panelInternal.add(checkListProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, -1, -1));

        checkSalePoint.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkSalePoint.setForeground(new java.awt.Color(118, 125, 142));
        checkSalePoint.setText("Punto de venta");
        checkSalePoint.setName("6"); // NOI18N
        checkSalePoint.setOpaque(false);
        panelInternal.add(checkSalePoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 140, -1, -1));

        checkOrders.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkOrders.setForeground(new java.awt.Color(118, 125, 142));
        checkOrders.setText("Pedidos entranates");
        checkOrders.setName("5"); // NOI18N
        checkOrders.setOpaque(false);
        panelInternal.add(checkOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 180, -1, -1));

        checkSettingsApp.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkSettingsApp.setForeground(new java.awt.Color(118, 125, 142));
        checkSettingsApp.setText("Ajustes del aplicativo");
        checkSettingsApp.setName("7"); // NOI18N
        checkSettingsApp.setOpaque(false);
        panelInternal.add(checkSettingsApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 280, -1, -1));

        checkCourt.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkCourt.setForeground(new java.awt.Color(118, 125, 142));
        checkCourt.setText("Corte de caja");
        checkCourt.setName("8"); // NOI18N
        checkCourt.setOpaque(false);
        panelInternal.add(checkCourt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 380, -1, -1));

        checkRegisterExpenses.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkRegisterExpenses.setForeground(new java.awt.Color(118, 125, 142));
        checkRegisterExpenses.setText("Registrar gastos");
        checkRegisterExpenses.setName("9"); // NOI18N
        checkRegisterExpenses.setOpaque(false);
        panelInternal.add(checkRegisterExpenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 420, -1, -1));

        checkExpensesHistory.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkExpensesHistory.setForeground(new java.awt.Color(118, 125, 142));
        checkExpensesHistory.setText("Historial de gastos");
        checkExpensesHistory.setName("9"); // NOI18N
        checkExpensesHistory.setOpaque(false);
        panelInternal.add(checkExpensesHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 460, -1, -1));

        checkListEmployes.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkListEmployes.setForeground(new java.awt.Color(118, 125, 142));
        checkListEmployes.setText("Lista de Empleados");
        checkListEmployes.setName("1"); // NOI18N
        checkListEmployes.setOpaque(false);
        panelInternal.add(checkListEmployes, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, -1, -1));

        checkUpdateEmployes.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkUpdateEmployes.setForeground(new java.awt.Color(118, 125, 142));
        checkUpdateEmployes.setText("Modificación de empleados");
        checkUpdateEmployes.setOpaque(false);
        panelInternal.add(checkUpdateEmployes, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, -1, -1));

        checkRegisterEmploy.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkRegisterEmploy.setForeground(new java.awt.Color(118, 125, 142));
        checkRegisterEmploy.setText("Registro de empleados");
        checkRegisterEmploy.setName("2"); // NOI18N
        checkRegisterEmploy.setOpaque(false);
        panelInternal.add(checkRegisterEmploy, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, -1, -1));

        checkUpdateProducts.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkUpdateProducts.setForeground(new java.awt.Color(118, 125, 142));
        checkUpdateProducts.setText("Modificación de productos");
        checkUpdateProducts.setOpaque(false);
        panelInternal.add(checkUpdateProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, -1, -1));

        checkRegisterProduct.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkRegisterProduct.setForeground(new java.awt.Color(118, 125, 142));
        checkRegisterProduct.setText("Alta de productos");
        checkRegisterProduct.setName("3"); // NOI18N
        checkRegisterProduct.setOpaque(false);
        panelInternal.add(checkRegisterProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 180, -1, -1));

        jLabel27.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(118, 125, 142));
        jLabel27.setText("Contabilidad");
        panelInternal.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 340, 110, 40));

        jLabel24.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(118, 125, 142));
        jLabel24.setText("Recursos Humanos");
        panelInternal.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 210, 40));

        jLabel3.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(118, 125, 142));
        jLabel3.setText("Ajustes");
        panelInternal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 240, 110, 40));

        jLabel25.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(118, 125, 142));
        jLabel25.setText("Ventas");
        panelInternal.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 90, 90, 40));

        jLabel26.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(118, 125, 142));
        jLabel26.setText("Almacen");
        panelInternal.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 120, 40));

        jLabel9.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(82, 146, 222));
        jLabel9.setText("Accesos");
        panelInternal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 213, -1));

        jLabel17.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(82, 146, 222));
        jLabel17.setText("Foto de Empleado");
        panelInternal.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 240, -1));

        buttonSelectImage.setBackground(new java.awt.Color(0, 102, 102));
        buttonSelectImage.setForeground(new java.awt.Color(255, 255, 255));
        buttonSelectImage.setText("Elegir Imagen");
        buttonSelectImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSelectImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelectImageActionPerformed(evt);
            }
        });
        panelInternal.add(buttonSelectImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 150, 140));

        jLabel14.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(82, 146, 222));
        jLabel14.setText("Información de cuenta");
        panelInternal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 310, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(118, 125, 142));
        jLabel18.setText("Usuario");
        panelInternal.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));
        panelInternal.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 210, 30));

        jLabel19.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(118, 125, 142));
        jLabel19.setText("Contraseña temporal");
        panelInternal.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 240, -1));

        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        panelInternal.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 210, 30));

        buttonCalendarIngress.setText("-- : -- : ----");
        buttonCalendarIngress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalendarIngressActionPerformed(evt);
            }
        });
        panelInternal.add(buttonCalendarIngress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 170, 30));

        labelInvalidMail.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelInvalidMail.setForeground(new java.awt.Color(153, 0, 0));
        labelInvalidMail.setText("Correo invalido");
        panelInternal.add(labelInvalidMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 150, -1));

        labelInvalidPhone.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelInvalidPhone.setForeground(new java.awt.Color(153, 0, 0));
        labelInvalidPhone.setText("Telefono invalido");
        panelInternal.add(labelInvalidPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 150, -1));

        jLabel15.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(82, 146, 222));
        jLabel15.setText("Informacion empresarial");
        panelInternal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 360, -1));

        labelInvalidUser.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelInvalidUser.setForeground(new java.awt.Color(153, 0, 0));
        labelInvalidUser.setText("Nombre de usuario invalido");
        panelInternal.add(labelInvalidUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 210, -1));
        panelInternal.add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 150, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1610, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelInternal, javax.swing.GroupLayout.PREFERRED_SIZE, 1610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelInternal, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        fileChooser.setDialogTitle("Seleccionar imagen");

        javax.swing.GroupLayout updateEmployeeLayout = new javax.swing.GroupLayout(updateEmployee.getContentPane());
        updateEmployee.getContentPane().setLayout(updateEmployeeLayout);
        updateEmployeeLayout.setHorizontalGroup(
            updateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1610, Short.MAX_VALUE)
            .addGroup(updateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateEmployeeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(updateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateEmployeeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        updateEmployeeLayout.setVerticalGroup(
            updateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(updateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateEmployeeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(updateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateEmployeeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setBackground(new java.awt.Color(240, 240, 240));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonCreate.setBackground(new java.awt.Color(255, 255, 255));
        buttonCreate.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonCreate.setForeground(new java.awt.Color(0, 153, 0));
        buttonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPlus.png"))); // NOI18N
        buttonCreate.setText("Alta");
        buttonCreate.setBorder(BorderFactory.createLineBorder(new Color(0,153,0), 2));
        buttonCreate.setContentAreaFilled(false);
        buttonCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCreate.setMaximumSize(new java.awt.Dimension(157, 38));
        buttonCreate.setMinimumSize(new java.awt.Dimension(157, 38));
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 60));

        buttonExport.setBackground(new java.awt.Color(0, 102, 0));
        buttonExport.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonExport.setForeground(new java.awt.Color(255, 255, 255));
        buttonExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exportExcel .png"))); // NOI18N
        buttonExport.setText("Exportar");
        buttonExport.setBorder(null);
        buttonExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonExport.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(buttonExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 25, 136, 40));

        buttonModify.setBackground(new java.awt.Color(255, 255, 255));
        buttonModify.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonModify.setForeground(new java.awt.Color(101, 128, 223));
        buttonModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconEdit.png"))); // NOI18N
        buttonModify.setText("Modificación");
        buttonModify.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        buttonModify.setContentAreaFilled(false);
        buttonModify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonModify.setMaximumSize(new java.awt.Dimension(157, 35));
        buttonModify.setMinimumSize(new java.awt.Dimension(157, 35));
        buttonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifyActionPerformed(evt);
            }
        });
        jPanel1.add(buttonModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 170, 60));

        buttonDelete.setBackground(new java.awt.Color(255, 255, 255));
        buttonDelete.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(255, 0, 51));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTrash.png"))); // NOI18N
        buttonDelete.setText("Eliminar");
        buttonDelete.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        buttonDelete.setContentAreaFilled(false);
        buttonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDelete.setMaximumSize(new java.awt.Dimension(157, 35));
        buttonDelete.setMinimumSize(new java.awt.Dimension(157, 35));
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 170, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(453, 500));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Empleado", "Nombre", "Apellidos", "Area", "Estatus"
            }
        ));
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setRowHeight(25);
        table.setRowMargin(3);
        table.setShowGrid(true);
        table.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 83, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Jaldi", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 56, 112));
        jLabel2.setText("Empleados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1517, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1704, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        this.mainWindow.setView("Alta de Empleado");
    }//GEN-LAST:event_buttonCreateActionPerformed

    public void showModel() {
        // Llamada al método findAllEntities para obtener la lista de empleados
        ArrayList<Employee> employees = jpaController.findAllEntities(Employee.class);

        // Configuración del modelo de la tabla
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        // Eliminar filas existentes
        tableModel.setRowCount(0);
        table.setModel(tableModel);

        for (Employee employee : employees) {
            Object[] rowData = {
                employee.getNumempleado(),
                employee.getNombre(),
                employee.getApellidop() + " " + employee.getApellidom(),
                employee.getPuesto(),
                employee.getEstado()
            };
            tableModel.addRow(rowData);
        }
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.showModel();
    }//GEN-LAST:event_formComponentShown

    public Employee findEmployee() {
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada != -1) { // Verifica que haya una fila seleccionada
            var codeEmployee = table.getValueAt(filaSeleccionada, 0);

            ArrayList<Employee> employees = jpaController.findAllEntities(Employee.class);

            for (Employee employee : employees) {
                if (employee.getNumempleado() == codeEmployee) {
                    return employee;

                }
            }
        }
        return null;
    }

    public Account findAccount(Employee employee) {

        ArrayList<Account> accounts = jpaController.findAllEntities(Account.class);

        for (Account account : accounts) {
            if (Objects.equals(account.getIdempleado().getNumempleado(), employee.getNumempleado())) {
                return account;

            }
        }
        return null;
    }
    // Método para obtener los nombres de los JCheckBox en un ArrayList

    public ArrayList<String> getCheckBoxNames() {
        ArrayList<String> checkBoxNames = new ArrayList<>();

        checkBoxNames.add(checkCourt.getName());
        checkBoxNames.add(checkExpensesHistory.getName());
        checkBoxNames.add(checkListEmployes.getName());
        checkBoxNames.add(checkListProducts.getName());
        checkBoxNames.add(checkOrders.getName());
        checkBoxNames.add(checkRegisterEmploy.getName());
        checkBoxNames.add(checkRegisterExpenses.getName());
        checkBoxNames.add(checkRegisterProduct.getName());
        checkBoxNames.add(checkSalePoint.getName());
        checkBoxNames.add(checkSettingsApp.getName());
        checkBoxNames.add(checkUpdateEmployes.getName());
        checkBoxNames.add(checkUpdateProducts.getName());

        return checkBoxNames;
    }

    private List<Access> generateAccess(Account account) {
        // Creas una instancia de Access
        Access access;
        ArrayList<Section> sections = controller.findAllEntities(Section.class);
        ArrayList<String> ids = getCheckBoxNames();
        List<Access> accessList = new ArrayList<>();
        // Estableces la relación con la sección
        for (Section section : sections) {

            if (ids.contains(section.getId())) {
                access = new Access.Builder()
                        .withId(section.getId())
                        .withIdCuenta(account)
                        .withIdSeccion(section)
                        .build();
                accessList.add(access); // Agregas el nuevo Access a la lista

            }
        }
        return accessList;
    }

    private void verify(KeyEvent evt, JTextField field, String regex) {
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();

        if (KeyEvent.getKeyText(keyCode).length() > 1) {
            return;
        }

        // Verifica si el carácter ingresado no es válido
        if (!Character.toString(c).matches(regex)) {
            // Consume el evento para evitar que el carácter no válido se agregue al JTextField// Obtiene el texto actual del JTextField
            String textoActual = field.getText();

            // Elimina el último carácter del texto actual
            if (textoActual.length() > 0) {
                String textoSinUltimoCaracter = textoActual.substring(0, textoActual.length() - 1);
                field.setText(textoSinUltimoCaracter);
            }
        }
    }

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed

        Employee employee = findEmployee();

        if (employee != null) {
            int opcion = JOptionPane.showConfirmDialog(null,
                    "¿Estás seguro de continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                Account account = findAccount(employee);
                if (account != null) {
                    jpaController.destroy(findAccount(employee));
                }

                jpaController.destroy(employee);
                this.showModel();
            }
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifyActionPerformed
        Employee employee = findEmployee();
        updateEmployee.show(true);
//        updateEmployee.
    }//GEN-LAST:event_buttonModifyActionPerformed

    private void txtNumEmployKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumEmployKeyReleased
        verify(evt, txtNumEmploy, "^[0-9]$");
    }//GEN-LAST:event_txtNumEmployKeyReleased

    private void txtLastNameMaternalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameMaternalKeyReleased
        verify(evt, txtLastNameMaternal, "^[A-Za-zÁ-úüÜñÑ]*$");
    }//GEN-LAST:event_txtLastNameMaternalKeyReleased

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        String email = txtEmail.getText().trim();
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            labelInvalidMail.setVisible(false);
        } else {
            System.out.println("Correo electrónico inválido");
            txtEmail.requestFocus();
            labelInvalidMail.setVisible(true);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        verify(evt, txtName, "^[A-Za-zÁ-úüÜñÑ]*$");
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtLastNamePaternalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNamePaternalKeyReleased
        verify(evt, txtLastNamePaternal, "^[A-Za-zÁ-úüÜñÑ]*$");
    }//GEN-LAST:event_txtLastNamePaternalKeyReleased

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        Employee employee = new Employee.Builder()
                .withId(35)
                .withNumEmpleado(Integer.valueOf(txtNumEmploy.getText().trim()))
                .withNombre(txtName.getText().trim())
                .withApellidoP(txtLastNamePaternal.getText().trim())
                .withApellidoM(txtLastNameMaternal.getText().trim())
                .withFechaNac(dateNac.getDate())
                .withCorreo(txtEmail.getText().trim())
                .withTelefono(txtNumberPhone.getText().trim())
                .withFechaIng(dateIngres.getDate())
                .withEstado(String.valueOf(comboStatus.getSelectedItem()))
                .withPuesto(txtPosition.getText().trim())
                .build();

        controller.create(employee);

        Account account = new Account.Builder()
                .withId(1)
                .withNumCuenta(Integer.valueOf(txtNumEmploy.getText().trim()))
                .withUsuario(txtUserName.getText().trim())
                .withContrasena(Tools.cryptPassword(txtPassword.getText().trim()))
                .withIdEmpleado(employee) // instancia que esta abajo
                .build();
        controller.create(account);

        account.setAccessList(generateAccess(account));
        controller.edit(account);

        account = controller.findEntityById(1, new Account().getClass());
        System.out.println(account.getContrasena());
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonCalendarNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalendarNacActionPerformed
        if (dateNac.isVisible()) {
            dateNac.setVisible(false);
            buttonCalendarNac.setText(dateNac.getDate().toLocaleString());
            System.err.println("Fecha seleccionada: " + dateNac.getDate().toLocaleString());
        } else {
            dateNac.setVisible(true);
            buttonCalendarNac.setText("-- : -- : ----");
        }
    }//GEN-LAST:event_buttonCalendarNacActionPerformed

    private void txtNumberPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumberPhoneFocusLost
        String phoneNumber = txtNumberPhone.getText().trim();
        String regex = "\\d{10}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println("Número de teléfono válido");
            labelInvalidPhone.setVisible(false);
        } else {
            txtNumberPhone.requestFocus();
            labelInvalidPhone.setVisible(true);
        }
    }//GEN-LAST:event_txtNumberPhoneFocusLost

    private void buttonSelectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelectImageActionPerformed
        fileChooser.showDialog(this, "Aceptar");

        String path = fileChooser.getSelectedFile().getPath();

        if (!path.isEmpty()) {
            Tools tools = new Tools();
            this.buttonSelectImage.setIcon(tools.resizeIcon(
                    new ImageIcon(path), 140, 140));

            this.buttonSelectImage.setOpaque(false);
            this.buttonSelectImage.setText("");

        }
    }//GEN-LAST:event_buttonSelectImageActionPerformed

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        String username = txtUserName.getText().trim();
        String regex = "^[a-zA-Z0-9_]{5,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        if (matcher.matches()) {
            labelInvalidUser.setVisible(false);
        } else {
            labelInvalidUser.setVisible(true);
            txtUserName.requestFocus();
        }
    }//GEN-LAST:event_txtUserNameFocusLost

    private void buttonCalendarIngressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalendarIngressActionPerformed
        if (dateIngres.isVisible()) {
            dateIngres.setVisible(false);
            buttonCalendarIngress.setText(dateIngres.getDate().toLocaleString());
            System.err.println("Fecha seleccionada: " + dateIngres.getDate().toLocaleString());
        } else {
            dateIngres.setVisible(true);
            buttonCalendarIngress.setText("-- : -- : ----");
        }
    }//GEN-LAST:event_buttonCalendarIngressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonCalendarIngress;
    private javax.swing.JToggleButton buttonCalendarNac;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonDiscard;
    private javax.swing.JButton buttonExport;
    private javax.swing.JButton buttonModify;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSelectImage;
    private javax.swing.JCheckBox checkCourt;
    private javax.swing.JCheckBox checkExpensesHistory;
    private javax.swing.JCheckBox checkListEmployes;
    private javax.swing.JCheckBox checkListProducts;
    private javax.swing.JCheckBox checkOrders;
    private javax.swing.JCheckBox checkRegisterEmploy;
    private javax.swing.JCheckBox checkRegisterExpenses;
    private javax.swing.JCheckBox checkRegisterProduct;
    private javax.swing.JCheckBox checkSalePoint;
    private javax.swing.JCheckBox checkSettingsApp;
    private javax.swing.JCheckBox checkUpdateEmployes;
    private javax.swing.JCheckBox checkUpdateProducts;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelInvalidMail;
    private javax.swing.JLabel labelInvalidPhone;
    private javax.swing.JLabel labelInvalidUser;
    private javax.swing.JPanel panelInternal;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastNameMaternal;
    private javax.swing.JTextField txtLastNamePaternal;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumEmploy;
    private javax.swing.JTextField txtNumberPhone;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JDialog updateEmployee;
    // End of variables declaration//GEN-END:variables
}
