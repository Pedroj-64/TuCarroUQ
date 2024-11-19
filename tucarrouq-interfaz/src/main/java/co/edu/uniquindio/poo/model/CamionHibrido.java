package co.edu.uniquindio.poo.model;



public class CamionHibrido extends VehiculoHibrido  {

    private String tipoCamion;
    private int capacidadCarga, numeroEjes;
    private boolean aireAcondicionado, frenosDeAire, ABS;

    public CamionHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica,int numeroCambios ,String tipoCamion, int capacidadCarga, int numeroEjes,
            boolean aireAcondicionado, boolean frenosDeAire, boolean ABS, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                enchufable, hibridoLigero, revisionTecnica,numeroCambios, esTransmisionManual);
        this.tipoCamion = tipoCamion;
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosDeAire = frenosDeAire;
        this.ABS = ABS;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosDeAire() {
        return frenosDeAire;
    }

    public void setFrenosDeAire(boolean frenosDeAire) {
        this.frenosDeAire = frenosDeAire;
    }

    public boolean isFrenosABS() {
        return ABS;
    }

    public void setFrenosABS(boolean ABS) {
        this.ABS = ABS;
    }

    @Override
    public String toString() {
        return "CamionHibrido [tipoCamion=" + tipoCamion + ", capacidadCarga=" + capacidadCarga + ", numeroEjes="
                + numeroEjes + ", aireAcondicionado=" + aireAcondicionado + ", frenosDeAire=" + frenosDeAire
                + ", frenosABS=" + ABS + "]";
    }

}
