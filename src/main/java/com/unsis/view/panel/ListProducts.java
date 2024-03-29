package com.unsis.view.panel;

import com.unsis.clases.Tools;
import com.unsis.models.entity.Product;
import com.unsis.view.Main;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import com.unsis.controller.JpaController;
import com.unsis.models.entity.Employee;
import com.unsis.models.entity.Flavors;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author jared
 */
public class ListProducts extends javax.swing.JPanel {

    private final Main mainWindow;
    private final JpaController jpaController;
    
    private List<Product> productList;

    /**
     * Creates new form ListProducts
     */
    public ListProducts(Main mainWindow) {
        initComponents();
        this.setBounds(217, 0, 1200, 692);
        // Obtener el JTableHeader (encabezado de la tabla)
        tableProduct.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));
        tableProduct.getTableHeader().setOpaque(false);
        tableProduct.getTableHeader().setBackground(new Color(32, 136, 203));
        tableProduct.getTableHeader().setForeground(Color.WHITE);

        this.mainWindow = mainWindow;
        this.jpaController = new JpaController();
        

        resizeImages();;
    }

    private void resizeImages() {
        Tools tools = new Tools();
        Icon resizedIcon = tools.resizeIcon(buttonExportPdf.getIcon(), 35, 35);
        buttonExportPdf.setIcon(resizedIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonCreate = new javax.swing.JButton();
        buttonExport = new javax.swing.JButton();
        buttonModify = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonExportPdf = new javax.swing.JButton();
        buttonTemplate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();

        fileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        fileChooser.setApproveButtonText("Guardar");
        fileChooser.setApproveButtonToolTipText("");
        fileChooser.setDialogTitle("Descargar platilla");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Documento Excel", "xlsx"));

        setBackground(new java.awt.Color(240, 240, 240));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Jaldi", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 56, 112));
        jLabel2.setText("Productos");

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

        buttonExport.setBackground(new java.awt.Color(0, 102, 0));
        buttonExport.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        buttonExport.setForeground(new java.awt.Color(255, 255, 255));
        buttonExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exportExcel .png"))); // NOI18N
        buttonExport.setText("Exportar");
        buttonExport.setBorder(null);
        buttonExport.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonExport.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExportActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, 136, 40));

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
        jPanel1.add(buttonExportPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 30, 136, 40));

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
        jPanel1.add(buttonTemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 136, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(453, 500));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripción", "Precio Venta", "Disponibles", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProduct.setGridColor(new java.awt.Color(204, 204, 204));
        tableProduct.setRowHeight(25);
        tableProduct.setRowMargin(3);
        tableProduct.setShowGrid(true);
        tableProduct.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tableProduct);
        if (tableProduct.getColumnModel().getColumnCount() > 0) {
            tableProduct.getColumnModel().getColumn(0).setResizable(false);
            tableProduct.getColumnModel().getColumn(1).setResizable(false);
            tableProduct.getColumnModel().getColumn(2).setResizable(false);
            tableProduct.getColumnModel().getColumn(3).setResizable(false);
            tableProduct.getColumnModel().getColumn(4).setResizable(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1704, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        this.mainWindow.setView("Alta de Producto");
    }//GEN-LAST:event_buttonCreateActionPerformed

    public void showModel() {
        // Llamada al método findAllEntities para obtener la lista de productos
        ArrayList<Product> products = jpaController.findAllEntities(Product.class);
        productList = products;
        // Configuración del modelo de la tabla
        DefaultTableModel tableModel = (DefaultTableModel) tableProduct.getModel();
        // Eliminar filas existentes
        tableModel.setRowCount(0);
        tableProduct.setModel(tableModel);

        for (Product product : products) {
            Object[] rowData = {
                product.getNombre(),
                product.getDescripcion(),
                product.getPrecioventa(),
                product.getDisponible(),
                product.getEstado()
            };
            tableModel.addRow(rowData);
        }
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.showModel();
    }//GEN-LAST:event_formComponentShown

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        Product product = findProduct();

        if (product != null) {
            int opcion = JOptionPane.showConfirmDialog(null,
                    "¿Estás seguro de continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                jpaController.destroy(product);
                this.showModel();
            }
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifyActionPerformed
        Product product = findProduct();
        if (product != null) {
            UpdateProduct.setProduct(product);
            mainWindow.setView("Editar Producto");
        }
    }//GEN-LAST:event_buttonModifyActionPerformed

    private void buttonExportPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportPdfActionPerformed
        try {
            String reportPath = "src/main/java/com/unsis/reports/Products.jasper";

            // Cargar platilla .jasper (compilado)
            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(reportPath);

            // agregar información 
            JRBeanCollectionDataSource dataSource
                    = new JRBeanCollectionDataSource(jpaController.findAllEntities(Product.class));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);

            // Exportar el informe a PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "./reports/Products.pdf");

            JOptionPane.showMessageDialog(null, "Reporte exportado", "Accion exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Reporte no exportado", "Accion no exitosa",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExportPdfActionPerformed

    private void buttonExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportActionPerformed
        try {
            exportToExcel("./reports/" + Tools.getFormatExcelFileName("Productos"));
            JOptionPane.showMessageDialog(null, "Reporte exportado", "Accion exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.err.println("Error al exportar\n" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Reporte no exportado", "Accion no exitosa",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExportActionPerformed

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
    
    /**/
    public Product findProduct() {
        int filaSeleccionada = tableProduct.getSelectedRow();

        if (filaSeleccionada != -1) { // Verifica que haya una fila seleccionada
            var codeProduct = tableProduct.getValueAt(filaSeleccionada, 0);

            ArrayList<Product> products = jpaController.findAllEntities(Product.class);

            for (Product product : products) {
                if (product.getNombre() == codeProduct) {
                    return product;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
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

    //Busca los sabores del producto seleccionado
    private List<String> obtenerFlavors(int idProducto) {
        List<Flavors> sabores = jpaController.findAllEntities(Flavors.class);
        List<String> saboresProd = new ArrayList<>();

        for (Flavors sabor : sabores) {
            if (sabor.getIdProduct() == idProducto) {
                saboresProd.add(String.valueOf(sabor));
            }
        }
        return saboresProd;
    }

    private void excelTemplate(String outputPath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Products");

            // Crear encabezados
            Row headerRow = sheet.createRow(0);
            String[] columns = {"Codigo de barras", "Nombre", "Precio de Compra", "Precio de Venta", "Tipo", "Descripción", "Numero de Producto", "Estado", "Disponible", "Variantes"};

            CellStyle headerStyle = createHeaderStyle(workbook);

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerStyle);
            }

            // Escribir el archivo Excel
            try (FileOutputStream fileOut = new FileOutputStream(outputPath)) {
                workbook.write(fileOut);
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
        org.apache.poi.ss.usermodel.Font font = workbook.createFont();
        font.setColor(IndexedColors.WHITE.getIndex());
        style.setFont(font);

        return style;
    }
   
    private void exportToExcel(String outputPath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Product");

            // Crear encabezados
            Row headerRow = sheet.createRow(0);
            String[] columns = {"Codigo de barras", "Nombre", "Precio de Compra", "Precio de Venta", "Tipo", "Descripción", "Numero de Producto", "Estado", "Disponible", "Variantes"};

            CellStyle headerStyle = createHeaderStyle(workbook);

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerStyle);
            }

            // Agregar datos de empleados
            int rowNum = 1;
            for (Product producto : productList) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(producto.getCodigobarra());
                row.createCell(1).setCellValue(producto.getNombre());
                row.createCell(2).setCellValue(producto.getPreciocom());
                row.createCell(3).setCellValue(producto.getPrecioventa());
                row.createCell(4).setCellValue(producto.getTipo());// Ajusta según el formato de fecha que desees
                row.createCell(5).setCellValue(producto.getDescripcion());
                row.createCell(6).setCellValue(producto.getNumproducto());
                row.createCell(7).setCellValue(producto.getEstado()); // Ajusta según el formato de fecha que desees
                row.createCell(8).setCellValue(producto.getDisponible());
                row.createCell(9).setCellValue(producto.getVariante());

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonExport;
    private javax.swing.JButton buttonExportPdf;
    private javax.swing.JButton buttonModify;
    private javax.swing.JButton buttonTemplate;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProduct;
    // End of variables declaration//GEN-END:variables
}
