package co.edu.uniquindio.poo.model;

import java.util.Collection;

public class Administrador extends Empleado {
    // Constructor
    public Administrador(String nombre, String identificacion, String contrasena) {
        super(nombre, identificacion, contrasena);
    }

    // Método para registrar empleados
    public void registrarEmpleado(Collection<Empleado> empleados, Empleado nuevoEmpleado) {
        if (empleados == null) {
            throw new IllegalArgumentException("La colección de empleados no puede ser nula");
        }
        if (nuevoEmpleado == null) {
            throw new IllegalArgumentException("El nuevo empleado no puede ser nulo");
        }
        empleados.add(nuevoEmpleado);
    }

    // Método para bloquear un empleado (ejemplo de manejo de estado de cuenta)
    public void bloquearEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
        empleado.setContrasena(null); // Esto simula el bloqueo de la cuenta eliminando la contraseña
    }

    // Método para generar reportes de transacciones de los empleados
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
        return "Administrador []";
    }
}
