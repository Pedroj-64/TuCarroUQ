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

    @FXML // fx:id="Screen_VerAutosDisponibles"
    private AnchorPane Screen_VerAutosDisponibles; // Value injected by FXMLLoader

    @FXML // fx:id="btn_EstoyInteresado"
    private Button btn_EstoyInteresado; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Regresar"
    private Button btn_Regresar; // Value injected by FXMLLoader

    @FXML // fx:id="img_Vehiculos"
    private ImageView img_Vehiculos; // Value injected by FXMLLoader

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

    @FXML // fx:id="tbl_verVehiculos"
    private TableView<Vehiculo> tbl_verVehiculos; // Value injected by FXMLLoader

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
        App.showAlert("Información",
                "Comuníquese con un empleado o administrador de la sucursal para obtener más información.",
                Alert.AlertType.INFORMATION);
    }

    private void accionRegresar(ActionEvent event) {
        App.goBack();
    }

    // Inicializar el mapa de imágenes con las imágenes correspondientes a cada tipo de vehículo
    private void inicializarImagenes() {
        imagenesVehiculos = new HashMap<>();

        // Imágenes para tipos generales de vehículos
        imagenesVehiculos.put("Van", new Image(getClass().getResourceAsStream("/imagenes/van.png")));
        imagenesVehiculos.put("Sedan", new Image(getClass().getResourceAsStream("/imagenes/sedan.png")));
        imagenesVehiculos.put("Deportivo", new Image(getClass().getResourceAsStream("/imagenes/deportivo.png")));
        imagenesVehiculos.put("Moto", new Image(getClass().getResourceAsStream("/imagenes/moto.png")));
        imagenesVehiculos.put("Camion", new Image(getClass().getResourceAsStream("/imagenes/camion.png")));
        imagenesVehiculos.put("Bus", new Image(getClass().getResourceAsStream("/imagenes/bus.png")));
        imagenesVehiculos.put("Camioneta", new Image(getClass().getResourceAsStream("/imagenes/camioneta.png")));
        imagenesVehiculos.put("Pickup", new Image(getClass().getResourceAsStream("/imagenes/pickup.png")));
    }

    // Configurar listener para cambios de selección en la tabla
    private void configurarListenerTabla() {
        // Listener para el cambio de selección en la tabla
        tbl_verVehiculos.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Obtener el nombre de la clase del vehículo seleccionado
                String tipoVehiculo = newValue.getClass().getSimpleName();

                // Determinar el tipo general del vehículo (sin importar si es una subclase)
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

                // Actualizar la imagen correspondiente en el ImageView
                img_Vehiculos.setImage(imagenesVehiculos.get(tipoVehiculo));
            }
        });
    }

}
