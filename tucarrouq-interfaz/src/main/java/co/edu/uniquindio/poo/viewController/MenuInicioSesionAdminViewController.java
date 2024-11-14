/**
 * Sample Skeleton for 'menuInicioSesionAdmin.fxml' Controller Class
 */

package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.MenuInicioSesionAdminController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MenuInicioSesionAdminViewController {

    MenuInicioSesionAdminController menuInicioSesionAdminController = new MenuInicioSesionAdminController();

    @FXML // fx:id="Screen_InicioAdmin04"
    private AnchorPane Screen_InicioAdmin04; // Value injected by FXMLLoader

    @FXML // fx:id="btn_RecuperarContraseña"
    private Button btn_RecuperarContraseña; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Regresar"
    private Button btn_Regresar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_inicioSesion"
    private Button btn_IniciarSesion; // Value injected by FXMLLoader

    @FXML // fx:id="txt_Contraseña"
    private TextField txt_Contraseña; // Value injected by FXMLLoader

    @FXML // fx:id="txt_Identifiacion"
    private TextField txt_Identificacion; // Value injected by FXMLLoader

    @FXML // fx:id="txt_NombreUsuario"
    private TextField txt_NombreUsuario; // Value injected by FXMLLoader

    @FXML
    void initialize() {
        btn_RecuperarContraseña.setVisible(false); // El botón se inicializa como invisible
        configurarBotones();

    }

    private void configurarBotones() {
        btn_IniciarSesion.setOnAction(this::iniciarSesion);
        btn_RecuperarContraseña.setOnAction(this::recuperarContraseña);
        btn_Regresar.setOnAction(this::accionRegresarAlInicio);
    }

    private void iniciarSesion(ActionEvent event) {
        String identificacion = txt_Identificacion.getText();
        String contrasena = txt_Contraseña.getText();

        // Verificar si las credenciales del empleado son correctas
        boolean esValido = menuInicioSesionAdminController.verificarAdministrador(identificacion, contrasena);

        if (esValido) {
            // Redirigir a la interfaz de empleado
            App.loadScene("menuAdmin", 630, 450);
        } else {
            // Mostrar el botón de recuperar contraseña si las credenciales son incorrectas
            btn_RecuperarContraseña.setVisible(true);
        }
    }

    private void recuperarContraseña(ActionEvent event) {
        menuInicioSesionAdminController.recuperarContrasena(txt_Identificacion.getText());
    }

    private void accionRegresarAlInicio(ActionEvent event) {
        try {
            App.loadScene("menuInicio", 800, 540);
        } catch (Exception e) {
            // Muestra un mensaje de alerta en caso de error al cargar la escena.
            App.showAlert("Error al Cargar Escena", "Ocurrió un error al regresar al menú de inicio: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

}
