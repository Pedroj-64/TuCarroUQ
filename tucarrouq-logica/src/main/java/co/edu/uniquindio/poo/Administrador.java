package co.edu.uniquindio.poo;

import java.util.Collection;

/**
 * Clase que representa un administrador.
 * Hereda de la clase Empleado y añade métodos específicos para la gestión de
 * empleados y reportes.
 */
public class Administrador extends Empleado {
    /**
     * Constructor de la clase Administrador.
     * Inicializa los atributos heredados de la clase Empleado.
     * 
     * @param nombre              El nombre del administrador.
     * @param identificacion      La identificación del administrador.
     * @param contrasena          La contraseña del administrador.
     * @param emailDeRecuperacion El email de recuperación del administrador.
     * @throws IllegalArgumentException si alguno de los parámetros es nulo.
     */
    public Administrador(String nombre, String identificacion, String contrasena, String emailDeRecuperacion) {
        super(nombre, identificacion, contrasena, emailDeRecuperacion);
    }

    /**
     * Método para registrar un nuevo empleado.
     * 
     * @param empleados     La colección de empleados.
     * @param nuevoEmpleado El nuevo empleado a registrar.
     * @throws IllegalArgumentException si la colección de empleados o el nuevo
     *                                  empleado son nulos.
     */
    public void registrarEmpleado(Collection<Empleado> empleados, Empleado nuevoEmpleado) {
        if (empleados == null) {
            throw new IllegalArgumentException("La colección de empleados no puede ser nula");
        }
        if (nuevoEmpleado == null) {
            throw new IllegalArgumentException("El nuevo empleado no puede ser nulo");
        }
        empleados.add(nuevoEmpleado);
    }

    /**
     * Método para bloquear un empleado (ejemplo de manejo de estado de cuenta).
     * 
     * @param empleado El empleado a bloquear.
     * @throws IllegalArgumentException si el empleado es nulo.
     */
    public void bloquearEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
        empleado.setContrasena(null); // Esto simula el bloqueo de la cuenta eliminando la contraseña
    }

    /**
     * Método para generar reportes de transacciones de los empleados.
     * 
     * @param empleados La colección de empleados.
     * @throws IllegalArgumentException si la colección de empleados es nula.
     */
    public void generarReporte(Collection<Empleado> empleados) {
        if (empleados == null) {
            throw new IllegalArgumentException("La colección de empleados no puede ser nula");
        }
        for (Empleado empleado : empleados) {
            System.out.println("Transacciones de " + empleado.getNombre() + ":");
            for (Transaccion transaccion : empleado.getTransacciones()) {
                System.out.println(transaccion);
            }
        }
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
