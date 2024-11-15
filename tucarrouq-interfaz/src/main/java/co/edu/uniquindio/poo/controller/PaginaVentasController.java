package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PaginaVentasController {

    Concesionario concesionario = App.getConcesionario();
    Vehiculo vehiculoSeleccionado=null;

    public ObservableList<Vehiculo> obtenerVehiculos() {
        if (concesionario == null) {
            throw new IllegalStateException("El concesionario no está inicializada.");
        }

        return FXCollections.observableArrayList(concesionario.getVehiculos());
    }

    public Vehiculo getVehiculoSeleccionado() {
        return vehiculoSeleccionado;
    }

    public void setVehiculoSeleccionado(Vehiculo vehiculoSeleccionado) {
        this.vehiculoSeleccionado = vehiculoSeleccionado;
    }


}

