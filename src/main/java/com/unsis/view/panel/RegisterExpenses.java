package com.unsis.view.panel;

import com.toedter.calendar.JCalendar;
import com.unsis.clases.Session;
import com.unsis.clases.Tools;
import com.unsis.controller.JpaController;
import com.unsis.models.entity.Expenses;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author america
 */
public class RegisterExpenses extends javax.swing.JPanel {

    private final JCalendar dateNac;
    private final JpaController controller;
    private String pathImage = "-1";

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

        dateNac = new JCalendar(new Date());
        dateNac.setVisible(false);
        Panel1gastos.add(dateNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 240, 150));
        Panel1gastos.setComponentZOrder(dateNac, 0);

        controller = new JpaController();
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

        fileChooser = new javax.swing.JFileChooser();
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
        txtDescription = new javax.swing.JTextField();
        comboCategory = new javax.swing.JComboBox<>();
        comboboxmonth = new javax.swing.JComboBox<>();
        comboboxproduct = new javax.swing.JComboBox<>();
        buttonAdd = new javax.swing.JButton();
        buttonvoucher1 = new javax.swing.JButton();
        LabelGeneral1 = new javax.swing.JLabel();
        buttonAdd1 = new javax.swing.JButton();
        buttonCalendarNac = new javax.swing.JToggleButton();
        buttonExportXls = new javax.swing.JButton();
        Labebillsl = new javax.swing.JLabel();

        fileChooser.setApproveButtonText("Abrir");

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
                "Descripcion", "Tipo", "Realizado Por", "Monto"
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
        labelcategory.setText("Categoria");
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
        buttonvoucher1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonvoucher1ActionPerformed(evt);
            }
        });
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

        buttonCalendarNac.setText("-- : -- : ----");
        buttonCalendarNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalendarNacActionPerformed(evt);
            }
        });
        Panel1gastos.add(buttonCalendarNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 250, 30));

        buttonExportXls.setBackground(new java.awt.Color(0, 102, 0));
        buttonExportXls.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonExportXls.setForeground(new java.awt.Color(255, 255, 255));
        buttonExportXls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exportExcel .png"))); // NOI18N
        buttonExportXls.setText("Exportar");
        buttonExportXls.setBorder(null);
        buttonExportXls.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonExportXls.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonExportXls.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonExportXls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExportXlsActionPerformed(evt);
            }
        });
        Panel1gastos.add(buttonExportXls, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 136, 40));

        add(Panel1gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 1580, 780));

        Labebillsl.setFont(new java.awt.Font("Jaldi", 0, 48)); // NOI18N
        Labebillsl.setForeground(new java.awt.Color(7, 56, 112));
        Labebillsl.setText("Gastos");
        add(Labebillsl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        String category = (String) comboCategory.getSelectedItem();
        float amount = Float.parseFloat(txtAmount.getText());
//        Employee user = Session.getAccount().getIdempleado();

        Expenses expense = new Expenses.Builder()
                .id(1)
                .date(dateNac.getDate())
                .usuario(Session.getAccount())
                .descripcion(txtDescription.getText().trim())
                .categoria(category)
                .monto(amount)
                .comprobante(pathImage)
                .build();

        try {
            controller.create(expense);
            JOptionPane.showMessageDialog(this, "Gasto egistrado", "Ok", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException e) {
            System.err.println("Error al registrar gasto\n" + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar a el empleado", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonAddActionPerformed

    private void txtAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyPressed
        char c = evt.getKeyChar();

        // Verificar si la tecla presionada es un número o un punto decimal
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == '.')) {
            evt.consume();  // Consumir el evento para evitar que se procese la tecla no válida
        }

        // Verificar que no se ingresen más de un punto decimal
        if (c == '.' && txtAmount.getText().contains(".")) {
            evt.consume();  // Consumir el evento si ya hay un punto decimal
        }
    }//GEN-LAST:event_txtAmountKeyPressed

    private void buttonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdd1ActionPerformed

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

    private void buttonExportXlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportXlsActionPerformed
        try {
            exportToExcel("./reports/" + Tools.getFormatExcelFileName("Gatos"));
            JOptionPane.showMessageDialog(this, "Reporte exportado", "Accion exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Reporte no exportado", "Accion no exitosa",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExportXlsActionPerformed

    private void buttonvoucher1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonvoucher1ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "jpg", "png");

        fileChooser.setFileFilter(filter);

        // Mostrar el diálogo de selección de archivo
        int result = fileChooser.showOpenDialog(this);

        // Verificar si se seleccionó un archivo
        if (result == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado
            try {
                String partPath[] = fileChooser.getSelectedFile().getAbsolutePath().split("\\\\");
                String pathFile = Tools.ROOTPATH + "recibos/" + partPath[partPath.length - 1];
                Tools.copyFile(fileChooser.getSelectedFile().getAbsolutePath(), pathFile);
                pathImage = pathFile;
            } catch (Exception e) {
                System.err.println("Error al registrar\n" + e.getMessage());
                e.printStackTrace();
            }
        } else {
            // Mostrar un mensaje si se canceló la selección
            System.out.println("Selección de archivo cancelada");
        }
    }//GEN-LAST:event_buttonvoucher1ActionPerformed

    private void exportToExcel(String path) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labebillsl;
    private javax.swing.JLabel LabelGeneral;
    private javax.swing.JLabel LabelGeneral1;
    private javax.swing.JPanel Panel1gastos;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAdd1;
    private javax.swing.JToggleButton buttonCalendarNac;
    private javax.swing.JButton buttonExportXls;
    private javax.swing.JButton buttonvoucher1;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboboxmonth;
    private javax.swing.JComboBox<String> comboboxproduct;
    private javax.swing.JFileChooser fileChooser;
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
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables

}
