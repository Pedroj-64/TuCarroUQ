package co.edu.uniquindio.poo.model;

import java.io.Serializable;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Clase que representa una transacción.
 * Implementa la interfaz Serializable para permitir la serialización de sus objetos.
 */
public class Transaccion implements Serializable {
    private LocalDateTime fechaTransaccion = LocalDateTime.now();
    private double total = 0;
    private Collection<DetalleTransaccion> detallesTransaccion;
    private Cliente cliente;
    private Empleado empleado;
    private int id;

    /**
     * Constructor de la clase Transaccion.
     * Inicializa los atributos cliente, empleado, id y detallesTransaccion.
     * 
     * @param cliente   El cliente asociado a la transacción.
     * @param empleado  El empleado que realiza la transacción.
     * @throws IllegalArgumentException si cliente o empleado son nulos.
     */
    public Transaccion(Cliente cliente, Empleado empleado) {
        if (cliente == null || empleado == null) {
            throw new IllegalArgumentException("Cliente y Empleado no pueden ser nulos");
        }
        this.cliente = cliente;
        this.empleado = empleado;
        SecureRandom generadorID = new SecureRandom();
        this.id = generadorID.nextInt(99);
        this.detallesTransaccion = new LinkedList<>();
    }

    public LocalDateTime getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(LocalDateTime fechaTransaccion) {
        if (fechaTransaccion == null) {
            throw new IllegalArgumentException("La fecha de transacción no puede ser nula");
        }
        this.fechaTransaccion = fechaTransaccion;
    }

    public double getTotal() {
        return total;
    }

    private void setTotal(double total) {
        if (total < 0) {
            throw new IllegalArgumentException("El total no puede ser negativo");
        }
        this.total = total;
    }

    public Collection<DetalleTransaccion> getDetallesTransaccion() {
        return detallesTransaccion;
    }

    public void setDetallesTransaccion(Collection<DetalleTransaccion> detallesTransaccion) {
        if (detallesTransaccion == null) {
            throw new IllegalArgumentException("Detalles de transacción no pueden ser nulos");
        }
        this.detallesTransaccion = detallesTransaccion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente no puede ser nulo");
        }
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("Empleado no puede ser nulo");
        }
        this.empleado = empleado;
    }

    public int getId() {
        return id;
    }

    /**
     * Agrega un detalle de transacción a la colección de detalles.
     * 
     * @param transaccion El detalle de la transacción a agregar.
     * @throws IllegalArgumentException si el detalle de la transacción es nulo.
     */
    public void agregarDetallesTransaccion(DetalleTransaccion transaccion) {
        if (transaccion == null) {
            throw new IllegalArgumentException("La transacción no puede ser nula");
        }
        detallesTransaccion.add(transaccion);
        calcularTotal();
    }

    /**
     * Elimina un detalle de transacción de la colección de detalles.
     * 
     * @param transaccion El detalle de la transacción a eliminar.
     * @throws IllegalArgumentException si el detalle de la transacción es nulo.
     */
    public void eliminarDetallesTransaccion(DetalleTransaccion transaccion) {
        if (transaccion == null) {
            throw new IllegalArgumentException("La transacción no puede ser nula");
        }
        detallesTransaccion.remove(transaccion);
        calcularTotal();
    }

    /**
     * Calcula el total de la transacción sumando los subtotales de cada detalle de transacción.
     * 
     * @throws IllegalArgumentException si el subtotal de algún detalle es negativo.
     */
    public void calcularTotal() {
        total = 0;
        for (DetalleTransaccion transaccion : detallesTransaccion) {
            double subtotal = transaccion.getSubtotal();
            if (subtotal < 0) {
                throw new IllegalArgumentException("El subtotal no puede ser negativo");
            }
            total += subtotal;
        }
        setTotal(total);
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Fecha: %s | Total: %.2f | Cliente: %s | Empleado: %s\nDetalles: %s",
                id,
                fechaTransaccion,
                total,
                cliente.getNombre(),
                empleado.getNombre(),
                detallesTransaccion.toString());
    }
}
