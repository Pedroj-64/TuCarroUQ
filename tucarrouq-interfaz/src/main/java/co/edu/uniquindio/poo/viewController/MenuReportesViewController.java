package co.edu.uniquindio.poo.viewController;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.MenuReportesController;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

/**
 * Sample Skeleton for 'menuReportes.fxml' Controller Class
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class MenuReportesViewController {

    @FXML // fx:id="btn_Regresar"
    private Button btn_Regresar; // Value injected by FXMLLoader

    @FXML // fx:id="btn_ReporteConcesionario"
    private Button btn_ReporteConcesionario; // Value injected by FXMLLoader

    @FXML // fx:id="btn_ReporteEmpleado"
    private Button btn_ReporteEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="cmb_Empleados"
    private ComboBox<Empleado> cmb_Empleados; // Value injected by FXMLLoader

    @FXML // fx:id="date_FechaReporte"
    private DatePicker date_FechaReporte; // Value injected by FXMLLoader

    MenuReportesController menuReportesController = new MenuReportesController();

    @FXML
    void initialize() {
        cargarEmpleados();
        configurarBotones();
    }

    private void configurarBotones() {
        btn_Regresar.setOnAction(this::accionRegresar);
        btn_ReporteConcesionario.setOnAction(this::accionReporteConcesionario);
        btn_ReporteEmpleado.setOnAction(this::accionReporteEmpleado);

    }

    private void cargarEmpleados() {
        ObservableList<Empleado> empleados = menuReportesController.obtenerEmpleados();
        cmb_Empleados.setItems(empleados);
    }

    private void accionReporteEmpleado(ActionEvent event) {
        Empleado empleado = cmb_Empleados.getValue();
        LocalDate fecha = date_FechaReporte.getValue();
        menuReportesController.generarReporteTransaccionesPorEmpleadoYFecha(fecha, empleado);
    }

    private void accionReporteConcesionario(ActionEvent event) {
        menuReportesController.generarReporteGeneral();

    }

    private void accionRegresar(ActionEvent event) {
        App.goBack();
    }

}
