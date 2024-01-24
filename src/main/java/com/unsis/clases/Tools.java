package com.unsis.clases;

import java.awt.Image;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author jared
 */
public class Tools {

    /**
     * Ruta general de los recursos del programa
     */
    public final static String ROOTPATH = "src/main/resources/";

    /**
     * Resize image for
     *
     * @param icon image for resize
     * @param width Width for image
     * @param height height for image
     * @return
     */
    public Icon resizeIcon(Icon icon, int width, int height) {
        if (icon instanceof ImageIcon) {
            ImageIcon imageIcon = (ImageIcon) icon;
            Image image = imageIcon.getImage();

            // Redimensionar la imagen al tamaño deseado
            Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

            // Crear un nuevo ImageIcon con la imagen redimensionada
            return new ImageIcon(resizedImage);
        }

        return icon; // Devolver el icono original si no es un ImageIcon
    }

    /**
     * Copy a file in path origin to destino path
     * @param originPath path of the file for copy
     * @param destinationPath path of destination for the file
     * @return boolean. True if don't exist an error, or false an otherwise
     * 
     * In the paths add name of the file with extension
     */
    public static boolean copyFile(String originPath, String destinationPath) {
        try {
            // Copiar el archivo con reemplazo si ya existe
            Path origen = Path.of(originPath);
            Path destino = Path.of(destinationPath);

            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static String cryptPassword(String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(12));
        return hashedPassword;
    }
    
    public static String getFormatExcelFileName(String name) {
            // Obtener la fecha y hora actual
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String timestamp = dateFormat.format(new Date());

            // Nombrar el archivo con "Empleados + fecha y hora actual"
            String fileName = name + "_" + timestamp + ".xlsx";
            
            return fileName;
    }
    
     public static void enviarCorreo(String destinatario, String asunto, String mensaje) {
        // Configuración de las propiedades del servidor SMTP
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "tu_servidor_smtp");
        properties.put("mail.smtp.port", "tu_puerto_smtp");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Autenticación del usuario
        javax.mail.Session session = javax.mail.Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("tu_correo@gmail.com", "tu_contraseña");
            }
        });

        try {
            // Crear mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tu_correo@gmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            message.setSubject(asunto);
            message.setText(mensaje);

            // Enviar mensaje
            Transport.send(message);

            System.out.println("Correo enviado con éxito!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
