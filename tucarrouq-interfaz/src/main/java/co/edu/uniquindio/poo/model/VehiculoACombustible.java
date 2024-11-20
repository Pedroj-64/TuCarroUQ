package co.edu.uniquindio.poo.model;

/**
 * Clase abstracta que representa un vehículo a combustible.
 * Hereda de la clase Vehiculo y añade atributos específicos para los vehículos
 * a combustible.
 */
public abstract class VehiculoACombustible extends Vehiculo {

    private String tipoCombustible;
    private int autonomiaTanqueLleno, capacidadTanque, cilindraje;
    private boolean revisionTecnica;
    private int numeroCambios;

    /**
     * Constructor de la clase VehiculoACombustible.
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
     * @param tipoCombustible      Tipo de combustible del vehículo.
     * @param autonomiaTanqueLleno Autonomía con el tanque lleno.
     * @param capacidadTanque      Capacidad del tanque del vehículo.
     * @param cilindraje           Cilindraje del vehículo.
     * @param revisionTecnica      Indica si el vehículo tiene revisión técnica.
     * @param numeroCambios        Número de cambios del vehículo.
     * @param esTransmisionManual  Indica si el vehículo tiene transmisión manual.
     */
    public VehiculoACombustible(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String tipoCombustible,
            int autonomiaTanqueLleno, int capacidadTanque, int cilindraje, boolean revisionTecnica, int numeroCambios,
            boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                esTransmisionManual);
        if (autonomiaTanqueLleno < 0 || capacidadTanque < 0 || cilindraje < 0) {
            throw new IllegalArgumentException("Valores inválidos para autonomía, capacidad del tanque o cilindraje");
        }
        this.tipoCombustible = tipoCombustible;
        this.autonomiaTanqueLleno = autonomiaTanqueLleno;
        this.capacidadTanque = capacidadTanque;
        this.cilindraje = cilindraje;
        this.revisionTecnica = revisionTecnica;
        this.numeroCambios = numeroCambios;
    }

    public int getAutonomiaTanqueLleno() {
        return autonomiaTanqueLleno;
    }

    public void setAutonomiaTanqueLleno(int autonomiaTanqueLleno) {
        try {
            if (autonomiaTanqueLleno < 0) {
                throw new IllegalArgumentException("La autonomía del tanque lleno no puede ser negativa.");
            }
            this.autonomiaTanqueLleno = autonomiaTanqueLleno;
        } catch (Exception e) {
            System.err.println("Error al establecer la autonomía del tanque lleno: " + e.getMessage());
        }
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        try {
            if (capacidadTanque < 0) {
                throw new IllegalArgumentException("La capacidad del tanque no puede ser negativa.");
            }
            this.capacidadTanque = capacidadTanque;
        } catch (Exception e) {
            System.err.println("Error al establecer la capacidad del tanque: " + e.getMessage());
        }
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        try {
            if (tipoCombustible == null) {
                throw new IllegalArgumentException("El tipo de combustible no puede ser nulo.");
            }
            this.tipoCombustible = tipoCombustible;
        } catch (Exception e) {
            System.err.println("Error al establecer el tipo de combustible: " + e.getMessage());
        }
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        try {
            if (cilindraje < 0) {
                throw new IllegalArgumentException("El cilindraje no puede ser negativo.");
            }
            this.cilindraje = cilindraje;
        } catch (Exception e) {
            System.err.println("Error al establecer el cilindraje: " + e.getMessage());
        }
    }

    public boolean tieneRevisionTecnica() {
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
        return "VehiculoACombustible [tipoCombustible=" + tipoCombustible + ", autonomiaTanqueLleno="
                + autonomiaTanqueLleno + ", capacidadTanque=" + capacidadTanque + ", cilindraje=" + cilindraje
                + ", revisionTecnica=" + revisionTecnica + ", numeroCambios=" + numeroCambios + "]";
    }
}
