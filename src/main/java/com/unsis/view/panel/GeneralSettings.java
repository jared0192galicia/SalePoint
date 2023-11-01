/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.cafe;

import com.unsis.clases.Tools;
import javax.swing.Icon;

/**
 *
 * @author america
 */
public class GeneralSettings extends javax.swing.JPanel {

    /**
     * Creates new form PanelAjustes
     */
    public GeneralSettings() {
        initComponents();
        
        this.resizeImages();
    }
    
    /**
     * Redimenciona las imagenes de los botones para que se ajusten a el tamaño
     * necesario
     */
    private void resizeImages() {
        Tools tools = new Tools();
        Icon resizedIcon = tools.resizeIcon(buttonSave.getIcon(), 45, 45);
        buttonSave.setIcon(resizedIcon);
        
        resizedIcon = tools.resizeIcon(buttonImport.getIcon(), 45, 45);
        buttonImport.setIcon(resizedIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelfilter = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        labelfilter1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        labelfilter2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        labelfilter3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        labelfilter4 = new javax.swing.JLabel();
        labelfilter5 = new javax.swing.JLabel();
        labelfilter6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        buttonImport = new javax.swing.JButton();
        Labeajustes = new javax.swing.JLabel();
        Labeajustes2 = new javax.swing.JLabel();
        Labeajustes1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelfilter.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        labelfilter.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter.setText("Editar logotipo");
        jPanel1.add(labelfilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 190, 39));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Empresa");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 370, 50));

        labelfilter1.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        labelfilter1.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter1.setText("Contacto");
        jPanel1.add(labelfilter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 510, 140, 39));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconCafe.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 370, 370));

        buttonSave.setBackground(new java.awt.Color(0, 102, 0));
        buttonSave.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(255, 255, 255));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        buttonSave.setText("Guardar");
        jPanel1.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 630, 260, 50));

        labelfilter2.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        labelfilter2.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter2.setText("Editar Nombre de la empresa");
        jPanel1.add(labelfilter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 350, 39));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setText("16%");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 250, 35));

        labelfilter3.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        labelfilter3.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter3.setText("% de IVA");
        jPanel1.add(labelfilter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 140, 130, 39));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setText("2");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 290, 250, 35));

        labelfilter4.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        labelfilter4.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter4.setText("Decimales");
        jPanel1.add(labelfilter4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 240, 130, 39));

        labelfilter5.setFont(new java.awt.Font("Jaldi", 0, 26)); // NOI18N
        labelfilter5.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter5.setText("Contactos de empresa");
        jPanel1.add(labelfilter5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 350, 290, 39));

        labelfilter6.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        labelfilter6.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter6.setText("Correo");
        jPanel1.add(labelfilter6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 410, 140, 39));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 450, 250, 35));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 550, 250, 35));

        buttonImport.setBackground(new java.awt.Color(0, 102, 0));
        buttonImport.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        buttonImport.setForeground(new java.awt.Color(255, 255, 255));
        buttonImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uploadIcon.png"))); // NOI18N
        buttonImport.setText("Importar");
        jPanel1.add(buttonImport, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, 260, 50));

        Labeajustes.setFont(new java.awt.Font("Jaldi", 0, 36)); // NOI18N
        Labeajustes.setForeground(new java.awt.Color(7, 82, 129));
        Labeajustes.setText("Ajustes de marca");
        jPanel1.add(Labeajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 390, -1));

        Labeajustes2.setFont(new java.awt.Font("Jaldi", 0, 36)); // NOI18N
        Labeajustes2.setForeground(new java.awt.Color(7, 82, 129));
        Labeajustes2.setText("Ajuste de valores");
        jPanel1.add(Labeajustes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1620, 860));

        Labeajustes1.setFont(new java.awt.Font("Jaldi", 0, 48)); // NOI18N
        Labeajustes1.setForeground(new java.awt.Color(7, 56, 112));
        Labeajustes1.setText("Ajustes");
        add(Labeajustes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labeajustes;
    private javax.swing.JLabel Labeajustes1;
    private javax.swing.JLabel Labeajustes2;
    private javax.swing.JButton buttonImport;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel labelfilter;
    private javax.swing.JLabel labelfilter1;
    private javax.swing.JLabel labelfilter2;
    private javax.swing.JLabel labelfilter3;
    private javax.swing.JLabel labelfilter4;
    private javax.swing.JLabel labelfilter5;
    private javax.swing.JLabel labelfilter6;
    // End of variables declaration//GEN-END:variables
}
