package co.edu.uniquindio.poo.model;

public class MotoACombustible extends VehiculoACombustible{

    private String tipoDeMotocicleta;

    public MotoACombustible(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String tipoCombustible,
            int autonomiaTanqueLleno, int capacidadTanque, int cilindraje, boolean revisionTecnica, int numeroCambios,
            String tipoDeMotocicleta) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje, revisionTecnica, numeroCambios);
        this.tipoDeMotocicleta = tipoDeMotocicleta;
    }

    public String getTipoDeMotocicleta() {
        return tipoDeMotocicleta;
    }

    public void setTipoDeMotocicleta(String tipoDeMotocicleta) {
        this.tipoDeMotocicleta = tipoDeMotocicleta;
    }

    
    
    

}
