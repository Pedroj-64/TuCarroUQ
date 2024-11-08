package co.edu.uniquindio.poo;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import co.edu.uniquindio.poo.model.Concesionario;

/**
 * Clase App es la central de cualquier programa JavaFX. En esta se utilizan varios métodos correspondientes
 * a la línea de vida de JavaFX como "start".
 */
public class App extends Application {
    private static Scene scene; // Escena principal de la aplicación

    // Instancia Singleton de Concesionario
    private static Concesionario concesionario;

    @SuppressWarnings("exports")
    @Override
    /**
     * Método start, fundamental en JavaFX, que inicializa todo al dar play a la aplicación.
     */
    public void start(Stage stage) {
        // Crear la instancia de Singleton de Concesionario
        concesionario = Concesionario.getInstance();
        concesionario.agregarEjemplo();

        try {
            scene = new Scene(loadFXML("menuInicio"), 630, 450);
            stage.setScene(scene); // Establece la escena en el escenario
            stage.show(); // Muestra la escena
        } catch (IOException e) {
            showAlert("Error al cargar la interfaz", "No se pudo cargar el archivo FXML: " + e.getMessage(), AlertType.ERROR);
        }
    }

    /**
     * Método que cambia la raíz de la escena a partir de cargar el archivo FXML correspondiente.
     * @param fxml Nombre del archivo FXML.
     * @param width Ancho de la ventana.
     * @param height Alto de la ventana.
     */
    public static void loadScene(String fxml, double width, double height) {
        try {
            scene.setRoot(loadFXML(fxml)); // Establece el nuevo contenido de la escena
            scene.getWindow().setWidth(width); // Ajusta el ancho de la ventana
            scene.getWindow().setHeight(height); // Ajusta el alto de la ventana
        } catch (IOException e) {
            showAlert("Error al cambiar la vista", "No se pudo cargar el archivo FXML: " + e.getMessage(), AlertType.ERROR);
        }
    }

    /**
     * Método auxiliar que ayuda a loadScene a cargar el archivo FXML.
     * @param fxml Nombre del archivo FXML.
     * @return El elemento raíz del archivo FXML cargado.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load(); // Carga el archivo FXML y retorna el elemento raíz
    }

    @SuppressWarnings("exports")
    /**
     * Método generalizado para mostrar alertas con Alert de JavaFX.
     * @param title Título de la alerta.
     * @param message Mensaje de la alerta.
     * @param type Tipo de alerta.
     */
    public static void showAlert(String title, String message, AlertType type) {
        Alert alert = new Alert(type); // Crea una nueva alerta del tipo especificado
        alert.setTitle(title); // Establece el título de la alerta
        alert.setHeaderText(null); // Establece que no hay texto de cabecera
        alert.setContentText(message); // Establece el mensaje de la alerta
        alert.showAndWait(); // Muestra la alerta y espera a que el usuario la cierre
    }

    /**
     * Método para obtener la instancia de Concesionario.
     * @return La instancia de Concesionario.
     */
    public static Concesionario getConcesionario() {
        return concesionario;
    }

    /**
     * Método main de la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        launch(); // Lanza la aplicación JavaFX
    }
}
