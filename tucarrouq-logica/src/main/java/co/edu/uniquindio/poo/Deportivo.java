package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int numeroDePasajeros, numeroDePuertas, numeroDeBolsasDeAire, numeroCaballosDeFuerza;
    private double tiempoEnAlcanzar100kmh, precioVenta, precioAlquiler;

    public Deportivo(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje,
                     boolean nuevo, TipoDeCombustible combustible, TipoDeTransmision transmision, int kilometraje,
                     int numeroDePasajeros, int numeroDePuertas, int numeroDeBolsasDeAire, int numeroCaballosDeFuerza,
                     double tiempoEnAlcanzar100kmh, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, kilometraje, nuevo, combustible, transmision, tipoDeVehiculo);

        if (numeroDePasajeros <= 0) {
            throw new IllegalArgumentException("El número de pasajeros debe ser mayor a 0");
        }
        if (numeroDePuertas <= 0) {
            throw new IllegalArgumentException("El número de puertas debe ser mayor a 0");
        }
        if (numeroDeBolsasDeAire < 0) {
            throw new IllegalArgumentException("El número de bolsas de aire no puede ser negativo");
        }
        if (numeroCaballosDeFuerza <= 0) {
            throw new IllegalArgumentException("El número de caballos de fuerza debe ser mayor a 0");
        }
        if (tiempoEnAlcanzar100kmh <= 0) {
            throw new IllegalArgumentException("El tiempo en alcanzar 100 km/h debe ser mayor a 0");
        }

        this.numeroDePasajeros = numeroDePasajeros;
        this.numeroDePuertas = numeroDePuertas;
        this.numeroDeBolsasDeAire = numeroDeBolsasDeAire;
        this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
        this.tiempoEnAlcanzar100kmh = tiempoEnAlcanzar100kmh;
    }

    public int getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    public void setNumeroDePasajeros(int numeroDePasajeros) {
        if (numeroDePasajeros <= 0) {
            throw new IllegalArgumentException("El número de pasajeros debe ser mayor a 0");
        }
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        if (numeroDePuertas <= 0) {
            throw new IllegalArgumentException("El número de puertas debe ser mayor a 0");
        }
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDeBolsasDeAire() {
        return numeroDeBolsasDeAire;
    }

    public void setNumeroDeBolsasDeAire(int numeroDeBolsasDeAire) {
        if (numeroDeBolsasDeAire < 0) {
            throw new IllegalArgumentException("El número de bolsas de aire no puede ser negativo");
        }
        this.numeroDeBolsasDeAire = numeroDeBolsasDeAire;
    }

    public int getNumeroCaballosDeFuerza() {
        return numeroCaballosDeFuerza;
    }

    public void setNumeroCaballosDeFuerza(int numeroCaballosDeFuerza) {
        if (numeroCaballosDeFuerza <= 0) {
            throw new IllegalArgumentException("El número de caballos de fuerza debe ser mayor a 0");
        }
        this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
    }

    public double getTiempoEnAlcanzar100kmh() {
        return tiempoEnAlcanzar100kmh;
    }

    public void setTiempoEnAlcanzar100kmh(double tiempoEnAlcanzar100kmh) {
        if (tiempoEnAlcanzar100kmh <= 0) {
            throw new IllegalArgumentException("El tiempo en alcanzar 100 km/h debe ser mayor a 0");
        }
        this.tiempoEnAlcanzar100kmh = tiempoEnAlcanzar100kmh;
    }

    @Override
    public double calcularPrecioVenta() {
        throw new UnsupportedOperationException("Método 'calcularPrecioVenta' no implementado");
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        throw new UnsupportedOperationException("Método 'calcularPrecioAlquiler' no implementado");
    }
}
