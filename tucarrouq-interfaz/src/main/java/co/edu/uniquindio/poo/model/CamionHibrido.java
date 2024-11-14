package co.edu.uniquindio.poo.model;

public class CamionHibrido extends VehiculoHibrido{

    private String tipoCamion;
    private int capacidadCarga, numeroEjes;
    private boolean aireAcondicionado, frenosDeAire, frenosABS;
    
    public CamionHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquiler, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, String tipoCamion, int capacidadCarga, int numeroEjes,
            boolean aireAcondicionado, boolean frenosDeAire, boolean frenosABS) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquiler, modelo,
                enchufable, hibridoLigero, revisionTecnica);
        this.tipoCamion = tipoCamion;
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosDeAire = frenosDeAire;
        this.frenosABS = frenosABS;
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
        return frenosABS;
    }

    public void setFrenosABS(boolean frenosABS) {
        this.frenosABS = frenosABS;
    }

    @Override
    public String toString() {
        return "CamionHibrido [tipoCamion=" + tipoCamion + ", capacidadCarga=" + capacidadCarga + ", numeroEjes="
                + numeroEjes + ", aireAcondicionado=" + aireAcondicionado + ", frenosDeAire=" + frenosDeAire
                + ", frenosABS=" + frenosABS + "]";
    }
    
    
}
