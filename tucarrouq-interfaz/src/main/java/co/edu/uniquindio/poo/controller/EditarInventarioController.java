package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Controlador para gestionar las operaciones de edición del inventario de vehículos.
 */
public class EditarInventarioController {

    // Instancia del concesionario obtenida desde la clase App
    Concesionario concesionario = App.getConcesionario();

    /**
     * Obtiene una lista observable de vehículos del concesionario.
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

    /**
     * Elimina un vehículo del concesionario.
     * 
     * @param vehiculo el vehículo a eliminar
     */
    public void eliminarVehiculo(Vehiculo vehiculo) {
        concesionario.eliminarVehiculo(vehiculo);
    }

    /**
     * Guarda los cambios realizados en un vehículo existente.
     * 
     * @param matricula la matrícula del vehículo
     * @param precioAlquiler el nuevo precio de alquiler del vehículo
     * @param precioVenta el nuevo precio de venta del vehículo
     * @return true si los cambios se guardaron exitosamente, false en caso contrario
     */
    public boolean guardarCambiosVehiculo(String matricula, double precioAlquiler, double precioVenta) {
        boolean banderilla = false;
        try {
            Vehiculo vehiculo = concesionario.buscarVehiculoPorPlaca(matricula);
            if (vehiculo != null) {
                vehiculo.setPrecioAlquiler(precioAlquiler);
                vehiculo.setPrecioVenta(precioVenta);
                banderilla = true;
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al guardar los cambios del vehículo: " + e.getMessage(), e);
        }
        return banderilla;
    }

    /**
     * Método de ejemplo para guardar cambios de un vehículo (actualmente sin implementación).
     * 
     * @return false siempre, ya que no hay implementación
     */
    public boolean guardarCambiosVehiculo() {
        boolean banderilla = false;
        return banderilla;
    }

}
