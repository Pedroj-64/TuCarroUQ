package co.edu.uniquindio.poo.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.HostServices;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Concesionario;
import javafx.scene.control.Alert.AlertType;

public class MenuAdminController {

    Concesionario concesionario = App.getConcesionario();
    private HostServices hostServices = App.getHostServicesInstance();  // Obtiene la instancia de HostServices

    public boolean generarReporte() {
        boolean banderilla = false;

        String reporteContenido = concesionario.toString();
        File archivoReporte = new File("reporte_concesionario.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoReporte))) {
            writer.write(reporteContenido);
            App.showAlert("Reporte Generado", "El reporte se ha generado y guardado en " + archivoReporte.getAbsolutePath(), AlertType.INFORMATION);

            // Abre el archivo automáticamente usando JavaFX HostServices
            hostServices.showDocument(archivoReporte.toURI().toString());
            banderilla = true;
        } catch (IOException e) {
            App.showAlert("Error", "No se pudo generar el reporte: " + e.getMessage(), AlertType.ERROR);
        }

        return banderilla;
    }
}
