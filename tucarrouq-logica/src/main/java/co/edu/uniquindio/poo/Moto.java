package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private double precioVenta, precioAlquiler;

    public Moto(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje, boolean nuevo,
                TipoDeCombustible combustible, TipoDeTransmision transmision, int kilometraje, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, kilometraje, nuevo, combustible, transmision, tipoDeVehiculo);
    }

    @Override
    public double calcularPrecioVenta() {
        throw new UnsupportedOperationException("Método 'calcularPrecioVenta' no implementado");
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        throw new UnsupportedOperationException("Método 'calcularPrecioAlquiler' no implementado");
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        if (precioVenta <= 0) {
            throw new IllegalArgumentException("El precio de venta debe ser mayor a 0");
        }
        this.precioVenta = precioVenta;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        if (precioAlquiler <= 0) {
            throw new IllegalArgumentException("El precio de alquiler debe ser mayor a 0");
        }
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return "Moto [precioVenta=" + precioVenta + ", precioAlquiler=" + precioAlquiler + "]";
    }
}
