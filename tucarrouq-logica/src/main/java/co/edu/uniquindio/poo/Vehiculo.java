package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    private String marca, referencia, cambios;
    private int velocidadMaxima, cilindraje, kilometraje;
    private boolean nuevo;
    private TipoDeCombustible combustible;
    private TipoDeTransmision transmision;
    private TipoDeVehiculo tipoDeVehiculo;
    private double precioVenta, precioAlquiler;

    public Vehiculo(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje,
                    int kilometraje, boolean nuevo, TipoDeCombustible combustible, TipoDeTransmision transmision,
                    TipoDeVehiculo tipoDeVehiculo) {
        try {
            if (marca == null || referencia == null || cambios == null || combustible == null || transmision == null || tipoDeVehiculo == null) {
                throw new IllegalArgumentException("Los valores no pueden ser nulos");
            }
            if (velocidadMaxima <= 0 || cilindraje <= 0 || kilometraje < 0) {
                throw new IllegalArgumentException("Valores inválidos para velocidad máxima, cilindraje o kilometraje");
            }

            this.marca = marca;
            this.referencia = referencia;
            this.cambios = cambios;
            this.velocidadMaxima = velocidadMaxima;
            this.cilindraje = cilindraje;
            this.kilometraje = kilometraje;
            this.nuevo = nuevo;
            this.combustible = combustible;
            this.transmision = transmision;
            this.tipoDeVehiculo = tipoDeVehiculo;

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

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        if (cambios == null) {
            throw new IllegalArgumentException("Los cambios no pueden ser nulos");
        }
        this.cambios = cambios;
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

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        if (cilindraje <= 0) {
            throw new IllegalArgumentException("El cilindraje debe ser mayor a 0");
        }
        this.cilindraje = cilindraje;
    }

    public boolean getEsNuevo() {
        return nuevo;
    }

    public void setEsNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public TipoDeCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoDeCombustible combustible) {
        if (combustible == null) {
            throw new IllegalArgumentException("El combustible no puede ser nulo");
        }
        this.combustible = combustible;
    }

    public TipoDeTransmision getTransmision() {
        return transmision;
    }

    public void setTransmision(TipoDeTransmision transmision) {
        if (transmision == null) {
            throw new IllegalArgumentException("La transmisión no puede ser nula");
        }
        this.transmision = transmision;
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

    public TipoDeVehiculo getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(TipoDeVehiculo tipoDeVehiculo) {
        if (tipoDeVehiculo == null) {
            throw new IllegalArgumentException("El tipo de vehículo no puede ser nulo");
        }
        this.tipoDeVehiculo = tipoDeVehiculo;
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

    public abstract double calcularPrecioVenta();

    public abstract double calcularPrecioAlquiler(int dias);

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", referencia=" + referencia + ", cambios=" + cambios + ", velocidadMaxima="
                + velocidadMaxima + ", cilindraje=" + cilindraje + ", kilometraje=" + kilometraje + ", es nuevo=" + nuevo
                + ", combustible=" + combustible + ", transmision=" + transmision + "]";
    }
}
