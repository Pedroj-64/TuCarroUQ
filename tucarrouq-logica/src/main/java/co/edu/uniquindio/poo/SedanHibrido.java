package co.edu.uniquindio.poo;

public class SedanHibrido extends VehiculoHibrido {

    private int numeroPuertas, numeroPasajeros, capacidadMaletero, numeroBolsasAire;
    private boolean aireAcondicionado, camaraReversa, velocidadCrucero, ABS, sensorColision, sensorTraficoCruzado,
            asistentePermanenciaEnCarril;

    /**
     * Constructor de la clase SedanHibrido.
     * Inicializa todos los atributos del vehículo y los atributos heredados de la
     * clase VehiculoHibrido.
     * 
     * @param marca                        Marca del vehículo.
     * @param referencia                   Referencia del vehículo.
     * @param placa                        Placa del vehículo.
     * @param kilometraje                  Kilometraje del vehículo.
     * @param velocidadMaxima              Velocidad máxima del vehículo.
     * @param nuevo                        Indica si el vehículo es nuevo.
     * @param precioVenta                  Precio de venta del vehículo.
     * @param precioAlquilerPorDia         Precio de alquiler por día del vehículo.
     * @param modelo                       Modelo del vehículo.
     * @param enchufable                   Indica si el vehículo es enchufable.
     * @param hibridoLigero                Indica si el vehículo es un híbrido
     *                                     ligero.
     * @param revisionTecnica              Indica si el vehículo tiene revisión
     *                                     técnica.
     * @param numeroCambios                Número de cambios del vehículo.
     * @param numeroPuertas                Número de puertas del vehículo.
     * @param numeroPasajeros              Número de pasajeros que puede llevar el
     *                                     vehículo.
     * @param capacidadMaletero            Capacidad del maletero del vehículo.
     * @param numeroBolsasAire             Número de bolsas de aire del vehículo.
     * @param aireAcondicionado            Indica si el vehículo tiene aire
     *                                     acondicionado.
     * @param camaraReversa                Indica si el vehículo tiene cámara de
     *                                     reversa.
     * @param velocidadCrucero             Indica si el vehículo tiene velocidad
     *                                     crucero.
     * @param ABS                          Indica si el vehículo tiene sistema de
     *                                     frenos ABS.
     * @param sensorColision               Indica si el vehículo tiene sensor de
     *                                     colisión.
     * @param sensorTraficoCruzado         Indica si el vehículo tiene sensor de
     *                                     tráfico cruzado.
     * @param asistentePermanenciaEnCarril Indica si el vehículo tiene asistente de
     *                                     permanencia en carril.
     * @param esTransmisionManual          Indica si el vehículo tiene transmisión
     *                                     manual.
     */
    public SedanHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, int numeroCambios, int numeroPuertas, int numeroPasajeros,
            int capacidadMaletero, int numeroBolsasAire, boolean aireAcondicionado, boolean camaraReversa,
            boolean velocidadCrucero, boolean ABS, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentePermanenciaEnCarril, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                enchufable, hibridoLigero, revisionTecnica, numeroCambios, esTransmisionManual);

        this.numeroPuertas = numeroPuertas;
        this.numeroPasajeros = numeroPasajeros;
        this.capacidadMaletero = capacidadMaletero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.ABS = ABS;
        this.sensorColision = sensorColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaEnCarril = asistentePermanenciaEnCarril;
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

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        try {
            this.velocidadCrucero = velocidadCrucero;
        } catch (Exception e) {
            System.err.println("Error al establecer la velocidad crucero: " + e.getMessage());
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

    public boolean isSensorColision() {
        return sensorColision;
    }

    public void setSensorColision(boolean sensorColision) {
        try {
            this.sensorColision = sensorColision;
        } catch (Exception e) {
            System.err.println("Error al establecer el sensor de colisión: " + e.getMessage());
        }
    }

    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        try {
            this.sensorTraficoCruzado = sensorTraficoCruzado;
        } catch (Exception e) {
            System.err.println("Error al establecer el sensor de tráfico cruzado: " + e.getMessage());
        }
    }

    public boolean isAsistentePermanenciaEnCarril() {
        return asistentePermanenciaEnCarril;
    }

    public void setAsistentePermanenciaEnCarril(boolean asistentePermanenciaEnCarril) {
        try {
            this.asistentePermanenciaEnCarril = asistentePermanenciaEnCarril;
        } catch (Exception e) {
            System.err.println("Error al establecer el asistente de permanencia en carril: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "SedanHibrido [numeroPuertas=" + numeroPuertas + ", numeroPasajeros=" + numeroPasajeros
                + ", capacidadMaletero=" + capacidadMaletero + ", numeroBolsasAire=" + numeroBolsasAire
                + ", AireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", velocidadCrucero=" + velocidadCrucero + ", frenosABS=" + ABS + ", sensorColision="
                + sensorColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado + ", asistentePermanenciaEnCarril="
                + asistentePermanenciaEnCarril + "]";
    }

}
