package co.edu.uniquindio.poo;

public class VanACombustible extends VehiculoACombustible {
    
    private int cantidadPuertas, numeroBolsasDeAire, numeroPasajeros;
    private boolean transmisionManual, aireAcondicionado, camaraReversa, abs;
    
    public VanACombustible(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquiler, int modelo, String tipoCombustible,
            int autonomiaTanqueLleno, int capacidadTanque, int cilindraje, boolean revisionTecnica, int cantidadPuertas,
            int numeroBolsasDeAire, int numeroPasajeros, boolean transmisionManual, boolean aireAcondicionado,
            boolean camaraReversa, boolean abs) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquiler, modelo,
                tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje, revisionTecnica);
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
        return "VanACombustible [cantidadPuertas=" + cantidadPuertas + ", numeroBolsasDeAire=" + numeroBolsasDeAire
                + ", numeroPasajeros=" + numeroPasajeros + ", transmisionManual=" + transmisionManual
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", abs=" + abs
                + "]";
    }


    
}
