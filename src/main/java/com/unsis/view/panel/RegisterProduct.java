package com.unsis.view.panel;

import com.unsis.clases.Tools;
import com.unsis.controller.JpaController;
import java.awt.Color;
import java.awt.event.ItemEvent;
import com.unsis.models.entity.Product;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jared
 */
public class RegisterProduct extends javax.swing.JPanel {

    static void setProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private final JpaController controller;

    /**
     * Creates new form RegisterProduct
     */
    public RegisterProduct() {
        initComponents();
        this.controller = new JpaController();

        this.resizeImages();

        // comboSaller.addItem("+");
        this.dialogRegisterSaller.setLocationRelativeTo(null);
    }

     // este método se asegura de que solo se ingresen caracteres válidos en un campo de texto 
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

            JOptionPane.showMessageDialog(null, "Solo se permiten caracteres válidos según la expresión regular: " + regex, "Advertencia", JOptionPane.WARNING_MESSAGE);

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

        resizedIcon = tools.resizeIcon(buttonUpload.getIcon(), 35, 35);
        buttonUpload.setIcon(resizedIcon);

        resizedIcon = tools.resizeIcon(buttonTemplate.getIcon(), 35, 35);
        buttonTemplate.setIcon(resizedIcon);

        resizedIcon = tools.resizeIcon(buttonSaveSaller.getIcon(), 30, 30);
        buttonSaveSaller.setIcon(resizedIcon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogRegisterSaller = new javax.swing.JDialog();
        panelRegisterDialog = new javax.swing.JPanel();
        txtNameSaller = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescSaller = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        buttonSaveSaller = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panelInternal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAvailable = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPBuys = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPSale = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ComboProductType = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        buttonDiscard = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtVariants = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        comboSchedule = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtNumProduct = new javax.swing.JTextField();
        RadioButtonAvailable = new javax.swing.JRadioButton();
        RadioButtonNotavailable = new javax.swing.JRadioButton();
        txtPortion = new javax.swing.JTextField();
        txtDiscounts = new javax.swing.JTextField();
        txtComments = new javax.swing.JTextField();
        labelinvalidDiscounts = new javax.swing.JLabel();
        labelinvalidPbuys = new javax.swing.JLabel();
        labelinvalidPsale1 = new javax.swing.JLabel();
        labelinvalidNproduct1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonUpload = new javax.swing.JButton();
        buttonTemplate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        dialogRegisterSaller.setBounds(new java.awt.Rectangle(0, 0, 668, 366));
        dialogRegisterSaller.setModal(true);

        panelRegisterDialog.setBackground(new java.awt.Color(255, 255, 255));

        txtNameSaller.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNameSaller.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre del proveedor");

        txtDescSaller.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDescSaller.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Descripción");

        buttonSaveSaller.setBackground(new java.awt.Color(46, 125, 18));
        buttonSaveSaller.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        buttonSaveSaller.setForeground(new java.awt.Color(255, 255, 255));
        buttonSaveSaller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        buttonSaveSaller.setText("Guardar");
        buttonSaveSaller.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelRegisterDialogLayout = new javax.swing.GroupLayout(panelRegisterDialog);
        panelRegisterDialog.setLayout(panelRegisterDialogLayout);
        panelRegisterDialogLayout.setHorizontalGroup(
            panelRegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterDialogLayout.createSequentialGroup()
                .addGroup(panelRegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisterDialogLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(panelRegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNameSaller, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtDescSaller, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRegisterDialogLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(buttonSaveSaller, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelRegisterDialogLayout.setVerticalGroup(
            panelRegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterDialogLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(panelRegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelRegisterDialogLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameSaller))
                    .addGroup(panelRegisterDialogLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescSaller, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(buttonSaveSaller, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout dialogRegisterSallerLayout = new javax.swing.GroupLayout(dialogRegisterSaller.getContentPane());
        dialogRegisterSaller.getContentPane().setLayout(dialogRegisterSallerLayout);
        dialogRegisterSallerLayout.setHorizontalGroup(
            dialogRegisterSallerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogRegisterSallerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panelRegisterDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        dialogRegisterSallerLayout.setVerticalGroup(
            dialogRegisterSallerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogRegisterSallerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelRegisterDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        panelInternal.setBackground(new java.awt.Color(255, 255, 255));
        panelInternal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 146, 222));
        jLabel2.setText("Información Especifica");
        panelInternal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 280, -1));
        panelInternal.add(txtAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 150, 30));

        jLabel5.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(118, 125, 142));
        jLabel5.setText(" Precio de compra");
        panelInternal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 180, -1));

        txtPBuys.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPBuysFocusLost(evt);
            }
        });
        panelInternal.add(txtPBuys, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 170, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(118, 125, 142));
        jLabel6.setText("N. Producto");
        panelInternal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        txtPSale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPSaleFocusLost(evt);
            }
        });
        panelInternal.add(txtPSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 180, 30));

        jLabel7.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(118, 125, 142));
        jLabel7.setText("Código de barras");
        panelInternal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 170, -1));
        panelInternal.add(txtBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 170, 30));

        jLabel8.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(118, 125, 142));
        jLabel8.setText("Tipo de producto");
        jLabel8.setToolTipText("");
        panelInternal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(118, 125, 142));
        jLabel10.setText("Precio de venta");
        panelInternal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        txtPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPNameKeyReleased(evt);
            }
        });
        panelInternal.add(txtPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 30));

        jLabel11.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(118, 125, 142));
        jLabel11.setText("Descripción");
        panelInternal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));
        panelInternal.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 170, 30));

        jLabel13.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(118, 125, 142));
        jLabel13.setText("Estado");
        panelInternal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        ComboProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimento ", "Bebidas" }));
        panelInternal.add(ComboProductType, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 170, 30));

        jLabel15.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(118, 125, 142));
        jLabel15.setText("Disponible");
        panelInternal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        jLabel16.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(118, 125, 142));
        jLabel16.setText("Variantes");
        panelInternal.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jLabel22.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(82, 146, 222));
        jLabel22.setText("Información general");
        panelInternal.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 260, -1));

        jLabel23.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(118, 125, 142));
        jLabel23.setText("Nombre");
        panelInternal.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 90, -1));

        buttonDiscard.setBackground(new java.awt.Color(153, 11, 11));
        buttonDiscard.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        buttonDiscard.setForeground(new java.awt.Color(255, 255, 255));
        buttonDiscard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconCircleMin.png"))); // NOI18N
        buttonDiscard.setText("Descartar");
        buttonDiscard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDiscardActionPerformed(evt);
            }
        });
        panelInternal.add(buttonDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 490, 190, 50));

        buttonSave.setBackground(new java.awt.Color(46, 125, 18));
        buttonSave.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(255, 255, 255));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        buttonSave.setText("Guardar");
        buttonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        panelInternal.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 490, 200, 50));

        jLabel21.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(82, 146, 222));
        jLabel21.setText("Información adicional");
        panelInternal.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 300, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(118, 125, 142));
        jLabel19.setText("Comentarios");
        panelInternal.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, -1, -1));
        panelInternal.add(txtVariants, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 170, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(118, 125, 142));
        jLabel14.setText("Descuentos");
        panelInternal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 90, -1, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(118, 125, 142));
        jLabel20.setText("Porción de comida");
        panelInternal.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 180, -1, -1));

        comboSchedule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo el dia", "Mañana ", "Tarde", "Noche" }));
        panelInternal.add(comboSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 210, 170, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(118, 125, 142));
        jLabel18.setText("Horario de venta");
        panelInternal.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 180, -1, -1));

        txtNumProduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumProductFocusLost(evt);
            }
        });
        panelInternal.add(txtNumProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 150, 30));

        buttonGroup1.add(RadioButtonAvailable);
        RadioButtonAvailable.setText("Disponible");
        RadioButtonAvailable.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelInternal.add(RadioButtonAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        buttonGroup1.add(RadioButtonNotavailable);
        RadioButtonNotavailable.setText("No disponible");
        panelInternal.add(RadioButtonNotavailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));
        panelInternal.add(txtPortion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 170, 30));

        txtDiscounts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiscountsFocusLost(evt);
            }
        });
        panelInternal.add(txtDiscounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 120, 170, 30));
        panelInternal.add(txtComments, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, 170, 30));

        labelinvalidDiscounts.setForeground(new java.awt.Color(255, 0, 51));
        panelInternal.add(labelinvalidDiscounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 150, 170, 20));

        labelinvalidPbuys.setForeground(new java.awt.Color(255, 0, 51));
        panelInternal.add(labelinvalidPbuys, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 170, 20));

        labelinvalidPsale1.setForeground(new java.awt.Color(255, 0, 51));
        panelInternal.add(labelinvalidPsale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 170, 20));

        labelinvalidNproduct1.setForeground(new java.awt.Color(255, 0, 51));
        panelInternal.add(labelinvalidNproduct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 150, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        buttonUpload.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonUpload.setForeground(new java.awt.Color(0, 102, 0));
        buttonUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uploadIcon.png"))); // NOI18N
        buttonUpload.setText("Cargar");
        buttonUpload.setToolTipText("Cargar desde Excel");
        buttonUpload.setBorder(BorderFactory.createLineBorder(new Color(0,102,0), 2));
        buttonUpload.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonUpload.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        buttonTemplate.setBackground(new java.awt.Color(0, 102, 0));
        buttonTemplate.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonTemplate.setForeground(new java.awt.Color(255, 255, 255));
        buttonTemplate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exportExcelHD.png"))); // NOI18N
        buttonTemplate.setText("Plantilla");
        buttonTemplate.setToolTipText("Plantilla para cargar datos");
        buttonTemplate.setBorder(null);
        buttonTemplate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonTemplate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel1.setFont(new java.awt.Font("Jaldi", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 41, 87));
        jLabel1.setText("Alta de producto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonTemplate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonTemplate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelInternal, javax.swing.GroupLayout.DEFAULT_SIZE, 1592, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(panelInternal, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPNameKeyReleased
        verify(evt, txtPName, "^[A-Za-zÁ-úüÜñÑ]*$");
    }//GEN-LAST:event_txtPNameKeyReleased

    private void txtPBuysFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPBuysFocusLost
        String price = txtPBuys.getText().trim();
        String regex = "^(\\d+\\.?\\d*|\\d*\\.\\d+)$";  // Acepta números flotantes (con o sin parte entera)

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(price);

        if (matcher.matches()) {
          labelinvalidPbuys.setVisible(false);
        } else {
            labelinvalidPbuys.setText("Precio invalido");
        }
    }//GEN-LAST:event_txtPBuysFocusLost

    private void txtPSaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPSaleFocusLost
        String price = txtPSale.getText().trim();
        String regex = "^(\\d+\\.?\\d*|\\d*\\.\\d+)$";  // Acepta números flotantes (con o sin parte entera)

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(price);

        if (matcher.matches()) {
          labelinvalidPsale1.setVisible(false);
        } else {
        
           labelinvalidDiscounts.setText("Precio invalido");
        }
    }//GEN-LAST:event_txtPSaleFocusLost

    private void txtNumProductFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumProductFocusLost
        String price = txtNumProduct.getText().trim();
        String regex = "^\\d+$";  // Acepta números enteros

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(price);

        if (matcher.matches()) {
           labelinvalidNproduct1.setVisible(false);
        } else {
            
         labelinvalidNproduct1.setText("Solo se aceptan numeros");
        }
    }//GEN-LAST:event_txtNumProductFocusLost

    private void txtDiscountsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiscountsFocusLost

        String discountStr = txtDiscounts.getText().trim();

        // Expresión regular que acepta números enteros del 0 al 100
        String regex = "^(100|[0-9]{1,2})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(discountStr);

        if (matcher.matches()) {
            int discount = Integer.parseInt(discountStr);
           labelinvalidDiscounts.setVisible(false);

        } else {
            

            labelinvalidDiscounts.setText("El descuento es un numero invalido");
        }
    }//GEN-LAST:event_txtDiscountsFocusLost

    //boton para guardar los productos en la base de datos
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // Verificar que todos los campos estén llenos
        if (camposEstanLlenos()) {
            // Todos los campos están llenos, proceder a crear y guardar el producto
            Product product = new Product.Builder()
                    .withId(35)
                    .withNumProducto(Integer.valueOf(txtNumProduct.getText().trim()))
                    .withNombre(txtPName.getText().trim())
                    .withPreciocom(Double.valueOf(txtPBuys.getText().trim()))
                    .withPrecioventa(Double.valueOf(txtPSale.getText().trim()))
                    .withCodigobarra(txtBarcode.getText().trim())
                    .withTipo(String.valueOf(ComboProductType.getSelectedItem()))
                    .withDescripcion(txtDescription.getText().trim())
                    .withEstado(RadioButtonAvailable.isSelected() ? "Disponible" : "No disponible")
                    .withDisponible(Integer.parseInt(txtAvailable.getText().trim()))
                    .build();

            controller.create(product);
        } else {
            // Mostrar un mensaje indicando que todos los campos deben estar llenos
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDiscardActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_buttonDiscardActionPerformed

    
    //verifica que el usuario rellene todos los caompos y en caso de que no, deja guardar 
    private boolean camposEstanLlenos() {
        // Verificar que todos los campos estén llenos
        return !txtNumProduct.getText().trim().isEmpty()
               && !txtPName.getText().trim().isEmpty()
            && !txtPBuys.getText().trim().isEmpty()
            && !txtPSale.getText().trim().isEmpty()
            && !txtBarcode.getText().trim().isEmpty()
            && ComboProductType.getSelectedItem() != null
            && !txtDescription.getText().trim().isEmpty()
            && !txtAvailable.getText().trim().isEmpty()
            && comboSchedule.getSelectedItem() != null;
    }

    private void limpiarCampos() {
        // Limpiar todos los campos del formulario
        txtNumProduct.setText("");
        txtPName.setText("");
        txtPBuys.setText("");
        txtPSale.setText("");
        txtBarcode.setText("");
        txtDescription.setText("");
        RadioButtonAvailable.setSelected(false);  // Desmarcar el botón de opción
        txtAvailable.setText("");
        txtVariants.setText("");
        txtComments.setText("");
        txtDiscounts.setText("");
        txtPortion.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboProductType;
    private javax.swing.JRadioButton RadioButtonAvailable;
    private javax.swing.JRadioButton RadioButtonNotavailable;
    private javax.swing.JButton buttonDiscard;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSaveSaller;
    private javax.swing.JButton buttonTemplate;
    private javax.swing.JButton buttonUpload;
    private javax.swing.JComboBox<String> comboSchedule;
    private javax.swing.JDialog dialogRegisterSaller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelinvalidDiscounts;
    private javax.swing.JLabel labelinvalidNproduct1;
    private javax.swing.JLabel labelinvalidPbuys;
    private javax.swing.JLabel labelinvalidPsale1;
    private javax.swing.JPanel panelInternal;
    private javax.swing.JPanel panelRegisterDialog;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtDescSaller;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDiscounts;
    private javax.swing.JTextField txtNameSaller;
    private javax.swing.JTextField txtNumProduct;
    private javax.swing.JTextField txtPBuys;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPSale;
    private javax.swing.JTextField txtPortion;
    private javax.swing.JTextField txtVariants;
    // End of variables declaration//GEN-END:variables
}
