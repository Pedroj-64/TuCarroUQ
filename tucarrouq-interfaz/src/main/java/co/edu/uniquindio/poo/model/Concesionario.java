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
    /**
     * Obtiene la colección de empleados.
     * 
     * @return la colección de empleados.
     */
    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Establece la colección de empleados.
     * 
     * @param empleados la nueva colección de empleados.
     * @throws IllegalArgumentException si la colección de empleados es nula.
     */
    public void setEmpleados(Collection<Empleado> empleados) {
        if (empleados == null) {
            throw new IllegalArgumentException("La colección de empleados no puede ser nula");
        }
        this.empleados = empleados;
    }

    /**
     * Obtiene la colección de administradores.
     * 
     * @return la colección de administradores.
     */
    public Collection<Administrador> getAdministradores() {
        return administradores;
    }

    /**
     * Establece la colección de administradores.
     * 
     * @param administradores la nueva colección de administradores.
     * @throws IllegalArgumentException si la colección de administradores es nula.
     */
    public void setAdministradores(Collection<Administrador> administradores) {
        if (administradores == null) {
            throw new IllegalArgumentException("La colección de administradores no puede ser nula");
        }
        this.administradores = administradores;
    }

    /**
     * Obtiene la colección de vehículos.
     * 
     * @return la colección de vehículos.
     */
    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Establece la colección de vehículos.
     * 
     * @param vehiculos la nueva colección de vehículos.
     * @throws IllegalArgumentException si la colección de vehículos es nula.
     */
    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        if (vehiculos == null) {
            throw new IllegalArgumentException("La colección de vehículos no puede ser nula");
        }
        this.vehiculos = vehiculos;
    }

    /**
     * Obtiene la colección de ventas.
     * 
     * @return la colección de ventas.
     */
    public Collection<Transaccion> getVentas() {
        return ventas;
    }

    /**
     * Establece la colección de ventas.
     * 
     * @param ventas la nueva colección de ventas.
     * @throws IllegalArgumentException si la colección de ventas es nula.
     */
    public void setVentas(Collection<Transaccion> ventas) {
        if (ventas == null) {
            throw new IllegalArgumentException("La colección de ventas no puede ser nula");
        }
        this.ventas = ventas;
    }

    /**
     * Obtiene el nombre.
     * 
     * @return el nombre.
     */
    public static String getNombre() {
        return NOMBRE;
    }

    /**
     * Obtiene el serialVersionUID.
     * 
     * @return el serialVersionUID.
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Establece la colección de vehículos vendidos.
     * 
     * @param vehiculosVendidos la nueva colección de vehículos vendidos.
     */
    public void setVehiculosVendidos(Collection<Vehiculo> vehiculosVendidos) {
        this.vehiculosVendidos = vehiculosVendidos;
    }

    /**
     * Establece la colección de vehículos alquilados.
     * 
     * @param vehiculosAlquilados la nueva colección de vehículos alquilados.
     */
    public void setVehiculosAlquilados(Collection<Vehiculo> vehiculosAlquilados) {
        this.vehiculosAlquilados = vehiculosAlquilados;
    }

    /**
     * Obtiene la colección de clientes.
     * 
     * @return la colección de clientes.
     */
    public Collection<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Establece la colección de clientes.
     * 
     * @param clientes la nueva colección de clientes.
     */
    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Comprueba si existe un empleado con la identificación dada.
     * 
     * @param identificacion la identificación del empleado.
     * @return true si existe un empleado con la identificación dada, false en caso
     *         contrario.
     * @throws IllegalArgumentException si la identificación es nula.
     */
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

    /**
     * Agrega un empleado a la colección de empleados.
     * 
     * @param empleado el empleado a agregar.
     * @throws IllegalArgumentException si el empleado es nulo.
     */
    public void agregarEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
        if (!existeEmpleado(empleado.getIdentificacion())) {
            empleados.add(empleado);
        }
    }

    /**
     * Comprueba si existe un administrador con la identificación dada.
     * 
     * @param identificacion la identificación del administrador.
     * @return true si existe un administrador con la identificación dada, false en
     *         caso contrario.
     * @throws IllegalArgumentException si la identificación es nula.
     */
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

    /**
     * Agrega un administrador a la colección de administradores.
     * 
     * @param administrador el administrador a agregar.
     * @throws IllegalArgumentException si el administrador es nulo.
     */
    public void agregarAdministrador(Administrador administrador) {
        if (administrador == null) {
            throw new IllegalArgumentException("El administrador no puede ser nulo");
        }
        if (!existeAdministrador(administrador.getIdentificacion())) {
            administradores.add(administrador);
            empleados.add(administrador);
        }
    }

    /**
     * Agrega un vehículo a la colección de vehículos.
     * 
     * @param vehiculo el vehículo a agregar.
     * @throws IllegalArgumentException si el vehículo es nulo.
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        vehiculos.add(vehiculo);
    }

    /**
     * Vende un vehículo, moviéndolo de la colección de vehículos a la colección de
     * vehículos vendidos.
     * 
     * @param vehiculo el vehículo a vender.
     * @throws IllegalArgumentException si el vehículo es nulo.
     */
    public void venderVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        if (vehiculos.remove(vehiculo)) {
            vehiculosVendidos.add(vehiculo);
        }
    }

    /**
     * Alquila un vehículo, moviéndolo de la colección de vehículos a la colección
     * de vehículos alquilados.
     * 
     * @param vehiculo el vehículo a alquilar.
     * @throws IllegalArgumentException si el vehículo es nulo.
     */
    public void alquilarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        if (vehiculos.remove(vehiculo)) {
            vehiculosAlquilados.add(vehiculo);
        }
    }

    /**
     * Devuelve un vehículo alquilado, moviéndolo de la colección de vehículos
     * alquilados a la colección de vehículos.
     * 
     * @param vehiculo el vehículo a devolver.
     * @throws IllegalArgumentException si el vehículo es nulo.
     */
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
        Empleado empleadoEjemplo = new Empleado("123", "123", "123", "123@gmail.com");
        agregarEmpleado(empleadoEjemplo);

        // Crear un administrador de ejemplo
        Administrador administradorEjemplo = new Administrador("1234", "1234", "1234", "pj245668@gmail.com");
        agregarAdministrador(administradorEjemplo);

        // Crear un vehículo híbrido de ejemplo
        VehiculoHibrido vehiculoHibrido = new VanHibrido("Maseratti", "900", "NOMBRE", 0, 120, true, 5600, 69, 450,
                false, true, true, 5, 4, 3, 6, false, true, false, true);
        agregarVehiculo(vehiculoHibrido);

        // Crear un cliente de ejemplo
        Cliente cliente1 = new Cliente("Juan Pérez", "1234567890", "555-1234", "Calle Ficticia 123");
        agregarCliente(cliente1);
    }

    /**
     * Busca un empleado por su identificación.
     * 
     * @param identificacion La identificación del empleado.
     * @return El empleado encontrado, o null si no se encuentra.
     * @throws IllegalArgumentException si la identificación es nula.
     */
    public Empleado buscarEmpleado(String identificacion) {
        Empleado empleadoBuscado = null;
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                empleadoBuscado = empleado;
                break; // Termina el ciclo una vez encontrado el empleado
            }
        }
        return empleadoBuscado;
    }

    /**
     * Obtiene un empleado por su identificación.
     * 
     * @param identificacion La identificación del empleado.
     * @return El empleado encontrado.
     * @throws IllegalArgumentException si no se encuentra el empleado con la
     *                                  identificación proporcionada.
     */
    public Empleado obtenerEmpleado(String identificacion) {
        Empleado empleado = buscarEmpleado(identificacion);
        if (empleado == null) {
            throw new IllegalArgumentException("No se encontró el empleado con la identificación proporcionada");
        }
        return empleado;
    }

    /**
     * Busca un administrador por su identificación.
     * 
     * @param identificacion La identificación del administrador.
     * @return El administrador encontrado, o null si no se encuentra.
     * @throws IllegalArgumentException si la identificación es nula.
     */
    public Administrador buscarAdministrador(String identificacion) {
        Administrador administradorBuscado = null;
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        for (Administrador administrador : administradores) {
            if (administrador.getIdentificacion().equals(identificacion)) {
                administradorBuscado = administrador;
            }
        }
        return administradorBuscado;
    }

    /**
     * Obtiene un administrador por su identificación.
     * 
     * @param identificacion La identificación del administrador.
     * @return El administrador encontrado.
     * @throws IllegalArgumentException si no se encuentra el administrador con la
     *                                  identificación proporcionada.
     */
    public Administrador obtenerAdministrador(String identificacion) {
        Administrador administrador = buscarAdministrador(identificacion);
        if (administrador == null) {
            throw new IllegalArgumentException("No se encontró el administrador con la identificación proporcionada");
        }
        return administrador;
    }

    /**
     * Elimina un vehículo de la colección de vehículos.
     * 
     * @param vehiculo El vehículo a eliminar.
     * @throws IllegalArgumentException si el vehículo es nulo.
     * @throws IllegalStateException    si la colección de vehículos es nula.
     */
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
     * @throws NoSuchElementException   si no se encuentra un vehículo con la placa
     *                                  especificada.
     * @throws IllegalArgumentException si la placa es nula o vacía.
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

    /**
     * Comprueba si existe un cliente con la identificación dada.
     * 
     * @param identificacion La identificación del cliente.
     * @return true si existe un cliente con la identificación dada, false en caso
     *         contrario.
     * @throws IllegalArgumentException si la identificación es nula.
     */
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

    /**
     * Elimina un cliente por su identificación.
     * 
     * @param identificacion La identificación del cliente a eliminar.
     * @throws IllegalArgumentException si el cliente no existe.
     */
    public void eliminarCliente(String identificacion) {
        Cliente cliente = obtenerCliente(identificacion);
        if (cliente != null) {
            clientes.remove(cliente);
        } else {
            throw new IllegalArgumentException("El cliente no existe");
        }
    }

    /**
     * Actualiza la información de un cliente.
     * 
     * @param identificacion La identificación del cliente a actualizar.
     * @param nombre         El nuevo nombre del cliente.
     * @param telefono       El nuevo teléfono del cliente.
     * @param direccion      La nueva dirección del cliente.
     * @throws IllegalArgumentException si el cliente no existe.
     */
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

    /**
     * Actualiza la información de un empleado.
     * 
     * @param nombre              El nuevo nombre del empleado.
     * @param identificacion      La identificación del empleado.
     * @param contrasena          La nueva contraseña del empleado.
     * @param emailDeRecuperacion El nuevo email de recuperación del empleado.
     * @throws IllegalArgumentException si el empleado no existe.
     */
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

    /**
     * Obtiene un cliente por su identificación.
     * 
     * @param identificacion La identificación del cliente.
     * @return El cliente encontrado.
     */
    public Cliente obtenerCliente(String identificacion) {
        Cliente clienteBuscado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                clienteBuscado = cliente;
            }
        }
        return clienteBuscado;
    }

    /**
     * Agrega un cliente a la colección de clientes.
     * 
     * @param cliente el cliente a agregar.
     * @throws IllegalArgumentException si el cliente es nulo o si ya existe un
     *                                  cliente con la misma identificación.
     */
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

    /**
     * Elimina un empleado por su identificación.
     * 
     * @param identificacion la identificación del empleado a eliminar.
     * @throws IllegalArgumentException si la identificación es nula.
     */
    public void eliminarEmpleado(String identificacion) {
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificación no puede ser nula");
        }
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                empleados.remove(empleado);
                break;
            }
        }
    }

    /**
     * Calcula el precio de una transacción de préstamo.
     * 
     * @param detalleTransaccion el detalle de la transacción.
     * @param vehiculo           el vehículo asociado a la transacción.
     * @throws IllegalArgumentException si el número de días de préstamo es menor o
     *                                  igual a 0.
     */
    public void calcularPrecioTransaccionPrestamo(DetalleTransaccion detalleTransaccion, Vehiculo vehiculo) {
        if (detalleTransaccion.getDiasPrestamo() <= 0) {
            throw new IllegalArgumentException("El número de días debe ser mayor a 0");
        }
        double precioFinal = detalleTransaccion.getDiasPrestamo() * vehiculo.getPrecioAlquilerPorDia();
        vehiculo.setPrecioAlquiler(precioFinal);
    }

    /**
     * Crea una nueva transacción.
     * 
     * @param cliente  el cliente asociado a la transacción.
     * @param empleado el empleado que realiza la transacción.
     * @return la transacción creada o una transacción existente si ya existe.
     * @throws IllegalArgumentException si el cliente o el empleado son nulos.
     */
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

    /**
     * Busca una transacción por el cliente asociado.
     * 
     * @param cliente el cliente asociado a la transacción.
     * @return la transacción encontrada o null si no se encuentra.
     */
    private Transaccion buscarTransaccionPorCliente(Cliente cliente) {
        Transaccion transaccionBuscada = null;
        for (Transaccion transaccion : ventas) {
            if (transaccion.getCliente().equals(cliente)) {
                transaccionBuscada = transaccion;
            }
        }
        return transaccionBuscada;
    }

    /**
     * Agrega un detalle a una transacción y gestiona el vehículo (vender o
     * alquilar).
     * 
     * @param transaccion la transacción a la que se agregará el detalle.
     * @param detalle     el detalle de la transacción.
     * @param esAlquiler  indica si la transacción es de alquiler.
     * @throws IllegalArgumentException si la transacción, el detalle o el vehículo
     *                                  son nulos.
     */
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

    /**
     * Genera un reporte de transacciones para un empleado en una fecha específica.
     * 
     * @param fechaDeseada la fecha de las transacciones a incluir en el reporte.
     * @param empleado     el empleado cuyas transacciones se incluirán en el
     *                     reporte.
     * @return el reporte generado.
     * @throws IllegalArgumentException si la fecha o el empleado son nulos.
     */
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