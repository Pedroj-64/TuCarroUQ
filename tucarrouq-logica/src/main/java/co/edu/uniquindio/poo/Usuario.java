package co.edu.uniquindio.poo;


/**
 * Clase abstracta que representa un usuario.
 * Implementa la interfaz Serializable para permitir la serialización de sus objetos.
 */
public abstract class Usuario {
    private String nombre;
    private String identificacion;
    private String contrasena;
    private String emailDeRecuperacion;

    /**
     * Constructor de la clase Usuario.
     * Inicializa los atributos nombre, identificacion, contrasena y emailDeRecuperacion.
     * 
     * @param nombre                El nombre del usuario.
     * @param identificacion        La identificación del usuario.
     * @param contrasena            La contraseña del usuario.
     * @param emailDeRecuperacion   El email de recuperación del usuario.
     * @throws IllegalArgumentException si alguno de los parámetros es nulo o si el email de recuperación no contiene un '@'.
     */
    public Usuario(String nombre, String identificacion, String contrasena, String emailDeRecuperacion) {
        if (nombre == null || identificacion == null || contrasena == null || emailDeRecuperacion == null) {
            throw new IllegalArgumentException("Los valores no pueden ser nulos");
        }
        if (!emailDeRecuperacion.contains("@")) {
            throw new IllegalArgumentException("El email de recuperación debe contener un '@'");
        }
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contrasena = contrasena;
        this.emailDeRecuperacion = emailDeRecuperacion;
    }

    /**
     * Método para autenticar al usuario.
     * 
     * @param identificacion La identificación del usuario.
     * @param contrasena     La contraseña del usuario.
     * @return true si la autenticación es exitosa, false en caso contrario.
     * @throws IllegalArgumentException si la identificación o la contraseña son nulas.
     */
    public boolean autenticar(String identificacion, String contrasena) {
        if (identificacion == null || contrasena == null) {
            throw new IllegalArgumentException("La identificación y la contraseña no pueden ser nulas");
        }
        return this.identificacion.equals(identificacion) && this.contrasena.equals(contrasena);
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

    public String getEmailDeRecuperacion() {
        return emailDeRecuperacion;
    }

    public void setEmailDeRecuperacion(String emailDeRecuperacion) {
        if (emailDeRecuperacion == null || !emailDeRecuperacion.contains("@")) {
            throw new IllegalArgumentException("El email de recuperación no puede ser nulo y debe contener un '@'");
        }
        this.emailDeRecuperacion = emailDeRecuperacion;
    }

    @Override
    public String toString() {
        return String.format(
            "Usuario:\n" +
            "--------\n" +
            "Nombre: %s\n" +
            "Identificación: %s\n" +
            "Contraseña: %s\n" +
            "Email de Recuperación: %s\n",
            nombre, identificacion, contrasena, emailDeRecuperacion
        );
    }
}
