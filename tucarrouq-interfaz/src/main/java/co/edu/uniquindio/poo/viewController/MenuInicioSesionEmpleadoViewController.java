package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AppControllerSingleton;
import co.edu.uniquindio.poo.controller.MenuInicioSesionEmpleadoController;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MenuInicioSesionEmpleadoViewController {

    @FXML
    private AnchorPane Screen_IncioSesionEmpleado01;

    @FXML
    private Button btn_IniciarSesion;

    @FXML
    private Button btn_RecuperarContraseña;

    @FXML
    private Button btn_Regresar;

    @FXML
    private TextField txt_Contraseña;

    @FXML
    private TextField txt_Identificacion;

    @FXML
    private TextField txt_NombreUsuario;

    private MenuInicioSesionEmpleadoController menuInicioSesionEmpleadoController = new MenuInicioSesionEmpleadoController();

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        btn_RecuperarContraseña.setVisible(false); // El botón se inicializa como invisible
        configurarBotones();
    }

    private void configurarBotones(){
        btn_IniciarSesion.setOnAction(this::iniciarSesion);
        btn_RecuperarContraseña.setOnAction(this::recuperarContraseña);
        btn_Regresar.setOnAction(this::accionRegresarAlInicio);
    }

    private void iniciarSesion(ActionEvent event){
        try {
            String identificacion = txt_Identificacion.getText();
            String contrasena = txt_Contraseña.getText();

            // Verificar si las credenciales del empleado son correctas
            boolean esValido = menuInicioSesionEmpleadoController.verificarEmpleado(identificacion, contrasena);

            if (esValido) {
                // Redirigir a la interfaz de empleado
                Empleado empleado=menuInicioSesionEmpleadoController.buscarEmpleado(identificacion);
                AppControllerSingleton.getInstance().setUsuarioActual(empleado);
                App.loadScene("menuEmpleado", 600, 430);
            } else {
                // Mostrar el botón de recuperar contraseña si las credenciales son incorrectas
                btn_RecuperarContraseña.setVisible(true);
            }
        } catch (Exception e) {
            App.showAlert("Error", "Ocurrió un error al iniciar sesión: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void recuperarContraseña(ActionEvent event){
        try {
            String identificacion = txt_Identificacion.getText();
            if (identificacion.isEmpty()) {
                App.showAlert("Error", "La identificación no puede estar vacía.", Alert.AlertType.ERROR);
                return;
            }
            menuInicioSesionEmpleadoController.recuperarContrasena(identificacion);
        } catch (Exception e) {
            App.showAlert("Error", "Ocurrió un error al recuperar la contraseña: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void accionRegresarAlInicio(ActionEvent event) {
        try {
            App.goBack();
        } catch (Exception e) {
            // Muestra un mensaje de alerta en caso de error al cargar la escena.
            App.showAlert("Error al Cargar Escena", "Ocurrió un error al regresar al menú de inicio: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }
}

