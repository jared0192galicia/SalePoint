package com.unsis.view.panel;

import com.unsis.clases.Session;
import com.unsis.clases.Tools;
import com.unsis.models.entity.Employee;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;

/**
 *
 * @author america
 */
public class RegisterExpenses extends javax.swing.JPanel {

    /**
     * Creates new form PanelGasto
     */
    public RegisterExpenses() {
        initComponents();
        this.resizeImages();
        
        table.getTableHeader().setFont(new Font("Jaldi", Font.BOLD, 16));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(32, 136, 203));
        table.getTableHeader().setForeground(Color.WHITE);
    }

    
    /**
     * Redimenciona las imagenes de los botones para que se ajusten a el tamaño
     * necesario
     */
    private void resizeImages() {
        Tools tools = new Tools();
        Icon resizedIcon = tools.resizeIcon(buttonAdd.getIcon(), 40, 40);
        buttonAdd.setIcon(resizedIcon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1gastos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        labelfilter = new javax.swing.JLabel();
        labeldescription = new javax.swing.JLabel();
        labelvoucher = new javax.swing.JLabel();
        labelamount = new javax.swing.JLabel();
        labelcategory = new javax.swing.JLabel();
        LabelGeneral = new javax.swing.JLabel();
        labeldate = new javax.swing.JLabel();
        labelmonth = new javax.swing.JLabel();
        labelproduct = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        comboCategory = new javax.swing.JComboBox<>();
        comboboxmonth = new javax.swing.JComboBox<>();
        comboboxproduct = new javax.swing.JComboBox<>();
        buttonAdd = new javax.swing.JButton();
        buttonvoucher1 = new javax.swing.JButton();
        LabelGeneral1 = new javax.swing.JLabel();
        buttonAdd1 = new javax.swing.JButton();
        Labebillsl = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1gastos.setBackground(new java.awt.Color(255, 255, 255));
        Panel1gastos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descripción", "Autorizado Por", "Realizado", "Monto"
            }
        ));
        jScrollPane1.setViewportView(table);

        Panel1gastos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 620, 560));

        labelfilter.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        labelfilter.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter.setText("Filtro de busqueda");
        Panel1gastos.add(labelfilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 233, 39));

        labeldescription.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labeldescription.setForeground(new java.awt.Color(118, 125, 142));
        labeldescription.setText("Descripción");
        Panel1gastos.add(labeldescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 110, 130, -1));

        labelvoucher.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelvoucher.setForeground(new java.awt.Color(118, 125, 142));
        labelvoucher.setText("Adjunte de comprobante");
        Panel1gastos.add(labelvoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 250, -1));

        labelamount.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelamount.setForeground(new java.awt.Color(118, 125, 142));
        labelamount.setText("Monto");
        Panel1gastos.add(labelamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 200, 90, -1));

        labelcategory.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelcategory.setForeground(new java.awt.Color(118, 125, 142));
        labelcategory.setText("Categoría");
        Panel1gastos.add(labelcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 160, -1));

        LabelGeneral.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        LabelGeneral.setForeground(new java.awt.Color(82, 146, 222));
        LabelGeneral.setText("Movimientos");
        Panel1gastos.add(LabelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 270, 39));

        labeldate.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labeldate.setForeground(new java.awt.Color(118, 125, 142));
        labeldate.setText("Fecha");
        Panel1gastos.add(labeldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 90, -1));

        labelmonth.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelmonth.setForeground(new java.awt.Color(118, 125, 142));
        labelmonth.setText("Mes de compra");
        Panel1gastos.add(labelmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 170, -1));

        labelproduct.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelproduct.setForeground(new java.awt.Color(118, 125, 142));
        labelproduct.setText("Tipo de gasto");
        Panel1gastos.add(labelproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 190, -1));

        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAmountKeyPressed(evt);
            }
        });
        Panel1gastos.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 230, 250, 30));
        Panel1gastos.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 250, 30));
        Panel1gastos.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 140, 250, 30));

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viatico", "Otro" }));
        Panel1gastos.add(comboCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 250, 30));

        comboboxmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        Panel1gastos.add(comboboxmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 250, 30));

        comboboxproduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viatico", "Otro" }));
        Panel1gastos.add(comboboxproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 600, 250, 30));

        buttonAdd.setBackground(new java.awt.Color(25, 130, 206));
        buttonAdd.setFont(new java.awt.Font("Jaldi", 1, 17)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconCirclePlus.png"))); // NOI18N
        buttonAdd.setText("Agregar");
        buttonAdd.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        Panel1gastos.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 310, 250, 40));

        buttonvoucher1.setBackground(new java.awt.Color(204, 255, 255));
        buttonvoucher1.setFont(new java.awt.Font("Jaldi", 0, 12)); // NOI18N
        buttonvoucher1.setText("Seleccionar archivo");
        buttonvoucher1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Panel1gastos.add(buttonvoucher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 250, 30));

        LabelGeneral1.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        LabelGeneral1.setForeground(new java.awt.Color(82, 146, 222));
        LabelGeneral1.setText("Información general ");
        Panel1gastos.add(LabelGeneral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 270, 39));

        buttonAdd1.setBackground(new java.awt.Color(25, 130, 206));
        buttonAdd1.setFont(new java.awt.Font("Jaldi", 1, 17)); // NOI18N
        buttonAdd1.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image-search_116996.png"))); // NOI18N
        buttonAdd1.setText("Buscar");
        buttonAdd1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        buttonAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdd1ActionPerformed(evt);
            }
        });
        Panel1gastos.add(buttonAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 590, 190, 40));

        add(Panel1gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 1580, 780));

        Labebillsl.setFont(new java.awt.Font("Jaldi", 0, 48)); // NOI18N
        Labebillsl.setForeground(new java.awt.Color(7, 56, 112));
        Labebillsl.setText("Gastos");
        add(Labebillsl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        String category = (String) comboCategory.getSelectedItem();
        double amount = Double.parseDouble(txtAmount.getText());
        Employee user = Session.getAccount().getIdempleado();
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void txtAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyPressed
        
    }//GEN-LAST:event_txtAmountKeyPressed

    private void buttonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdd1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labebillsl;
    private javax.swing.JLabel LabelGeneral;
    private javax.swing.JLabel LabelGeneral1;
    private javax.swing.JPanel Panel1gastos;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAdd1;
    private javax.swing.JButton buttonvoucher1;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboboxmonth;
    private javax.swing.JComboBox<String> comboboxproduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelamount;
    private javax.swing.JLabel labelcategory;
    private javax.swing.JLabel labeldate;
    private javax.swing.JLabel labeldescription;
    private javax.swing.JLabel labelfilter;
    private javax.swing.JLabel labelmonth;
    private javax.swing.JLabel labelproduct;
    private javax.swing.JLabel labelvoucher;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables
}
