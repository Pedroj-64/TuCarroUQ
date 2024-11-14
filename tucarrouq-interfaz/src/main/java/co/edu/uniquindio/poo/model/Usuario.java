package co.edu.uniquindio.poo.model;

public abstract class Usuario {
    private String nombre;
    private String identificacion;
    private String contrasena;
    private String emailDeRecuperacion;

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

    // Método para autenticar usuario
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
        return "Usuario [nombre=" + nombre + ", identificacion=" + identificacion + ", contrasena=" + contrasena
                + ", emailDeRecuperacion=" + emailDeRecuperacion + "]";
    }
}
