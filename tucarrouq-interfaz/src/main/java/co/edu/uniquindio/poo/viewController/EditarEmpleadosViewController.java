package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.EditarEmpleadosController;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;

/**
 * Controlador de la vista para editar empleados, incluyendo la funcionalidad
 * de crear y actualizar empleados.
 */
public class EditarEmpleadosViewController {

    @FXML // fx:id="Tan"
    private AnchorPane Tan; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Actulizar"
    private Button btn_Actulizar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_CrearEmpleado"
    private Button btn_CrearEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Regresar"
    private Button btn_Regresar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Regresar1"
    private Button btn_Regresar1; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Eliminar"
    private Button btn_Eliminar; // Value injected by FXMLLoader

    @FXML // fx:id="cmb_CargoEmpleadoActulizar"
    private ComboBox<String> cmb_CargoEmpleadoActulizar; // Value injected by FXMLLoader

    @FXML // fx:id="cmb_CargoEmpleadoCrear"
    private ComboBox<String> cmb_CargoEmpleadoCrear; // Value injected by FXMLLoader

    @FXML // fx:id="tab_CrearEmpleados"
    private Tab tab_CrearEmpleados; // Value injected by FXMLLoader

    @FXML // fx:id="tab_EditarEmpleados"
    private Tab tab_EditarEmpleados; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_EmpleadosActuales"
    private TableColumn<Empleado, String> tbc_EmpleadosActuales; // Value injected by FXMLLoader

    @FXML // fx:id="tbl_Empleados"
    private TableView<Empleado> tbl_Empleados; // Value injected by FXMLLoader

    @FXML // fx:id="txt_ContraseñaActulizar"
    private TextField txt_ContraseñaActulizar; // Value injected by FXMLLoader

    @FXML // fx:id="txt_ContraseñaCrear"
    private TextField txt_ContraseñaCrear; // Value injected by FXMLLoader

    @FXML // fx:id="txt_EmailRecuperacionActualizar"
    private TextField txt_EmailRecuperacionActualizar; // Value injected by FXMLLoader

    @FXML // fx:id="txt_EmailRecuperacionCrear"
    private TextField txt_EmailRecuperacionCrear; // Value injected by FXMLLoader

    @FXML // fx:id="txt_IdentificacionActualizar"
    private TextField txt_IdentificacionActualizar; // Value injected by FXMLLoader

    @FXML // fx:id="txt_IdentificacionCrear"
    private TextField txt_IdentificacionCrear; // Value injected by FXMLLoader

    @FXML // fx:id="txt_NombreUsuarioActulizar"
    private TextField txt_NombreUsuarioActulizar; // Value injected by FXMLLoader

    @FXML // fx:id="txt_NombreUsuarioCrear"
    private TextField txt_NombreUsuarioCrear; // Value injected by FXMLLoader

    private ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList();
    EditarEmpleadosController editarEmpleadosController = new EditarEmpleadosController();

    @FXML
    void initialize() {
        try {
            configurarColumnas();
            cargarEmpleados();
            cargarRangos();
            configurarAccionesBotones();
            configurarListeners();
        } catch (Exception e) {
            App.showAlert("Error de Inicialización", "Ocurrió un error al inicializar la vista: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    private void configurarColumnas() {
        tbc_EmpleadosActuales
                .setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getNombre()));
    }

    private void cargarEmpleados() {
        listaEmpleados.setAll(editarEmpleadosController.obtenerEmpleados());
        tbl_Empleados.setItems(listaEmpleados);
    }

    private void cargarRangos() {
        ObservableList<String> rangos = FXCollections.observableArrayList("Empleado", "Administrador");
        cmb_CargoEmpleadoActulizar.setItems(rangos);
        cmb_CargoEmpleadoCrear.setItems(rangos);
    }

    private void configurarAccionesBotones() {
        try {
            btn_Actulizar.setOnAction(this::actualizarEmpleado);
            btn_CrearEmpleado.setOnAction(this::crearEmpleado);
            btn_Regresar.setOnAction(this::accionRegresar);
            btn_Regresar1.setOnAction(this::accionRegresar);
            btn_Eliminar.setOnAction(this::eliminarEmpleado);
        } catch (Exception e) {
            App.showAlert("Error de Configuración",
                    "Error al configurar las acciones de los botones: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void actualizarEmpleado(ActionEvent event) {
        String nombre = txt_NombreUsuarioActulizar.getText();
        String identificacion = txt_IdentificacionActualizar.getText();
        String contrasena = txt_ContraseñaActulizar.getText();
        String emailDeRecuperacion = txt_EmailRecuperacionActualizar.getText();
        String cargo = cmb_CargoEmpleadoActulizar.getValue();

        boolean resultado = editarEmpleadosController.actualizarEmpleado(nombre, identificacion, contrasena,
                emailDeRecuperacion,cargo);
        if (resultado) {
            App.showAlert("Éxito", "El empleado ha sido actualizado correctamente", Alert.AlertType.INFORMATION);
        } else {
            App.showAlert("Error", "No se pudo actualizar el empleado", Alert.AlertType.ERROR);
        }
    }

    private void crearEmpleado(ActionEvent event) {
        String nombre = txt_NombreUsuarioCrear.getText();
        String identificacion = txt_IdentificacionCrear.getText();
        String contrasena = txt_ContraseñaCrear.getText();
        String emailDeRecuperacion = txt_EmailRecuperacionCrear.getText();
        String rangoEmpleado = cmb_CargoEmpleadoCrear.getValue();

        boolean resultado = editarEmpleadosController.crearEmpleado(nombre, contrasena, identificacion,
                emailDeRecuperacion, rangoEmpleado);
        if (resultado) {
            App.showAlert("Éxito", "El empleado ha sido creado correctamente", Alert.AlertType.INFORMATION);
            cargarEmpleados(); // Recargar la lista de empleados después de crear un nuevo empleado
            txt_NombreUsuarioCrear.clear();
            txt_IdentificacionCrear.clear();
            txt_ContraseñaCrear.clear();
            txt_EmailRecuperacionCrear.clear();
            cmb_CargoEmpleadoCrear.setValue(null);
        } else {
            App.showAlert("Error", "No se pudo crear el empleado", Alert.AlertType.ERROR);
        }
    }

    private void eliminarEmpleado(ActionEvent event) {
        String identificacion = txt_IdentificacionActualizar.getText();
        boolean resultado = editarEmpleadosController.eliminarEmpleado(identificacion);
        if (resultado) {
            App.showAlert("Éxito", "El empleado ha sido eliminado correctamente", Alert.AlertType.INFORMATION);
            cargarEmpleados(); // Recargar la lista de empleados después de eliminar un empleado
            txt_NombreUsuarioActulizar.clear();
            txt_IdentificacionActualizar.clear();
            txt_ContraseñaActulizar.clear();
            txt_EmailRecuperacionActualizar.clear();
        } else {
            App.showAlert("Error", "No se pudo eliminar el empleado", Alert.AlertType.ERROR);
        }
    }

    private void accionRegresar(ActionEvent event) {
        App.goBack();
    }

    private void configurarListeners() {
        tbl_Empleados.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                txt_NombreUsuarioActulizar.setText(newValue.getNombre());
                txt_IdentificacionActualizar.setText(newValue.getIdentificacion());
                txt_ContraseñaActulizar.setText(newValue.getContrasena());
                txt_EmailRecuperacionActualizar.setText(newValue.getEmailDeRecuperacion());
                String cargoEmpleado = newValue.getCargo();
                cmb_CargoEmpleadoActulizar.getSelectionModel().select(cargoEmpleado);
                // Puedes agregar aquí cualquier otro campo que desees actualizar
            }
        });
    }
}
