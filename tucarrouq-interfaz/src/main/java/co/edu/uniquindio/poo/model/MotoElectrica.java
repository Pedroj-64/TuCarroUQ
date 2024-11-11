package co.edu.uniquindio.poo;

public class MotoElectrica extends VehiculoElectrico{

    private String tipoMotocicleta;

    public MotoElectrica(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquiler, int modelo, String autonomiaCargaCompleta,
            String tiempoPromedioPorCarga, boolean revisionTecnica, String tipoMotocicleta) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquiler, modelo,
                autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica);
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
