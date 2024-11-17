package co.edu.uniquindio.poo.model;

public abstract class VehiculoHibrido extends Vehiculo {

    private boolean enchufable, hibridoLigero, revisionTecnica;
    private int numeroCambios;

    public VehiculoHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, int numeroCambios) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo);
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
        this.revisionTecnica = revisionTecnica;
        this.numeroCambios = numeroCambios;
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

    public int getNumeroCambios() {
        return numeroCambios;
    }

    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }

    @Override
    public String toString() {
        return "VehiculoHibrido [enchufable=" + enchufable + ", hibridoLigero=" + hibridoLigero + ", revisionTecnica="
                + revisionTecnica + "]";
    }

}
