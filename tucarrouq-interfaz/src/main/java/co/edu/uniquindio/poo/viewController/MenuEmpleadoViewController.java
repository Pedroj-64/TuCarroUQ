package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AppControllerSingleton;
import javafx.event.ActionEvent;

/**
 * Sample Skeleton for 'menuEmpleado.fxml' Controller Class
 */

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class MenuEmpleadoViewController {

    @FXML // fx:id="btn_AgregarCliente"
    private Button btn_AgregarCliente; // Value injected by FXMLLoader

    @FXML // fx:id="btn_AgregarVehiculo"
    private Button btn_AgregarVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="btn_CerrarSesion"
    private Button btn_CerrarSesion; // Value injected by FXMLLoader

    @FXML // fx:id="btn_RealizarVenta"
    private Button btn_RealizarVenta; // Value injected by FXMLLoader

    @FXML
    void initialize() {
        configurarBotones();
    }

    private void configurarBotones() {
        btn_RealizarVenta.setOnAction(this::accionRealizarVenta);
        btn_AgregarCliente.setOnAction(this::accionAgregarCliente);
        btn_AgregarVehiculo.setOnAction(this::accionAgregarVehiculo);
        btn_CerrarSesion.setOnAction(this::accionCerrarSesion);
    }

    private void accionAgregarCliente(ActionEvent event){
        App.loadScene("editarClientes", 800, 600);
    }

    private void accionRealizarVenta(ActionEvent event){
        App.loadScene("paginaVentas", 800, 600);
    }

    private void accionAgregarVehiculo(ActionEvent event){
        App.loadScene("registroVehicular", 777, 474);
    }



    private void accionCerrarSesion(ActionEvent event) {
        try {
            App.loadScene("menuInicio", 1250, 950);
            AppControllerSingleton.getInstance().cerrarSesion();
        } catch (Exception e) {
            // Muestra un mensaje de alerta en caso de error al cargar la escena.
            App.showAlert("Error al Cargar Escena", "Ocurrió un error al regresar al menú de inicio: " + e.getMessage(),
                    AlertType.ERROR);
        }
    }

}
