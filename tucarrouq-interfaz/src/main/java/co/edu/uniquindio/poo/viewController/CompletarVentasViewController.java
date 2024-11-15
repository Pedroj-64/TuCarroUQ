package co.edu.uniquindio.poo.viewController;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.CompletarVentasController;
import co.edu.uniquindio.poo.model.Cliente;
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

    @FXML
    public void initialize() {
        configurarVistaVehiculo();
        cargarClientes();
        configurarAccionesBotones();
    }

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

    private void configurarAccionesBotones() {
        btn_Alquilar.setOnAction(this::accionAlquilar);
        btn_Regresar.setOnAction(this::accionRegresar);
        btn_Vender.setOnAction(this::accionVender);
    }

    private void accionAlquilar(ActionEvent event) {
        LocalDate fechaDevolucion = date_DiaDevolucion.getValue();
        Cliente cliente = cmb_Clientes.getValue();

        boolean exi
    }
    

    private void accionVender(ActionEvent event) {
        boolean resultado = completarVentasController.venderVehiculo();
        if (resultado) {
            App.showAlert("Éxito", "El vehículo ha sido vendido correctamente", Alert.AlertType.INFORMATION);
        } else {
            App.showAlert("Error", "No se pudo vender el vehículo", Alert.AlertType.ERROR);
        }
    }

    private void accionRegresar(ActionEvent event) {
        App.loadScene("paginaVentas", 630, 450);
    }

    private void cargarClientes() {
        ObservableList<Cliente> clientes = completarVentasController.obtenerClientes();
        cmb_Clientes.setItems(clientes);
    }
}


