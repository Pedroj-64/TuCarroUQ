package co.edu.uniquindio.poo;

/**
 * Clase que representa una Moto a Combustible.
 * Hereda de la clase VehiculoACombustible y añade atributos específicos para
 * las motos a combustible.
 */
public class MotoACombustible extends VehiculoACombustible {

    private String tipoDeMotocicleta;

    /**
     * Constructor de la clase MotoACombustible.
     * Inicializa todos los atributos del vehículo y los atributos heredados de la
     * clase VehiculoACombustible.
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
     * @param tipoCombustible      Tipo de combustible del vehículo.
     * @param autonomiaTanqueLleno Autonomía con el tanque lleno.
     * @param capacidadTanque      Capacidad del tanque del vehículo.
     * @param cilindraje           Cilindraje del vehículo.
     * @param revisionTecnica      Indica si el vehículo tiene revisión técnica.
     * @param numeroCambios        Número de cambios del vehículo.
     * @param tipoDeMotocicleta    Tipo de motocicleta.
     * @param esTransmisionManual  Indica si el vehículo tiene transmisión manual.
     */
    public MotoACombustible(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String tipoCombustible,
            int autonomiaTanqueLleno, int capacidadTanque, int cilindraje, boolean revisionTecnica, int numeroCambios,
            String tipoDeMotocicleta, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje, revisionTecnica, numeroCambios,
                esTransmisionManual);

        this.tipoDeMotocicleta = tipoDeMotocicleta;
    }

    public String getTipoDeMotocicleta() {
        return tipoDeMotocicleta;
    }

    public void setTipoDeMotocicleta(String tipoDeMotocicleta) {
        try {
            if (tipoDeMotocicleta == null || tipoDeMotocicleta.isEmpty()) {
                throw new IllegalArgumentException("El tipo de motocicleta no puede estar vacío.");
            }
            this.tipoDeMotocicleta = tipoDeMotocicleta;
        } catch (Exception e) {
            System.err.println("Error al establecer el tipo de motocicleta: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "MotoACombustible [tipoDeMotocicleta=" + tipoDeMotocicleta + "]";
    }
}
