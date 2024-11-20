package co.edu.uniquindio.poo.model;

public class PickUpHibrida extends VehiculoHibrido {

    private int numeroPuertas, numeroPasajeros, numeroBolsasAire, capacidadCajaDeCarga;
    private boolean aireAcondicionado, camaraReversa, ABS, es4x4;

    /**
     * Constructor de la clase PickUpHibrida.
     * Inicializa todos los atributos del vehículo y los atributos heredados de la
     * clase VehiculoHibrido.
     * 
     * @param marca                Marca del vehículo.
     * @param referencia           Referencia del vehículo.
     * @param placa                Placa del vehículo.
     * @param kilometraje          Kilometraje del vehículo.
     * @param velocidadMaxima      Velocidad máxima del vehículo.
     * @param nuevo                Indica si el vehículo es nuevo.
     * @param precioVenta          Precio de venta del vehículo.
     * @param precioAlquilerPorDia Precio de alquiler por día del vehículo.
     * @param modelo               Modelo del vehículo.
     * @param enchufable           Indica si el vehículo es enchufable.
     * @param hibridoLigero        Indica si el vehículo es un híbrido ligero.
     * @param revisionTecnica      Indica si el vehículo tiene revisión técnica.
     * @param numeroCambios        Número de cambios del vehículo.
     * @param numeroPuertas        Número de puertas del vehículo.
     * @param numeroPasajeros      Número de pasajeros que puede llevar el vehículo.
     * @param numeroBolsasAire     Número de bolsas de aire del vehículo.
     * @param capacidadCajaDeCarga Capacidad de la caja de carga del vehículo.
     * @param aireAcondicionado    Indica si el vehículo tiene aire acondicionado.
     * @param camaraReversa        Indica si el vehículo tiene cámara de reversa.
     * @param ABS                  Indica si el vehículo tiene sistema de frenos
     *                             ABS.
     * @param es4x4                Indica si el vehículo es 4x4.
     * @param esTransmisionManual  Indica si el vehículo tiene transmisión manual.
     */
    public PickUpHibrida(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, int numeroCambios, int numeroPuertas, int numeroPasajeros,
            int numeroBolsasAire, int capacidadCajaDeCarga, boolean aireAcondicionado, boolean camaraReversa,
            boolean ABS, boolean es4x4, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                enchufable, hibridoLigero, revisionTecnica, numeroCambios, esTransmisionManual);

        // Inicialización de los atributos específicos de la Pick-Up híbrida
        this.numeroPuertas = numeroPuertas;
        this.numeroPasajeros = numeroPasajeros;
        this.numeroBolsasAire = numeroBolsasAire;
        this.capacidadCajaDeCarga = capacidadCajaDeCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.ABS = ABS;
        this.es4x4 = es4x4;
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

    public int getCapacidadCajaDeCarga() {
        return capacidadCajaDeCarga;
    }

    public void setCapacidadCajaDeCarga(int capacidadCajaDeCarga) {
        try {
            if (capacidadCajaDeCarga < 0) {
                throw new IllegalArgumentException("La capacidad de la caja de carga no puede ser negativa.");
            }
            this.capacidadCajaDeCarga = capacidadCajaDeCarga;
        } catch (Exception e) {
            System.err.println("Error al establecer la capacidad de la caja de carga: " + e.getMessage());
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

    public boolean isEs4x4() {
        return es4x4;
    }

    public void setEs4x4(boolean es4x4) {
        try {
            this.es4x4 = es4x4;
        } catch (Exception e) {
            System.err.println("Error al establecer si es 4x4: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "PickUpHibrida [numeroPuertas=" + numeroPuertas + ", numeroPasajeros=" + numeroPasajeros
                + ", numeroBolsasAire=" + numeroBolsasAire + ", capacidadCajaDeCarga=" + capacidadCajaDeCarga
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", frenosABS="
                + ABS + ", es4x4=" + es4x4 + "]";
    }

}
