package co.edu.uniquindio.poo.model;

public abstract class Usuario {
    private String nombre;
    private String identificacion;
    private String contrasena;

    public Usuario(String nombre, String identificacion, String contrasena) {
        if (nombre == null || identificacion == null || contrasena == null) {
            throw new IllegalArgumentException("Los valores no pueden ser nulos");
        }
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contrasena = contrasena;
    }

    // Método para autenticar usuario
    public boolean autenticar(String identificacion, String contrasena) {
        if (identificacion == null || contrasena == null) {
            throw new IllegalArgumentException("La identificación y la contraseña no pueden ser nulas");
        }
        return this.identificacion.equals(identificacion) && this.contrasena.equals(contrasena);
    }

    // Método para recuperar contraseña mediante pregunta de seguridad
    public void recuperarContrasena(String respuesta) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        this.identificacion = identificacion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        if (contrasena == null) {
            throw new IllegalArgumentException("La contraseña no puede ser nula");
        }
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", identificacion=" + identificacion + ", contrasena=" + contrasena
                + ", preguntaSeguridad=" + ", respuestaSeguridad=" + "]";
    }
}
