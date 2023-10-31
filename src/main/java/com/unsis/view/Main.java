/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.unsis.view;

import com.unsis.models.constants.Constants;
import com.unsis.view.panel.AltaEmpleado;
import com.unsis.view.panel.ListEmployes;
import com.unsis.view.panel.MainMenu;
import com.unsis.view.panel.NavBar;
import com.unsis.view.panel.RegisterExpenses;
import com.unsis.view.panel.Venta;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author labtecweb10
 */
public class Main extends javax.swing.JFrame {

    private JPanel defaultPanel;
    private final String MAINMENU = "Main Menu";

    /**
     * Creates new form Home
     *
     */
    public Main() {
        initComponents();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(1237, 1224);
        Constants.fillContants();

        NavBar navigator = new NavBar(this);
        navigator.setBounds(0, 0, 216, 1024);
        navigator.buttonHome.addActionListener((e) -> {
            setView(MAINMENU);
        });
        this.add(navigator);
        this.setCardPanel();
    }

    /**
     * Create a Panel with CardLayout for container all sections Setter it to
     * this Frame
     */
    private void setCardPanel() {
        defaultPanel = new JPanel(new CardLayout());
        defaultPanel.setBounds(217, 0, 1696, 894);

        defaultPanel.add(MAINMENU, new MainMenu());
        defaultPanel.add("Punto de Venta", new Venta());
        defaultPanel.add("Lista Empleados", new ListEmployes());
        defaultPanel.add("Alta de Empleado", new AltaEmpleado());
        defaultPanel.add("Gastos", new RegisterExpenses());
        
        
        this.add(defaultPanel);
    }

    /**
     * Change the panel view
     *
     * @param name key for JPanel to show
     */
    public void setView(String name) {
        CardLayout c1 = (CardLayout) (defaultPanel.getLayout());
        c1.show(defaultPanel, name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
