package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.scene.control.Alert;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.App;
import java.util.Stack;

public class AppControllerSingleton {

    private static AppControllerSingleton instance;
    private Vehiculo vehiculoSeleccionado;
    private Empleado usuarioActual; // Almacena el usuario que ha iniciado sesión
    private Stack<String> sceneHistoryStack; // Pila para el historial de rutas FXML

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

    public void pushScene(String fxml) {
        if (!sceneHistoryStack.isEmpty() && sceneHistoryStack.peek().equals(fxml)) {
            // Evitar duplicar la misma escena consecutivamente
            return;
        }
        sceneHistoryStack.push(fxml);
    }

    public String popScene() {
        if (!sceneHistoryStack.isEmpty()) {
            return sceneHistoryStack.pop();
        }
        return null;
    }

    public boolean isSceneHistoryEmpty() {
        return sceneHistoryStack.isEmpty();
    }

    public void goBack() {
        if (sceneHistoryStack.size() > 1) {
            // Eliminar la escena actual del stack
            sceneHistoryStack.pop();
            // Obtener la escena anterior
            String previousScene = sceneHistoryStack.peek();

            // Cargar la escena anterior
            App.loadScene(previousScene, 630, 450); // Ajusta el tamaño según tu necesidad
        } else {
            // Si no hay más escenas en el stack, muestra un mensaje o no hace nada
            App.showAlert("Navegación", "No hay más vistas a las que retroceder.", Alert.AlertType.INFORMATION);
        }
    }

}
