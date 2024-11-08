package co.edu.uniquindio.poo.model;

public class Camion extends Vehiculo {
    private int numeroDeEjes;
    private double capacidadDeCarga, precioVenta, precioAlquiler;
    private boolean aireAcondicionado, frenosDeAire, ABS;
    private String tipoCamion;

    public Camion(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje, boolean nuevo,
                  TipoDeCombustible combustible, TipoDeTransmision transmision, int kilometraje, int numeroDeEjes,
                  double capacidadDeCarga, boolean aireAcondicionado, boolean frenosDeAire, boolean ABS, String tipoCamion, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, kilometraje, nuevo, combustible, transmision, tipoDeVehiculo);

        if (numeroDeEjes <= 0) {
            throw new IllegalArgumentException("El número de ejes debe ser mayor a 0");
        }
        if (capacidadDeCarga < 0) {
            throw new IllegalArgumentException("La capacidad de carga no puede ser negativa");
        }
        if (tipoCamion == null || tipoCamion.isEmpty()) {
            throw new IllegalArgumentException("El tipo de camión no puede ser nulo o vacío");
        }

        this.numeroDeEjes = numeroDeEjes;
        this.capacidadDeCarga = capacidadDeCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosDeAire = frenosDeAire;
        this.ABS = ABS;
        this.tipoCamion = tipoCamion;
    }

    public int getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public void setNumeroDeEjes(int numeroDeEjes) {
        if (numeroDeEjes <= 0) {
            throw new IllegalArgumentException("El número de ejes debe ser mayor a 0");
        }
        this.numeroDeEjes = numeroDeEjes;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        if (capacidadDeCarga < 0) {
            throw new IllegalArgumentException("La capacidad de carga no puede ser negativa");
        }
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosDeAire() {
        return frenosDeAire;
    }

    public void setFrenosDeAire(boolean frenosDeAire) {
        this.frenosDeAire = frenosDeAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        if (tipoCamion == null || tipoCamion.isEmpty()) {
            throw new IllegalArgumentException("El tipo de camión no puede ser nulo o vacío");
        }
        this.tipoCamion = tipoCamion;
    }

    @Override
    public double calcularPrecioVenta() {
        throw new UnsupportedOperationException("Método 'calcularPrecioVenta' no implementado");
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        throw new UnsupportedOperationException("Método 'calcularPrecioAlquiler' no implementado");
    }
}
