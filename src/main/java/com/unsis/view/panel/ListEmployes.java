package com.unsis.view.panel;

import com.unsis.clases.Tools;
import com.unsis.controller.JpaController;
import com.unsis.models.entity.Account;
import com.unsis.models.entity.Employee;
import com.unsis.view.Main;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
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

        this.resizeImages();
    }

    /**
     * Redimenciona las imagenes de los botones para que se ajusten a el tamaño
     * necesario
     */
    private void resizeImages() {
        Tools tools = new Tools();
        Icon resizedIcon = tools.resizeIcon(buttonExportPdf.getIcon(), 35, 35);
        buttonExportPdf.setIcon(resizedIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        selectFileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        buttonCreate = new javax.swing.JButton();
        buttonExportXls = new javax.swing.JButton();
        buttonModify = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonExportPdf = new javax.swing.JButton();
        buttonTemplate1 = new javax.swing.JButton();
        buttonTemplate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        fileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        fileChooser.setApproveButtonText("Guardar");
        fileChooser.setApproveButtonToolTipText("");
        fileChooser.setDialogTitle("Descargar platilla");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Documento Excel", "xlsx"));

        selectFileChooser.setApproveButtonToolTipText("");
        selectFileChooser.setDialogTitle("Descargar platilla");
        selectFileChooser.setFileFilter(new FileNameExtensionFilter("Documento Excel", "xlsx"));

        setBackground(new java.awt.Color(240, 240, 240));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonCreate.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonCreate.setForeground(new java.awt.Color(0, 153, 0));
        buttonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPlus.png"))); // NOI18N
        buttonCreate.setText("Alta");
        buttonCreate.setBorder(BorderFactory.createLineBorder(new Color(0,153,0), 2));
        buttonCreate.setContentAreaFilled(false);
        buttonCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonCreate.setMaximumSize(new java.awt.Dimension(157, 38));
        buttonCreate.setMinimumSize(new java.awt.Dimension(157, 38));
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 60));

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
        jPanel1.add(buttonExportXls, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 25, 136, 40));

        buttonModify.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonModify.setForeground(new java.awt.Color(101, 128, 223));
        buttonModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconEdit.png"))); // NOI18N
        buttonModify.setText("Modificación");
        buttonModify.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        buttonModify.setContentAreaFilled(false);
        buttonModify.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonModify.setMaximumSize(new java.awt.Dimension(157, 35));
        buttonModify.setMinimumSize(new java.awt.Dimension(157, 35));
        buttonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifyActionPerformed(evt);
            }
        });
        jPanel1.add(buttonModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 170, 60));

        buttonDelete.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(255, 0, 51));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTrash.png"))); // NOI18N
        buttonDelete.setText("Eliminar");
        buttonDelete.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        buttonDelete.setContentAreaFilled(false);
        buttonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonDelete.setMaximumSize(new java.awt.Dimension(157, 35));
        buttonDelete.setMinimumSize(new java.awt.Dimension(157, 35));
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 170, 60));

        buttonExportPdf.setBackground(new java.awt.Color(153, 0, 51));
        buttonExportPdf.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonExportPdf.setForeground(new java.awt.Color(255, 255, 255));
        buttonExportPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdfIcon.png"))); // NOI18N
        buttonExportPdf.setText("Exportar");
        buttonExportPdf.setBorder(null);
        buttonExportPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonExportPdf.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonExportPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExportPdfActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExportPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 25, 136, 40));

        buttonTemplate1.setBackground(new java.awt.Color(0, 102, 102));
        buttonTemplate1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonTemplate1.setForeground(new java.awt.Color(255, 255, 255));
        buttonTemplate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exportExcel .png"))); // NOI18N
        buttonTemplate1.setText("Cargar");
        buttonTemplate1.setBorder(null);
        buttonTemplate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTemplate1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonTemplate1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonTemplate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTemplate1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTemplate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 25, 136, 40));

        buttonTemplate.setBackground(new java.awt.Color(0, 102, 153));
        buttonTemplate.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonTemplate.setForeground(new java.awt.Color(255, 255, 255));
        buttonTemplate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exportExcel .png"))); // NOI18N
        buttonTemplate.setText("Plantilla");
        buttonTemplate.setBorder(null);
        buttonTemplate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTemplate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonTemplate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonTemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTemplateActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 25, 136, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(453, 500));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Empleado", "Nombre", "Apellidos", "Area", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setRowHeight(25);
        table.setRowMargin(3);
        table.setShowGrid(true);
        table.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

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
                .addContainerGap(316, Short.MAX_VALUE))
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

    /**
     * Genera un archivo excel en la ruta especificada con toda la información
     * de los empleados registrados. No muentras informacion de las cuentas
     *
     * @param outputPath String con la ruta y nombre a guardar
     */
    private void exportToExcel(String outputPath) {
        try ( Workbook workbook = new XSSFWorkbook()) {
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
                row.createCell(0).setCellValue(employee.getNumempleado());
                row.createCell(1).setCellValue(employee.getNombre());
                row.createCell(2).setCellValue(employee.getApellidop());
                row.createCell(3).setCellValue(employee.getApellidom());
                row.createCell(4).setCellValue(employee.getFechanac().toString()); // Ajusta según el formato de fecha que desees
                row.createCell(5).setCellValue(employee.getCorreo());
                row.createCell(6).setCellValue(employee.getTelefono());
                row.createCell(7).setCellValue(employee.getFechaing().toString()); // Ajusta según el formato de fecha que desees
                row.createCell(8).setCellValue(employee.getEstado());
                row.createCell(9).setCellValue(employee.getPuesto());

                // Autoajustar el ancho de las columnas después de agregar los datos a la fila
                for (int i = 0; i < columns.length; i++) {
                    sheet.autoSizeColumn(i);
                }
            }

            // Escribir el archivo Excel
            try ( FileOutputStream fileOut = new FileOutputStream(outputPath)) {
                workbook.write(fileOut);
                System.out.println("Archivo Excel generado con éxito en: " + outputPath);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Genera un archivo excel en la ruta especificada con toda la información
     * de los empleados registrados. No muentras informacion de las cuentas
     *
     * @param outputPath String con la ruta y nombre a guardar
     */
    private void excelTemplate(String outputPath) {
        try ( Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Employees");

            // Crear encabezados
            Row headerRow = sheet.createRow(0);
            String[] columns = {"Número de Empleado", "Nombre", "Apellido Paterno", "Apellido Materno",
                "Fecha Nacimiento", "Correo", "Teléfono", "Fecha Ingreso", "Estado", "Puesto",
                "Usuario", "Contraseña", "Foto de perfil"};

            CellStyle headerStyle = createHeaderStyle(workbook);

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerStyle);
            }

            // Escribir el archivo Excel
            try ( FileOutputStream fileOut = new FileOutputStream(outputPath)) {
                workbook.write(fileOut);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Devuelve un style con el formato estandar para los reportes con excel
     *
     * @param workbook Libro sobre el cual se aplican los estilos de formato
     * basico
     * @return Obj Style para su uso libre
     */
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

    /**
     * Crea y muestra un modelo de tabla con la información de los empleados
     */
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

    private void buttonExportXlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportXlsActionPerformed
        exportToExcel("./reports/" + Tools.getFormatExcelFileName("Empleados"));
    }//GEN-LAST:event_buttonExportXlsActionPerformed

    /**
     * Utiliza la plantilla Empleados.jasper para generar un reporte pdf exporta
     * en ruta establecida en el archivo por defecto resource/files/settings
     *
     * @param evt Objeto con propiedades del evento click
     */
    private void buttonExportPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportPdfActionPerformed
        try {
            String reportPath = "src/main/java/com/unsis/reports/Empleados.jasper";

            // Cargar platilla .jasper (compilado)
            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(reportPath);

            // agregar información 
            JRBeanCollectionDataSource dataSource
                    = new JRBeanCollectionDataSource(jpaController.findAllEntities(Employee.class));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);

            // Exportar el informe a PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "./reports/Empleados.pdf");

            JOptionPane.showMessageDialog(null, "Reporte exportado", "Accion exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (JRException e) {
        }
    }//GEN-LAST:event_buttonExportPdfActionPerformed

    private void buttonTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTemplateActionPerformed
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // El usuario ha seleccionado un archivo y ha hecho clic en "Guardar"
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            // Verifica si la cadena ya termina con ".xlsx"
            if (!filePath.endsWith(".xlsx")) {
                // Si no termina con ".xlsx", agrégale la extensión
                filePath += ".xlsx";
            }
            excelTemplate(filePath);
        }
    }//GEN-LAST:event_buttonTemplateActionPerformed

    private void buttonTemplate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTemplate1ActionPerformed
        // Establecer el filtro para que solo se muestren archivos con extensión xlsx
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos Excel (*.xlsx)", "xlsx");
        selectFileChooser.setFileFilter(filter);

        // Mostrar el diálogo de selección de archivo
        int result = selectFileChooser.showOpenDialog(this);

        // Verificar si se seleccionó un archivo
        if (result == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado
            String pathFile = Tools.ROOTPATH + "files/temporal.xlsx";
            Tools.copyFile(selectFileChooser.getSelectedFile().getAbsolutePath(), pathFile);
            try ( Workbook workbook = new XSSFWorkbook(pathFile)) {
                Sheet sheet = workbook.getSheetAt(0); // Obtén la primera hoja (índice 0)
                Employee employee;
                Account account;
                DataFormatter format = new DataFormatter();
                ArrayList<Employee> emplooyes = new ArrayList<>();
                int index = 2;
                System.out.println("Lineas: "+ sheet.getLastRowNum());
                // Iterar sobre las filas, comenzando desde la segunda fila (índice 1, ya que la primera fila es el encabezado)
                for (int rowIndex = 1; rowIndex < sheet.getLastRowNum(); rowIndex++) {
                    Row row = sheet.getRow(rowIndex);

                    try {

                        // Crear un nuevo objeto Employee utilizando el formato del Builder y los valores de las celdas
                        employee = new Employee.Builder()
                                .withNumEmpleado((int) row.getCell(0).getNumericCellValue())
                                .withNombre(row.getCell(1).getStringCellValue())
                                .withApellidoP(row.getCell(2).getStringCellValue())
                                .withApellidoM(row.getCell(3).getStringCellValue())
                                .withFechaNac(row.getCell(4).getDateCellValue()) // Asegúrate de que la celda contenga una fecha
                                .withCorreo(row.getCell(5).getStringCellValue())
                                .withTelefono(row.getCell(6).getStringCellValue())
                                .withFechaIng(row.getCell(7).getDateCellValue()) // Asegúrate de que la celda contenga una fecha
                                .withEstado(row.getCell(8).getStringCellValue())
                                .withPuesto(row.getCell(9).getStringCellValue())
                                .build();

                        account = new Account.Builder()
                                .withId(1)
                                .withIdEmpleado(employee)
                                .withNumCuenta(0)
                                .withUsuario(row.getCell(10).getStringCellValue())
                                .withContrasena(Tools.cryptPassword(format.formatCellValue(row.getCell(11)))) // Encriptar usando tools
                                .withFotoPerfil(row.getCell(12).getStringCellValue())
                                .build();

                        // Agregar el objeto a la lista
                        employee.setAccount(account);
//                    jpaController.create(employee);
                        emplooyes.add(employee);
                    } catch (Exception e) {
                        System.err.println("Error al crear entidades\n" + e.getMessage());
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al leer el archivo\nLinea " + index, "Aviso", JOptionPane.ERROR_MESSAGE);
                    }
                    index++;
                }
                for (Employee emplooye : emplooyes) {
                    jpaController.create(emplooye);
                }
            } catch (Exception e) {
                System.err.println("Error al registrar\n" + e.getMessage());
                e.printStackTrace();
            }
        } else {
            // Mostrar un mensaje si se canceló la selección
            System.out.println("Selección de archivo cancelada");
        }
    }//GEN-LAST:event_buttonTemplate1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonExportPdf;
    private javax.swing.JButton buttonExportXls;
    private javax.swing.JButton buttonModify;
    private javax.swing.JButton buttonTemplate;
    private javax.swing.JButton buttonTemplate1;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFileChooser selectFileChooser;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
