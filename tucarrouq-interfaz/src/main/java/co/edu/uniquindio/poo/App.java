package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.Serializador.Serializador;
import co.edu.uniquindio.poo.controller.AppControllerSingleton;

import java.io.File;
import java.io.IOException;

public class App extends Application {
    private static final String ARCHIVO_SERIALIZACION = "concesionario.ser";

    private static Scene scene;
    private static Concesionario concesionario;
    private static HostServices hostServices;
    private static AppControllerSingleton appControllerSingleton = AppControllerSingleton.getInstance();

    @Override
    public void init() {
        // Cargar el estado del concesionario desde el archivo de serialización
        try {
            File archivo = new File(ARCHIVO_SERIALIZACION);
            if (archivo.exists()) {
                concesionario = Serializador.cargarEstado(ARCHIVO_SERIALIZACION);
                System.out.println("Estado del concesionario cargado exitosamente.");
            } else {
                concesionario = Concesionario.getInstance(); // Crear nueva instancia si no existe el archivo
                System.out.println("No se encontró el archivo de estado, se creó una nueva instancia del concesionario.");
            }
        } catch (IOException | ClassNotFoundException e) {
            concesionario = Concesionario.getInstance(); // Crear nueva instancia en caso de error
            System.out.println("No se pudo cargar el estado del concesionario, se creó una nueva instancia.");
        }
    }

    @Override
    public void start(Stage stage) {
       

        try {
            // Cargar la escena principal desde el archivo FXML
            scene = new Scene(loadFXML("MenuInicio"), 630, 450);
            stage.setScene(scene); // Establecer la escena en el escenario
            stage.show(); // Mostrar la escena
            appControllerSingleton.pushScene("menuInicio"); // Agregar la escena inicial al stack de historial
        } catch (IOException e) {
            showAlert("Error al cargar la interfaz", "No se pudo cargar el archivo FXML: " + e.getMessage(), AlertType.ERROR);
        }

        hostServices = getHostServices(); // Obtener servicios del host
    }

    @Override
    public void stop() {
        // Guardar el estado del concesionario antes de cerrar la aplicación
        try {
            Serializador.guardarEstado(concesionario, ARCHIVO_SERIALIZACION);
            System.out.println("Estado del concesionario guardado exitosamente.");
        } catch (IOException e) {
            showAlert("Error al guardar el estado", "No se pudo guardar el estado del concesionario: " + e.getMessage(),
                    AlertType.ERROR);
        }
    }

    public static void loadScene(String fxml, double width, double height) {
        try {
            Parent root = loadFXML(fxml);
            scene.setRoot(root);
            scene.getWindow().setWidth(width);
            scene.getWindow().setHeight(height);
    
            // Agregar la escena al historial
            appControllerSingleton.pushScene(fxml);
        } catch (IOException e) {
            showAlert("Error al cambiar la vista", "No se pudo cargar el archivo FXML: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }
    
    
    
    // Método privado para cargar el archivo FXML
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load(); // Cargar y devolver el nodo raíz del archivo FXML
    }

    // Método para mostrar alertas
    public static void showAlert(String title, String message, AlertType type) {
        Alert alert = new Alert(type); // Crear la alerta
        alert.setTitle(title); // Establecer el título de la alerta
        alert.setHeaderText(null); // No usar encabezado
        alert.setContentText(message); // Establecer el contenido del mensaje
        alert.showAndWait(); // Mostrar la alerta y esperar a que el usuario la cierre
    }

    // Método para mostrar una alerta y redirigir a una nueva escena al cerrar la alerta
    public static void showAlertAndRedirect(String title, String message, AlertType type, String fxml, double width,
                                            double height) {
        Alert alert = new Alert(type); // Crear la alerta
        alert.setTitle(title); // Establecer el título
        alert.setHeaderText(null); // Sin encabezado
        alert.setContentText(message); // Mensaje

        // Redirigir a una nueva escena al cerrar la alerta
        alert.setOnHidden(evt -> loadScene(fxml, width, height));
        alert.show(); // Mostrar la alerta
    }

    // Método para obtener la instancia del concesionario
    public static Concesionario getConcesionario() {
        return concesionario;
    }

    // Método para obtener la instancia de HostServices
    public static HostServices getHostServicesInstance() {
        return hostServices;
    }

    // Método para ir a la escena anterior en el historial
    public static void goBack() {
        appControllerSingleton.goBack();
    }

    public static void main(String[] args) {
        launch(); // Lanzar la aplicación JavaFX
    }
}
