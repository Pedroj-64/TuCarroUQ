package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Concesionario {
    // Listas para almacenar empleados, administradores y vehículos
    private Collection<Empleado> empleados;
    private Collection<Administrador> administradores;
    private Collection<Vehiculo> vehiculos;
    private Collection<Transaccion> ventas;
    private static final String NOMBRE = "TuCarroUQ";

    // Constructor
    public Concesionario() {
        empleados = new LinkedList<>();
        administradores = new LinkedList<>();
        vehiculos = new LinkedList<>();
        ventas = new LinkedList<>();
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        if (empleados == null) {
            throw new IllegalArgumentException("La colección de empleados no puede ser nula");
        }
        this.empleados = empleados;
    }

    public Collection<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(Collection<Administrador> administradores) {
        if (administradores == null) {
            throw new IllegalArgumentException("La colección de administradores no puede ser nula");
        }
        this.administradores = administradores;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        if (vehiculos == null) {
            throw new IllegalArgumentException("La colección de vehículos no puede ser nula");
        }
        this.vehiculos = vehiculos;
    }

    public Collection<Transaccion> getVentas() {
        return ventas;
    }

    public void setVentas(Collection<Transaccion> ventas) {
        if (ventas == null) {
            throw new IllegalArgumentException("La colección de ventas no puede ser nula");
        }
        this.ventas = ventas;
    }

    public static String getNombre() {
        return NOMBRE;
    }

    // Métodos para agregar empleados, administradores y vehículos
    public boolean existeEmpleado(String identificacion) {
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                return true;
            }
        }
        return false;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
        if (!existeEmpleado(empleado.getIdentificacion())) {
            empleados.add(empleado);
        }
    }

    public boolean existeAdministrador(String identificacion) {
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        for (Administrador administrador : administradores) {
            if (administrador.getIdentificacion().equals(identificacion)) {
                return true;
            }
        }
        return false;
    }

    public void agregarAdministrador(Administrador administrador) {
        if (administrador == null) {
            throw new IllegalArgumentException("El administrador no puede ser nulo");
        }
        if (!existeAdministrador(administrador.getIdentificacion())) {
            administradores.add(administrador);
        }
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        vehiculos.add(vehiculo);
    }

    public void agregarTransaccion(Transaccion transaccion) {
        if (transaccion == null) {
            throw new IllegalArgumentException("La transacción no puede ser nula");
        }
        ventas.add(transaccion);
    }
}

