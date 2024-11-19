package co.edu.uniquindio.poo.model;



public class BusElectrico extends VehiculoElectrico {

    private int numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasAire, numeroEjes,
            numeroSalidasEmergencia;
    private boolean aireAcondicionado, camaraReversa, ABS;

    public BusElectrico(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String autonomiaCargaCompleta,
            String tiempoPromedioPorCarga, boolean revisionTecnica, int numeroPasajeros, int numeroPuertas,
            int capacidadMaletero, int numeroBolsasAire, int numeroEjes, int numeroSalidasEmergencia,
            boolean aireAcondicionado, boolean camaraReversa, boolean ABS,boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica,esTransmisionManual);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.ABS = ABS;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isFrenosABS() {
        return ABS;
    }

    public void setFrenosABS(boolean ABS) {
        this.ABS = ABS;
    }

    @Override
    public String toString() {
        return "BusElectrico [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", capacidadMaletero=" + capacidadMaletero + ", numeroBolsasAire=" + numeroBolsasAire
                + ", numeroEjes=" + numeroEjes + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", frenosABS="
                + ABS + "]";
    }

}
