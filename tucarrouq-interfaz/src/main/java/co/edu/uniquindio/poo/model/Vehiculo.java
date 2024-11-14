package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
    private String marca, referencia, placa;
    private int velocidadMaxima, kilometraje, modelo;
    private boolean nuevo;
    private double precioVenta, precioAlquiler;

    public Vehiculo(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima, boolean nuevo, double precioVenta, double precioAlquiler, int modelo) {
        try {
            if (marca == null || referencia == null) {
                throw new IllegalArgumentException("Los valores no pueden ser nulos");
            }
            if (velocidadMaxima <= 0 || kilometraje < 0 || precioVenta < 0 || precioAlquiler < 0) {
                throw new IllegalArgumentException("Valores inválidos para velocidad máxima, cilindraje o kilometraje");
            }

            this.marca = marca;
            this.referencia = referencia;
            this.placa=placa;
            this.kilometraje = kilometraje;
            this.velocidadMaxima = velocidadMaxima;
            this.nuevo = nuevo;
            this.precioVenta = precioVenta;
            this.precioAlquiler = precioAlquiler;
            this.modelo=modelo;

        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el vehículo: " + e.getMessage());
        }
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

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima <= 0) {
            throw new IllegalArgumentException("La velocidad máxima debe ser mayor a 0");
        }
        this.velocidadMaxima = velocidadMaxima;
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
        return "Vehiculo [marca=" + marca + ", referencia=" + referencia + ", placa=" + placa + ", velocidadMaxima="
                + velocidadMaxima + ", kilometraje=" + kilometraje + ", modelo=" + modelo + ", nuevo=" + nuevo
                + ", precioVenta=" + precioVenta + ", precioAlquiler=" + precioAlquiler + "]";
    }


}
