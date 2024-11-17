package co.edu.uniquindio.poo.viewController;

/**
 * Sample Skeleton for 'menuInicio.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MenuInicioViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Screen_Inicio01"
    private AnchorPane Screen_Inicio01; // Value injected by FXMLLoader

    @FXML // fx:id="btn_IniciarSesion"
    private Button btn_IniciarSesion; // Value injected by FXMLLoader

    @FXML // fx:id="btn_verAutosDiponibles"
    private Button btn_verAutosDiponibles; // Value injected by FXMLLoader

    @FXML // fx:id="img_tuCarroUq"
    private ImageView img_tuCarroUq; // Value injected by FXMLLoader

    @FXML // fx:id="lbl_bienvenido"
    private Label lbl_bienvenido; // Value injected by FXMLLoader

    @FXML // fx:id="lbl_preguntaInicio"
    private Label lbl_preguntaInicio; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        configurarBotones();

    }

    public void configurarBotones() {
        btn_IniciarSesion.setOnAction(this::adminBtnRegistrarVehiculo);
        btn_verAutosDiponibles.setOnAction(this::adminBtnVerAutosDisponibles);
    }

    private void adminBtnRegistrarVehiculo(ActionEvent event) {
        cambiarVista("menuSeleccionUsuario", 800, 600);
    }

    public void adminBtnVerAutosDisponibles(ActionEvent event){
        cambiarVista("verAutosDisponibles", 907, 577);
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
