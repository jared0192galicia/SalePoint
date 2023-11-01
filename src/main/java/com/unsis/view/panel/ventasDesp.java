package com.unsis.view.panel;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import com.unsis.clases.PanelDesp;

/**
 *
 * @author labtecweb07
 */
public class ventasDesp extends javax.swing.JPanel {
    /**
     * Creates new form ventasDesp
     */
    public ventasDesp() {
        initComponents();
        this.setBounds(0, 0, 899, 691);
        /*
        Aqui creo los objetos para la cabecera y el hijo para desplegar, esto
        para poder agregarle imagenes y modificar los componentes.
        */
        HeadWrapperPanel hPanel1 = new HeadWrapperPanel();
        HeadWrapperPanel hPanel2 = new HeadWrapperPanel();
        ChildWrapperPanel chPanel1 = new ChildWrapperPanel();

//        hPanel1.getImgLabel().setIcon(new ImageIcon(getClass().getResource("/user0.png")));
        hPanel2.getImgLabel().setIcon(new ImageIcon(getClass().getResource("/user1.png")));
        
        /*
        Aqui lo agrego a una matriz que contendra el header y el child.
        */
        JPanel[][] p = new JPanel[][]{
            {hPanel1, chPanel1},
            {hPanel2, new ChildWrapperPanel()}

        };
        
        /*
        Creo el objeto de los paneles desplegables.
        */
        PanelDesp desp = new PanelDesp(p);
        
        deplegablesPanel.add(desp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        deplegablesPanel = new javax.swing.JPanel();

        jLabel2.setBackground(new java.awt.Color(3, 43, 89));
        jLabel2.setFont(new java.awt.Font("Jaldi", 0, 28)); // NOI18N
        jLabel2.setText("Registro de ventas realizadas");

        jLabel1.setBackground(new java.awt.Color(1, 41, 87));
        jLabel1.setFont(new java.awt.Font("Jaldi", 0, 26)); // NOI18N
        jLabel1.setText("Buenas tardes");

        deplegablesPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 520, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(746, 746, 746)
                                .addComponent(jSeparator3))
                            .addComponent(deplegablesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deplegablesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel deplegablesPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}