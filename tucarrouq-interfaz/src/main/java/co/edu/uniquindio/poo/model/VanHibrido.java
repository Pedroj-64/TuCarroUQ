package co.edu.uniquindio.poo.model;

public class VanHibrido extends VehiculoHibrido{

    private int cantidadPuertas, numeroBolsasDeAire, numeroPasajeros;
    private boolean transmisionManual, aireAcondicionado, camaraReversa, abs;
    
    public VanHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, int numeroCambios,int cantidadPuertas, int numeroBolsasDeAire,
            int numeroPasajeros, boolean transmisionManual, boolean aireAcondicionado, boolean camaraReversa,
            boolean abs) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                enchufable, hibridoLigero, revisionTecnica,numeroCambios);
        this.cantidadPuertas = cantidadPuertas;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.numeroPasajeros = numeroPasajeros;
        this.transmisionManual = transmisionManual;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.abs = abs;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public boolean isTransmisionManual() {
        return transmisionManual;
    }

    public void setTransmisionManual(boolean transmisionManual) {
        this.transmisionManual = transmisionManual;
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

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "VanHibrido [cantidadPuertas=" + cantidadPuertas + ", numeroBolsasDeAire=" + numeroBolsasDeAire
                + ", numeroPasajeros=" + numeroPasajeros + ", transmisionManual=" + transmisionManual
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", abs=" + abs
                + "]";
    }
    
    
}
