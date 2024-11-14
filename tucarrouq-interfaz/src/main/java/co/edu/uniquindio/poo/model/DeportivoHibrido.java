package co.edu.uniquindio.poo.model;



public class DeportivoHibrido extends VehiculoHibrido {

    private int numeroPasajeros, numeroPuertas, numeroBolsasAire, caballosDeFuerza;
    private double tiempoQueAlcanza100kmh;

    public DeportivoHibrido(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquiler, int modelo, boolean enchufable,
            boolean hibridoLigero, boolean revisionTecnica, int numeroPasajeros, int numeroPuertas,
            int numeroBolsasAire, int caballosDeFuerza, double tiempoQueAlcanza100kmh) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquiler, modelo,
                enchufable, hibridoLigero, revisionTecnica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.caballosDeFuerza = caballosDeFuerza;
        this.tiempoQueAlcanza100kmh = tiempoQueAlcanza100kmh;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public double getTiempoQueAlcanza100kmh() {
        return tiempoQueAlcanza100kmh;
    }

    public void setTiempoQueAlcanza100kmh(double tiempoQueAlcanza100kmh) {
        this.tiempoQueAlcanza100kmh = tiempoQueAlcanza100kmh;
    }

    @Override
    public String toString() {
        return "DeportivoHibrido [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", numeroBolsasAire=" + numeroBolsasAire + ", caballosDeFuerza=" + caballosDeFuerza
                + ", tiempoQueAlcanza100kmh=" + tiempoQueAlcanza100kmh + "]";
    }

}
