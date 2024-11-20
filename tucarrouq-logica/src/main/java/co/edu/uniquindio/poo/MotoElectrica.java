package co.edu.uniquindio.poo;

/**
 * Clase que representa una Moto Eléctrica.
 * Hereda de la clase VehiculoElectrico y añade atributos específicos para las
 * motos eléctricas.
 */
public class MotoElectrica extends VehiculoElectrico {

    private String tipoMotocicleta;

    /**
     * Constructor de la clase MotoElectrica.
     * Inicializa todos los atributos del vehículo y los atributos heredados de la
     * clase VehiculoElectrico.
     * 
     * @param marca                  Marca del vehículo.
     * @param referencia             Referencia del vehículo.
     * @param placa                  Placa del vehículo.
     * @param kilometraje            Kilometraje del vehículo.
     * @param velocidadMaxima        Velocidad máxima del vehículo.
     * @param nuevo                  Indica si el vehículo es nuevo.
     * @param precioVenta            Precio de venta del vehículo.
     * @param precioAlquilerPorDia   Precio de alquiler por día del vehículo.
     * @param modelo                 Modelo del vehículo.
     * @param autonomiaCargaCompleta Autonomía con la carga completa.
     * @param tiempoPromedioPorCarga Tiempo promedio por carga.
     * @param revisionTecnica        Indica si el vehículo tiene revisión técnica.
     * @param tipoMotocicleta        Tipo de motocicleta.
     * @param esTransmisionManual    Indica si el vehículo tiene transmisión manual.
     */
    public MotoElectrica(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String autonomiaCargaCompleta,
            String tiempoPromedioPorCarga, boolean revisionTecnica, String tipoMotocicleta,
            boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, esTransmisionManual);

        // Inicialización de los atributos específicos de la moto eléctrica
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
        return "MotoElectrica [tipoMotocicleta=" + tipoMotocicleta + "]";
    }
}
