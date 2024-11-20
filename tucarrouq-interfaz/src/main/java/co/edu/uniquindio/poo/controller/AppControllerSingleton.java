package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.scene.control.Alert;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.App;
import java.util.Stack;

/**
 * Clase singleton que controla el estado de la aplicación y las transiciones de escenas.
 */
public class AppControllerSingleton {

    // Instancia estática del singleton
    private static AppControllerSingleton instance;
    
    // Almacena el vehículo seleccionado actualmente
    private Vehiculo vehiculoSeleccionado;
    
    // Almacena el usuario que ha iniciado sesión
    private Empleado usuarioActual;
    
    // Pila para almacenar el historial de rutas FXML
    private Stack<String> sceneHistoryStack;

    /**
     * Constructor privado para evitar la instanciación externa.
     * Inicializa la pila de historial de escenas.
     */
    private AppControllerSingleton() {
        sceneHistoryStack = new Stack<>();
    }

    /**
     * Devuelve la instancia singleton de AppControllerSingleton.
     * Sincronizado para garantizar la seguridad en hilos.
     * 
     * @return la instancia singleton de AppControllerSingleton
     */
    public static synchronized AppControllerSingleton getInstance() {
        if (instance == null) {
            instance = new AppControllerSingleton();
        }
        return instance;
    }

    /**
     * Obtiene el vehículo seleccionado actualmente.
     * 
     * @return el vehículo seleccionado
     */
    public Vehiculo getVehiculoSeleccionado() {
        return vehiculoSeleccionado;
    }

    /**
     * Establece el vehículo seleccionado actualmente.
     * 
     * @param vehiculoSeleccionado el vehículo a ser seleccionado
     */
    public void setVehiculoSeleccionado(Vehiculo vehiculoSeleccionado) {
        this.vehiculoSeleccionado = vehiculoSeleccionado;
    }

    /**
     * Obtiene el usuario que ha iniciado sesión.
     * 
     * @return el usuario actual
     */
    public Empleado getUsuarioActual() {
        return usuarioActual;
    }

    /**
     * Establece el usuario que ha iniciado sesión.
     * 
     * @param usuarioActual el usuario a ser establecido como actual
     */
    public void setUsuarioActual(Empleado usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    /**
     * Cierra la sesión del usuario actual, estableciendo el usuario a null.
     */
    public void cerrarSesion() {
        this.usuarioActual = null;
    }

    /**
     * Añade el archivo FXML especificado a la pila de historial de escenas.
     * Garantiza que la misma escena no se duplique consecutivamente.
     * 
     * @param fxml el archivo FXML a ser añadido a la pila
     */
    public void pushScene(String fxml) {
        if (!sceneHistoryStack.isEmpty() && sceneHistoryStack.peek().equals(fxml)) {
            // Evitar duplicar la misma escena consecutivamente
            return;
        }
        sceneHistoryStack.push(fxml);
    }

    /**
     * Elimina la escena más reciente de la pila de historial y la devuelve.
     * 
     * @return el archivo FXML más reciente, o null si la pila está vacía
     */
    public String popScene() {
        if (!sceneHistoryStack.isEmpty()) {
            return sceneHistoryStack.pop();
        }
        return null;
    }

    /**
     * Verifica si la pila de historial de escenas está vacía.
     * 
     * @return true si la pila está vacía, false en caso contrario
     */
    public boolean isSceneHistoryEmpty() {
        return sceneHistoryStack.isEmpty();
    }

    /**
     * Navega a la escena anterior en la pila de historial.
     * Si no hay escenas anteriores, se muestra una alerta informativa.
     */
    public void goBack() {
        if (sceneHistoryStack.size() > 1) {
            // Eliminar la escena actual del stack
            sceneHistoryStack.pop();
            // Obtener la escena anterior
            String previousScene = sceneHistoryStack.peek();

            // Cargar la escena anterior
            App.loadScene(previousScene, 630, 450); // Ajusta el tamaño según sea necesario
        } else {
            // Si no hay más escenas a las que retroceder, mostrar un mensaje
            App.showAlert("Navegación", "No hay más vistas a las que retroceder.", Alert.AlertType.INFORMATION);
        }
    }

}
