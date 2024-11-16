package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.scene.control.Alert.AlertType;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.SecureRandom;
import java.util.Properties;

public class MenuInicioSesionEmpleadoController {
    Concesionario concesionario = App.getConcesionario();

    /**
     * Método para verificar si el empleado existe y sus credenciales son correctas.
     * 
     * @param identificacion La identificación del empleado.
     * @param contrasena     La contraseña del empleado.
     * @return true si el empleado es válido, false si no lo es.
     */
    public boolean verificarEmpleado(String identificacion, String contrasena) {
        boolean banderilla = false;

        // Buscar el empleado con la identificación proporcionada
        for (Empleado empleado : concesionario.getEmpleados()) {
            if (empleado.getIdentificacion().equals(identificacion) &&
                    empleado.getContrasena().equals(contrasena)) {
                banderilla = true; // Credenciales correctas
                break; // Salir del bucle una vez encontrado
            }
        }

        // Si no se encuentra el empleado o las credenciales son incorrectas
        if (!banderilla) {
            App.showAlert("Error de inicio de sesión",
                    "La identificación o contraseña son incorrectas \n Por favor, inténtelo de nuevo.",
                    AlertType.ERROR);
        }

        return banderilla;
    }

    public Empleado buscarEmpleado(String identificacion){
        Empleado empleadoBuscado=null;
        empleadoBuscado=concesionario.buscarEmpleado(identificacion);
        return empleadoBuscado;
    }

    /**
     * Método para generar una nueva contraseña y enviarla por correo electrónico.
     * 
     * @param emailUsuario El correo electrónico del usuario.
     */
    public void recuperarContrasena(String identificacion) {
        String nuevaContrasena = generarContrasenaAleatoria();
        String emailBuscado = null;
        Empleado empleado = concesionario.buscarEmpleado(identificacion);
        emailBuscado = empleado.getEmailDeRecuperacion();
        empleado.setContrasena(nuevaContrasena);

        // Configurar las propiedades de JavaMail
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");

        // Autenticación
        String miCorreo = "tu-email@gmail.com";
        String miContrasena = "tu-contrasena";

        Session session = Session.getInstance(propiedades, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(miCorreo, miContrasena);
            }
        });

        try {
            // Crear el mensaje
            Message mensaje = new MimeMessage(session);
            mensaje.setFrom(new InternetAddress(miCorreo));
            mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailBuscado));
            mensaje.setSubject("Recuperación de Contraseña Tu Carro UQ");
            mensaje.setText("Hola, \n\nTu nueva contraseña es: " + nuevaContrasena + "\n\nSaludos,\nTu Carro UQ");

            // Enviar el mensaje
            Transport.send(mensaje);
            App.showAlert("Correo Enviado", "La nueva contraseña ha sido enviada a tu correo.", AlertType.INFORMATION);
        } catch (MessagingException e) {
            App.showAlert("Error", "No se pudo enviar el correo: " + e.getMessage(), AlertType.ERROR);
        }
    }

    /**
     * Método para generar una contraseña aleatoria.
     * 
     * @return La nueva contraseña aleatoria.
     */
    private String generarContrasenaAleatoria() {
        final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder contrasena = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            contrasena.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        
        return contrasena.toString();
    }
}
