package com.unsis.view.panel;

import com.unsis.clases.Tools;
import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.BorderFactory;
import javax.swing.Icon;

/**
 *
 * @author jared
 */
public class RegisterProduct extends javax.swing.JPanel {

    /**
     * Creates new form RegisterProduct
     */
    public RegisterProduct() {
        initComponents();

        this.resizeImages();

        comboSaller.addItem("+");
        this.dialogRegisterSaller.setLocationRelativeTo(null);
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
        panelInternal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        comboSaller = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        buttonDiscard = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
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
        buttonSaveSaller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
        panelInternal.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 150, 30));

        jLabel4.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(118, 125, 142));
        jLabel4.setText("Proveedor");
        panelInternal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 130, -1));

        jLabel5.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(118, 125, 142));
        jLabel5.setText(" Precio de compra");
        panelInternal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 180, -1));
        panelInternal.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 170, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(118, 125, 142));
        jLabel6.setText("N. Producto");
        panelInternal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));
        panelInternal.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 180, 30));

        jLabel7.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(118, 125, 142));
        jLabel7.setText("Código de barras");
        panelInternal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 170, -1));
        panelInternal.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 170, 30));

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
        panelInternal.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 30));

        jLabel11.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(118, 125, 142));
        jLabel11.setText("Descripción");
        panelInternal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));
        panelInternal.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 170, 30));

        comboSaller.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSaller.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSallerItemStateChanged(evt);
            }
        });
        panelInternal.add(comboSaller, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 140, 30));

        jLabel13.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(118, 125, 142));
        jLabel13.setText("Estado");
        panelInternal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelInternal.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 170, 30));

        jLabel15.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(118, 125, 142));
        jLabel15.setText("Disponible");
        panelInternal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelInternal.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 140, 30));

        jLabel16.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(118, 125, 142));
        jLabel16.setText("Variantes");
        panelInternal.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelInternal.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 140, 30));

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
        buttonDiscard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInternal.add(buttonDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 490, 190, 50));

        buttonSave.setBackground(new java.awt.Color(46, 125, 18));
        buttonSave.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(255, 255, 255));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        buttonSave.setText("Guardar");
        buttonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInternal.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 490, 200, 50));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelInternal.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 140, 30));

        jLabel21.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(82, 146, 222));
        jLabel21.setText("Información adicional");
        panelInternal.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 300, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(118, 125, 142));
        jLabel19.setText("Comentarios");
        panelInternal.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, -1, -1));
        panelInternal.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, 170, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(118, 125, 142));
        jLabel14.setText("Descuentos");
        panelInternal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 90, -1, -1));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelInternal.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 120, 170, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(118, 125, 142));
        jLabel20.setText("Porción de comida");
        panelInternal.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 180, -1, -1));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelInternal.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 170, 30));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelInternal.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 210, 170, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(118, 125, 142));
        jLabel18.setText("Horario de venta");
        panelInternal.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 180, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        buttonUpload.setBackground(new java.awt.Color(255, 255, 255));
        buttonUpload.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonUpload.setForeground(new java.awt.Color(0, 102, 0));
        buttonUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uploadIcon.png"))); // NOI18N
        buttonUpload.setText("Cargar");
        buttonUpload.setToolTipText("Cargar desde Excel");
        buttonUpload.setBorder(BorderFactory.createLineBorder(new Color(0,102,0), 2));
        buttonUpload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonUpload.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        buttonTemplate.setBackground(new java.awt.Color(0, 102, 0));
        buttonTemplate.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonTemplate.setForeground(new java.awt.Color(255, 255, 255));
        buttonTemplate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exportExcelHD.png"))); // NOI18N
        buttonTemplate.setText("Plantilla");
        buttonTemplate.setToolTipText("Plantilla para cargar datos");
        buttonTemplate.setBorder(null);
        buttonTemplate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

    /**
     * comprueba si el item seleccionado es el icono de +
     * en caso de ser verdadero muestra el dialog para registrar
     * a un nuevo proveedor
     * @param evt 
     */
    private void comboSallerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSallerItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String selection = (String) comboSaller.getSelectedItem();
            if (selection.equals("+")) {
                System.out.println("Mostrar registro");
                dialogRegisterSaller.show();
            }
        }
    }//GEN-LAST:event_comboSallerItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDiscard;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSaveSaller;
    private javax.swing.JButton buttonTemplate;
    private javax.swing.JButton buttonUpload;
    private javax.swing.JComboBox<String> comboSaller;
    private javax.swing.JDialog dialogRegisterSaller;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel panelInternal;
    private javax.swing.JPanel panelRegisterDialog;
    private javax.swing.JTextField txtDescSaller;
    private javax.swing.JTextField txtNameSaller;
    // End of variables declaration//GEN-END:variables
}
