package co.edu.uniquindio.poo.model;

import java.io.Serializable;

/**
 * Clase abstracta que representa un vehículo.
 * Implementa la interfaz Serializable para permitir la serialización de sus objetos.
 */
public abstract class Vehiculo implements Serializable {
    private String marca, referencia, placa;
    private int velocidadMaxima, kilometraje, modelo;
    private boolean nuevo;
    private double precioVenta, precioAlquilerPorDia, PrecioAlquiler;
    private boolean esTransmisionManual;

    /**
     * Constructor de la clase Vehiculo.
     * Inicializa todos los atributos del vehículo.
     * 
     * @param marca                 Marca del vehículo.
     * @param referencia            Referencia del vehículo.
     * @param placa                 Placa del vehículo.
     * @param kilometraje           Kilometraje del vehículo.
     * @param velocidadMaxima       Velocidad máxima del vehículo.
     * @param nuevo                 Indica si el vehículo es nuevo.
     * @param precioVenta           Precio de venta del vehículo.
     * @param precioAlquilerPorDia  Precio de alquiler por día del vehículo.
     * @param modelo                Modelo del vehículo.
     * @param esTransmisionManual   Indica si el vehículo tiene transmisión manual.
     * @throws IllegalArgumentException si alguno de los parámetros es inválido.
     */
    public Vehiculo(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima, boolean nuevo,
            double precioVenta, double precioAlquilerPorDia, int modelo, boolean esTransmisionManual) {
        if (marca == null || referencia == null) {
            throw new IllegalArgumentException("Los valores no pueden ser nulos");
        }
        if (velocidadMaxima <= 0 || kilometraje < 0 || precioVenta < 0 || precioAlquilerPorDia < 0) {
            throw new IllegalArgumentException("Valores inválidos para velocidad máxima, kilometraje o precios");
        }

        this.marca = marca;
        this.referencia = referencia;
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.velocidadMaxima = velocidadMaxima;
        this.nuevo = nuevo;
        this.precioVenta = precioVenta;
        this.precioAlquilerPorDia = precioAlquilerPorDia;
        this.modelo = modelo;
        this.esTransmisionManual = esTransmisionManual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null) {
            throw new IllegalArgumentException("La marca no puede ser nula");
        }
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        if (referencia == null) {
            throw new IllegalArgumentException("La referencia no puede ser nula");
        }
        this.referencia = referencia;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima <= 0) {
            throw new IllegalArgumentException("La velocidad máxima debe ser mayor a 0");
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public boolean getEsNuevo() {
        return nuevo;
    }

    public void setEsNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        if (kilometraje < 0) {
            throw new IllegalArgumentException("El kilometraje no puede ser negativo");
        }
        this.kilometraje = kilometraje;
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

    public double getPrecioAlquilerPorDia() {
        return precioAlquilerPorDia;
    }

    public void setPrecioAlquilerPorDia(double precioAlquilerPorDia) {
        if (precioAlquilerPorDia <= 0) {
            throw new IllegalArgumentException("El precio de alquiler debe ser mayor a 0");
        }
        this.precioAlquilerPorDia = precioAlquilerPorDia;
    }

    public double getPrecioAlquiler() {
        return PrecioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        PrecioAlquiler = precioAlquiler;
    }

    public boolean isEsTransmisionManual() {
        return esTransmisionManual;
    }

    public void setEsTransmisionManual(boolean esTransmisionManual) {
        this.esTransmisionManual = esTransmisionManual;
    }

    public void calcularPrecioReservaPorDia(){
        double valorPorDia = this.precioVenta / 30;
        this.precioAlquilerPorDia = valorPorDia;
    }

    @Override
    public String toString() {
        return String.format(
            "Vehículo:\n" +
            "--------\n" +
            "Marca: %s\n" +
            "Referencia: %s\n" +
            "Placa: %s\n" +
            "Velocidad Máxima: %d km/h\n" +
            "Kilometraje: %d km\n" +
            "Modelo: %d\n" +
            "Nuevo: %b\n" +
            "Precio de Venta: $%.2f\n" +
            "Precio de Alquiler por Día: $%.2f\n" +
            "Precio de Alquiler: $%.2f\n" +
            "Transmisión Manual: %b\n",
            marca, referencia, placa, velocidadMaxima, kilometraje, modelo, nuevo, precioVenta, precioAlquilerPorDia, PrecioAlquiler, esTransmisionManual
        );
    }
}
