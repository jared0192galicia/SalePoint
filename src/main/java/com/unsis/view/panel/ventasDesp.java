package com.unsis.view.panel;

import com.unsis.controller.JpaController;
import com.unsis.models.entity.Sales;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Arleth
 */
public class ventasDesp extends javax.swing.JPanel {

    private List<Sales> salesList;
    private List<SalesRow> listSalesPanels;


    /**
     * Creates new form ventasDesp
     */
    public ventasDesp() {
        initComponents();
        salesList = new ArrayList<>();
        listSalesPanels = new ArrayList<>();
        buildPanel();

        HiloActualizar hUpdate = new HiloActualizar();
        hUpdate.start();
    }

    /**
     * Este método construye las filas en el panel
     */
    private void buildPanel() {
        //        deplegablesPanel.add(desp);
        MigLayout layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill");
        this.panelDesp.setLayout(layout);
    }

    /**
     * Este método pobla el panel con los pedido existentes.
     */
    private void populate() {
        SalesRow h;
        int i = 0;
        listSalesPanels = new ArrayList<>();
        // recorro la lista con un for each.
        for (Sales sale : salesList) {
            // Por cada pedido hago lo siguiente.
            // sale: es el objeto de cada item del for each

            /*
            Aqui creo los objetos para la cabecera y el hijo para desplegar, esto
            para poder agregarle imagenes y modificar los componentes.
             */
            h = new SalesRow();

            // Aquí agrego un icono a la fila del pedido
            // Genera num random new Random().nextInt(0, 3)
            h.getImgLabel().setIcon(new ImageIcon(
                    getClass().getResource(sale.getIdempleado().getAccount().getFotoperfil())));
            h.getNombreLabel().setText(sale.getIdempleado().getNombre()); // Pone el nombre del empleado
            h.getPedidoLabel().setText(sale.getTipoorden()); // Pone el tipo de pedido.

            h.getHoraLabel().setText(
                    (sale.getFechahora().compareTo(new Date()) >= 0 ? "Hoy" : "Ayer")
                    + " A las " + new SimpleDateFormat(
                            "HH:mm:ss").format(sale.getFechahora()));

            h.getProductoLabel().setText("<html><p style=\"text-align: center;\">"
                    + sale.getIdproducto().getNombre()
                    + " " + sale.getIdproducto().getDescripcion()
                    + "<br>" + sale.getComentarios() + "</p>"
                    + "</html>");

            // propiedades del panel
            if ((i % 2) == 0) {
                h.setBackground(new Color(240, 248, 255));
            }

            listSalesPanels.add(h);
            i++;
        }
    }

    private void loadSalesList() {
        //obtengo una lista de todas las ventas de la base de datos.
        List<Sales> salesListTemp = new JpaController().findAllEntities(Sales.class); // Cambie los nombres a minusculas porque me marcaba error.
        salesList = new ArrayList<>();
        for (Sales sales : salesListTemp) {
            try {
            if (sales.getEstatus() == 0) {
                    salesList.add(sales);
                }
            } catch (Exception e) {
                    salesList.add(sales);
            }
        }
    }

    private void loadSales() {
        this.panelDesp.removeAll();
        populate();
        for (SalesRow listSalesPanel : listSalesPanels) {
            this.panelDesp.add(listSalesPanel);
        }
        revalidate();
    }

    private class HiloActualizar extends Thread {

        int sizeList = 0;

        @Override
        public void run() {
            do {
                try {
                    /* Aquí no actualiza la lista de productos al ejecutar un update.
                    para cambiar el estado de la venta.
                     */
                    loadSalesList();

                    if (salesList.size() != sizeList) {
                        loadSales();
                        sizeList = salesList.size();
                    }
                    sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ventasDesp.class.getName()).log(Level.SEVERE, null, ex);
                }
            } while (true);
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelDesp = new javax.swing.JPanel();

        jLabel2.setBackground(new java.awt.Color(3, 43, 89));
        jLabel2.setFont(new java.awt.Font("Jaldi", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 56, 112));
        jLabel2.setText("Registro de ventas realizadas");

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelDespLayout = new javax.swing.GroupLayout(panelDesp);
        panelDesp.setLayout(panelDespLayout);
        panelDespLayout.setHorizontalGroup(
            panelDespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        panelDespLayout.setVerticalGroup(
            panelDespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelDesp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 625, Short.MAX_VALUE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

//archivos e hilos
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panelDesp;
    // End of variables declaration//GEN-END:variables
}
