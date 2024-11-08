package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Concesionario {
    // Instancia única del Singleton
    private static Concesionario instancia;

    // Listas para almacenar empleados, administradores y vehículos
    private Collection<Empleado> empleados;
    private Collection<Administrador> administradores;
    private Collection<Vehiculo> vehiculos;
    private Collection<Transaccion> ventas;

    // Nuevas listas para vehículos vendidos y alquilados
    private Collection<Vehiculo> vehiculosVendidos;
    private Collection<Vehiculo> vehiculosAlquilados;

    private static final String NOMBRE = "TuCarroUQ";

    // Constructor privado para el patrón Singleton
    private Concesionario() {
        empleados = new LinkedList<>();
        administradores = new LinkedList<>();
        vehiculos = new LinkedList<>();
        ventas = new LinkedList<>();
        vehiculosVendidos = new LinkedList<>();
        vehiculosAlquilados = new LinkedList<>();
    }

    // Método para obtener la instancia única
    public static synchronized Concesionario getInstance() {
        if (instancia == null) {
            instancia = new Concesionario();
        }
        return instancia;
    }

    // Métodos getter y setter
    public Collection<Empleado> getEmpleados() {
        return empleados;
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

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
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

    public Collection<Vehiculo> getVehiculosVendidos() {
        return vehiculosVendidos;
    }

    public Collection<Vehiculo> getVehiculosAlquilados() {
        return vehiculosAlquilados;
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

    // Métodos para gestionar vehículos
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        vehiculos.add(vehiculo);
    }

    public void venderVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        if (vehiculos.remove(vehiculo)) {
            vehiculosVendidos.add(vehiculo);
        }
    }

    public void alquilarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        if (vehiculos.remove(vehiculo)) {
            vehiculosAlquilados.add(vehiculo);
        }
    }

    public void devolverVehiculoAlquilado(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        if (vehiculosAlquilados.remove(vehiculo)) {
            vehiculos.add(vehiculo);
        }
    }

    // Métodos para transacciones
    public void agregarTransaccion(Transaccion transaccion) {
        if (transaccion == null) {
            throw new IllegalArgumentException("La transacción no puede ser nula");
        }
        ventas.add(transaccion);
    }

    /**
     * Método que agrega ejemplos de Empleado y Administrador al concesionario.
     */
    public void agregarEjemplo() {
        // Crear un empleado de ejemplo
        Empleado empleadoEjemplo = new Empleado("Juan Pérez", "E001", "contrasenaEmpleado");
        agregarEmpleado(empleadoEjemplo);

        // Crear un administrador de ejemplo
        Administrador administradorEjemplo = new Administrador("Ana García", "A001", "contrasenaAdmin");
        agregarAdministrador(administradorEjemplo);
    }


    public void cambiarContraseña(String contrasenaNueva){
        
    }


}
