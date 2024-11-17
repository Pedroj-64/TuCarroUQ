package co.edu.uniquindio.poo.viewController;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AppControllerSingleton;
import co.edu.uniquindio.poo.controller.CompletarVentasController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * Controlador de la vista para completar ventas, incluyendo la funcionalidad
 * de alquilar y vender vehículos.
 */
public class CompletarVentasViewController {

    private CompletarVentasController completarVentasController = new CompletarVentasController();

    @FXML
    private AnchorPane Screen_VenderAlquilarVehiculo;

    @FXML
    private Button btn_Alquilar;

    @FXML
    private Button btn_Regresar;

    @FXML
    private Button btn_Vender;

    @FXML
    private ComboBox<Cliente> cmb_Clientes;

    @FXML // fx:id="date_DiaDevolucion"
    private DatePicker date_DiaDevolucion; // Value injected by FXMLLoader

    @FXML
    private TextField txt_Marca;

    @FXML
    private TextField txt_Placa;

    @FXML
    private TextField txt_TipoVehiculo;

    /**
     * Método de inicialización llamado por JavaFX después de la carga del FXML.
     * Configura la vista del vehículo, carga los clientes y asigna las acciones a
     * los botones.
     */
    @FXML
    public void initialize() {
        configurarVistaVehiculo();
        cargarClientes();
        configurarAccionesBotones();
    }

    /**
     * Configura los campos de texto de la vista con la información del vehículo
     * seleccionado.
     */
    private void configurarVistaVehiculo() {
        Vehiculo vehiculo = completarVentasController.obtenerVehiculoInterfazAnterior();
        if (vehiculo != null) {
            txt_Marca.setText(vehiculo.getMarca());
            txt_Placa.setText(vehiculo.getPlaca());
            txt_TipoVehiculo.setText(vehiculo.getClass().getSimpleName());

            txt_Marca.setEditable(false);
            txt_Placa.setEditable(false);
            txt_TipoVehiculo.setEditable(false);
        }
    }

    /**
     * Configura las acciones de los botones para alquilar, regresar y vender.
     */
    private void configurarAccionesBotones() {
        btn_Alquilar.setOnAction(this::accionAlquilar);
        btn_Regresar.setOnAction(this::accionRegresar);
        btn_Vender.setOnAction(this::accionVender);
    }

    /**
     * Acción que se ejecuta al pulsar el botón de alquilar.
     * 
     * @param event El evento de acción.
     */
    private void accionAlquilar(ActionEvent event) {
        LocalDate fechaDevolucion = date_DiaDevolucion.getValue();
        Cliente cliente = cmb_Clientes.getValue();

        boolean resultado = completarVentasController.alquilarVehiculo(fechaDevolucion, cliente);
        if (resultado) {
            App.showAlertAndRedirect("Éxito",
                    "El vehículo ha sido alquilado correctamente. Será redirigido al menú principal.",
                    Alert.AlertType.INFORMATION, "MenuAdmin", 800, 540);
        } else {
            App.showAlertAndRedirect("Error", "No se pudo alquilar el vehículo. Será redirigido al menú principal.",
                    Alert.AlertType.ERROR, "MenuAdmin", 800, 540);
        }
    }

    private void accionVender(ActionEvent event) {
        Cliente cliente = cmb_Clientes.getValue();
        boolean resultado = completarVentasController.venderVehiculo(cliente);

        if (resultado) {
            // Obtener el usuario actual desde el Singleton
            Empleado usuario = AppControllerSingleton.getInstance().getUsuarioActual();

            if (usuario != null) {
                // Redirigir al menú correspondiente según el tipo de usuario
                if (usuario instanceof Administrador) {
                    App.showAlertAndRedirect("Éxito",
                            "El vehículo ha sido vendido correctamente. Será redirigido al menú de administrador.",
                            Alert.AlertType.INFORMATION, "MenuAdmin", 800, 600);
                } else if (usuario instanceof Empleado) {
                    App.showAlertAndRedirect("Éxito",
                            "El vehículo ha sido vendido correctamente. Será redirigido al menú de empleado.",
                            Alert.AlertType.INFORMATION, "MenuEmpleado", 800, 600);
                }
            } else {
                App.showAlert("Error", "No se ha encontrado el usuario actual.", Alert.AlertType.ERROR);
            }
        } else {
            // Si no se pudo vender el vehículo, redirigir al menú de administrador
            App.showAlert("Error", "No se ha pddido vender el vehiculo, comuniquese con un superior.",
                    Alert.AlertType.ERROR);

        }
    }

    /**
     * Acción que se ejecuta al pulsar el botón de regresar.
     * 
     * @param event El evento de acción.
     */
    private void accionRegresar(ActionEvent event) {
        App.goBack();
    }

    /**
     * Carga la lista de clientes en el ComboBox.
     */
    private void cargarClientes() {
        ObservableList<Cliente> clientes = completarVentasController.obtenerClientes();
        cmb_Clientes.setItems(clientes);
    }
}
