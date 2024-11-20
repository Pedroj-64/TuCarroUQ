package co.edu.uniquindio.poo.model;

import java.io.Serializable;

/**
 * Clase que representa a un Cliente.
 * Implementa la interfaz Serializable para permitir la serialización de sus
 * objetos.
 */
public class Cliente implements Serializable {
    private String nombre;
    private String identificacion;
    private String telefono;
    private String direccion;

    /**
     * Constructor de la clase Cliente.
     * Inicializa todos los atributos del cliente.
     *
     * @param nombre         Nombre del cliente.
     * @param identificacion Identificación del cliente.
     * @param telefono       Teléfono del cliente.
     * @param direccion      Dirección del cliente.
     * @throws IllegalArgumentException si algún parámetro es nulo o está vacío.
     */
    public Cliente(String nombre, String identificacion, String telefono, String direccion) {
        if (nombre == null || identificacion == null || telefono == null || direccion == null) {
            throw new IllegalArgumentException("Los valores no pueden ser nulos");
        }
        if (nombre.isEmpty() || identificacion.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
            throw new IllegalArgumentException("Los valores no pueden estar vacíos");
        }

        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o estar vacío");
        }
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        if (identificacion == null || identificacion.isEmpty()) {
            throw new IllegalArgumentException("La identificación no puede ser nula o estar vacía");
        }
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede ser nulo o estar vacío");
        }
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede ser nula o estar vacía");
        }
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
