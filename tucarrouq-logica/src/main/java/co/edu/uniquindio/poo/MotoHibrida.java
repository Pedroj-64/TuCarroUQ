package co.edu.uniquindio.poo;

public class MotoHibrida extends VehiculoHibrido{

    private String tipoMotocicleta;

    public MotoHibrida(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquiler, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, String tipoMotocicleta) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquiler, modelo,
                enchufable, hibridoLigero, revisionTecnica);
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
        return "MotoHibrida [tipoMotocicleta=" + tipoMotocicleta + "]";
    }
    




    
}
