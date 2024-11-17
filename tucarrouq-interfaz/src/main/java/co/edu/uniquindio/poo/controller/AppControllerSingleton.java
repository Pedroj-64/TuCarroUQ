package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Stack;

public class AppControllerSingleton {

    private static AppControllerSingleton instance;
    private Vehiculo vehiculoSeleccionado;
    private Empleado usuarioActual; // Almacena el usuario que ha iniciado sesión
    private Stack<Scene> sceneHistoryStack; // Pila para el historial de navegación

    private AppControllerSingleton() {
        // Constructor privado para evitar instanciación externa
        sceneHistoryStack = new Stack<>();
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

    // Métodos para gestionar el historial de navegación
    public void pushScene(Scene scene) {
        sceneHistoryStack.push(scene);
    }

    public Scene popScene() {
        if (!sceneHistoryStack.isEmpty()) {
            return sceneHistoryStack.pop();
        }
        return null;
    }

    public boolean isSceneHistoryEmpty() {
        return sceneHistoryStack.isEmpty();
    }

    // Método para ir a la escena anterior
    public void goBack() {
        if (sceneHistoryStack.size() > 1) { // Verificar que haya más de una escena en el historial
            sceneHistoryStack.pop(); // Sacar la escena actual
            Scene previousScene = sceneHistoryStack.peek(); // Obtener la escena anterior

            if (previousScene != null) {
                // Cambiar a la escena anterior
                Stage stage = (Stage) previousScene.getWindow(); // Convertir la ventana en Stage
                stage.setScene(previousScene); // Establecer la escena previa
            }
        } else {
            System.out.println("No hay escenas anteriores en el historial.");
        }
    }

}
