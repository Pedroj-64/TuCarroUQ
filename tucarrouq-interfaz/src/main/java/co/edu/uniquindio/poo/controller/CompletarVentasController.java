package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CompletarVentasController {
    private Concesionario concesionario = App.getConcesionario();
    private Vehiculo vehiculoSeleccionado;

    public Vehiculo obtenerVehiculoInterfazAnterior() {
        vehiculoSeleccionado = AppControllerSingleton.getInstance().getVehiculoSeleccionado();
        return vehiculoSeleccionado;
    }

    public ObservableList<Cliente> obtenerClientes() {
        return FXCollections.observableArrayList(concesionario.getClientes());
    }

    public boolean alquilarVehiculo(LocalDate fechaDevolucion) {
        boolean banderilla = false;
        if (vehiculoSeleccionado == null) {
            banderilla = false;
        }
        try {
            concesionario.alquilarVehiculo(vehiculoSeleccionado);
            concesionario.calcularPrecioReserva(dias, vehiculoSeleccionado);
            banderilla = true;
        } catch (Exception e) {
            // Manejar la excepción según sea necesario
            e.printStackTrace();
        }
        return banderilla;
    }

    public boolean venderVehiculo() {
        boolean banderilla = false;
        if (vehiculoSeleccionado == null) {
            banderilla = false;
        }
        try {
            concesionario.venderVehiculo(vehiculoSeleccionado);
            banderilla = true;
        } catch (Exception e) {
            // Manejar la excepción según sea necesario
            e.printStackTrace();
        }
        return banderilla;
    }
}
