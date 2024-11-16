package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Empleado;

public class AppControllerSingleton {

    private static AppControllerSingleton instance;
    private Vehiculo vehiculoSeleccionado;
    private Empleado usuarioActual; // Almacena el usuario que ha iniciado sesión

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

    public Empleado getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Empleado usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public void cerrarSesion() {
        this.usuarioActual = null;
    }
}
