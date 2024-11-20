package co.edu.uniquindio.poo.model;

/**
 * Clase abstracta que representa un vehículo híbrido.
 * Hereda de la clase Vehiculo y añade atributos específicos para los vehículos
 * híbridos.
 */
public abstract class VehiculoHibrido extends Vehiculo {

    private boolean enchufable, hibridoLigero, revisionTecnica;
    private int numeroCambios;

    /**
     * Constructor de la clase VehiculoHibrido.
     * Inicializa todos los atributos del vehículo y los atributos heredados de la
     * clase Vehiculo.
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
     * @param esTransmisionManual  Indica si el vehículo tiene transmisión manual.
     * @throws IllegalArgumentException si alguno de los parámetros es inválido.
     */
    public VehiculoHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, int numeroCambios, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                esTransmisionManual);
        if (numeroCambios < 0) {
            throw new IllegalArgumentException("El número de cambios no puede ser negativo.");
        }
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
        this.revisionTecnica = revisionTecnica;
        this.numeroCambios = numeroCambios;
    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        try {
            this.enchufable = enchufable;
        } catch (Exception e) {
            System.err.println("Error al establecer si el vehículo es enchufable: " + e.getMessage());
        }
    }

    public boolean isHibridoLigero() {
        return hibridoLigero;
    }

    public void setHibridoLigero(boolean hibridoLigero) {
        try {
            this.hibridoLigero = hibridoLigero;
        } catch (Exception e) {
            System.err.println("Error al establecer si el vehículo es un híbrido ligero: " + e.getMessage());
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

    public int getNumeroCambios() {
        return numeroCambios;
    }

    public void setNumeroCambios(int numeroCambios) {
        try {
            if (numeroCambios < 0) {
                throw new IllegalArgumentException("El número de cambios no puede ser negativo.");
            }
            this.numeroCambios = numeroCambios;
        } catch (Exception e) {
            System.err.println("Error al establecer el número de cambios: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "VehiculoHibrido [enchufable=" + enchufable + ", hibridoLigero=" + hibridoLigero + ", revisionTecnica="
                + revisionTecnica + ", numeroCambios=" + numeroCambios + "]";
    }
}
