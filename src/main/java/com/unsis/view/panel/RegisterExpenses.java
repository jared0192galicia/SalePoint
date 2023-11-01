package com.unsis.view.panel;

import com.unsis.clases.Tools;
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
        
        table.getTableHeader().setFont(new Font("Jaldi", Font.BOLD, 18));
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
        Icon resizedIcon = tools.resizeIcon(buttonAdd.getIcon(), 45, 45);
        buttonAdd.setIcon(resizedIcon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1gastos = new javax.swing.JPanel();
        Labebillsl = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtdescription = new javax.swing.JTextField();
        txtproduct = new javax.swing.JTextField();
        comboboxcategory = new javax.swing.JComboBox<>();
        comboboxmonth = new javax.swing.JComboBox<>();
        comboboxproduct = new javax.swing.JComboBox<>();
        buttonAdd = new javax.swing.JButton();
        buttonvoucher1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1gastos.setBackground(new java.awt.Color(255, 255, 255));
        Panel1gastos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Labebillsl.setFont(new java.awt.Font("Jaldi", 0, 48)); // NOI18N
        Labebillsl.setForeground(new java.awt.Color(7, 56, 112));
        Labebillsl.setText("Gastos");
        Panel1gastos.add(Labebillsl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descripcion", "Autorizado Por", "Realizado", "Monto"
            }
        ));
        jScrollPane1.setViewportView(table);

        Panel1gastos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 620, 660));

        labelfilter.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        labelfilter.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter.setText("Filtro de busqueda");
        Panel1gastos.add(labelfilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 440, 233, 39));

        labeldescription.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labeldescription.setForeground(new java.awt.Color(118, 125, 142));
        labeldescription.setText("Descripcion");
        Panel1gastos.add(labeldescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 220, 130, -1));

        labelvoucher.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelvoucher.setForeground(new java.awt.Color(118, 125, 142));
        labelvoucher.setText("Adjunte de comprobante");
        Panel1gastos.add(labelvoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 600, 250, -1));

        labelamount.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelamount.setForeground(new java.awt.Color(118, 125, 142));
        labelamount.setText("Monto");
        Panel1gastos.add(labelamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 310, 90, -1));

        labelcategory.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelcategory.setForeground(new java.awt.Color(118, 125, 142));
        labelcategory.setText("Categoria");
        Panel1gastos.add(labelcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 310, 160, -1));

        LabelGeneral.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        LabelGeneral.setForeground(new java.awt.Color(82, 146, 222));
        LabelGeneral.setText("Informacion general ");
        Panel1gastos.add(LabelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 150, 270, 39));

        labeldate.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labeldate.setForeground(new java.awt.Color(118, 125, 142));
        labeldate.setText("Fecha");
        Panel1gastos.add(labeldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 220, 90, -1));

        labelmonth.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelmonth.setForeground(new java.awt.Color(118, 125, 142));
        labelmonth.setText("Mes de compra");
        Panel1gastos.add(labelmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 490, 170, -1));

        labelproduct.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelproduct.setForeground(new java.awt.Color(118, 125, 142));
        labelproduct.setText("Tipo de producto");
        Panel1gastos.add(labelproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 490, 190, -1));

        jLabel13.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(118, 125, 142));
        jLabel13.setText("Tipo de producto");
        Panel1gastos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 600, 190, -1));
        Panel1gastos.add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 340, 250, 35));
        Panel1gastos.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 250, 250, 35));
        Panel1gastos.add(txtdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 250, 250, 35));
        Panel1gastos.add(txtproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, 250, 35));

        comboboxcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel1gastos.add(comboboxcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 340, 250, 35));

        comboboxmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel1gastos.add(comboboxmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 530, 250, 35));

        comboboxproduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel1gastos.add(comboboxproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 530, 250, 35));

        buttonAdd.setBackground(new java.awt.Color(25, 130, 206));
        buttonAdd.setFont(new java.awt.Font("Jaldi", 1, 18)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconCirclePlus.png"))); // NOI18N
        buttonAdd.setText("Agregar");
        buttonAdd.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Panel1gastos.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 710, 300, 50));

        buttonvoucher1.setBackground(new java.awt.Color(204, 255, 255));
        buttonvoucher1.setFont(new java.awt.Font("Jaldi", 0, 12)); // NOI18N
        buttonvoucher1.setText("Seleccionar archivo");
        buttonvoucher1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Panel1gastos.add(buttonvoucher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 630, 250, 35));

        add(Panel1gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 890));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labebillsl;
    private javax.swing.JLabel LabelGeneral;
    private javax.swing.JPanel Panel1gastos;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonvoucher1;
    private javax.swing.JComboBox<String> comboboxcategory;
    private javax.swing.JComboBox<String> comboboxmonth;
    private javax.swing.JComboBox<String> comboboxproduct;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtproduct;
    // End of variables declaration//GEN-END:variables
}
