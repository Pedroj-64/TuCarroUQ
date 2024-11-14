package co.edu.uniquindio.poo.model;

public class PickUpElectrica extends VehiculoElectrico {
    
    private int numeroPuertas, numeroPasajeros, numeroBolsasAire, capacidadCajaDeCarga;
    private boolean aireAcondicionado, camaraReversa, frenosABS, es4x4;
    
    public PickUpElectrica(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquiler, int modelo, String autonomiaCargaCompleta,
            String tiempoPromedioPorCarga, boolean revisionTecnica, int numeroPuertas, int numeroPasajeros,
            int numeroBolsasAire, int capacidadCajaDeCarga, boolean aireAcondicionado, boolean camaraReversa,
            boolean frenosABS, boolean es4x4) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquiler, modelo,
                autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica);
        this.numeroPuertas = numeroPuertas;
        this.numeroPasajeros = numeroPasajeros;
        this.numeroBolsasAire = numeroBolsasAire;
        this.capacidadCajaDeCarga = capacidadCajaDeCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.frenosABS = frenosABS;
        this.es4x4 = es4x4;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public int getCapacidadCajaDeCarga() {
        return capacidadCajaDeCarga;
    }

    public void setCapacidadCajaDeCarga(int capacidadCajaDeCarga) {
        this.capacidadCajaDeCarga = capacidadCajaDeCarga;
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
        return frenosABS;
    }

    public void setFrenosABS(boolean frenosABS) {
        this.frenosABS = frenosABS;
    }

    public boolean isEs4x4() {
        return es4x4;
    }

    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }

    @Override
    public String toString() {
        return "PickUpElectrica [numeroPuertas=" + numeroPuertas + ", numeroPasajeros=" + numeroPasajeros
                + ", numeroBolsasAire=" + numeroBolsasAire + ", capacidadCajaDeCarga=" + capacidadCajaDeCarga
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", frenosABS="
                + frenosABS + ", es4x4=" + es4x4 + "]";
    }

    
}
