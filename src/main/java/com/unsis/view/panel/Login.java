package com.unsis.view.panel;

import com.toedter.calendar.JCalendar;
import com.unsis.clases.Tools;
import com.unsis.controller.JpaController;
import com.unsis.models.entity.Access;
import com.unsis.models.entity.Account;
import com.unsis.models.entity.Employee;
import com.unsis.models.entity.Section;
import com.unsis.view.Main;
import com.unsis.view.ResetPassword;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Elio
 */
public class Login extends javax.swing.JFrame {

    private final JCalendar dateIngres;
    private final JCalendar dateNac;
    private final JpaController controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio de Sesión");

        this.resetPass.setLocationRelativeTo(null);
        this.resetPass.setSize(450, 506);
        this.resetPass.setBounds(this.getX() + 300, this.getY() - 25, 450, 506);
        this.resetPass.setTitle("Resetear contraseña");

        this.firtsUser.setLocationRelativeTo(null);
        this.firtsUser.setSize(1710, 840);
        this.firtsUser.setBounds(this.getX() + 300, this.getY() - 25, 1710, 860);
        this.firtsUser.setTitle("Registra tu usuario de Administrador!!");

        this.firtsUser.add(new RegisterEmployed());
        dateIngres = new JCalendar(new Date());
        dateIngres.setVisible(false);

        panelInternal.add(dateIngres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 230, 250));
        panelInternal.setComponentZOrder(dateIngres, 0);

        dateNac = new JCalendar(new Date());
        dateNac.setVisible(false);
        this.controller = new JpaController();

        if (!existAccount()) {

            panelInternal.add(dateNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 400, 210));
            panelInternal.setComponentZOrder(dateNac, 0);
            JOptionPane.showMessageDialog(null, "No existe ningun usuario registrado");
            firtsUser.setVisible(true);
        }

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        resetPass = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textMessage = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtMailReset = new javax.swing.JTextField();
        buttonSend = new javax.swing.JButton();
        firtsUser = new javax.swing.JDialog();
        panelInternal = new javax.swing.JPanel();
        txtNumEmploy = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLastNameMaternal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtLastNamePaternal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        buttonSelectImage = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        buttonCalendarIngress = new javax.swing.JToggleButton();
        labelInvalidMail = new javax.swing.JLabel();
        labelInvalidPhone = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        labelInvalidUser = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelResetPass = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelClose = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        resetPass.setTitle("Restablecer contraseña");
        resetPass.setAlwaysOnTop(true);
        resetPass.setFocusTraversalPolicyProvider(true);
        resetPass.setLocationByPlatform(true);
        resetPass.setModal(true);
        resetPass.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(245, 248, 251));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(17, 57, 103));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        textMessage.setEditable(false);
        textMessage.setColumns(20);
        textMessage.setForeground(new java.awt.Color(180, 184, 186));
        textMessage.setRows(5);
        textMessage.setBorder(null);
        textMessage.setOpaque(false);
        jScrollPane1.setViewportView(textMessage);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 65, 370, -1));

        jLabel5.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(118, 125, 142));
        jLabel5.setText("Correo Electronico");

        txtMailReset.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonSend.setBackground(new java.awt.Color(0, 102, 102));
        buttonSend.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buttonSend.setForeground(new java.awt.Color(255, 255, 255));
        buttonSend.setText("Enviar");
        buttonSend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(txtMailReset, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMailReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 370, 200));

        javax.swing.GroupLayout resetPassLayout = new javax.swing.GroupLayout(resetPass.getContentPane());
        resetPass.getContentPane().setLayout(resetPassLayout);
        resetPassLayout.setHorizontalGroup(
            resetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        resetPassLayout.setVerticalGroup(
            resetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        firtsUser.setModal(true);

        panelInternal.setBackground(new java.awt.Color(255, 255, 255));
        panelInternal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumEmploy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumEmployKeyReleased(evt);
            }
        });
        panelInternal.add(txtNumEmploy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 150, 30));

        jLabel7.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(118, 125, 142));
        jLabel7.setText("Puesto");
        panelInternal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(118, 125, 142));
        jLabel8.setText("Apellido materno");
        panelInternal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        txtLastNameMaternal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameMaternalKeyReleased(evt);
            }
        });
        panelInternal.add(txtLastNameMaternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 170, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(118, 125, 142));
        jLabel9.setText("N.Empleado");
        panelInternal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(118, 125, 142));
        jLabel10.setText("Correo");
        panelInternal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        panelInternal.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 150, 30));

        jLabel11.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(118, 125, 142));
        jLabel11.setText("Telefono");
        panelInternal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(118, 125, 142));
        jLabel12.setText("Fecha Nacimiento");
        panelInternal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        panelInternal.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        jLabel13.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(118, 125, 142));
        jLabel13.setText("Apellido paterno");
        panelInternal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        txtLastNamePaternal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNamePaternalKeyReleased(evt);
            }
        });
        panelInternal.add(txtLastNamePaternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 170, 30));

        jLabel14.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(118, 125, 142));
        jLabel14.setText("Fecha Ingreso");
        panelInternal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(118, 125, 142));
        jLabel15.setText("Estado");
        panelInternal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

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
        checkListProducts.setSelected(true);
        checkListProducts.setText("Lista de productos");
        checkListProducts.setName("4"); // NOI18N
        checkListProducts.setOpaque(false);
        panelInternal.add(checkListProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, -1, -1));

        checkSalePoint.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkSalePoint.setForeground(new java.awt.Color(118, 125, 142));
        checkSalePoint.setSelected(true);
        checkSalePoint.setText("Punto de venta");
        checkSalePoint.setName("6"); // NOI18N
        checkSalePoint.setOpaque(false);
        panelInternal.add(checkSalePoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 140, -1, -1));

        checkOrders.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkOrders.setForeground(new java.awt.Color(118, 125, 142));
        checkOrders.setSelected(true);
        checkOrders.setText("Pedidos entranates");
        checkOrders.setName("5"); // NOI18N
        checkOrders.setOpaque(false);
        panelInternal.add(checkOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 180, -1, -1));

        checkSettingsApp.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkSettingsApp.setForeground(new java.awt.Color(118, 125, 142));
        checkSettingsApp.setSelected(true);
        checkSettingsApp.setText("Ajustes del aplicativo");
        checkSettingsApp.setName("7"); // NOI18N
        checkSettingsApp.setOpaque(false);
        panelInternal.add(checkSettingsApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 280, -1, -1));

        checkCourt.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkCourt.setForeground(new java.awt.Color(118, 125, 142));
        checkCourt.setSelected(true);
        checkCourt.setText("Corte de caja");
        checkCourt.setName("8"); // NOI18N
        checkCourt.setOpaque(false);
        panelInternal.add(checkCourt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 380, -1, -1));

        checkRegisterExpenses.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkRegisterExpenses.setForeground(new java.awt.Color(118, 125, 142));
        checkRegisterExpenses.setSelected(true);
        checkRegisterExpenses.setText("Registrar gastos");
        checkRegisterExpenses.setName("9"); // NOI18N
        checkRegisterExpenses.setOpaque(false);
        panelInternal.add(checkRegisterExpenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 420, -1, -1));

        checkExpensesHistory.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkExpensesHistory.setForeground(new java.awt.Color(118, 125, 142));
        checkExpensesHistory.setSelected(true);
        checkExpensesHistory.setText("Historial de gastos");
        checkExpensesHistory.setName("9"); // NOI18N
        checkExpensesHistory.setOpaque(false);
        panelInternal.add(checkExpensesHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 460, -1, -1));

        checkListEmployes.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkListEmployes.setForeground(new java.awt.Color(118, 125, 142));
        checkListEmployes.setSelected(true);
        checkListEmployes.setText("Lista de Empleados");
        checkListEmployes.setName("1"); // NOI18N
        checkListEmployes.setOpaque(false);
        panelInternal.add(checkListEmployes, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, -1, -1));

        checkUpdateEmployes.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkUpdateEmployes.setForeground(new java.awt.Color(118, 125, 142));
        checkUpdateEmployes.setSelected(true);
        checkUpdateEmployes.setText("Modificación de empleados");
        checkUpdateEmployes.setName("10"); // NOI18N
        checkUpdateEmployes.setOpaque(false);
        panelInternal.add(checkUpdateEmployes, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, -1, -1));

        checkRegisterEmploy.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkRegisterEmploy.setForeground(new java.awt.Color(118, 125, 142));
        checkRegisterEmploy.setSelected(true);
        checkRegisterEmploy.setText("Registro de empleados");
        checkRegisterEmploy.setName("2"); // NOI18N
        checkRegisterEmploy.setOpaque(false);
        panelInternal.add(checkRegisterEmploy, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, -1, -1));

        checkUpdateProducts.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkUpdateProducts.setForeground(new java.awt.Color(118, 125, 142));
        checkUpdateProducts.setSelected(true);
        checkUpdateProducts.setText("Modificación de productos");
        checkUpdateProducts.setName("11"); // NOI18N
        checkUpdateProducts.setOpaque(false);
        panelInternal.add(checkUpdateProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, -1, -1));

        checkRegisterProduct.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        checkRegisterProduct.setForeground(new java.awt.Color(118, 125, 142));
        checkRegisterProduct.setSelected(true);
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

        jLabel16.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(118, 125, 142));
        jLabel16.setText("Ajustes");
        panelInternal.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 240, 110, 40));

        jLabel25.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(118, 125, 142));
        jLabel25.setText("Ventas");
        panelInternal.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 90, 90, 40));

        jLabel26.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(118, 125, 142));
        jLabel26.setText("Almacen");
        panelInternal.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 120, 40));

        jLabel17.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(82, 146, 222));
        jLabel17.setText("Accesos");
        panelInternal.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 213, -1));

        jLabel18.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(82, 146, 222));
        jLabel18.setText("Foto de Empleado");
        panelInternal.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 240, -1));

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

        jLabel19.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(82, 146, 222));
        jLabel19.setText("Información de cuenta");
        panelInternal.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 310, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(118, 125, 142));
        jLabel20.setText("Usuario");
        panelInternal.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));
        panelInternal.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 210, 30));

        jLabel21.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(118, 125, 142));
        jLabel21.setText("Contraseña temporal");
        panelInternal.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 240, -1));

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

        jLabel28.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(82, 146, 222));
        jLabel28.setText("Informacion empresarial");
        panelInternal.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 360, -1));

        labelInvalidUser.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelInvalidUser.setForeground(new java.awt.Color(153, 0, 0));
        labelInvalidUser.setText("Nombre de usuario invalido");
        panelInternal.add(labelInvalidUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 210, -1));
        panelInternal.add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 150, 30));

        javax.swing.GroupLayout firtsUserLayout = new javax.swing.GroupLayout(firtsUser.getContentPane());
        firtsUser.getContentPane().setLayout(firtsUserLayout);
        firtsUserLayout.setHorizontalGroup(
            firtsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1590, Short.MAX_VALUE)
            .addGroup(firtsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firtsUserLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInternal, javax.swing.GroupLayout.PREFERRED_SIZE, 1578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        firtsUserLayout.setVerticalGroup(
            firtsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
            .addGroup(firtsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firtsUserLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInternal, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 57, 103));

        jLabel1.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 231, 231));
        jLabel1.setText("Usuario");

        buttonLogin.setBackground(new java.awt.Color(25, 130, 206));
        buttonLogin.setFont(new java.awt.Font("Jaldi", 1, 15)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Login");
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Jaldi", 0, 15)); // NOI18N
        txtUser.setForeground(new java.awt.Color(51, 51, 51));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("jGalicia");
        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtUser.setPreferredSize(new java.awt.Dimension(210, 25));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 231, 231));
        jLabel2.setText("Contraseña");

        txtPass.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(51, 51, 51));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setText("1234");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(txtPass))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(buttonLogin)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Jaldi", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(118, 125, 142));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bienvenido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 592, 28));

        labelResetPass.setForeground(new java.awt.Color(82, 146, 222));
        labelResetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResetPass.setText("¿Olvidaste tu contraseña?");
        labelResetPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelResetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelResetPassMouseClicked(evt);
            }
        });
        jPanel2.add(labelResetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 170, 200, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vector 2.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 540, 60));

        labelClose.setForeground(new java.awt.Color(118, 125, 142));
        labelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClose.setText("Cerrar");
        labelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCloseMouseClicked(evt);
            }
        });
        jPanel2.add(labelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 230, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vector 2.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 500, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private boolean existAccount() {
        ArrayList<Account> allEntities = new JpaController().findAllEntities(Account.class);

        return !allEntities.isEmpty();

    }

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        String user = txtUser.getText().trim();
        String pass = txtPass.getText().trim();

        if (!user.equals("") && !pass.equals("")) {

            Account logger = new Account(user, pass);
            JpaController sesion = new JpaController();

            if (sesion.auth(user, logger.getContrasena())) {
                new Main().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }

    }//GEN-LAST:event_buttonLoginActionPerformed

    private void labelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelCloseMouseClicked

    private void labelResetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPassMouseClicked
        new ResetPassword().setVisible(true);
    }//GEN-LAST:event_labelResetPassMouseClicked

    private void buttonSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSendMouseClicked
       
    }//GEN-LAST:event_buttonSendMouseClicked

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

        String path;
        try {

            path = fileChooser.getSelectedFile().getPath();

            if (path.isEmpty()) {
                path = "/profileDefault.png";
            }
        } catch (Exception e) {
            path = "/profileDefault.png";
        }

        Account account = new Account.Builder()
                .withNumCuenta(Integer.valueOf(txtNumEmploy.getText().trim()))
                .withUsuario(txtUserName.getText().trim())
                .withContrasena(Tools.cryptPassword(txtPassword.getText().trim()))
                .withIdEmpleado(employee)
                .withFotoPerfil(path)
                .build();

        employee.setAccount(account);
        account.setAccessList(generateAccess(account));

        try {
            controller.create(employee);
            JOptionPane.showMessageDialog(null, "Empleado egistrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar a el empleado", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        //        controller.create(account);

    }//GEN-LAST:event_buttonSaveActionPerformed

    // Método para obtener los nombres de los JCheckBox en un ArrayList
    public ArrayList<String> getCheckBoxNames() {
        ArrayList<String> checkBoxNames = new ArrayList<>();
        JCheckBox[] allCheckBoxes = {checkCourt, checkExpensesHistory, checkListEmployes, checkListProducts, checkOrders, checkRegisterEmploy, checkRegisterExpenses, checkRegisterProduct, checkSalePoint, checkSettingsApp, checkUpdateEmployes, checkUpdateProducts};

        for (JCheckBox checkBox : allCheckBoxes) {
            if (checkBox.isSelected()) {
                checkBoxNames.add(checkBox.getName());
                System.out.println("Agregada la seccion: " + checkBox.getName());
            }
        }

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
            if (ids.contains(String.valueOf(section.getId()))) {
                access = new Access.Builder()
                        .withId(section.getId())
                        .withIdCuenta(account)
                        .withIdSeccion(new Section(section))
                        .build();
                accessList.add(access);
                System.out.println("Acceso a " + section.getId() + " : " + section.getNombre());
            }
        }
        return accessList;
    }

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

        try {
            String path = fileChooser.getSelectedFile().getPath();

            if (!path.isEmpty()) {
                Tools tools = new Tools();
                this.buttonSelectImage.setIcon(tools.resizeIcon(
                        new ImageIcon(path), 140, 140));

                this.buttonSelectImage.setOpaque(false);
                this.buttonSelectImage.setText("");

            }
        } catch (Exception e) {
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonCalendarIngress;
    private javax.swing.JToggleButton buttonCalendarNac;
    private javax.swing.JButton buttonDiscard;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSelectImage;
    private javax.swing.JButton buttonSend;
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
    private javax.swing.JDialog firtsUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelInvalidMail;
    private javax.swing.JLabel labelInvalidPhone;
    private javax.swing.JLabel labelInvalidUser;
    private javax.swing.JLabel labelResetPass;
    private javax.swing.JPanel panelInternal;
    private javax.swing.JDialog resetPass;
    private javax.swing.JTextArea textMessage;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastNameMaternal;
    private javax.swing.JTextField txtLastNamePaternal;
    private javax.swing.JTextField txtMailReset;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumEmploy;
    private javax.swing.JTextField txtNumberPhone;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
