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

/**
 * Controlador para gestionar las operaciones de venta y alquiler de vehículos.
 */
public class CompletarVentasController {
    private Concesionario concesionario = App.getConcesionario();
    private Vehiculo vehiculoSeleccionado;

    /**
     * Obtiene el vehículo seleccionado de la interfaz anterior.
     * 
     * @return el vehículo seleccionado
     */
    public Vehiculo obtenerVehiculoInterfazAnterior() {
        vehiculoSeleccionado = AppControllerSingleton.getInstance().getVehiculoSeleccionado();
        return vehiculoSeleccionado;
    }

    /**
     * Obtiene una lista observable de clientes del concesionario.
     * 
     * @return una lista observable de clientes
     */
    public ObservableList<Cliente> obtenerClientes() {
        return FXCollections.observableArrayList(concesionario.getClientes());
    }

    /**
     * Alquila un vehículo a un cliente y registra la transacción.
     * 
     * @param fechaDevolucion la fecha de devolución del vehículo
     * @param cliente el cliente que alquila el vehículo
     * @return true si la transacción fue exitosa, false en caso contrario
     */
    public boolean alquilarVehiculo(LocalDate fechaDevolucion, Cliente cliente) {
        Empleado usuarioActual = AppControllerSingleton.getInstance().getUsuarioActual();
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

    /**
     * Vende un vehículo a un cliente y registra la transacción.
     * 
     * @param cliente el cliente que compra el vehículo
     * @return true si la transacción fue exitosa, false en caso contrario
     */
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
