package co.edu.uniquindio.poo.model;

public class MotoElectrica extends VehiculoElectrico{

    private String tipoMotocicleta;

    public MotoElectrica(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String autonomiaCargaCompleta,
            String tiempoPromedioPorCarga, boolean revisionTecnica, String tipoMotocicleta,boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica,esTransmisionManual);
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public String getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(String tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public String toString() {
        return "MotoElectrica [tipoMotocicleta=" + tipoMotocicleta + "]";
    }

    
    
}
