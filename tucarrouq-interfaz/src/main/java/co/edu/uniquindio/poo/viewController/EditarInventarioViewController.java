package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.EditarInventarioController;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;

public class EditarInventarioViewController {

    EditarInventarioController editarInventarioController = new EditarInventarioController();

    @FXML // fx:id="Screen_EditarInventario06"
    private AnchorPane Screen_EditarInventario06; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Regresar"
    private Button btn_Regresar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_eliminar"
    private Button btn_eliminar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_guardar"
    private Button btn_guardar; // Value injected by FXMLLoader

    @FXML
    private Button btn_CrearVehiculo;

    @FXML // fx:id="lbl_marca"
    private Label lbl_marca; // Value injected by FXMLLoader

    @FXML // fx:id="lbl_marca1"
    private Label lbl_marca1; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_marca"
    private TableColumn<Vehiculo, String> tbc_marca; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_modelo"
    private TableColumn<Vehiculo, Integer> tbc_modelo; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_PrecioAlquiler"
    private TableColumn<Vehiculo, Double> tbc_PrecioAlquiler; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_PrecioVenta"
    private TableColumn<Vehiculo, Double> tbc_PrecioVenta; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_placa"
    private TableColumn<Vehiculo, String> tbc_placa; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_tipoDeVehiculo"
    private TableColumn<Vehiculo, String> tbc_tipoDeVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="tbl_listaVehiculosInventario"
    private TableView<Vehiculo> tbl_listaVehiculosInventario; // Value injected by FXMLLoader

    @FXML // fx:id="txt_matricula"
    private TextField txt_matricula; // Value injected by FXMLLoader

    @FXML // fx:id="txt_PrecioAlquiler"
    private TextField txt_PrecioAlquiler; // Value injected by FXMLLoader

    @FXML // fx:id="txt_PrecioVenta"
    private TextField txt_PrecioVenta; // Value injected by FXMLLoader

    @FXML // fx:id="txt_tipoVehiculo"
    private TextField txt_tipoVehiculo; // Value injected by FXMLLoader

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
            tbc_marca.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getMarca()));
            tbc_modelo.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getModelo()));
            tbc_placa.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getPlaca()));
            tbc_tipoDeVehiculo.setCellValueFactory(
                    cellData -> new SimpleObjectProperty<>(cellData.getValue().getClass().getSimpleName()));
        } catch (Exception e) {
            App.showAlert("Error de Configuración", "Error al configurar las columnas de la tabla: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    private void cargarVehiculos() {
        try {
            listaVehiculos.setAll(editarInventarioController.obtenerVehiculos());
            tbl_listaVehiculosInventario.setItems(listaVehiculos);
        } catch (Exception e) {
            App.showAlert("Error de Carga", "No se pudieron cargar los vehículos: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    private void configurarAccionesBotones() {
        try {
            btn_eliminar.setOnAction(this::eliminarVehiculoSeleccionado);
            btn_guardar.setOnAction(this::guardarCambiosVehiculo);
            btn_Regresar.setOnAction(this::accionRegresar);
            btn_CrearVehiculo.setOnAction(this::accionCrearVehiculo);
        } catch (Exception e) {
            App.showAlert("Error de Configuración",
                    "Error al configurar las acciones de los botones: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void accionCrearVehiculo(ActionEvent  event){
        App.loadScene("RegistroVehicular", 777, 474);
    }

    private void eliminarVehiculoSeleccionado(ActionEvent event) {
        Vehiculo vehiculoSeleccionado = tbl_listaVehiculosInventario.getSelectionModel().getSelectedItem();
        if (vehiculoSeleccionado != null) {
            listaVehiculos.remove(vehiculoSeleccionado);
            editarInventarioController.eliminarVehiculo(vehiculoSeleccionado);
        } else {
            App.showAlert("Seleccionar Vehículo", "Por favor, seleccione un vehículo a eliminar",
                    Alert.AlertType.INFORMATION);
        }
    }

    @FXML
    private void guardarCambiosVehiculo(ActionEvent event) {
        String matricula = txt_matricula.getText();
        String precioAlquilerStr = txt_PrecioAlquiler.getText();
        String precioVentaStr = txt_PrecioVenta.getText();

        try {
            double precioAlquiler = Double.parseDouble(precioAlquilerStr);
            double precioVenta = Double.parseDouble(precioVentaStr);

            boolean exitoso = editarInventarioController.guardarCambiosVehiculo(matricula, precioAlquiler, precioVenta);

            if (exitoso) {
                App.showAlert("Éxito", "Los cambios en el vehículo se han guardado correctamente",
                        Alert.AlertType.INFORMATION);
                cargarVehiculos(); // Recargar la lista de vehículos después de guardar los cambios
                txt_PrecioAlquiler.clear();
                txt_PrecioVenta.clear();
                txt_matricula.clear();
            } else {
                App.showAlert("Error", "No se pudo guardar los cambios en el vehículo", Alert.AlertType.ERROR);
            }

        } catch (NumberFormatException e) {
            App.showAlert("Error de Formato", "Los campos de precio deben ser números válidos", Alert.AlertType.ERROR);
        }
    }

    private void accionRegresar(ActionEvent event) {
        App.goBack();
    }

    private void configurarListeners() {
        tbl_listaVehiculosInventario.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        txt_matricula.setText(newValue.getPlaca());
                        txt_PrecioAlquiler.setText(String.valueOf(newValue.getPrecioAlquilerPorDia()));
                        txt_PrecioVenta.setText(String.valueOf(newValue.getPrecioVenta()));
                    }
                });
    }
}
