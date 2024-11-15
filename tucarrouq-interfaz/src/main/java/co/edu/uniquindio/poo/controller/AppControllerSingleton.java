package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Vehiculo;

public class AppControllerSingleton {

    private static AppControllerSingleton instance;
    private Vehiculo vehiculoSeleccionado;

    private AppControllerSingleton() {
        // Constructor privado para evitar instanciación externa
    }

    public static synchronized AppControllerSingleton getInstance() {
        if (instance == null) {
            instance = new AppControllerSingleton();
        }
        return instance;
    }

    public Vehiculo getVehiculoSeleccionado() {
        return vehiculoSeleccionado;
    }

    public void setVehiculoSeleccionado(Vehiculo vehiculoSeleccionado) {
        this.vehiculoSeleccionado = vehiculoSeleccionado;
    }
}
