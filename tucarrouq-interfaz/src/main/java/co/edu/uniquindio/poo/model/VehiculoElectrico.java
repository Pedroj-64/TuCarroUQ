package co.edu.uniquindio.poo.model;

public abstract class VehiculoElectrico extends Vehiculo {

    private String autonomiaCargaCompleta, tiempoPromedioPorCarga;
    private boolean revisionTecnica;

    public VehiculoElectrico(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String autonomiaCargaCompleta,
            String tiempoPromedioPorCarga, boolean revisionTecnica, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,esTransmisionManual);
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
        this.tiempoPromedioPorCarga = tiempoPromedioPorCarga;
        this.revisionTecnica = revisionTecnica;
    }

    public String getAutonomiaCargaCompleta() {
        return autonomiaCargaCompleta;
    }

    public void setAutonomiaCargaCompleta(String autonomiaCargaCompleta) {
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
    }

    public String getTiempoPromedioPorCarga() {
        return tiempoPromedioPorCarga;
    }

    public void setTiempoPromedioPorCarga(String tiempoPromedioPorCarga) {
        this.tiempoPromedioPorCarga = tiempoPromedioPorCarga;
    }

    public boolean isRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    @Override
    public String toString() {
        return "VehiculoElectrico [autonomiaCargaCompleta=" + autonomiaCargaCompleta + ", tiempoPromedioPorCarga="
                + tiempoPromedioPorCarga + ", revisionTecnica=" + revisionTecnica + "]";
    }

}
