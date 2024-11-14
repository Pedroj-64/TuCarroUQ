package co.edu.uniquindio.poo.model;

public abstract class VehiculoHibrido extends Vehiculo {
    
    private boolean enchufable, hibridoLigero, revisionTecnica;

    public VehiculoHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquiler, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquiler, modelo);
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
        this.revisionTecnica = revisionTecnica;
    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    public boolean isHibridoLigero() {
        return hibridoLigero;
    }

    public void setHibridoLigero(boolean hibridoLigero) {
        this.hibridoLigero = hibridoLigero;
    }

    public boolean isRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    @Override
    public String toString() {
        return "VehiculoHibrido [enchufable=" + enchufable + ", hibridoLigero=" + hibridoLigero + ", revisionTecnica="
                + revisionTecnica + "]";
    }

    
}
