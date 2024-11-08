package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.App;
import javafx.scene.control.Alert.AlertType;

public class MenuInicioSesionAdminController {
    Concesionario concesionario = App.getConcesionario();

    /**
     * Método para verificar si el administrador existe y sus credenciales son
     * correctas.
     * 
     * @param identificacion La identificación del administrador.
     * @param contrasena     La contraseña del administrador.
     * @return true si el administrador es válido, false si no lo es.
     */
    public boolean verificarAdministrador(String identificacion, String contrasena) {
        boolean banderilla=false;

        // Buscar el administrador con la identificación proporcionada
        for (Administrador administrador : concesionario.getAdministradores()) {
            if (administrador.getIdentificacion().equals(identificacion) &&
                    administrador.getContrasena().equals(contrasena)) {
                banderilla= true; // Credenciales correctas
                break;
            }
        }

        if (!banderilla) {
            App.showAlert("Error de inicio de sesión",
                    "La identificación o contraseña son incorrectas",
                    AlertType.ERROR);
        }

        return banderilla;
    }
}
