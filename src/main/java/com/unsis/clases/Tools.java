package com.unsis.clases;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author jared
 */
public class Tools { 
     /**
     * Resize image for 
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
}
