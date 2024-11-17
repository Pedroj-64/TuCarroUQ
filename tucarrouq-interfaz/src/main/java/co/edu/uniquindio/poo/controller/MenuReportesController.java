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

public class MenuReportesController {

    Concesionario concesionario = App.getConcesionario();

    private HostServices hostServices = App.getHostServicesInstance(); // Obtiene la instancia de HostServices

    public boolean generarReporteGeneral() {
        boolean banderilla = false;

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

    public ObservableList<Empleado> obtenerEmpleados (){
        return FXCollections.observableArrayList(concesionario.getEmpleados());
    }
}
