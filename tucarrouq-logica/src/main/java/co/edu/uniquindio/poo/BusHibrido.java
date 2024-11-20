package co.edu.uniquindio.poo;

/**
 * Clase que representa un Bus híbrido.
 * Hereda de la clase VehiculoHibrido y añade atributos específicos para los
 * buses.
 */
public class BusHibrido extends VehiculoHibrido {

    private int numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasAire, numeroEjes,
            numeroSalidasEmergencia;
    private boolean aireAcondicionado, camaraReversa, ABS;

    /**
     * Constructor de la clase BusHibrido.
     * 
     * @param marca                   Marca del vehículo.
     * @param referencia              Referencia del vehículo.
     * @param placa                   Placa del vehículo.
     * @param kilometraje             Kilometraje del vehículo.
     * @param velocidadMaxima         Velocidad máxima del vehículo.
     * @param nuevo                   Indica si el vehículo es nuevo.
     * @param precioVenta             Precio de venta del vehículo.
     * @param precioAlquilerPorDia    Precio de alquiler por día del vehículo.
     * @param modelo                  Modelo del vehículo.
     * @param enchufable              Indica si el vehículo es enchufable.
     * @param hibridoLigero           Indica si el vehículo es un híbrido ligero.
     * @param revisionTecnica         Indica si el vehículo tiene revisión técnica.
     * @param numeroCambios           Número de cambios del vehículo.
     * @param numeroPasajeros         Número de pasajeros que puede llevar el
     *                                vehículo.
     * @param numeroPuertas           Número de puertas del vehículo.
     * @param capacidadMaletero       Capacidad del maletero del vehículo.
     * @param numeroBolsasAire        Número de bolsas de aire del vehículo.
     * @param numeroEjes              Número de ejes del vehículo.
     * @param numeroSalidasEmergencia Número de salidas de emergencia del vehículo.
     * @param aireAcondicionado       Indica si el vehículo tiene aire
     *                                acondicionado.
     * @param camaraReversa           Indica si el vehículo tiene cámara de reversa.
     * @param ABS                     Indica si el vehículo tiene sistema de frenos
     *                                ABS.
     * @param esTransmisionManual     Indica si el vehículo tiene transmisión
     *                                manual.
     */
    public BusHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, int numeroCambios, int numeroPasajeros, int numeroPuertas,
            int capacidadMaletero, int numeroBolsasAire, int numeroEjes, int numeroSalidasEmergencia,
            boolean aireAcondicionado, boolean camaraReversa, boolean ABS, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                enchufable, hibridoLigero, revisionTecnica, numeroCambios, esTransmisionManual);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.ABS = ABS;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        try {
            if (numeroPasajeros < 0) {
                throw new IllegalArgumentException("El número de pasajeros no puede ser negativo.");
            }
            this.numeroPasajeros = numeroPasajeros;
        } catch (Exception e) {
            System.err.println("Error al establecer el número de pasajeros: " + e.getMessage());
        }
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        try {
            if (numeroPuertas < 0) {
                throw new IllegalArgumentException("El número de puertas no puede ser negativo.");
            }
            this.numeroPuertas = numeroPuertas;
        } catch (Exception e) {
            System.err.println("Error al establecer el número de puertas: " + e.getMessage());
        }
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        try {
            if (capacidadMaletero < 0) {
                throw new IllegalArgumentException("La capacidad del maletero no puede ser negativa.");
            }
            this.capacidadMaletero = capacidadMaletero;
        } catch (Exception e) {
            System.err.println("Error al establecer la capacidad del maletero: " + e.getMessage());
        }
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        try {
            if (numeroBolsasAire < 0) {
                throw new IllegalArgumentException("El número de bolsas de aire no puede ser negativo.");
            }
            this.numeroBolsasAire = numeroBolsasAire;
        } catch (Exception e) {
            System.err.println("Error al establecer el número de bolsas de aire: " + e.getMessage());
        }
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        try {
            if (numeroEjes < 0) {
                throw new IllegalArgumentException("El número de ejes no puede ser negativo.");
            }
            this.numeroEjes = numeroEjes;
        } catch (Exception e) {
            System.err.println("Error al establecer el número de ejes: " + e.getMessage());
        }
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        try {
            if (numeroSalidasEmergencia < 0) {
                throw new IllegalArgumentException("El número de salidas de emergencia no puede ser negativo.");
            }
            this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        } catch (Exception e) {
            System.err.println("Error al establecer el número de salidas de emergencia: " + e.getMessage());
        }
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        try {
            this.aireAcondicionado = aireAcondicionado;
        } catch (Exception e) {
            System.err.println("Error al establecer el aire acondicionado: " + e.getMessage());
        }
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        try {
            this.camaraReversa = camaraReversa;
        } catch (Exception e) {
            System.err.println("Error al establecer la cámara de reversa: " + e.getMessage());
        }
    }

    public boolean isFrenosABS() {
        return ABS;
    }

    public void setFrenosABS(boolean ABS) {
        try {
            this.ABS = ABS;
        } catch (Exception e) {
            System.err.println("Error al establecer los frenos ABS: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "BusHibrido [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", capacidadMaletero=" + capacidadMaletero + ", numeroBolsasAire=" + numeroBolsasAire
                + ", numeroEjes=" + numeroEjes + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", frenosABS="
                + ABS + "]";
    }
}
