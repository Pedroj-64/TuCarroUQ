package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;

/**
 * Sample Skeleton for 'intro.fxml' Controller Class
 */

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class IntroViewController {

    @FXML // fx:id="img_intro"
    private ImageView img_intro; // Value injected by FXMLLoader

    @FXML
    public void initialize() {
        // Crear un nuevo hilo para esperar 5 segundos antes de cambiar la interfaz
        new Thread(() -> {
            try {
                // Esperar 5 segundos (5000 milisegundos)
                Thread.sleep(5000);

                // Asegurarse de que el cambio de interfaz ocurra en el hilo JavaFX
                Platform.runLater(() -> {
                    // Usar el método estático de App para cargar la nueva escena
                    App.loadScene("menuInicio", 600, 430); // Ajusta el tamaño según sea necesario
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
