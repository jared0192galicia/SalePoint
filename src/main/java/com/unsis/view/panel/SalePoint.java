/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.unsis.view.panel;

import com.unsis.clases.Session;
import com.unsis.clases.Tools;
import com.unsis.controller.JpaController;
import com.unsis.dao.Conexion;
import com.unsis.models.entity.Flavors;
import com.unsis.models.entity.Product;
import com.unsis.models.entity.Sales;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author labtecweb09
 */
public class SalePoint extends javax.swing.JPanel {

    private final JpaController controller;
    private String selectedMess = "";
    private boolean band = false;
    private final Connection cn = Conexion.getConexion();
    private final ArrayList<Product> listPedido;
    private ArrayList<Product> productList = new ArrayList<>();
    private ArrayList<String> listComent;
    private ArrayList<Boolean> listTipoOrden;

    /**
     * Creates new form Venta
     */
    public SalePoint() {
        initComponents();
        this.labelInvalidCant.setVisible(false);
        this.labelInvalidName.setVisible(false);
        this.labelInvalidCodBarra.setVisible(false);
        this.labelVoidCamp.setVisible(false);
        this.labelVoidTable.setVisible(false);
        this.controller = new JpaController();
        JTableHeader TableProduct = tableProduct.getTableHeader();
        

        // Crear un renderizador de encabezado personalizado
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER); // Alineación del texto en el encabezado
        headerRenderer.setVerticalAlignment(SwingConstants.CENTER);
        headerRenderer.setBackground(new Color(25, 130, 206)); // Cambia el color de fondo del encabezado
        headerRenderer.setForeground(Color.WHITE); // Cambia el color del texto del encabezado
        headerRenderer.setFont(new Font("Arial", Font.BOLD, 32)); // Cambia el color del texto del encabezado

        // Asignar el renderizador personalizado al encabezado
        TableProduct.setDefaultRenderer(headerRenderer);

        resizeImages();
        llenarComboProd();
        dialogConfirm.setLocationRelativeTo(null);
        DefaultTableModel tableModel = (DefaultTableModel) tableProduct.getModel();
        tableModel.setRowCount(0);
        tableProduct.setModel(tableModel);
        this.listPedido = new ArrayList<>();
        this.listComent = new ArrayList<>();
        this.listTipoOrden = new ArrayList<>();
    }

    /**
     * Redimenciona las imagenes de los botones para que se ajusten a el tamaño
     * necesario
     */
    private void resizeImages() {
        Tools tools = new Tools();
        Icon resizedIcon = tools.resizeIcon(buttonAdd.getIcon(), 20, 20);
        buttonAdd.setIcon(resizedIcon);
    }
/**
 * Llena el comboBox de productos con los productos que esten en la base de
 * datos
 */
    public void llenarComboProd() {
        // Llamada al método findAllEntities para obtener la lista de productos
        productList = controller.findAllEntities(Product.class);

        // Limpiar el JComboBox antes de agregar nuevos elementos
        comboProd.removeAllItems();

        for (Product product : productList) {
            // Obtener el nombre del producto
            String nombreProducto = product.getNombre();

            // Agregar el nombre del producto al JComboBox
            comboProd.addItem(nombreProducto);
            //llenarComboSab();
        }
    }
/**
 * Llena el comboBox de sabores dependiendo del producto que sea elegido en el 
 * comboBox de producto
 */
    public void llenarComboSab() {
        comboSab.removeAllItems();

        String nameProd = (String) comboProd.getSelectedItem();

        if (nameProd != null) {
            Product selectProd = obtProduct(nameProd);

            if (selectProd != null) {
                ArrayList<Flavors> sabores = obtSabProd(selectProd);

                for (Flavors sabor : sabores) {
                    comboSab.addItem(sabor.getSabor());
                }
            }
        }
    }
/**
 * Obtiene una lista de los sabores dependiendo del producto seleccionado, 
 * recibe el producto y busca los sabores
 * @param producto
 * @return 
 */
    private ArrayList<Flavors> obtSabProd(Product producto) {
        ArrayList<Flavors> sabores = controller.findAllEntities(Flavors.class);
        ArrayList<Flavors> saboresProd = new ArrayList<>();

        for (Flavors sabor : sabores) {
            if (sabor.getIdProduct() == producto.getId()) {
                saboresProd.add(sabor);
            }
        }
        return saboresProd;
    }
/**
 * Obtiene los productos de la base de datos
 * @param nameProd
 * @return 
 */
    private Product obtProduct(String nameProd) {
        for (Product product : productList) {
            if (product.getNombre().equalsIgnoreCase(nameProd)) {
                return product;
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dialogConfirm = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        vendedorLabel = new javax.swing.JLabel();
        compradorLabel = new javax.swing.JLabel();
        montoLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        nameVendedorLabel = new javax.swing.JLabel();
        nameCompradorLabel = new javax.swing.JLabel();
        ingresoMontoLabel = new javax.swing.JLabel();
        ingresarFechaLabel = new javax.swing.JLabel();
        confirmarBoton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableConfComp = new javax.swing.JTable();
        buttonClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboSab = new javax.swing.JComboBox<>();
        comboProd = new javax.swing.JComboBox<>();
        txtCant = new javax.swing.JTextField();
        rbNormal = new javax.swing.JRadioButton();
        rbParaLlevar = new javax.swing.JRadioButton();
        txtComents = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        txtCodBarra = new javax.swing.JTextField();
        buttonAddOrder = new javax.swing.JButton();
        labelInvalidCodBarra = new javax.swing.JLabel();
        labelInvalidCant = new javax.swing.JLabel();
        labelInvalidName = new javax.swing.JLabel();
        labelVoidCamp = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JButton();
        labelVoidTable = new javax.swing.JLabel();

        dialogConfirm.setAlwaysOnTop(true);
        dialogConfirm.setUndecorated(true);
        dialogConfirm.setResizable(false);
        dialogConfirm.setSize(new java.awt.Dimension(925, 446));
        dialogConfirm.setType(java.awt.Window.Type.UTILITY);
        dialogConfirm.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                dialogConfirmComponentShown(evt);
            }
        });
        dialogConfirm.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(15, 36, 109));
        jLabel2.setFont(new java.awt.Font("Jaldi", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 36, 109));
        jLabel2.setText("Detalles de la venta");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 6, -1, 24));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 36, 356, 10));

        vendedorLabel.setBackground(new java.awt.Color(118, 125, 142));
        vendedorLabel.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        vendedorLabel.setForeground(new java.awt.Color(118, 125, 142));
        vendedorLabel.setText("Vendedor");
        jPanel4.add(vendedorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 110, -1));

        compradorLabel.setBackground(new java.awt.Color(118, 125, 142));
        compradorLabel.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        compradorLabel.setForeground(new java.awt.Color(118, 125, 142));
        compradorLabel.setText("Comprador");
        jPanel4.add(compradorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 130, -1));

        montoLabel.setBackground(new java.awt.Color(118, 125, 142));
        montoLabel.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        montoLabel.setForeground(new java.awt.Color(118, 125, 142));
        montoLabel.setText("Monto de la venta");
        jPanel4.add(montoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        fechaLabel.setBackground(new java.awt.Color(118, 125, 142));
        fechaLabel.setFont(new java.awt.Font("Jaldi", 0, 16)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(118, 125, 142));
        fechaLabel.setText("Fecha y hora de venta");
        jPanel4.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, -1));

        nameVendedorLabel.setBackground(new java.awt.Color(118, 125, 142));
        nameVendedorLabel.setFont(new java.awt.Font("Jaldi", 0, 12)); // NOI18N
        nameVendedorLabel.setForeground(new java.awt.Color(118, 125, 142));
        nameVendedorLabel.setText("Hugo López");
        nameVendedorLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.add(nameVendedorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 114, 28));

        nameCompradorLabel.setBackground(new java.awt.Color(118, 125, 142));
        nameCompradorLabel.setFont(new java.awt.Font("Jaldi", 0, 12)); // NOI18N
        nameCompradorLabel.setForeground(new java.awt.Color(118, 125, 142));
        nameCompradorLabel.setText("Pedro (taxista)");
        nameCompradorLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.add(nameCompradorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 190, 28));

        ingresoMontoLabel.setForeground(new java.awt.Color(118, 125, 142));
        ingresoMontoLabel.setText("$__.__");
        ingresoMontoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.add(ingresoMontoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 114, 22));

        ingresarFechaLabel.setBackground(new java.awt.Color(118, 125, 142));
        ingresarFechaLabel.setFont(new java.awt.Font("Jaldi", 0, 12)); // NOI18N
        ingresarFechaLabel.setForeground(new java.awt.Color(118, 125, 142));
        ingresarFechaLabel.setText("3 de Octubre 2023 10:15:45");
        ingresarFechaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.add(ingresarFechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 190, 22));

        confirmarBoton.setBackground(new java.awt.Color(25, 130, 206));
        confirmarBoton.setFont(new java.awt.Font("Jaldi", 0, 12)); // NOI18N
        confirmarBoton.setForeground(new java.awt.Color(255, 255, 255));
        confirmarBoton.setText("Confirmar compra");
        confirmarBoton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBotonActionPerformed(evt);
            }
        });
        jPanel4.add(confirmarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 303, 137, 36));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 420, 380));

        tableConfComp.setFont(new java.awt.Font("Jaldi", 0, 12)); // NOI18N
        tableConfComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productos", "Descripción", "Cantidad", "Precio p/pz", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableConfComp.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tableConfComp.setSelectionForeground(new java.awt.Color(250, 250, 250));
        jScrollPane2.setViewportView(tableConfComp);
        if (tableConfComp.getColumnModel().getColumnCount() > 0) {
            tableConfComp.getColumnModel().getColumn(0).setResizable(false);
            tableConfComp.getColumnModel().getColumn(1).setResizable(false);
            tableConfComp.getColumnModel().getColumn(2).setResizable(false);
            tableConfComp.getColumnModel().getColumn(3).setResizable(false);
            tableConfComp.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 470, 380));

        buttonClose.setBackground(new java.awt.Color(242, 242, 242));
        buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconClose.png"))); // NOI18N
        buttonClose.setBorder(null);
        buttonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });
        jPanel3.add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 30, 30));

        dialogConfirm.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 448));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Jaldi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 41, 87));
        jLabel1.setText("Realizar Venta");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 281, 46));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 146, 222));
        jLabel3.setText("Productos agregados");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 330, -1));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Descripcion", "Cantidad", "Precio por pz", "Total"
            }
        ));
        jScrollPane1.setViewportView(tableProduct);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 820, 560));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 960, 720));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(7, 56, 112));
        jLabel22.setText("Captura de producto");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 260, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(118, 125, 142));
        jLabel6.setText("Producto");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 80, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(118, 125, 142));
        jLabel7.setText("Sabor");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(118, 125, 142));
        jLabel8.setText("Código de barras");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 370, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(118, 125, 142));
        jLabel9.setText("Tipo de orden");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 150, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(118, 125, 142));
        jLabel10.setText("Comentarios");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(118, 125, 142));
        jLabel11.setText("Nombre del comprador");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        comboSab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboSab, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 160, 30));

        comboProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdActionPerformed(evt);
            }
        });
        jPanel2.add(comboProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 160, 30));

        txtCant.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantFocusLost(evt);
            }
        });
        jPanel2.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 160, 30));

        buttonGroup1.add(rbNormal);
        rbNormal.setText("Normal");
        rbNormal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rbNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNormalActionPerformed(evt);
            }
        });
        jPanel2.add(rbNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        buttonGroup1.add(rbParaLlevar);
        rbParaLlevar.setText("Para llevar");
        rbParaLlevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParaLlevarActionPerformed(evt);
            }
        });
        jPanel2.add(rbParaLlevar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));
        jPanel2.add(txtComents, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 164, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Jaldi", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(118, 125, 142));
        jLabel12.setText("Cantidad");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 164, 30));

        buttonAdd.setBackground(new java.awt.Color(82, 146, 222));
        buttonAdd.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconCirclePlus.png"))); // NOI18N
        buttonAdd.setText("Agregar");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 160, 33));

        txtCodBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodBarraActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 370, 40));

        buttonAddOrder.setBackground(new java.awt.Color(82, 146, 222));
        buttonAddOrder.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        buttonAddOrder.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddOrder.setText("Agregar pedido");
        buttonAddOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAddOrderMouseClicked(evt);
            }
        });
        jPanel2.add(buttonAddOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 370, 50));

        labelInvalidCodBarra.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelInvalidCodBarra.setForeground(new java.awt.Color(255, 153, 0));
        labelInvalidCodBarra.setText("Mercancia no disponible");
        jPanel2.add(labelInvalidCodBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 360, -1));

        labelInvalidCant.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelInvalidCant.setForeground(new java.awt.Color(153, 0, 0));
        labelInvalidCant.setText("Cantidad no valida");
        jPanel2.add(labelInvalidCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 150, -1));

        labelInvalidName.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelInvalidName.setForeground(new java.awt.Color(153, 0, 0));
        labelInvalidName.setText("Caracteres invalidos");
        jPanel2.add(labelInvalidName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 160, -1));

        labelVoidCamp.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelVoidCamp.setForeground(new java.awt.Color(153, 0, 0));
        labelVoidCamp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVoidCamp.setText("Campos necesarios vacios");
        jPanel2.add(labelVoidCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 450, -1));

        buttonDelete.setBackground(new java.awt.Color(82, 146, 222));
        buttonDelete.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(255, 255, 255));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTrash.png"))); // NOI18N
        buttonDelete.setText("Borrar");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 160, 33));

        labelVoidTable.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelVoidTable.setForeground(new java.awt.Color(153, 0, 0));
        labelVoidTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVoidTable.setText("No hay productos que comprar");
        jPanel2.add(labelVoidTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 450, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 560, 720));
    }// </editor-fold>//GEN-END:initComponents
/**
 * Agrega la orden a un dialogConfirm para confirmar la compra
 * @param evt 
 */
    private void buttonAddOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddOrderMouseClicked
        if (((DefaultTableModel) tableProduct.getModel()).getRowCount() > 0) {
            labelVoidTable.setVisible(false);
            dialogConfirm.show(true);
            nameCompradorLabel.setText(txtName.getText());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'del' yyyy ' ' HH:mm:ss");
            LocalDateTime fechaActual = LocalDateTime.now();
            ingresarFechaLabel.setText(fechaActual.format(formatter));
            nameVendedorLabel.setText(Session.getAccount().getIdempleado().getNombre());
        } else {
            labelVoidTable.setVisible(true);
        }
    }//GEN-LAST:event_buttonAddOrderMouseClicked

    private void confirmarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBotonActionPerformed
//      this.wrapper.setEnabled(true);
//      this.dispose();
        dialogConfirm.show(false);
        int idVenta = obSigIdVeta();
        int index = 0;
        for (Product product : listPedido) {
            Sales sales = new Sales.Builder()
                    .withIdVenta(idVenta)
                    .withIdProducto(product)
                    .withIdEmpleado(Session.getAccount().getIdempleado().getId())
                    .withTipoOrden(listTipoOrden.get(index) ? "Normal" : "Para llevar")//Crear lista de booleanos
                    .withNombreComp(txtName.getText())
                    .withComentarios(listComent.get(index))//Crear lista de String
                    .withCodigoBarras(product.getCodigobarra())
                    .withFechaHora(new Date(ingresarFechaLabel.getText()))
                    .build();
            index++;
        }

    }//GEN-LAST:event_confirmarBotonActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
//        this.wrapper.setEnabled(true);
//        this.dispose();
        dialogConfirm.show(false);
    }//GEN-LAST:event_buttonCloseActionPerformed
/**
 * Validaciones de cantidades y del nombre del comprador
 * @param evt 
 */
    private void txtCantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantFocusLost
        String cantidad = txtCant.getText().trim();
        String regex = "^[1-9]\\d*$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cantidad);

        if (matcher.matches()) {
            labelInvalidCant.setVisible(false);
            band = false;
        } else {
            System.out.println("Cantidad invalida");

            labelInvalidCant.setVisible(true);
            band = true;
        }
    }//GEN-LAST:event_txtCantFocusLost

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        String cantidad = txtName.getText().trim();
        String regex = "^[a-zA-Z]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cantidad);

        if (matcher.matches()) {
            labelInvalidCodBarra.setVisible(false);
            band = false;
        } else {
            System.out.println("Nombre Invalido");

            labelInvalidCodBarra.setVisible(true);
            band = true;
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        if (band == false) {
            try {
                String producto = (String) comboProd.getSelectedItem();
                String sabor = (String) comboSab.getSelectedItem();
                int cantidad = (Integer.valueOf(txtCant.getText()));
                String nomComp = txtName.getText();
                String coment = txtComents.getText();
                String codBarra = txtCodBarra.getText();
                txtName.setEnabled(false);
                listComent.add(coment);
                boolean tipoOrden = obtTipoOrden();
                listTipoOrden.add(tipoOrden);

                if (txtCant.getText() == null || txtName.getText() == null) {
                    labelVoidCamp.setVisible(true);
                } else {
                    labelVoidCamp.setVisible(false);
                    llenarTabla(producto, cantidad);

                    Session.getAccount().getId();
                }
            } catch (NumberFormatException e) {
                labelVoidCamp.setVisible(true);
            }
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void rbNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNormalActionPerformed
        updateMessage("Normal");
    }//GEN-LAST:event_rbNormalActionPerformed

    private void rbParaLlevarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParaLlevarActionPerformed
        updateMessage("Para llevar");
    }//GEN-LAST:event_rbParaLlevarActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int selectedRow = tableProduct.getSelectedRow();

        if (selectedRow != -1) { // Verifica que haya una fila seleccionada
            int opcion = JOptionPane.showConfirmDialog(null,
                    "¿Estás seguro de continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) tableProduct.getModel();
                //listPedido.remove(listPedido.);
                model.removeRow(selectedRow);

            }
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void txtCodBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodBarraActionPerformed
        int cantidad = 1;
        JTextField textField = (JTextField) evt.getSource();
        String codBarra = textField.getText();
        ArrayList<Product> products = controller.findAllEntities(Product.class);

        for (Product producto : products) {
            if (producto.getCodigobarra().equalsIgnoreCase(codBarra)) {
                String nombreProd = producto.getNombre();
                llenarTabla(nombreProd, cantidad);
                System.out.println(codBarra);

                textField.setText("");
                return;
            } else {
                labelInvalidCodBarra.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtCodBarraActionPerformed

    private void comboProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdActionPerformed
        llenarComboSab();
    }//GEN-LAST:event_comboProdActionPerformed

    private void dialogConfirmComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dialogConfirmComponentShown
        tableConfComp.setModel(tableProduct.getModel());
        DefaultTableModel tableModel = (DefaultTableModel) tableProduct.getModel();
        
        int rowCount = tableModel.getRowCount();
        double total = 0.0f;
        
        for (int i=0; i < rowCount; i++){
            double totalComp = (double) tableModel.getValueAt(i, 4);
            
            total += totalComp;
        }
        ingresoMontoLabel.setText("$" + String.valueOf(total));
    }//GEN-LAST:event_dialogConfirmComponentShown

    private void updateMessage(String mensaje) {
        selectedMess = mensaje;
    }

    public void llenarTabla(String productName, int cantidad) {
        ArrayList<Product> products = controller.findAllEntities(Product.class);

        txtCant.setText("");
        txtComents.setText("");
        DefaultTableModel tableModel = (DefaultTableModel) tableProduct.getModel();
        if (tableModel == null) {
            tableModel = new DefaultTableModel();
            tableModel.addColumn("Producto");
            tableModel.addColumn("Descriptción");
            tableModel.addColumn("Cantidad");
            tableModel.addColumn("Precio por pz");
            tableModel.addColumn("Total");
            tableProduct.setModel(tableModel);
        }

        double precio = 0.0f;

        for (Product producto : products) {
            if (producto.getNombre().equalsIgnoreCase(productName)) {
                precio = producto.getPrecioventa();
                double total = precio * cantidad;

                Object[] rowData = {
                    producto.getNombre(), 
                   producto.getDescripcion(),
                    cantidad,
                    producto.getPrecioventa(),
                    total
                };
                tableModel.addRow(rowData);
                listPedido.add(producto);
                break;
            }
        }
    }

    public int obSigIdVeta() {
        String query = "SELECT MAX(idventa) FROM \"Sales\"";
        try (PreparedStatement pst = cn.prepareStatement(query)) {
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int maxIdVenta = rs.getInt(1);
                return maxIdVenta + 1;
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener el siguiente idVenta: " + e.getMessage());
        }

        return 1; // Si no se puede obtener, devolvemos 1 como valor predeterminado
    }
    
    private boolean obtTipoOrden() {
        if(rbNormal.isSelected()){
            return true;
        }else if (rbParaLlevar.isSelected()){
            return false;
        }else {
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAddOrder;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonDelete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboProd;
    private javax.swing.JComboBox<String> comboSab;
    private javax.swing.JLabel compradorLabel;
    private javax.swing.JButton confirmarBoton;
    private javax.swing.JDialog dialogConfirm;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel ingresarFechaLabel;
    private javax.swing.JLabel ingresoMontoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelInvalidCant;
    private javax.swing.JLabel labelInvalidCodBarra;
    private javax.swing.JLabel labelInvalidName;
    private javax.swing.JLabel labelVoidCamp;
    private javax.swing.JLabel labelVoidTable;
    private javax.swing.JLabel montoLabel;
    private javax.swing.JLabel nameCompradorLabel;
    private javax.swing.JLabel nameVendedorLabel;
    private javax.swing.JRadioButton rbNormal;
    private javax.swing.JRadioButton rbParaLlevar;
    private javax.swing.JTable tableConfComp;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodBarra;
    private javax.swing.JTextField txtComents;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel vendedorLabel;
    // End of variables declaration//GEN-END:variables
}
