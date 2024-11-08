package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo {
    private int numeroPasajeros, numeroPuertas, numeroBolsasDeAire;
    private double capacidadMaletero, precioVenta, precioAlquiler;
    private boolean aireAcondicionado, camaraReversa, ABS;

    public PickUp(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje, boolean nuevo,
                  TipoDeCombustible combustible, TipoDeTransmision transmision, int kilometraje, int numeroPasajeros,
                  int numeroPuertas, int numeroBolsasDeAire, double capacidadMaletero, boolean aireAcondicionado,
                  boolean camaraReversa, boolean ABS, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, kilometraje, nuevo, combustible, transmision, tipoDeVehiculo);

        if (numeroPasajeros <= 0) {
            throw new IllegalArgumentException("El número de pasajeros debe ser mayor a 0");
        }
        if (numeroPuertas <= 0) {
            throw new IllegalArgumentException("El número de puertas debe ser mayor a 0");
        }
        if (numeroBolsasDeAire < 0) {
            throw new IllegalArgumentException("El número de bolsas de aire no puede ser negativo");
        }
        if (capacidadMaletero < 0) {
            throw new IllegalArgumentException("La capacidad del maletero no puede ser negativa");
        }

        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.ABS = ABS;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        if (numeroPasajeros <= 0) {
            throw new IllegalArgumentException("El número de pasajeros debe ser mayor a 0");
        }
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        if (numeroPuertas <= 0) {
            throw new IllegalArgumentException("El número de puertas debe ser mayor a 0");
        }
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        if (numeroBolsasDeAire < 0) {
            throw new IllegalArgumentException("El número de bolsas de aire no puede ser negativo");
        }
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        if (capacidadMaletero < 0) {
            throw new IllegalArgumentException("La capacidad del maletero no puede ser negativa");
        }
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
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
