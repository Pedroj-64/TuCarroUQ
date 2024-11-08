package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.MenuInicioSesionEmpleadoController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MenuInicioSesionEmpleadoViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Screen_InicioAdmin04"
    private AnchorPane Screen_InicioAdmin04; // Value injected by FXMLLoader

    @FXML // fx:id="btn_inicioSesion"
    private Button btn_inicioSesion; // Value injected by FXMLLoader

    @FXML // fx:id="txt_Contraseña"
    private TextField txt_Contraseña; // Value injected by FXMLLoader

    @FXML // fx:id="txt_Identifiacion"
    private TextField txt_Identifiacion; // Value injected by FXMLLoader

    @FXML // fx:id="txt_NombreUsuario"
    private TextField txt_NombreUsuario; // Value injected by FXMLLoader

    @FXML
    private Button btn_RecuperarContraseña;

    private MenuInicioSesionEmpleadoController menuInicioSesionEmpleadoController = new MenuInicioSesionEmpleadoController();

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        configurarBotones();
    }

    public void configurarBotones(){
        btn_inicioSesion.setOnAction(this::iniciarSesion);
        btn_RecuperarContraseña.setOnAction(this::recuperarContraseña);
    }

    public void iniciarSesion(ActionEvent event){
        String identificacion = txt_Identifiacion.getText();
        String contrasena = txt_Contraseña.getText();

        // Verificar si las credenciales del empleado son correctas
        boolean esValido = menuInicioSesionEmpleadoController.verificarEmpleado(identificacion, contrasena);

        if (esValido) {
            // Redirigir a la interfaz de empleado
            cambiarVista("menuEmpleado", 630, 450);
        }
    }

    public void recuperarContraseña(ActionEvent event){
        
    }

    /**
     * Método que utiliza el método estático e inherente a la clase App para cargar
     * la escena.
     *
     * @param rutaFXML Nombre del archivo FXML
     * @param ancho    Ancho de la ventana
     * @param alto     Alto de la ventana
     */
    private void cambiarVista(String rutaFXML, double ancho, double alto) {
        try {
            App.loadScene(rutaFXML, ancho, alto); // Carga la nueva escena
        } catch (Exception e) {
            App.showAlert("Error al cargar la interfaz", "No se pudo cargar la interfaz: " + rutaFXML, javafx.scene.control.Alert.AlertType.ERROR);
        }
    }
}

