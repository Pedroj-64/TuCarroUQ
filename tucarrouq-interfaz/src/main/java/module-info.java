/**
 * Clase module el cual ayuda a que javafx y sus librerias puedan saber donde se
 * tienen
 * las interfaces y viewController
 */
module co.edu.uniquindio.poo {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires java.mail;
    requires java.activation;
    requires transitive javafx.graphics;
    requires javafx.base;
    

    opens co.edu.uniquindio.poo to javafx.fxml;

    exports co.edu.uniquindio.poo;

    opens co.edu.uniquindio.poo.controller to javafx.fxml;

    exports co.edu.uniquindio.poo.controller;

    opens co.edu.uniquindio.poo.viewController to javafx.fxml;

    exports co.edu.uniquindio.poo.viewController;

    opens co.edu.uniquindio.poo.model to javafx.fxml;

    exports co.edu.uniquindio.poo.model;

    opens co.edu.uniquindio.poo.Serializador to javafx.fxml;

    exports co.edu.uniquindio.poo.Serializador;

}
