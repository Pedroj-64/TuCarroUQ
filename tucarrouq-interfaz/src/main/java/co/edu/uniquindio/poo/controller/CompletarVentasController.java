package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.DetalleTransaccion;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Transaccion;
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

    public boolean alquilarVehiculo(LocalDate fechaDevolucion,Cliente cliente) {
        Empleado usuarioActual= AppControllerSingleton.getInstance().getUsuarioActual();
        Transaccion transaccion = concesionario.crearTransaccion(cliente, usuarioActual);
        DetalleTransaccion detalleTransaccion = new DetalleTransaccion(true, vehiculoSeleccionado);
        detalleTransaccion.calcularDiferenciaDias(fechaDevolucion);
        usuarioActual.registrarTransaccion(transaccion);
        
        boolean banderilla = false;
        if (vehiculoSeleccionado == null) {
            banderilla = false;
        }
        try {
            concesionario.agregarDetalleATransaccion(transaccion, detalleTransaccion, true);
            banderilla = true;
        } catch (Exception e) {
            // Manejar la excepción según sea necesario
            e.printStackTrace();
        }
        return banderilla;
    }

    public boolean venderVehiculo(Cliente cliente) {
        Empleado usuarioActual = AppControllerSingleton.getInstance().getUsuarioActual();
        Transaccion transaccion = concesionario.crearTransaccion(cliente, usuarioActual);
        DetalleTransaccion detalleTransaccion = new DetalleTransaccion(false, vehiculoSeleccionado);
        usuarioActual.registrarTransaccion(transaccion);

        boolean banderilla = false;
        if (vehiculoSeleccionado == null) {
            banderilla = false;
        }
        try {
            concesionario.agregarDetalleATransaccion(transaccion, detalleTransaccion, false);
            banderilla = true;
        } catch (Exception e) {
            // Manejar la excepción según sea necesario
            e.printStackTrace();
        }
        return banderilla;
    }
}
