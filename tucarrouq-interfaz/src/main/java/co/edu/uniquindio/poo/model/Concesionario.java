package co.edu.uniquindio.poo.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Concesionario implements Serializable {
    // Instancia única del Singleton
    private static Concesionario instancia;
    private static final long serialVersionUID = 1L;

    // Listas para almacenar empleados, administradores y vehículos
    private Collection<Empleado> empleados;
    private Collection<Administrador> administradores;
    private Collection<Vehiculo> vehiculos;
    private Collection<Transaccion> ventas;
    private Collection<Cliente> clientes;

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
        clientes = new LinkedList<>();
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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public void setVehiculosVendidos(Collection<Vehiculo> vehiculosVendidos) {
        this.vehiculosVendidos = vehiculosVendidos;
    }

    public void setVehiculosAlquilados(Collection<Vehiculo> vehiculosAlquilados) {
        this.vehiculosAlquilados = vehiculosAlquilados;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    // Métodos para agregar empleados, administradores y vehículos
    public boolean existeEmpleado(String identificacion) {
        boolean banderilla = false;
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                banderilla = true;
            }
        }
        return banderilla;
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
        boolean banderilla = false;
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        for (Administrador administrador : administradores) {
            if (administrador.getIdentificacion().equals(identificacion)) {
                banderilla = true;
            }
        }
        return banderilla;
    }

    public void agregarAdministrador(Administrador administrador) {
        if (administrador == null) {
            throw new IllegalArgumentException("El administrador no puede ser nulo");
        }
        if (!existeAdministrador(administrador.getIdentificacion())) {
            administradores.add(administrador);
            empleados.add(administrador);
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

    /**
     * Método que agrega ejemplos de Empleado y Administrador al concesionario.
     */
    public void agregarEjemplo() {
        // Crear un empleado de ejemplo
        Empleado empleadoEjemplo = new Empleado("Juan Pérez", "E001", "contrasenaEmpleado", "hola@gmail.com");
        agregarEmpleado(empleadoEjemplo);

        // Crear un administrador de ejemplo
        Administrador administradorEjemplo = new Administrador("Ana García", "A001", "contrasenaAdmin",
                "hola@gmail.com");
        agregarAdministrador(administradorEjemplo);
    }

    // Método para buscar un empleado por identificación
    public Empleado buscarEmpleado(String identificacion) {
        Empleado empleadoBuscado = null;
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                empleado = empleadoBuscado;
            }
        }
        return empleadoBuscado; // Retorna null si no se encuentra el empleado
    }

    // Método para obtener un empleado por identificación
    public Empleado obtenerEmpleado(String identificacion) {
        Empleado empleado = buscarEmpleado(identificacion);
        if (empleado == null) {
            throw new IllegalArgumentException("No se encontró el empleado con la identificación proporcionada");
        }
        return empleado;
    }

    // Método para buscar un administrador por identificación
    public Administrador buscarAdministrador(String identificacion) {
        Administrador administradorBuscado = null;
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        for (Administrador administrador : administradores) {
            if (administrador.getIdentificacion().equals(identificacion)) {
                administrador = administradorBuscado;
            }
        }
        return administradorBuscado;
    }

    // Método para obtener un administrador por identificación
    public Administrador obtenerAdministrador(String identificacion) {
        Administrador administrador = buscarAdministrador(identificacion);
        if (administrador == null) {
            throw new IllegalArgumentException("No se encontró el administrador con la identificación proporcionada");
        }
        return administrador;
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo proporcionado no puede ser nulo");
        }
        if (vehiculos == null) {
            throw new IllegalStateException("La colección de vehículos no puede ser nula");
        }

        boolean encontrado = false;

        try {
            for (Vehiculo vehiculo1 : vehiculos) {
                if (vehiculo.equals(vehiculo1)) {
                    vehiculos.remove(vehiculo1);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                throw new IllegalArgumentException("El vehículo no se encontró en la colección");
            }
        } catch (Exception e) {
            throw new RuntimeException("Ocurrió un error al intentar eliminar el vehículo: " + e.getMessage(), e);
        }
    }

    /**
     * Busca un vehículo por su placa.
     * 
     * @param placa La placa del vehículo a buscar.
     * @return El vehículo encontrado.
     * @throws NoSuchElementException si no se encuentra un vehículo con la placa
     *                                especificada.
     */
    public Vehiculo buscarVehiculoPorPlaca(String placa) throws NoSuchElementException {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("La placa no puede ser nula o vacía.");
        }
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo; // Retorna el vehículo encontrado
            }
        }
        throw new NoSuchElementException("No se encontró un vehículo con la placa: " + placa);
    }

    public boolean existeCliente(String identificacion) {
        boolean banderilla = false;
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                banderilla = true;
            }
        }
        return banderilla;
    }

    public void eliminarCliente(String identificacion) {
        Cliente cliente = obtenerCliente(identificacion);
        if (cliente != null) {
            clientes.remove(cliente);
        } else {
            throw new IllegalArgumentException("El cliente no existe");
        }
    }

    public void actualizarCliente(String identificacion, String nombre, String telefono, String direccion) {
        Cliente clienteExistente = obtenerCliente(identificacion);
        if (clienteExistente != null) {
            clienteExistente.setNombre(nombre);
            clienteExistente.setTelefono(telefono);
            clienteExistente.setDireccion(direccion);
        } else {
            throw new IllegalArgumentException("El cliente no existe");
        }
    }

    public void actualizarEmpleado(String nombre, String identificacion, String contrasena,
            String emailDeRecuperacion) {
        Empleado empleadoExistente = obtenerEmpleado(identificacion);
        if (empleadoExistente != null) {
            empleadoExistente.setNombre(nombre);
            empleadoExistente.setContrasena(contrasena);
            empleadoExistente.setEmailDeRecuperacion(emailDeRecuperacion);
        } else {
            throw new IllegalArgumentException("El empleado no existe");
        }
    }

    public Cliente obtenerCliente(String identificacion) {
        Cliente clienteBuscado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                clienteBuscado = cliente;
            }
        }
        return clienteBuscado;
    }

    public void agregarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo");
        }
        if (!existeCliente(cliente.getIdentificacion())) {
            clientes.add(cliente);
        } else {
            throw new IllegalArgumentException("El cliente con esa identificación ya existe");
        }
    }

    public void eliminarEmpleado(String identificacion) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                empleados.remove(empleado);
                break;
            }
        }
    }

    public void calcularPrecioTransaccionPrestamo(DetalleTransaccion detalleTransaccion, Vehiculo vehiculo) {
        if (detalleTransaccion.getDiasPrestamo() <= 0) {
            throw new IllegalArgumentException("El número de días debe ser mayor a 0");
        }
        double precioFinal = detalleTransaccion.getDiasPrestamo() * vehiculo.getPrecioAlquilerPorDia();
        vehiculo.setPrecioAlquiler(precioFinal);
    }

    public Transaccion crearTransaccion(Cliente cliente, Empleado empleado) {
        if (cliente == null || empleado == null) {
            throw new IllegalArgumentException("Cliente o Empleado no pueden ser nulos");
        }
        Transaccion transaccionExistente = buscarTransaccionPorCliente(cliente);
        if (transaccionExistente != null) {
            return transaccionExistente;
        } else {
            Transaccion nuevaTransaccion = new Transaccion(cliente, empleado);
            ventas.add(nuevaTransaccion);
            return nuevaTransaccion;
        }
    }

    private Transaccion buscarTransaccionPorCliente(Cliente cliente) {
        Transaccion transaccionBuscada = null;
        for (Transaccion transaccion : ventas) {
            if (transaccion.getCliente().equals(cliente)) {
                transaccionBuscada = transaccion;
            }
        }
        return transaccionBuscada;
    }

    public void agregarDetalleATransaccion(Transaccion transaccion, DetalleTransaccion detalle, boolean esAlquiler) {
        if (transaccion == null || detalle == null || detalle.getVehiculo() == null) {
            throw new IllegalArgumentException("Transacción, Detalle o Vehículo no pueden ser nulos");
        }
        detalle.calcularSubtotal();
        transaccion.agregarDetallesTransaccion(detalle);
        transaccion.calcularTotal();
        // Gestionar el vehículo (vender o alquilar)
        if (esAlquiler) {
            alquilarVehiculo(detalle.getVehiculo());
        } else {
            venderVehiculo(detalle.getVehiculo());
        }
    }

    public String generarReportePorFechaEmpleado(LocalDate fechaDeseada, Empleado empleado) {
    if (fechaDeseada == null) {
        throw new IllegalArgumentException("La fecha deseada no puede ser nula.");
    }
    if (empleado == null) {
        throw new IllegalArgumentException("El empleado no puede ser nulo.");
    }

    Collection<Transaccion> transaccionesEmpleado = empleado.getTransacciones();

    Collection<Transaccion> transaccionesFiltradas = transaccionesEmpleado.stream()
            .filter(transaccion -> transaccion.getFechaTransaccion().toLocalDate().isEqual(fechaDeseada))
            .collect(Collectors.toList());

    if (transaccionesFiltradas.isEmpty()) {
        return String.format("No se encontraron transacciones para el empleado '%s' en la fecha %s.\n",
                empleado.getNombre(), fechaDeseada);
    }

    StringBuilder reporte = new StringBuilder();
    reporte.append("-------------------------------------------------\n");
    reporte.append(String.format("Reporte de Transacciones para el empleado '%s'\n", empleado.getNombre()));
    reporte.append(String.format("Fecha: %s\n", fechaDeseada));
    reporte.append("-------------------------------------------------\n");

    for (Transaccion transaccion : transaccionesFiltradas) {
        reporte.append(transaccion.toString()).append("\n");
    }

    reporte.append("-------------------------------------------------\n");
    reporte.append(String.format("Total de transacciones encontradas: %d\n", transaccionesFiltradas.size()));

    return reporte.toString();
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("*******************************\n");
        sb.append("**          TuCarroUQ        **\n");
        sb.append("*******************************\n");
        sb.append("Nombre: ").append(NOMBRE).append("\n\n");

        sb.append("Resumen de Empleados:\n");
        sb.append("Total Empleados: ").append(empleados.size()).append("\n");
        sb.append("Total Administradores: ").append(administradores.size()).append("\n\n");

        sb.append("Resumen de Vehículos:\n");
        sb.append("Total Vehículos Disponibles: ").append(vehiculos.size()).append("\n");
        sb.append("Total Vehículos Vendidos: ").append(vehiculosVendidos.size()).append("\n");
        sb.append("Total Vehículos Alquilados: ").append(vehiculosAlquilados.size()).append("\n\n");

        sb.append("Resumen de Clientes:\n");
        sb.append("Total Clientes Registrados: ").append(clientes.size()).append("\n\n");

        sb.append("Resumen de Transacciones:\n");
        sb.append("Total Ventas y Alquileres: ").append(ventas.size()).append("\n");
        sb.append("*******************************\n");
        return sb.toString();
    }

}