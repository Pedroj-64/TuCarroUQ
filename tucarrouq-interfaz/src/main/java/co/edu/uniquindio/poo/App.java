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

    @Override
    public void init() {
        // Cargar el estado de Concesionario
        try {
            File archivo = new File(ARCHIVO_SERIALIZACION);
            if (archivo.exists()) {
                concesionario = Serializador.cargarEstado(ARCHIVO_SERIALIZACION);
                System.out.println("Estado del concesionario cargado exitosamente.");
            } else {
                concesionario = Concesionario.getInstance();
                System.out.println("No se encontró el archivo de estado, se creó una nueva instancia del concesionario.");
            }
        } catch (IOException | ClassNotFoundException e) {
            concesionario = Concesionario.getInstance();
            System.out.println("No se pudo cargar el estado del concesionario, se creó una nueva instancia.");
        }
    }

    @Override
    public void start(Stage stage) {
        concesionario.agregarEjemplo(); // Agrega ejemplos al concesionario

        try {
            scene = new Scene(loadFXML("menuInicio"), 630, 450);
            stage.setScene(scene); // Establece la escena en el escenario
            stage.show(); // Muestra la escena
            AppControllerSingleton.getInstance().pushScene(scene); // Agrega la escena inicial al stack
        } catch (IOException e) {
            showAlert("Error al cargar la interfaz", "No se pudo cargar el archivo FXML: " + e.getMessage(), AlertType.ERROR);
        }

        hostServices = getHostServices();
    }

    @Override
    public void stop() {
        // Guardar el estado de Concesionario
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
            Parent root = loadFXML(fxml); // Cargar el archivo FXML
            scene.setRoot(root); // Cambiar el contenido de la escena actual
            scene.getWindow().setWidth(width); // Ajustar ancho
            scene.getWindow().setHeight(height); // Ajustar alto

            AppControllerSingleton.getInstance().pushScene(scene); // Agregar al stack
        } catch (IOException e) {
            showAlert("Error al cambiar la vista", "No se pudo cargar el archivo FXML: " + e.getMessage(), AlertType.ERROR);
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load(); // Cargar el archivo FXML y devolver el nodo raíz
    }

    public static void showAlert(String title, String message, AlertType type) {
        Alert alert = new Alert(type); // Crear alerta
        alert.setTitle(title); // Establecer título
        alert.setHeaderText(null); // Sin cabecera
        alert.setContentText(message); // Mensaje
        alert.showAndWait(); // Mostrar y esperar cierre
    }

    public static void showAlertAndRedirect(String title, String message, AlertType type, String fxml, double width,
                                            double height) {
        Alert alert = new Alert(type); // Crear alerta
        alert.setTitle(title); // Establecer título
        alert.setHeaderText(null); // Sin cabecera
        alert.setContentText(message); // Mensaje

        // Cambiar la vista al cerrar la alerta
        alert.setOnHidden(evt -> loadScene(fxml, width, height));
        alert.show(); // Mostrar alerta
    }

    public static Concesionario getConcesionario() {
        return concesionario;
    }

    public static HostServices getHostServicesInstance() {
        return hostServices;
    }

    public static void goBack() {
        AppControllerSingleton.getInstance().goBack();
    }
    

    public static void main(String[] args) {
        launch(); // Lanzar aplicación JavaFX
    }
}
