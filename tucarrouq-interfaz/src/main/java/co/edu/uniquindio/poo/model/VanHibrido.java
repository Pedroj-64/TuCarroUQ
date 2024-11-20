package co.edu.uniquindio.poo.model;

/**
 * Clase que representa una Van Híbrida.
 * Hereda de la clase VehiculoHibrido y añade atributos específicos para las
 * vans híbridas.
 */
public class VanHibrido extends VehiculoHibrido {

    private int cantidadPuertas, numeroBolsasDeAire, numeroPasajeros;
    private boolean aireAcondicionado, camaraReversa, abs;

    /**
     * Constructor de la clase VanHibrido.
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
     * @param cantidadPuertas      Cantidad de puertas del vehículo.
     * @param numeroBolsasDeAire   Número de bolsas de aire del vehículo.
     * @param numeroPasajeros      Número de pasajeros que puede llevar el vehículo.
     * @param esTransmisionManual  Indica si el vehículo tiene transmisión manual.
     * @param aireAcondicionado    Indica si el vehículo tiene aire acondicionado.
     * @param camaraReversa        Indica si el vehículo tiene cámara de reversa.
     * @param abs                  Indica si el vehículo tiene sistema de frenos
     *                             ABS.
     */
    public VanHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, int numeroCambios, int cantidadPuertas,
            int numeroBolsasDeAire, int numeroPasajeros, boolean esTransmisionManual, boolean aireAcondicionado,
            boolean camaraReversa, boolean abs) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                enchufable, hibridoLigero, revisionTecnica, numeroCambios, esTransmisionManual);
        this.cantidadPuertas = cantidadPuertas;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.numeroPasajeros = numeroPasajeros;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.abs = abs;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        try {
            if (cantidadPuertas < 0) {
                throw new IllegalArgumentException("La cantidad de puertas no puede ser negativa.");
            }
            this.cantidadPuertas = cantidadPuertas;
        } catch (Exception e) {
            System.err.println("Error al establecer la cantidad de puertas: " + e.getMessage());
        }
    }

    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        try {
            if (numeroBolsasDeAire < 0) {
                throw new IllegalArgumentException("El número de bolsas de aire no puede ser negativo.");
            }
            this.numeroBolsasDeAire = numeroBolsasDeAire;
        } catch (Exception e) {
            System.err.println("Error al establecer el número de bolsas de aire: " + e.getMessage());
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

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        try {
            this.abs = abs;
        } catch (Exception e) {
            System.err.println("Error al establecer el ABS: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "VanHibrido [cantidadPuertas=" + cantidadPuertas + ", numeroBolsasDeAire=" + numeroBolsasDeAire
                + ", numeroPasajeros=" + numeroPasajeros + ", aireAcondicionado=" + aireAcondicionado
                + ", camaraReversa=" + camaraReversa + ", abs=" + abs + "]";
    }
}
