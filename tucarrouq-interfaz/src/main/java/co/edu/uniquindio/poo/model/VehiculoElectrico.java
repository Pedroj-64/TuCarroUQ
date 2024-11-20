package co.edu.uniquindio.poo.model;

/**
 * Clase abstracta que representa un vehículo eléctrico.
 * Hereda de la clase Vehiculo y añade atributos específicos para los vehículos
 * eléctricos.
 */
public abstract class VehiculoElectrico extends Vehiculo {

    private String autonomiaCargaCompleta, tiempoPromedioPorCarga;
    private boolean revisionTecnica;

    /**
     * Constructor de la clase VehiculoElectrico.
     * Inicializa todos los atributos del vehículo y los atributos heredados de la
     * clase Vehiculo.
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
     * @param esTransmisionManual    Indica si el vehículo tiene transmisión manual.
     */
    public VehiculoElectrico(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String autonomiaCargaCompleta,
            String tiempoPromedioPorCarga, boolean revisionTecnica, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                esTransmisionManual);
        if (autonomiaCargaCompleta == null || tiempoPromedioPorCarga == null) {
            throw new IllegalArgumentException(
                    "La autonomía de carga completa y el tiempo promedio por carga no pueden ser nulos");
        }
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
        this.tiempoPromedioPorCarga = tiempoPromedioPorCarga;
        this.revisionTecnica = revisionTecnica;
    }

    public String getAutonomiaCargaCompleta() {
        return autonomiaCargaCompleta;
    }

    public void setAutonomiaCargaCompleta(String autonomiaCargaCompleta) {
        try {
            if (autonomiaCargaCompleta == null) {
                throw new IllegalArgumentException("La autonomía de carga completa no puede ser nula");
            }
            this.autonomiaCargaCompleta = autonomiaCargaCompleta;
        } catch (Exception e) {
            System.err.println("Error al establecer la autonomía de carga completa: " + e.getMessage());
        }
    }

    public String getTiempoPromedioPorCarga() {
        return tiempoPromedioPorCarga;
    }

    public void setTiempoPromedioPorCarga(String tiempoPromedioPorCarga) {
        try {
            if (tiempoPromedioPorCarga == null) {
                throw new IllegalArgumentException("El tiempo promedio por carga no puede ser nulo");
            }
            this.tiempoPromedioPorCarga = tiempoPromedioPorCarga;
        } catch (Exception e) {
            System.err.println("Error al establecer el tiempo promedio por carga: " + e.getMessage());
        }
    }

    public boolean isRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(boolean revisionTecnica) {
        try {
            this.revisionTecnica = revisionTecnica;
        } catch (Exception e) {
            System.err.println("Error al establecer la revisión técnica: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "VehiculoElectrico [autonomiaCargaCompleta=" + autonomiaCargaCompleta + ", tiempoPromedioPorCarga="
                + tiempoPromedioPorCarga + ", revisionTecnica=" + revisionTecnica + "]";
    }
}
