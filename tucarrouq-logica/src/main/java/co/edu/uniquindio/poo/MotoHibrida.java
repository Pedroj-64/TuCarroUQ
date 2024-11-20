package co.edu.uniquindio.poo;

/**
 * Clase que representa una Moto Híbrida.
 * Hereda de la clase VehiculoHibrido y añade atributos específicos para las
 * motos híbridas.
 */
public class MotoHibrida extends VehiculoHibrido {

    private String tipoMotocicleta;

    /**
     * Constructor de la clase MotoHibrida.
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
     * @param tipoMotocicleta      Tipo de motocicleta.
     * @param esTransmisionManual  Indica si el vehículo tiene transmisión manual.
     */
    public MotoHibrida(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, int numeroCambios, String tipoMotocicleta,
            boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                enchufable, hibridoLigero, revisionTecnica, numeroCambios, esTransmisionManual);

        this.tipoMotocicleta = tipoMotocicleta;
    }

    public String getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(String tipoMotocicleta) {
        try {
            if (tipoMotocicleta == null || tipoMotocicleta.isEmpty()) {
                throw new IllegalArgumentException("El tipo de motocicleta no puede estar vacío.");
            }
            this.tipoMotocicleta = tipoMotocicleta;
        } catch (Exception e) {
            System.err.println("Error al establecer el tipo de motocicleta: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "MotoHibrida [tipoMotocicleta=" + tipoMotocicleta + "]";
    }
}
