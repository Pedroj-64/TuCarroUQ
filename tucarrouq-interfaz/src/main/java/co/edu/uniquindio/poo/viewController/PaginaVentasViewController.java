package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AppControllerSingleton;
import co.edu.uniquindio.poo.controller.PaginaVentasController;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;

public class PaginaVentasViewController {

    PaginaVentasController paginaVentasController = new PaginaVentasController();

    @FXML // fx:id="Screen_AutosDisponiblesParaVentas07"
    private AnchorPane Screen_AutosDisponiblesParaVentas07; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Regresar"
    private Button btn_Regresar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_VenderAlquilar"
    private Button btn_VenderAlquilar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_agregarClientes"
    private Button btn_agregarClientes; // Value injected by FXMLLoader

    @FXML // fx:id="lbl_tituloRegistroDeReservas"
    private Label lbl_tituloRegistroDeReservas; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_CostoDia"
    private TableColumn<Vehiculo, Double> tbc_CostoDia; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_CostoTotal"
    private TableColumn<Vehiculo, Double> tbc_CostoTotal; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_Marca"
    private TableColumn<Vehiculo, String> tbc_Marca; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_Placa"
    private TableColumn<Vehiculo, String> tbc_Placa; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_tipoDeVehiculo"
    private TableColumn<Vehiculo, String> tbc_tipoDeVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="tbl_VerAutosDisponibles"
    private TableView<Vehiculo> tbl_VerAutosDisponibles; // Value injected by FXMLLoader

    private ObservableList<Vehiculo> listaVehiculos = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        try {
            configurarColumnas();
            cargarVehiculos();
            configurarAccionesBotones();
            configurarListeners();
        } catch (Exception e) {
            App.showAlert("Error de Inicialización", "Ocurrió un error al inicializar la vista: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    private void configurarColumnas() {
        try {
            tbc_Marca.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getMarca()));
            tbc_Placa.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getPlaca()));
            tbc_CostoDia.setCellValueFactory(
                    cellData -> new SimpleObjectProperty<>(cellData.getValue().getPrecioAlquilerPorDia()));
            tbc_CostoTotal
                    .setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getPrecioVenta()));
            tbc_tipoDeVehiculo.setCellValueFactory(
                    cellData -> new SimpleObjectProperty<>(cellData.getValue().getClass().getSimpleName()));
        } catch (Exception e) {
            App.showAlert("Error de Configuración", "Error al configurar las columnas de la tabla: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    private void cargarVehiculos() {
        try {
            listaVehiculos.setAll(paginaVentasController.obtenerVehiculos());
            tbl_VerAutosDisponibles.setItems(listaVehiculos);
        } catch (Exception e) {
            App.showAlert("Error de Carga", "No se pudieron cargar los vehículos: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    private void configurarAccionesBotones() {
        try {
            btn_VenderAlquilar.setOnAction(this::venderOAlquilarVehiculo);
            btn_agregarClientes.setOnAction(this::agregarCliente);
            btn_Regresar.setOnAction(this::accionRegresar);
        } catch (Exception e) {
            App.showAlert("Error de Configuración",
                    "Error al configurar las acciones de los botones: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void venderOAlquilarVehiculo(ActionEvent event) {
        Vehiculo vehiculoSeleccionado = tbl_VerAutosDisponibles.getSelectionModel().getSelectedItem();
        if (vehiculoSeleccionado != null) {
            // Guardar el vehículo seleccionado en el singleton
            AppControllerSingleton.getInstance().setVehiculoSeleccionado(vehiculoSeleccionado);

            // Cambiar de interfaz
            App.loadScene("completarVentas", 800, 600);
        } else {
            App.showAlert("Seleccionar Vehículo", "Por favor, seleccione un vehículo", Alert.AlertType.INFORMATION);
        }
    }

    private void configurarListeners() {
        tbl_VerAutosDisponibles.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    btn_VenderAlquilar.setDisable(newValue == null); // Deshabilitar el botón si no hay selección
                    // Opcional: Aquí puedes hacer algo con la nueva selección, como llenar campos
                    // de texto
                });
    }

    private void agregarCliente(ActionEvent event) {

        App.loadScene("editarClientes", 800, 600);
    }

    private void accionRegresar(ActionEvent event) {
        App.goBack();
    }
}
