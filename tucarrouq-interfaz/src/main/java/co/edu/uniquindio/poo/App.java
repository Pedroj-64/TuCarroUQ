package co.edu.uniquindio.poo;

import java.io.IOException;
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

public class App extends Application {
    private static final String ARCHIVO_SERIALIZACION = "concesionario.ser";

    private static Scene scene; 
    private static Concesionario concesionario;
    private static HostServices hostServices;

    @Override
    public void init() {
        // Cargar el estado de Concesionario
        try {
            concesionario = Serializador.cargarEstado(ARCHIVO_SERIALIZACION);
            System.out.println("Estado del concesionario cargado exitosamente.");
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
            showAlert("Error al guardar el estado", "No se pudo guardar el estado del concesionario: " + e.getMessage(), AlertType.ERROR);
        }
    }

    public static void loadScene(String fxml, double width, double height) {
        try {
            scene.setRoot(loadFXML(fxml)); // Establece el nuevo contenido de la escena
            scene.getWindow().setWidth(width); // Ajusta el ancho de la ventana
            scene.getWindow().setHeight(height); // Ajusta el alto de la ventana
        } catch (IOException e) {
            showAlert("Error al cambiar la vista", "No se pudo cargar el archivo FXML: " + e.getMessage(), AlertType.ERROR);
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load(); // Carga el archivo FXML y retorna el elemento raíz
    }

    public static void showAlert(String title, String message, AlertType type) {
        Alert alert = new Alert(type); // Crea una nueva alerta del tipo especificado
        alert.setTitle(title); // Establece el título de la alerta
        alert.setHeaderText(null); // Establece que no hay texto de cabecera
        alert.setContentText(message); // Establece el mensaje de la alerta
        alert.showAndWait(); // Muestra la alerta y espera a que el usuario la cierre
    }

    public static Concesionario getConcesionario() {
        return concesionario;
    }

    public static HostServices getHostServicesInstance() {
        return hostServices;
    }

    public static void main(String[] args) {
        launch(); // Lanza la aplicación JavaFX
    }
}
