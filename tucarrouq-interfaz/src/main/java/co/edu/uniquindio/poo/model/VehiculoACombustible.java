package co.edu.uniquindio.poo.model;

public abstract class VehiculoACombustible extends Vehiculo{

    private String tipoCombustible;
    private int autonomiaTanqueLleno, capacidadTanque, cilindraje;
    private boolean revisionTecnica;

    

    public VehiculoACombustible(String marca, String referencia, String placa,int kilometraje, int velocidadMaxima, boolean nuevo,
            double precioVenta, double precioAlquiler, int modelo, String tipoCombustible, int autonomiaTanqueLleno,
            int capacidadTanque, int cilindraje, boolean revisionTecnica) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquiler, modelo);
        this.tipoCombustible = tipoCombustible;
        this.autonomiaTanqueLleno = autonomiaTanqueLleno;
        this.capacidadTanque = capacidadTanque;
        this.cilindraje = cilindraje;
        this.revisionTecnica = revisionTecnica;
    }

    public int getAutonomiaTanqueLleno() {
        return autonomiaTanqueLleno;
    }

    public void setAutonomiaTanqueLleno(int autonomiaTanqueLleno) {
        this.autonomiaTanqueLleno = autonomiaTanqueLleno;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean tieneRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    @Override
    public String toString() {
        return "VehiculoACombustible [autonomiaTanqueLleno=" + autonomiaTanqueLleno + ", capacidadTanqueLleno="
                + capacidadTanque + ", tipoCombustible=" + tipoCombustible + "cilindraje="+  cilindraje+"revisionTecnica="+revisionTecnica+"]";

    }
    
    
    

    
    
}
