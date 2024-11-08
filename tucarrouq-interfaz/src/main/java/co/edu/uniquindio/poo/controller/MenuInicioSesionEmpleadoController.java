package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.scene.control.Alert.AlertType;

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
                    "La identificación o contraseña son incorrectas",
                    AlertType.ERROR);
        }

        return banderilla;
    }

    
}
