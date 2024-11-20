package co.edu.uniquindio.poo.model;

public class CamionHibrido extends VehiculoHibrido {

    private String tipoCamion;
    private int capacidadCarga, numeroEjes;
    private boolean aireAcondicionado, frenosDeAire, ABS;

    /**
     * Constructor de la clase CamionHibrido.
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
     * @param tipoCamion           Tipo de camión.
     * @param capacidadCarga       Capacidad de carga del vehículo.
     * @param numeroEjes           Número de ejes del vehículo.
     * @param aireAcondicionado    Indica si el vehículo tiene aire acondicionado.
     * @param frenosDeAire         Indica si el vehículo tiene frenos de aire.
     * @param ABS                  Indica si el vehículo tiene sistema de frenos
     *                             ABS.
     * @param esTransmisionManual  Indica si el vehículo tiene transmisión manual.
     */
    public CamionHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, int numeroCambios, String tipoCamion, int capacidadCarga,
            int numeroEjes,
            boolean aireAcondicionado, boolean frenosDeAire, boolean ABS, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                enchufable, hibridoLigero, revisionTecnica, numeroCambios, esTransmisionManual);

        this.tipoCamion = tipoCamion;
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosDeAire = frenosDeAire;
        this.ABS = ABS;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        try {
            if (tipoCamion == null || tipoCamion.isEmpty()) {
                throw new IllegalArgumentException("El tipo de camión no puede estar vacío.");
            }
            this.tipoCamion = tipoCamion;
        } catch (Exception e) {
            System.err.println("Error al establecer el tipo de camión: " + e.getMessage());
        }
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        try {
            if (capacidadCarga < 0) {
                throw new IllegalArgumentException("La capacidad de carga no puede ser negativa.");
            }
            this.capacidadCarga = capacidadCarga;
        } catch (Exception e) {
            System.err.println("Error al establecer la capacidad de carga: " + e.getMessage());
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

    public boolean isFrenosDeAire() {
        return frenosDeAire;
    }

    public void setFrenosDeAire(boolean frenosDeAire) {
        try {
            this.frenosDeAire = frenosDeAire;
        } catch (Exception e) {
            System.err.println("Error al establecer los frenos de aire: " + e.getMessage());
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
        return "CamionHibrido [tipoCamion=" + tipoCamion + ", capacidadCarga=" + capacidadCarga + ", numeroEjes="
                + numeroEjes + ", aireAcondicionado=" + aireAcondicionado + ", frenosDeAire=" + frenosDeAire
                + ", frenosABS=" + ABS + "]";
    }

}
