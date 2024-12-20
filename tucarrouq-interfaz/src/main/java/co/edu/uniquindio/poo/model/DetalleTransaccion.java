package co.edu.uniquindio.poo.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Clase que representa el detalle de una transacción.
 * Implementa la interfaz Serializable para permitir la serialización de sus objetos.
 */
public class DetalleTransaccion implements Serializable {
    private int diasPrestamo;
    private int cantidad = 1;
    private LocalDate fechaActual = LocalDate.now();
    private LocalDate fechaEntregaPrestamo;
    private double subtotal;
    private boolean esAlquiler;
    private Vehiculo vehiculo;

    /**
     * Constructor de la clase DetalleTransaccion.
     * Inicializa los atributos esAlquiler y vehiculo.
     * 
     * @param esAlquiler Indica si la transacción es de alquiler.
     * @param vehiculo   El vehículo asociado a la transacción.
     * @throws IllegalArgumentException si vehiculo es nulo o cantidad es menor o igual a 0.
     */
    public DetalleTransaccion(boolean esAlquiler, Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }

        this.esAlquiler = esAlquiler;
        this.vehiculo = vehiculo;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        if (diasPrestamo <= 0) {
            throw new IllegalArgumentException("Los días de préstamo deben ser mayores a 0");
        }
        this.diasPrestamo = diasPrestamo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        if (subtotal < 0) {
            throw new IllegalArgumentException("El subtotal no puede ser negativo");
        }
        this.subtotal = subtotal;
    }

    public boolean isEsAlquiler() {
        return esAlquiler;
    }

    public void setEsAlquiler(boolean esAlquiler) {
        this.esAlquiler = esAlquiler;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        if (fechaActual == null) {
            throw new IllegalArgumentException("La fecha actual no puede ser nula");
        }
        this.fechaActual = fechaActual;
    }

    public LocalDate getFechaEntregaPrestamo() {
        return fechaEntregaPrestamo;
    }

    public void setFechaEntregaPrestamo(LocalDate fechaEntregaPrestamo) {
        if (fechaEntregaPrestamo == null) {
            throw new IllegalArgumentException("La fecha de entrega del préstamo no puede ser nula");
        }
        this.fechaEntregaPrestamo = fechaEntregaPrestamo;
    }

    /**
     * Calcula la diferencia de días entre la fecha actual y la fecha de entrega del préstamo.
     * 
     * @param fechaEntregaPrestamo La fecha de entrega del préstamo.
     * @throws IllegalArgumentException si alguna de las fechas es nula.
     */
    public void calcularDiferenciaDias(LocalDate fechaEntregaPrestamo) {
        if (this.fechaActual == null || fechaEntregaPrestamo == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas");
        }
        int dias = (int) ChronoUnit.DAYS.between(this.fechaActual, fechaEntregaPrestamo);
        setDiasPrestamo(dias);
    }

    /**
     * Calcula el subtotal de la transacción basado en si es una venta o alquiler.
     */
    public void calcularSubtotal() {
        if (!esAlquiler) {
            setSubtotal(vehiculo.getPrecioVenta());
        } else {
            setSubtotal(vehiculo.getPrecioAlquilerPorDia());
        }
    }

    @Override
    public String toString() {
        return String.format(
            "Detalle de la Transacción:\n" +
            "------------------------\n" +
            "Días de Préstamo: %d\n" +
            "Cantidad: %d\n" +
            "Subtotal: %.2f\n" +
            "Es Alquiler: %b\n" +
            "Vehículo: %s\n",
            diasPrestamo, cantidad, subtotal, esAlquiler, vehiculo
        );
    }
}
