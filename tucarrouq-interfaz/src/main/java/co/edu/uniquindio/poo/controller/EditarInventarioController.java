package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EditarInventarioController {

    Concesionario concesionario = App.getConcesionario();

    public ObservableList<Vehiculo> obtenerVehiculos(){
        if (concesionario == null) {
            throw new IllegalStateException("El concesionario no está inicializada.");
        }

        return FXCollections.observableArrayList(concesionario.getVehiculos());

    }

    public void elimarVehiculo(Vehiculo vehiculo){
        concesionario.eliminarVehiculo(vehiculo);
    }

    

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



    public boolean guardarCambiosVehiculo(){
        boolean banderilla=false;
        return banderilla;
    }
    
}
