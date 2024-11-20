package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Controlador para gestionar la vista de ventas de vehículos.
 */
public class PaginaVentasController {

    // Instancia del concesionario obtenida desde la clase App
    Concesionario concesionario = App.getConcesionario();

    /**
     * Obtiene una lista observable de vehículos disponibles en el concesionario.
     * 
     * @return una lista observable de vehículos
     * @throws IllegalStateException si el concesionario no está inicializado
     */
    public ObservableList<Vehiculo> obtenerVehiculos() {
        if (concesionario == null) {
            throw new IllegalStateException("El concesionario no está inicializado.");
        }

        return FXCollections.observableArrayList(concesionario.getVehiculos());
    }

}

