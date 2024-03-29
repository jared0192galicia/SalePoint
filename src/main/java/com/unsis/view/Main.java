package com.unsis.view;

import com.unsis.clases.KeyController;
import com.unsis.clases.Stack;
import com.unsis.view.panel.GeneralSettings;
import com.unsis.dao.Conexion;
import com.unsis.models.constants.Constants;
import com.unsis.view.panel.RegisterEmployed;
import com.unsis.view.panel.ClosingSales;
import com.unsis.view.panel.ListEmployes;
import com.unsis.view.panel.ListProducts;
import com.unsis.view.panel.MainMenu;
import com.unsis.view.panel.NavBar;
import com.unsis.view.panel.RegisterExpenses;
import com.unsis.view.panel.RegisterProduct;
import com.unsis.view.panel.ToolBar;
import com.unsis.view.panel.SalePoint;
import com.unsis.view.panel.UpdateEmployee;
import com.unsis.view.panel.UpdateProduct;
import com.unsis.view.panel.ventasDesp;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jared
 */
public class Main extends javax.swing.JFrame {

    private JPanel defaultPanel;
    private final String MAINMENU = "Main Menu";
    public Stack<String> stack;
    
    private KeyController keyController;

    /**
     * Creates new form Home
     */
    public Main() {
        initComponents();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(1900, 1224);
        Constants.fillContants();

        NavBar navigator = new NavBar(this);
        navigator.addKeyListener(keyController);
        
        ToolBar toolBar = new ToolBar(this);
        toolBar.addKeyListener(keyController);
        
        navigator.setBounds(0, 0, 216, 1024);
        navigator.buttonHome.addActionListener((e) -> {
            setView(MAINMENU);
        });
        this.add(navigator);
        this.add(toolBar);
        this.setCardPanel();

        keyController = new KeyController(this);
        
        this.addKeyListener(keyController);

        // Agrega un WindowListener al JFrame para capturar el evento de cierre
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    // Coloca aquí el código que deseas ejecutar cuando se cierra la ventana
                    Conexion.closeConecction();
                    stack.print();
                    stack.pop();
                    stack.print();
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar la conexion\n" + ex.getMessage());
                }
            }
        });

        this.createStackAccess();
        this.setFocusable(true);
        this.requestFocusInWindow();

    }

    /**
     * Crea una pila para guardar el historial de navegación
     */
    private void createStackAccess() {
        stack = new Stack<>(MAINMENU);
        stack.add(MAINMENU);
    }

    public void showPreviusPanel() {
        stack.pop();
        this.setView(stack.pop());
    }

    /**
     * Agrega un elemento en la pila. Metodo para use desde clases externas
     *
     * @param name Nombre la clase a agregar
     */
    public void addPanelHistory(String name) {
        stack.add(name);
    }

    /**
     * Create a Panel with CardLayout for container all sections Setter it to
     * this Frame
     */
    private void setCardPanel() {
        defaultPanel = new JPanel(new CardLayout());
        defaultPanel.setBounds(217, 85, 1696, 894);

        defaultPanel.add(MAINMENU, new MainMenu(this));
        defaultPanel.add("Punto de Venta", new SalePoint());
        defaultPanel.add("Lista Empleados", new ListEmployes(this));
        defaultPanel.add("Alta de Empleado", new RegisterEmployed());
        defaultPanel.add("Gastos", new RegisterExpenses());
        defaultPanel.add("Alta de Producto", new RegisterProduct());
        defaultPanel.add("Ordenes entrantes", new ventasDesp());
        defaultPanel.add("Lista Productos", new ListProducts(this));
        defaultPanel.add("Corte de caja", new ClosingSales());
        defaultPanel.add("Gastos", new RegisterExpenses());
        defaultPanel.add("Ajustes del generales", new GeneralSettings());
        defaultPanel.add("Editar Emplado", new UpdateEmployee());
        defaultPanel.add("Editar Producto", new UpdateProduct());

        defaultPanel.addKeyListener(keyController);
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
        this.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
