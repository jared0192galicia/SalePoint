package com.unsis.view.panel;

import com.unsis.clases.Tools;
import com.unsis.controller.JpaController;
import com.unsis.models.entity.Account;
import com.unsis.models.entity.Employee;
import com.unsis.view.Main;
import java.awt.Color;
//import java.awt.Font;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author jared
 */
public class ListEmployes extends javax.swing.JPanel {

    private final Main mainWindow;
    private final JpaController jpaController;
    
    private List<Employee> employeeList;

    /**
     * Creates new form HumanResourcesPanel
     *
     * @param mainWindow
     */
    public ListEmployes(Main mainWindow) {
        initComponents();

        this.setBounds(217, 0, 1700, 512);
        // Obtener el JTableHeader (encabezado de la tabla)
        table.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(32, 136, 203));
        table.getTableHeader().setForeground(Color.WHITE);

        this.mainWindow = mainWindow;
        this.jpaController = new JpaController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonCreate = new javax.swing.JButton();
        buttonExport = new javax.swing.JButton();
        buttonModify = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

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
        buttonExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExportActionPerformed(evt);
            }
        });
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

    private void exportToExcel(String outputPath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Employees");

            // Crear encabezados
            Row headerRow = sheet.createRow(0);
            String[] columns = {"Número de Empleado", "Nombre", "Apellido Paterno", "Apellido Materno", "Fecha Nacimiento", "Correo", "Teléfono", "Fecha Ingreso", "Estado", "Puesto"};
            
            CellStyle headerStyle = createHeaderStyle(workbook);

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerStyle);
            }

            // Agregar datos de empleados
            int rowNum = 1;
            for (Employee employee : employeeList) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(1).setCellValue(employee.getNumempleado());
                row.createCell(2).setCellValue(employee.getNombre());
                row.createCell(3).setCellValue(employee.getApellidop());
                row.createCell(4).setCellValue(employee.getApellidom());
                row.createCell(5).setCellValue(employee.getFechanac().toString()); // Ajusta según el formato de fecha que desees
                row.createCell(6).setCellValue(employee.getCorreo());
                row.createCell(7).setCellValue(employee.getTelefono());
                row.createCell(8).setCellValue(employee.getFechaing().toString()); // Ajusta según el formato de fecha que desees
                row.createCell(9).setCellValue(employee.getEstado());
                row.createCell(10).setCellValue(employee.getPuesto());
                 
                // Autoajustar el ancho de las columnas después de agregar los datos a la fila
                for (int i = 0; i < columns.length; i++) {
                    sheet.autoSizeColumn(i);
                }
            }

            // Escribir el archivo Excel
            try (FileOutputStream fileOut = new FileOutputStream(outputPath)) {
                workbook.write(fileOut);
                System.out.println("Archivo Excel generado con éxito en: " + outputPath);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static CellStyle createHeaderStyle(Workbook workbook) {
        CellStyle style = workbook.createCellStyle();

        // Establecer el color de fondo
        style.setFillForegroundColor(IndexedColors.DARK_TEAL.getIndex()); // Color: 0, 102, 102
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // Establecer el color de la letra (fuente)
        Font font = workbook.createFont();
        font.setColor(IndexedColors.WHITE.getIndex());
        style.setFont(font);

        return style;
    }
    
    public void showModel() {
        // Llamada al método findAllEntities para obtener la lista de empleados
        ArrayList<Employee> employees = new JpaController().findAllEntities(Employee.class);
        employeeList = employees;
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
        if (employee != null) {
            UpdateEmployee.setEmploye(employee);
            mainWindow.setView("Editar Emplado");
        }
    }//GEN-LAST:event_buttonModifyActionPerformed
    
    private void buttonExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportActionPerformed
        exportToExcel("./reports/" + Tools.getFormatExcelFileName("Empleados"));
//        try {
//            String reportPath = "src/main/java/com/unsis/reports/Empleados.jasper";
//
//            // Cargar el informe .jasper (ya compilado)
//            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(reportPath);
//
//            JRBeanCollectionDataSource dataSource = 
//                    new JRBeanCollectionDataSource(jpaController.findAllEntities(Employee.class));
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);
//
//            // Exportar el informe a PDF
//            JasperExportManager.exportReportToPdfFile(jasperPrint, "./reports/Empleados.pdf");
//
//            System.out.println("¡Informe PDF generado con éxito!");
//
//        } catch (JRException e) {
//            e.printStackTrace();
//        }

    }//GEN-LAST:event_buttonExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonExport;
    private javax.swing.JButton buttonModify;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
