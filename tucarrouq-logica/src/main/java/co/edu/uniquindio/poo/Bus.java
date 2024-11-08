package co.edu.uniquindio.poo;

public class Bus extends Vehiculo {
    private int numeroPasajero, numeroPuertas, numeroBolsasDeAire, numeroEjes, numeroSalidasEmergencia;
    private double capacidadMaletero;
    private boolean aireAcondicionado, camaraReversa, ABS;

    public Bus(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje, boolean nuevo,
               TipoDeCombustible combustible, TipoDeTransmision transmision, int kilometraje, int numeroPasajero, int numeroPuertas,
               int numeroBolsasDeAire, int numeroEjes, int numeroSalidasEmergencia, double capacidadMaletero,
               boolean aireAcondicionado, boolean camaraReversa, boolean ABS, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, kilometraje, nuevo, combustible, transmision, tipoDeVehiculo);

        if (numeroPasajero <= 0) {
            throw new IllegalArgumentException("El número de pasajeros debe ser mayor a 0");
        }
        if (numeroPuertas <= 0) {
            throw new IllegalArgumentException("El número de puertas debe ser mayor a 0");
        }
        if (numeroBolsasDeAire < 0) {
            throw new IllegalArgumentException("El número de bolsas de aire no puede ser negativo");
        }
        if (numeroEjes <= 0) {
            throw new IllegalArgumentException("El número de ejes debe ser mayor a 0");
        }
        if (numeroSalidasEmergencia <= 0) {
            throw new IllegalArgumentException("El número de salidas de emergencia debe ser mayor a 0");
        }
        if (capacidadMaletero < 0) {
            throw new IllegalArgumentException("La capacidad del maletero no puede ser negativa");
        }

        this.numeroPasajero = numeroPasajero;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.ABS = ABS;
    }

    public int getNumeroPasajero() {
        return numeroPasajero;
    }

    public void setNumeroPasajero(int numeroPasajero) {
        if (numeroPasajero <= 0) {
            throw new IllegalArgumentException("El número de pasajeros debe ser mayor a 0");
        }
        this.numeroPasajero = numeroPasajero;
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

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        if (numeroEjes <= 0) {
            throw new IllegalArgumentException("El número de ejes debe ser mayor a 0");
        }
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        if (numeroSalidasEmergencia <= 0) {
            throw new IllegalArgumentException("El número de salidas de emergencia debe ser mayor a 0");
        }
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
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
