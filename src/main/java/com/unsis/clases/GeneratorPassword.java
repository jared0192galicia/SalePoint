package com.unsis.clases;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author jared
 */
public class GeneratorPassword {
    public static void main(String[] args) {
        // Contraseña normal
        String userProvidedPassword = "5678"; // Ingresa la contraseña que quieres usar

        // Generar un hash de la contraseña
        String hashedPassword = BCrypt.hashpw(userProvidedPassword, BCrypt.gensalt(12));

        // Imprimir el hash de la contraseña (esto es lo que almacenarías en tu base de datos)
        System.out.println("Contraseña hasheada: " + hashedPassword);
    }
}
