package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.EditarClientesController;
import co.edu.uniquindio.poo.controller.AppControllerSingleton;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Administrador;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * Controlador de la vista para editar clientes, incluyendo la funcionalidad
 * de crear, actualizar y eliminar clientes.
 */
public class EditarClientesViewController {

    @FXML // fx:id="Tan"
    private AnchorPane Tan; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Actulizar"
    private Button btn_Actulizar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_CrearCliente"
    private Button btn_CrearCliente; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Eliminar"
    private Button btn_Eliminar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Regresar"
    private Button btn_Regresar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Regresar1"
    private Button btn_Regresar1; // Value injected by FXMLLoader

    @FXML // fx:id="tab_CrearClientes"
    private Tab tab_CrearClientes; // Value injected by FXMLLoader

    @FXML // fx:id="tab_EditarClientes"
    private Tab tab_EditarClientes; // Value injected by FXMLLoader

    @FXML // fx:id="tbc_ClientesActuales"
    private TableColumn<Cliente, String> tbc_ClientesActuales; // Value injected by FXMLLoader

    @FXML // fx:id="tbl_Clientes"
    private TableView<Cliente> tbl_Clientes; // Value injected by FXMLLoader

    @FXML // fx:id="txt_DireccionActualizar"
    private TextField txt_DireccionActualizar; // Value injected by FXMLLoader

    @FXML // fx:id="txt_DireccionCrear"
    private TextField txt_DireccionCrear; // Value injected by FXMLLoader

    @FXML // fx:id="txt_IdentificacionActualizar"
    private TextField txt_IdentificacionActualizar; // Value injected by FXMLLoader

    @FXML // fx:id="txt_IdentificacionCrear"
    private TextField txt_IdentificacionCrear; // Value injected by FXMLLoader

    @FXML // fx:id="txt_NombreActulizar"
    private TextField txt_NombreActulizar; // Value injected by FXMLLoader

    @FXML // fx:id="txt_NombreClienteCrear"
    private TextField txt_NombreClienteCrear; // Value injected by FXMLLoader

    @FXML // fx:id="txt_TelefonoActulizar"
    private TextField txt_TelefonoActulizar; // Value injected by FXMLLoader

    @FXML // fx:id="txt_TelefonoCrear"
    private TextField txt_TelefonoCrear; // Value injected by FXMLLoader

    EditarClientesController editarClientesController = new EditarClientesController();
    private ObservableList<Cliente> clientes= FXCollections.observableArrayList();

    @FXML
    void initialize() {
        try {
            verificarAccesoAdministrador();
            configurarColumnas();
            cargarClientes();
            configurarAccionesBotones();
            configurarListeners();
        } catch (Exception e) {
            App.showAlert("Error de Inicialización", "Ocurrió un error al inicializar la vista: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void verificarAccesoAdministrador() {
        Empleado usuarioActual = AppControllerSingleton.getInstance().getUsuarioActual();
        if (!(usuarioActual instanceof Administrador)) {
            tab_EditarClientes.setOnSelectionChanged(event -> {
                if (tab_EditarClientes.isSelected()) {
                    App.showAlert("Acceso Restringido", "Usted no es administrador y no tiene acceso a esta pestaña.", Alert.AlertType.ERROR);
                    tab_EditarClientes.getTabPane().getSelectionModel().select(tab_CrearClientes);
                }
            });
        }
    }

    private void configurarColumnas() {
        tbc_ClientesActuales.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getNombre()));
    }

    private void cargarClientes() {
        clientes.setAll(editarClientesController.obtenerClientes());
        tbl_Clientes.setItems(clientes);
    }

    private void configurarAccionesBotones() {
        try {
            btn_Actulizar.setOnAction(this::actualizarCliente);
            btn_CrearCliente.setOnAction(this::crearCliente);
            btn_Regresar.setOnAction(this::accionRegresar);
            btn_Regresar1.setOnAction(this::accionRegresar);
            btn_Eliminar.setOnAction(this::eliminarCliente);
        } catch (Exception e) {
            App.showAlert("Error de Configuración", "Error al configurar las acciones de los botones: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void actualizarCliente(ActionEvent event) {
        String nombre = txt_NombreActulizar.getText();
        String identificacion = txt_IdentificacionActualizar.getText();
        String direccion = txt_DireccionActualizar.getText();
        String emailDeRecuperacion = txt_TelefonoActulizar.getText();

        boolean resultado = editarClientesController.actulizarCliente(nombre, identificacion, direccion, emailDeRecuperacion);
        if (resultado) {
            App.showAlert("Éxito", "El cliente ha sido actualizado correctamente", Alert.AlertType.INFORMATION);
        } else {
            App.showAlert("Error", "No se pudo actualizar el cliente", Alert.AlertType.ERROR);
        }
    }

    private void crearCliente(ActionEvent event) {
        String nombre = txt_NombreClienteCrear.getText();
        String identificacion = txt_IdentificacionCrear.getText();
        String direccion = txt_DireccionCrear.getText();
        String telefono = txt_TelefonoCrear.getText();

        boolean resultado = editarClientesController.crearCliente(nombre, identificacion, direccion, telefono);
        if (resultado) {
            App.showAlert("Éxito", "El cliente ha sido creado correctamente", Alert.AlertType.INFORMATION);
            cargarClientes();
            txt_NombreClienteCrear.clear();
            txt_IdentificacionCrear.clear();
            txt_DireccionCrear.clear();
            txt_TelefonoCrear.clear();
        } else {
            App.showAlert("Error", "No se pudo crear el cliente", Alert.AlertType.ERROR);
        }
    }

    private void eliminarCliente(ActionEvent event) {
        String identificacion = txt_IdentificacionActualizar.getText();
        boolean resultado = editarClientesController.eliminarCliente(identificacion);
        if (resultado) {
            App.showAlert("Éxito", "El cliente ha sido eliminado correctamente", Alert.AlertType.INFORMATION);
            cargarClientes();
            txt_NombreClienteCrear.clear();
            txt_IdentificacionCrear.clear();
            txt_DireccionCrear.clear();
            txt_TelefonoCrear.clear();
        } else {
            App.showAlert("Error", "No se pudo eliminar el cliente", Alert.AlertType.ERROR);
        }
    }

    private void accionRegresar(ActionEvent event) {
        App.goBack();
    }

    private void configurarListeners() {
        tbl_Clientes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                txt_NombreActulizar.setText(newValue.getNombre());
                txt_IdentificacionActualizar.setText(newValue.getIdentificacion());
                txt_TelefonoActulizar.setText(newValue.getTelefono());
                txt_DireccionActualizar.setText(newValue.getDireccion());
                // Puedes agregar aquí cualquier otro campo que desees actualizar
            }
        });
    }
}
