package co.edu.uniquindio.poo.viewController;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.VerVehiculosDiponiblesController;
import co.edu.uniquindio.poo.model.*;

import java.util.HashMap;
import java.util.Map;

public class VerVehiculosDiponiblesViewController {

    @FXML
    private AnchorPane Screen_VerAutosDisponibles;

    @FXML
    private Button btn_EstoyInteresado;

    @FXML
    private Button btn_Regresar;

    @FXML
    private ImageView img_Vehiculos;

    @FXML
    private TableColumn<Vehiculo, Double> tbc_CostoDia;

    @FXML
    private TableColumn<Vehiculo, Double> tbc_CostoTotal;

    @FXML
    private TableColumn<Vehiculo, String> tbc_Marca;

    @FXML
    private TableColumn<Vehiculo, String> tbc_Placa;

    @FXML
    private TableColumn<Vehiculo, String> tbc_tipoDeVehiculo;

    @FXML
    private TableView<Vehiculo> tbl_verVehiculos;

    private ObservableList<Vehiculo> listaVehiculos = FXCollections.observableArrayList();
    VerVehiculosDiponiblesController verVehiculosDiponiblesController = new VerVehiculosDiponiblesController();
    private Map<String, Image> imagenesVehiculos;

    @FXML
    void initialize() {
        try {
            configurarColumnas();
            cargarVehiculos();
            configurarAccionesBotones();
            inicializarImagenes(); // Inicializar el mapa de imágenes
            configurarListenerTabla(); // Configurar el listener de la tabla
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
            listaVehiculos.setAll(verVehiculosDiponiblesController.obtenerVehiculos());
            tbl_verVehiculos.setItems(listaVehiculos);
        } catch (Exception e) {
            App.showAlert("Error de Carga", "No se pudieron cargar los vehículos: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    private void configurarAccionesBotones() {
        try {
            btn_EstoyInteresado.setOnAction(this::accionEstoyInteresado);
            btn_Regresar.setOnAction(this::accionRegresar);
        } catch (Exception e) {
            App.showAlert("Error de Configuración",
                    "Error al configurar las acciones de los botones: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void accionEstoyInteresado(ActionEvent event) {
        try {
            App.showAlert("Información",
                    "Comuníquese con un empleado o administrador de la sucursal para obtener más información.",
                    Alert.AlertType.INFORMATION);
        } catch (Exception e) {
            App.showAlert("Error", "Ocurrió un error al mostrar la información: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    private void accionRegresar(ActionEvent event) {
        try {
            App.goBack();
        } catch (Exception e) {
            App.showAlert("Error", "Ocurrió un error al regresar a la escena anterior: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }
    /**
     * mapeo de informacion para asignar fotos por vehiculo y palabra clave
     */
    private void inicializarImagenes() {
        try {
            imagenesVehiculos = new HashMap<>();
    
            imagenesVehiculos.put("Van", new Image(getClass().getResourceAsStream("/co/edu/uniquindio/poo/imagenes/van.jpeg")));
            imagenesVehiculos.put("Sedan", new Image(getClass().getResourceAsStream("/co/edu/uniquindio/poo/imagenes/sedan.jpg")));
            imagenesVehiculos.put("Deportivo", new Image(getClass().getResourceAsStream("/co/edu/uniquindio/poo/imagenes/deportivo.jpg")));
            imagenesVehiculos.put("Moto", new Image(getClass().getResourceAsStream("/co/edu/uniquindio/poo/imagenes/moto.jpeg")));
            imagenesVehiculos.put("Camion", new Image(getClass().getResourceAsStream("/co/edu/uniquindio/poo/imagenes/camion.jpeg")));
            imagenesVehiculos.put("Bus", new Image(getClass().getResourceAsStream("/co/edu/uniquindio/poo/imagenes/bus.jpg")));
            imagenesVehiculos.put("Camioneta", new Image(getClass().getResourceAsStream("/co/edu/uniquindio/poo/imagenes/camioneta.png")));
            imagenesVehiculos.put("Pickup", new Image(getClass().getResourceAsStream("/co/edu/uniquindio/poo/imagenes/pickup.jpg")));
    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /*
     * Configuracion de listener de la tabla para mostrar fotografias
     */
    private void configurarListenerTabla() {
        try {
            tbl_verVehiculos.getSelectionModel().selectedItemProperty()
                    .addListener((observable, oldValue, newValue) -> {
                        if (newValue != null) {
                            String tipoVehiculo = newValue.getClass().getSimpleName();

                            if (tipoVehiculo.contains("Van")) {
                                tipoVehiculo = "Van";
                            } else if (tipoVehiculo.contains("Sedan")) {
                                tipoVehiculo = "Sedan";
                            } else if (tipoVehiculo.contains("Deportivo")) {
                                tipoVehiculo = "Deportivo";
                            } else if (tipoVehiculo.contains("Moto")) {
                                tipoVehiculo = "Moto";
                            } else if (tipoVehiculo.contains("Camion")) {
                                tipoVehiculo = "Camion";
                            } else if (tipoVehiculo.contains("Bus")) {
                                tipoVehiculo = "Bus";
                            } else if (tipoVehiculo.contains("Camioneta")) {
                                tipoVehiculo = "Camioneta";
                            } else if (tipoVehiculo.contains("Pickup")) {
                                tipoVehiculo = "Pickup";
                            }

                            img_Vehiculos.setImage(imagenesVehiculos.get(tipoVehiculo));
                        }
                    });
        } catch (Exception e) {
            App.showAlert("Error de Configuración", "Error al configurar el listener de la tabla: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }
}
