package co.edu.uniquindio.poo.model;

public class MotoACombustible extends VehiculoACombustible{

    private int numeroCambios;

    public MotoACombustible(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String tipoCombustible,
            int autonomiaTanqueLleno, int capacidadTanque, int cilindraje, boolean revisionTecnica, int numeroCambios) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje, revisionTecnica);
        this.numeroCambios = numeroCambios;
    }

    public int getNumeroCambios() {
        return numeroCambios;
    }

    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }

    @Override
    public String toString() {
        return "MotoACombustible [numeroCambios=" + numeroCambios + "]";
    }

    
    
    

}
