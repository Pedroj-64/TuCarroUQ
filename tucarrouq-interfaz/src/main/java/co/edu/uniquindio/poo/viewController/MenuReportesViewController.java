package co.edu.uniquindio.poo.viewController;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.MenuReportesController;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

/**
 * Controlador para la vista del menú de reportes.
 * Este controlador gestiona la generación de reportes del concesionario y de los empleados.
 */
public class MenuReportesViewController {

    @FXML // fx:id="btn_Regresar"
    private Button btn_Regresar; // Botón para regresar a la vista anterior

    @FXML // fx:id="btn_ReporteConcesionario"
    private Button btn_ReporteConcesionario; // Botón para generar el reporte general del concesionario

    @FXML // fx:id="btn_ReporteEmpleado"
    private Button btn_ReporteEmpleado; // Botón para generar el reporte de transacciones por empleado

    @FXML // fx:id="cmb_Empleados"
    private ComboBox<Empleado> cmb_Empleados; // ComboBox para seleccionar un empleado

    @FXML // fx:id="date_FechaReporte"
    private DatePicker date_FechaReporte; // Selector de fecha para el reporte

    // Instancia del controlador de reportes
    MenuReportesController menuReportesController = new MenuReportesController();

    /**
     * Método de inicialización llamado por JavaFX después de la carga del FXML.
     * Configura los empleados y los botones de la vista.
     */
    @FXML
    void initialize() {
        cargarEmpleados();
        configurarBotones();
    }

    /**
     * Configura las acciones de los botones para regresar y generar reportes.
     */
    private void configurarBotones() {
        btn_Regresar.setOnAction(this::accionRegresar);
        btn_ReporteConcesionario.setOnAction(this::accionReporteConcesionario);
        btn_ReporteEmpleado.setOnAction(this::accionReporteEmpleado);
    }

    /**
     * Carga la lista de empleados en el ComboBox.
     */
    private void cargarEmpleados() {
        ObservableList<Empleado> empleados = menuReportesController.obtenerEmpleados();
        cmb_Empleados.setItems(empleados);
    }

    /**
     * Acción que se ejecuta al pulsar el botón para generar el reporte de transacciones por empleado.
     * 
     * @param event El evento de acción.
     */
    private void accionReporteEmpleado(ActionEvent event) {
        Empleado empleado = cmb_Empleados.getValue();
        LocalDate fecha = date_FechaReporte.getValue();
        menuReportesController.generarReporteTransaccionesPorEmpleadoYFecha(fecha, empleado);
    }

    /**
     * Acción que se ejecuta al pulsar el botón para generar el reporte general del concesionario.
     * 
     * @param event El evento de acción.
     */
    private void accionReporteConcesionario(ActionEvent event) {
        menuReportesController.generarReporteGeneral();
    }

    /**
     * Acción que se ejecuta al pulsar el botón de regresar.
     * 
     * @param event El evento de acción.
     */
    private void accionRegresar(ActionEvent event) {
        App.goBack();
    }
}
