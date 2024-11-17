package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MenuSeleccionUsuarioViewController {
    /**
     * Sample Skeleton for 'menuSeleccionUsuario.fxml' Controller Class
     */

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Screen_SeleccionUsuario02"
    private AnchorPane Screen_SeleccionUsuario02; // Value injected by FXMLLoader

    @FXML // fx:id="btn_InicioSesionAdmin"
    private Button btn_InicioSesionAdmin; // Value injected by FXMLLoader

    @FXML // fx:id="btn_inicioSesionEmpleado"
    private Button btn_inicioSesionEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="img_tuCarroUq"
    private ImageView img_tuCarroUq; // Value injected by FXMLLoader

    @FXML
    private Button btn_Regresar;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        configurarBotones();
        
    }

    public void configurarBotones() {
        btn_InicioSesionAdmin.setOnAction(this::adminBtnRegistrarVehiculo);
        btn_inicioSesionEmpleado.setOnAction(this::adminBtnVerAutosDisponibles);
        btn_Regresar.setOnAction(this::accionRegresar);
    }

    private void adminBtnRegistrarVehiculo(ActionEvent event) {
        cambiarVista("menuInicioSesionAdmin", 630, 450);
    }

    public void adminBtnVerAutosDisponibles(ActionEvent event) {
        cambiarVista("menuInicioSesionEmpleado", 630, 450);
    }

    private void accionRegresar(ActionEvent event){
        App.goBack();
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
            App.showAlert("Error al cargar la interfaz", "No se pudo cargar la interfaz: " + rutaFXML, AlertType.ERROR);
        }
    }

}
