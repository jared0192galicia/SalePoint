package com.unsis.view.panel;

import com.toedter.calendar.JCalendar;
import com.unsis.clases.Tools;
import com.unsis.controller.JpaController;
import com.unsis.models.entity.Access;
import com.unsis.models.entity.Account;
import com.unsis.models.entity.Employee;
import com.unsis.models.entity.Section;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author labtecweb09
 */
public class RegisterEmployed extends javax.swing.JPanel {

    private final JCalendar dateIngres;
    private final JCalendar dateNac;
    private final JpaController controller;

    /**
     * Creates new form AltaEmpleado
     */
    public RegisterEmployed() {
        this.controller = new JpaController();
        initComponents();
        panelInternal.setSize(1696, 894);
        this.setSize(1696, 894);
        this.setBounds(0, 0, this.getWidth(), this.getHeight());

        dateIngres = new JCalendar(new Date());
        dateIngres.setVisible(false);
        panelInternal.add(dateIngres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 230, 250));
        panelInternal.setComponentZOrder(dateIngres, 0);

        dateNac = new JCalendar(new Date());
        dateNac.setVisible(false);
        panelInternal.add(dateNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 400, 210));
        panelInternal.setComponentZOrder(dateNac, 0);

        this.resizeImages();
    }

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
        ArrayList<Section> sections = new ArrayList<>();
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

    /**
     * Redimenciona las imagenes de los botones para que se ajusten a el tamaño
     * necesario
     */
    private void resizeImages() {
        Tools tools = new Tools();
        Icon resizedIcon = tools.resizeIcon(buttonSave.getIcon(), 30, 30);
        buttonSave.setIcon(resizedIcon);

        resizedIcon = tools.resizeIcon(buttonDiscard.getIcon(), 35, 35);
        buttonDiscard.setIcon(resizedIcon);
        labelInvalidMail.setVisible(false);
        labelInvalidPhone.setVisible(false);
        labelInvalidPhone.setVisible(false);
        labelInvalidUser.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        labelInvalidUser = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();

        fileChooser.setDialogTitle("Seleccionar imagen");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Jaldi", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 41, 87));
        jLabel1.setText("Alta de empleado");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 360, 40));

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
        checkListProducts.setSelected(true);
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
        checkOrders.setSelected(true);
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
        checkUpdateEmployes.setName("10"); // NOI18N
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
        checkUpdateProducts.setName("11"); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 146, 222));
        jLabel2.setText("Informacion empresarial");
        panelInternal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 360, -1));

        labelInvalidUser.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelInvalidUser.setForeground(new java.awt.Color(153, 0, 0));
        labelInvalidUser.setText("Nombre de usuario invalido");
        panelInternal.add(labelInvalidUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 210, -1));
        panelInternal.add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 150, 30));

        add(panelInternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 1610, 770));
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        verify(evt, txtName, "^[A-Za-zÁ-úüÜñÑ]*$");
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtLastNamePaternalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNamePaternalKeyReleased
        verify(evt, txtLastNamePaternal, "^[A-Za-zÁ-úüÜñÑ]*$");
    }//GEN-LAST:event_txtLastNamePaternalKeyReleased

    private void txtLastNameMaternalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameMaternalKeyReleased
        verify(evt, txtLastNameMaternal, "^[A-Za-zÁ-úüÜñÑ]*$");
    }//GEN-LAST:event_txtLastNameMaternalKeyReleased

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
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar a el empleado", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
//        controller.create(account);


    }//GEN-LAST:event_buttonSaveActionPerformed

    private void txtNumEmployKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumEmployKeyReleased
        verify(evt, txtNumEmploy, "^[0-9]$");
    }//GEN-LAST:event_txtNumEmployKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonCalendarIngress;
    private javax.swing.JToggleButton buttonCalendarNac;
    private javax.swing.JButton buttonDiscard;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel labelInvalidMail;
    private javax.swing.JLabel labelInvalidPhone;
    private javax.swing.JLabel labelInvalidUser;
    private javax.swing.JPanel panelInternal;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastNameMaternal;
    private javax.swing.JTextField txtLastNamePaternal;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumEmploy;
    private javax.swing.JTextField txtNumberPhone;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
