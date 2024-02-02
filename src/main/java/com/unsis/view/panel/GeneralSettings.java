package com.unsis.view.panel;

import com.unsis.clases.Tools;
import javax.swing.Icon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneralSettings extends javax.swing.JPanel {

    /**
     * Creates new form PanelAjustes
     */
    public GeneralSettings() {
        initComponents();
        this.resizeImages();
        addListeners();
        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent evt) {
                // Este método se llama cuando se muestra el panel
                readDataFromFile(); // Llama a un método para leer datos desde el archivo y actualizar la interfaz de usuario
            }
        });
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

    private void addListeners() {
        // validacion del campo iva
        jTextFieldVAT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateVAT();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateVAT();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateVAT();
            }
        });

        //  Validación del campo Decimales
        jTextFieldDecimals.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateDecimals();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateDecimals();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateDecimals();
            }
        });

        // Validación del campo Correo
        jTextFieldEmail.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateEmail();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateEmail();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateEmail();
            }
        });

        // Validación del campo Contacto
        jTextFieldContact.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateContact();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateContact();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateContact();
            }
        });
        buttonSave.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Llama al método separado para manejar la acción de buttonSave
        buttonSaveActionPerformed(e);
    }
});
       
    }

    private void validateVAT() {
        String textVAT = jTextFieldVAT.getText();
        if (!textVAT.matches("\\d*")) {
            // Si el texto contiene caracteres no numéricos, elimínalo
            textVAT = textVAT.replaceAll("\\D", "");
            jTextFieldVAT.setText(textVAT);
        }
        // Agregar automáticamente el símbolo %
        jTextFieldVAT.setText(textVAT + "%");
    }

    private void validateDecimals() {
        String textDecimals = jTextFieldDecimals.getText();
        if (!textDecimals.matches("\\d*")) {
            textDecimals = textDecimals.replaceAll("\\D", "");
            jTextFieldDecimals.setText(textDecimals);
        }
    }

    private void validateEmail() {
        // Implementar la validación del correo electrónico usando una expresión regular
        String textEmail = jTextFieldEmail.getText();
        if (!textEmail.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            jTextFieldEmail.setText("");
        }
    }

    private void validateContact() {
        String textContact = jTextFieldContact.getText();
        if (!textContact.matches("\\d{10,}")) {
            textContact = textContact.replaceAll("\\D", "");
            jTextFieldContact.setText(textContact);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelfilter = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        labelfilter1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelfilter2 = new javax.swing.JLabel();
        jTextFieldVAT = new javax.swing.JTextField();
        labelfilter3 = new javax.swing.JLabel();
        jTextFieldDecimals = new javax.swing.JTextField();
        labelfilter4 = new javax.swing.JLabel();
        labelfilter5 = new javax.swing.JLabel();
        labelfilter6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        buttonImport = new javax.swing.JButton();
        Labeajustes = new javax.swing.JLabel();
        Labeajustes2 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        jTextFieldContact = new javax.swing.JTextField();
        labelfilter7 = new javax.swing.JLabel();
        jTextFieldroute = new javax.swing.JTextField();
        Labeajustes1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelfilter.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelfilter.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter.setText("Editar logotipo");
        jPanel1.add(labelfilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 190, 39));

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Empresa");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 370, 50));

        labelfilter1.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelfilter1.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter1.setText("ruta");
        jPanel1.add(labelfilter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 540, 140, 39));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconCafe.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 350, 280));

        labelfilter2.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelfilter2.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter2.setText("Editar Nombre de la empresa");
        jPanel1.add(labelfilter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 350, 39));

        jTextFieldVAT.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextFieldVAT.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldVAT.setText("16%");
        jPanel1.add(jTextFieldVAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 140, 250, 35));

        labelfilter3.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelfilter3.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter3.setText("% de IVA");
        jPanel1.add(labelfilter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 130, 39));

        jTextFieldDecimals.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextFieldDecimals.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldDecimals.setText("2");
        jPanel1.add(jTextFieldDecimals, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 240, 250, 35));

        labelfilter4.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelfilter4.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter4.setText("Decimales");
        jPanel1.add(labelfilter4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 190, 130, 39));

        labelfilter5.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        labelfilter5.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter5.setText("Contactos de empresa");
        jPanel1.add(labelfilter5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 300, 310, 39));

        labelfilter6.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelfilter6.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter6.setText("Correo");
        jPanel1.add(labelfilter6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 360, 140, 39));

        jTextFieldEmail.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 400, 250, 35));

        buttonImport.setBackground(new java.awt.Color(0, 102, 0));
        buttonImport.setFont(new java.awt.Font("Jaldi", 0, 24)); // NOI18N
        buttonImport.setForeground(new java.awt.Color(255, 255, 255));
        buttonImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uploadIcon.png"))); // NOI18N
        buttonImport.setText("Importar");
        jPanel1.add(buttonImport, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 260, 50));

        Labeajustes.setFont(new java.awt.Font("Jaldi", 0, 36)); // NOI18N
        Labeajustes.setForeground(new java.awt.Color(7, 82, 129));
        Labeajustes.setText("Ajustes de marca");
        jPanel1.add(Labeajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 390, -1));

        Labeajustes2.setFont(new java.awt.Font("Jaldi", 0, 36)); // NOI18N
        Labeajustes2.setForeground(new java.awt.Color(7, 82, 129));
        Labeajustes2.setText("Ajuste de valores");
        jPanel1.add(Labeajustes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));

        buttonSave.setBackground(new java.awt.Color(0, 102, 0));
        buttonSave.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(255, 255, 255));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        buttonSave.setText("Guardar");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 630, 260, 50));

        jTextFieldContact.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextFieldContact.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextFieldContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 500, 250, 35));

        labelfilter7.setFont(new java.awt.Font("Jaldi", 0, 20)); // NOI18N
        labelfilter7.setForeground(new java.awt.Color(82, 146, 222));
        labelfilter7.setText("Contacto");
        jPanel1.add(labelfilter7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 460, 140, 39));
        jPanel1.add(jTextFieldroute, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 580, 250, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 1540, 690));

        Labeajustes1.setFont(new java.awt.Font("Jaldi", 0, 40)); // NOI18N
        Labeajustes1.setForeground(new java.awt.Color(7, 56, 112));
        Labeajustes1.setText("Ajustes");
        add(Labeajustes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

  
    
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        String vat = jTextFieldVAT.getText();
        String decimals = jTextFieldDecimals.getText();
        String email = jTextFieldEmail.getText();
        String contact = jTextFieldContact.getText();
       String ruta = jTextFieldroute.getText(); // Obtener ruta desde JTextField


        String filePath = "src/main/resources/files/config.txt";

        try {
            File file = new File(filePath);

            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("VAT=" + vat);
                writer.newLine();
                writer.write("Decimals=" + decimals);
                writer.newLine();
                writer.write("Email=" + email);
                writer.newLine();
                writer.write("Contact=" + contact);
                writer.newLine();
            writer.write("Ruta=" + ruta); // Guardar la ruta

                System.out.println("Data saved successfully in the file.");
            } catch (IOException e) {
                System.err.println("Error saving data to the file: " + e.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }//GEN-LAST:event_buttonSaveActionPerformed
 
    public void componentShown(java.awt.event.ComponentEvent evt) {
        // Este método se llama cuando se muestra el panel
        readDataFromFile(); // Llama a un método para leer datos desde el archivo y actualizar la interfaz de usuario
    }

    private void readDataFromFile() {
        String filePath = "src/main/resources/files/config.txt";

        try {
            java.nio.file.Path path = java.nio.file.Paths.get(filePath);
            java.util.List<String> lines = java.nio.file.Files.readAllLines(path, java.nio.charset.StandardCharsets.UTF_8);

            for (String line : lines) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    String key = parts[0];
                    String value = parts[1];

                    switch (key) {
                        case "VAT":
                            jTextFieldVAT.setText(value);
                            break;
                        case "Decimals":
                            jTextFieldDecimals.setText(value);
                            break;
                        case "Email":
                            jTextFieldEmail.setText(value);
                            break;
                        case "Contact":
                            jTextFieldContact.setText(value);
                            break;
                        // Agrega más casos si es necesario para otras configuraciones
                    }
                }
            }
        } catch (java.io.IOException e) {
            System.err.println("Error al leer datos desde el archivo: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labeajustes;
    private javax.swing.JLabel Labeajustes1;
    private javax.swing.JLabel Labeajustes2;
    private javax.swing.JButton buttonImport;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldContact;
    private javax.swing.JTextField jTextFieldDecimals;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldVAT;
    private javax.swing.JTextField jTextFieldroute;
    private javax.swing.JLabel labelfilter;
    private javax.swing.JLabel labelfilter1;
    private javax.swing.JLabel labelfilter2;
    private javax.swing.JLabel labelfilter3;
    private javax.swing.JLabel labelfilter4;
    private javax.swing.JLabel labelfilter5;
    private javax.swing.JLabel labelfilter6;
    private javax.swing.JLabel labelfilter7;
    // End of variables declaration//GEN-END:variables
}
