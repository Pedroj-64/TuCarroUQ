package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DetalleTransaccion {
    private int diasPrestamo, cantidad;
    private LocalDate fechaActual = LocalDate.now();
    private LocalDate fechaEntregaPrestamo;
    private double subtotal;
    private boolean esAlquiler;
    private Vehiculo vehiculo;

    public DetalleTransaccion(boolean esAlquiler, Vehiculo vehiculo, int cantidad) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        
        this.cantidad = cantidad;
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

    public void calcularDiferenciaDias(LocalDate fechaActual, LocalDate fechaEntregaPrestamo) {
        if (fechaActual == null || fechaEntregaPrestamo == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas");
        }
        int dias = (int) ChronoUnit.DAYS.between(fechaActual, fechaEntregaPrestamo);
        setDiasPrestamo(dias);
    }

    public void calcularSubtotal() {
        if (!esAlquiler) {
            setSubtotal(vehiculo.getPrecioVenta());
        } else {
            setSubtotal(vehiculo.getPrecioAlquiler());
        }
    }

    @Override
    public String toString() {
        return "DetalleTransaccion [diasPrestamo=" + diasPrestamo + ", cantidad=" + cantidad + ", subtotal=" + subtotal
                + ", esAlquiler=" + esAlquiler + ", vehiculo=" + vehiculo + "]";
    }
}
