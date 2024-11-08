package co.edu.uniquindio.poo;

public interface Autenticable {
    boolean autenticar(String usuario, String contraseña);
    void recuperarClave(String preguntaSeguridad, String respuesta);
}
