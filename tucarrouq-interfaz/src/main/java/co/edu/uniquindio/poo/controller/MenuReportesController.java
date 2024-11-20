package co.edu.uniquindio.poo.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.application.HostServices;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert.AlertType;

/**
 * Controlador para gestionar la generación de reportes del concesionario.
 */
public class MenuReportesController {

    Concesionario concesionario = App.getConcesionario();

    // Instancia de HostServices obtenida desde la clase App
    private HostServices hostServices = App.getHostServicesInstance();

    /**
     * Genera un reporte general del concesionario y lo guarda en un archivo.
     * 
     * @return true si el reporte se generó correctamente, false en caso contrario
     */
    public boolean generarReporteGeneral() {
        boolean banderilla = false;

        // Contenido del reporte general
        String reporteContenido = concesionario.toString();
        File archivoReporte = new File("reporte_concesionario.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoReporte))) {
            writer.write(reporteContenido);
            App.showAlert("Reporte Generado",
                    "El reporte se ha generado y guardado en " + archivoReporte.getAbsolutePath(),
                    AlertType.INFORMATION);

            // Abre el archivo automáticamente usando JavaFX HostServices
            hostServices.showDocument(archivoReporte.toURI().toString());
            banderilla = true;
        } catch (IOException e) {
            App.showAlert("Error", "No se pudo generar el reporte: " + e.getMessage(), AlertType.ERROR);
        }

        return banderilla;
    }

    /**
     * Genera un reporte de transacciones por empleado y fecha, y lo guarda en un archivo.
     * 
     * @param fechaDeseada la fecha deseada para filtrar las transacciones
     * @param empleado el empleado cuyas transacciones se deben incluir en el reporte
     * @return true si el reporte se generó correctamente, false en caso contrario
     */
    public boolean generarReporteTransaccionesPorEmpleadoYFecha(LocalDate fechaDeseada, Empleado empleado) {
        boolean banderilla = false;

        try {
            // Generar el contenido del reporte
            String reporteContenido = concesionario.generarReportePorFechaEmpleado(fechaDeseada, empleado);

            // Crear el archivo del reporte
            File archivoReporte = new File("reporte_transacciones_empleado.txt");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoReporte))) {
                writer.write(reporteContenido);
                App.showAlert("Reporte Generado",
                        "El reporte se ha generado y guardado en " + archivoReporte.getAbsolutePath(),
                        AlertType.INFORMATION);

                // Abre el archivo automáticamente usando JavaFX HostServices
                hostServices.showDocument(archivoReporte.toURI().toString());
                banderilla = true;
            }
        } catch (IllegalArgumentException e) {
            App.showAlert("Error de Parámetros", "Error: " + e.getMessage(), AlertType.ERROR);
        } catch (IOException e) {
            App.showAlert("Error", "No se pudo generar el reporte: " + e.getMessage(), AlertType.ERROR);
        }

        return banderilla;
    }

    /**
     * Obtiene una lista observable de empleados del concesionario.
     * 
     * @return una lista observable de empleados
     */
    public ObservableList<Empleado> obtenerEmpleados() {
        return FXCollections.observableArrayList(concesionario.getEmpleados());
    }
}
