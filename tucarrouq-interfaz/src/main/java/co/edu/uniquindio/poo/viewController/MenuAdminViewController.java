package co.edu.uniquindio.poo.viewController;



import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AppControllerSingleton;
import co.edu.uniquindio.poo.controller.MenuAdminController;
import javafx.event.ActionEvent;

/**
 * Sample Skeleton for 'menuAdmin.fxml' Controller Class
 */

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MenuAdminViewController {

    MenuAdminController menuAdminController = new MenuAdminController();

    @FXML // fx:id="Screen_MenuAdmin05"
    private AnchorPane Screen_MenuAdmin05; // Value injected by FXMLLoader

    @FXML // fx:id="btn_PaginaVentas"
    private Button btn_PaginaVentas; // Value injected by FXMLLoader

    @FXML // fx:id="btn_VerAutosDisponibles"
    private Button btn_VerAutosDisponibles; // Value injected by FXMLLoader

    @FXML // fx:id="btn_VerClientes"
    private Button btn_VerClientes; // Value injected by FXMLLoader

    @FXML // fx:id="btn_VerEmpleados"
    private Button btn_VerEmpleados; // Value injected by FXMLLoader

    @FXML // fx:id="btn_generarReporte"
    private Button btn_generarReporte; // Value injected by FXMLLoader

    @FXML // fx:id="btn_CerrarSesion"
    private Button btn_CerrarSesion; // Value injected by FXMLLoader

    @FXML
    void initialize() {
        configurarBotones();
    }

    private void configurarBotones() {
        btn_PaginaVentas.setOnAction(this::accionVerPaginaVentas);
        btn_VerAutosDisponibles.setOnAction(this::accionVerAutosDisponibles);
        btn_VerClientes.setOnAction(this::accionVerClientes);
        btn_VerEmpleados.setOnAction(this::accionVerEmpleados);
        btn_generarReporte.setOnAction(this::accionGenerarReporte);
        btn_CerrarSesion.setOnAction(this::accionCerrarSesion);

    }

    private void accionGenerarReporte(ActionEvent event) {
        App.loadScene("menuReportes", 600, 430);

    }

    private void accionVerAutosDisponibles(ActionEvent event) {
        App.loadScene("editarInvetario", 600, 430);

    }

    private void accionVerEmpleados(ActionEvent event) {
        App.loadScene("editarEmpleados", 600, 430);

    }

    private void accionVerClientes(ActionEvent event) {

        App.loadScene("editarClientes", 600, 430);
    }

    private void accionVerPaginaVentas(ActionEvent event) {
        App.loadScene("paginaVentas", 600, 430);

    }

    private void accionCerrarSesion(ActionEvent event) {
        try {
            App.loadScene("menuInicio", 600, 430);
            AppControllerSingleton.getInstance().cerrarSesion();
        } catch (Exception e) {
            // Muestra un mensaje de alerta en caso de error al cargar la escena.
            App.showAlert("Error al Cargar Escena", "Ocurrió un error al regresar al menú de inicio: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

}
