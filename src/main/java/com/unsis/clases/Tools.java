package com.unsis.clases;

import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import io.github.cdimascio.dotenv.Dotenv;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.mindrot.jbcrypt.BCrypt;
import javax.mail.Session;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

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
     *
     */
    public static String codeSecurityPass = "";

    public static boolean matchCode(String codeInp) {
        return codeSecurityPass.equalsIgnoreCase(codeInp);
    }

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
     *
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

    public static String generateCode() {
        String code = "";

        int aux;
        for (int i = 0; i < 8; i++) {
            aux = (int) (Math.random() * 9);
            code += aux;

            if (i == 3) {
                code += " ";
            }
        }
        codeSecurityPass = code;
        return code;
    }

    public static void updateCode() {
        codeSecurityPass = generateCode();
    }

    public static int enviarCorreo(String destinatario, String asunto, String mensaje) {

        Dotenv env = Dotenv.load();
        String user = env.get("MAIL_HOST");
        String pass = env.get("MAIL_PASSWORD");

        if (user == null || pass == null) {
            return 304;
        }

        // Configuración de las propiedades del servidor SMTP
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.user", user);
        properties.put("mail.smtp.password", pass);    //La clave de la cuenta
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Autenticación del usuario
        Session session = Session.getInstance(properties);

        try {
            // Crear mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            message.setSubject(asunto);
            message.setContent(mensaje, "text/html");
            try (Transport transport = session.getTransport("smtp")) {
                transport.connect("smtp.gmail.com", user, pass);
                transport.sendMessage(message, message.getAllRecipients());
            }

            // Enviar mensaje
//            Transport.send(message);
            System.out.println("Correo enviado con éxito!");

        } catch (MessagingException e) {
            e.printStackTrace();
            return 305;
        }

        return 200;
    }

    public static String createMessageResetPassword(String user, String code) {
        String message
                = """
                  <html lang="es">
                      <main style="margin: 0; padding: 0;">
                          <div style="max-width: 650px; font-family: Arial, Helvetica, sans-serif;">
                              <h1 style="padding-right: 30px; background-color: rgb(12, 116, 201); color: white; text-align: center; padding: 40px 0;">C\u00f3digo de recuperaci\u00f3n de SalePoint</h1>
                              <p>Hola """ + user + ":</p>\n"
                + "            <p>Hemos recibido una solicitud para recuperar el acceso a tu cuenta de SalePoint,\n"
                + "            por medio de tu cuenta de correo electronico, tu código de recuperación es:</p>\n"
                + "            <p style=\"text-align: center; font-size: larger; font-weight: 700; \">" + code + "</p>\n"
                + "            <p>Si tu no solicitaste este código puedes ignorar este mensaje. Por favor no compartas este <br>\n"
                + "                código ni reenvíes este mensaje</p>\n"
                + "            <p>Atentamente Sistema de ventas SalePoint</p>\n"
                + "        </div>\n"
                + "    </main>\n"
                + "</html>";

        return message;
    }

    public static void generateTicket() {
        PrinterMatrix printer = new PrinterMatrix();

        String factura = "1";
        String vendedor = "Juan";
        String comprador = "Pepe";

        Extenso e = new Extenso();

        e.setNumber(101.85);

        printer.setOutSize(10, 32);

        printer.printCharAtCol(1, 1, 32, "=");

        printer.printTextWrap(1, 2, 8, 32, "TICKET DE VENTAS");
        printer.printTextWrap(2, 3, 1, 32, "Num. Venta" + factura);
        printer.printTextWrap(3, 3, 1, 32, "Fecha de emision: " );
        printer.printTextWrap(4, 3, 1, 32, "Hora: " );
        printer.printTextWrap(5, 3, 1, 32, "Vendedor: " + vendedor);
        printer.printTextWrap(6, 3, 1, 32, "Comprador: " + comprador);
        printer.printCharAtCol(7, 1, 32, "=");
        printer.printTextWrap(8, 2, 8, 32, "Producto");
        printer.printCharAtCol(9, 1, 32, "=");

        printer.toFile("ticket.pdf");
        FileInputStream inputStram = null;
        try {
            inputStram = new FileInputStream("ticket.pdf");
        } catch (FileNotFoundException ex) {
            System.err.println("Error al abrir ticket\n" + ex.getMessage());
            return;
        }

        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStram, docFormat, null);

        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

        if (defaultPrintService != null) {
            DocPrintJob printJob = defaultPrintService.createPrintJob();

            try {
                printJob.print(document, attributeSet);
            } catch (PrintException ex) {
                System.err.println("Error al imprimir ticket");
            }
        } else {
            System.out.println("Sin impresora instalada");
        }
    }

    // Método para obtener la fechaactual en el formato dd/mm/aa
    private static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(new Date());
    }

    // Método para obtener la hora actual en el formato HH:mm:ss
    private static String getCurrentTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        return timeFormat.format(new Date());
    }
}
