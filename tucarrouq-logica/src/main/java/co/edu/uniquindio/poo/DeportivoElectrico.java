package co.edu.uniquindio.poo;

/**
 * Clase que representa un Deportivo Eléctrico.
 * Hereda de la clase VehiculoElectrico y añade atributos específicos para los
 * vehículos deportivos eléctricos.
 */
public class DeportivoElectrico extends VehiculoElectrico {

    private int numeroPasajeros, numeroPuertas, numeroBolsasAire, caballosDeFuerza;
    private double tiempoQueAlcanza100kmh;

    /**
     * Constructor de la clase DeportivoElectrico.
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
     * @param numeroPasajeros        Número de pasajeros que puede llevar el
     *                               vehículo.
     * @param numeroPuertas          Número de puertas del vehículo.
     * @param numeroBolsasAire       Número de bolsas de aire del vehículo.
     * @param caballosDeFuerza       Potencia del vehículo en caballos de fuerza.
     * @param tiempoQueAlcanza100kmh Tiempo en segundos que el vehículo tarda en
     *                               alcanzar 100 km/h.
     * @param esTransmisionManual    Indica si el vehículo tiene transmisión manual.
     */
    public DeportivoElectrico(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String autonomiaCargaCompleta,
            String tiempoPromedioPorCarga, boolean revisionTecnica, int numeroPasajeros, int numeroPuertas,
            int numeroBolsasAire, int caballosDeFuerza, double tiempoQueAlcanza100kmh, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, esTransmisionManual);


        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.caballosDeFuerza = caballosDeFuerza;
        this.tiempoQueAlcanza100kmh = tiempoQueAlcanza100kmh;
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

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        try {
            if (caballosDeFuerza < 0) {
                throw new IllegalArgumentException("La cantidad de caballos de fuerza no puede ser negativa.");
            }
            this.caballosDeFuerza = caballosDeFuerza;
        } catch (Exception e) {
            System.err.println("Error al establecer los caballos de fuerza: " + e.getMessage());
        }
    }

    public double getTiempoQueAlcanza100kmh() {
        return tiempoQueAlcanza100kmh;
    }

    public void setTiempoQueAlcanza100kmh(double tiempoQueAlcanza100kmh) {
        try {
            if (tiempoQueAlcanza100kmh < 0) {
                throw new IllegalArgumentException("El tiempo no puede ser negativo.");
            }
            this.tiempoQueAlcanza100kmh = tiempoQueAlcanza100kmh;
        } catch (Exception e) {
            System.err.println("Error al establecer el tiempo que alcanza 100 km/h: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "DeportivoElectrico [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", numeroBolsasAire=" + numeroBolsasAire + ", caballosDeFuerza=" + caballosDeFuerza
                + ", tiempoQueAlcanza100kmh=" + tiempoQueAlcanza100kmh + "]";
    }
}
