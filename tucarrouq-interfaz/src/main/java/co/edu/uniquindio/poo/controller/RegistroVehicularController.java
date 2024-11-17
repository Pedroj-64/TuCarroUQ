package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.*;

public class RegistroVehicularController {

    Concesionario concesionario = App.getConcesionario();

    public boolean crearVehiculo(String tipoCombustion, String tipoVehiculo,
            String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo,
            double precioVenta, double precioAlquilerPorDia, int modelo, String tipoCombustible,
            int autonomiaTanqueLleno,
            int capacidadTanque, int cilindraje, boolean revisionTecnica, int numeroCambios,
            String autonomiaCargaCompleta,
            String tiempoPromedioPorCarga, boolean enchufable,
            boolean hibridoLigero, int cantidadPuertas, int numeroBolsasDeAire,
            int numeroPasajeros, boolean transmisionManual, boolean aireAcondicionado, boolean camaraReversa,
            boolean abs, int numeroPuertas, int capacidadMaletero, int numeroBolsasAire,
            boolean velocidadCrucero, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentePermanenciaEnCarril,
            int capacidadCajaDeCarga,
            boolean es4x4, String tipoMotocicleta, int caballosDeFuerza, double tiempoQueAlcanza100kmh,
            String tipoCamion, int capacidadDeCarga, int numeroEjes,
            boolean frenosDeAire) {
        boolean banderilla = false;

        try {
            // Identificar el tipo de combustible
            switch (tipoCombustion) {
                case "Eléctrico":
                    switch (tipoVehiculo) {
                        case "Van":
                            VehiculoElectrico vehiculoElectrico = new VanElectrico(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, cantidadPuertas,
                                    numeroBolsasDeAire, numeroPasajeros, transmisionManual, aireAcondicionado,
                                    camaraReversa, abs);
                            concesionario.agregarVehiculo(vehiculoElectrico);
                            banderilla = true;
                            break;
                        case "Sedán":
                            VehiculoElectrico vehiculoElectrico2 = new SedanElectrico(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, numeroPuertas,
                                    numeroPasajeros, capacidadMaletero, numeroBolsasAire, aireAcondicionado,
                                    camaraReversa, velocidadCrucero, frenosDeAire, sensorColision, sensorTraficoCruzado,
                                    asistentePermanenciaEnCarril);
                            concesionario.agregarVehiculo(vehiculoElectrico2);
                            banderilla = true;
                            break;
                        case "Pick-Up":
                            VehiculoElectrico vehiculoElectrico3 = new PickUpElectrica(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, numeroPuertas,
                                    numeroPasajeros, numeroBolsasAire, capacidadCajaDeCarga, aireAcondicionado,
                                    camaraReversa, frenosDeAire, es4x4);
                            concesionario.agregarVehiculo(vehiculoElectrico3);
                            banderilla = true;
                            break;
                        case "Moto":
                            VehiculoElectrico vehiculoElectrico4 = new MotoElectrica(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, tipoMotocicleta);
                            concesionario.agregarVehiculo(vehiculoElectrico4);
                            banderilla = true;
                            break;
                        case "Deportivo":
                            VehiculoElectrico vehiculoElectrico5 = new DeportivoElectrico(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, numeroPasajeros,
                                    cantidadPuertas, numeroBolsasAire, numeroPasajeros, capacidadMaletero);
                            concesionario.agregarVehiculo(vehiculoElectrico5);
                            banderilla = true;
                            break;
                        case "Camioneta":
                            VehiculoElectrico vehiculoElectrico6 = new CamionetaElectrica(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, cantidadPuertas,
                                    numeroPasajeros, capacidadTanque, numeroBolsasAire, aireAcondicionado, abs,
                                    camaraReversa, aireAcondicionado, camaraReversa, abs, banderilla, es4x4);
                            concesionario.agregarVehiculo(vehiculoElectrico6);
                            banderilla = true;
                            break;
                        case "Camión":
                            VehiculoElectrico vehiculoElectrico7 = new CamionElectrico(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, tipoCombustible,
                                    capacidadTanque, numeroPasajeros, aireAcondicionado, banderilla, abs);
                            concesionario.agregarVehiculo(vehiculoElectrico7);
                            banderilla = true;
                            break;
                        case "Bus":
                            VehiculoElectrico vehiculoElectrico8 = new BusElectrico(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, numeroPasajeros,
                                    cantidadPuertas, capacidadTanque, numeroBolsasAire, numeroBolsasAire,
                                    numeroPasajeros, aireAcondicionado, camaraReversa, abs);
                            concesionario.agregarVehiculo(vehiculoElectrico8);
                            banderilla = true;
                            break;
                        default:
                            throw new IllegalArgumentException("Tipo de vehículo eléctrico no válido: " + tipoVehiculo);
                    }
                    break;

                case "Híbrido":
                    switch (tipoVehiculo) {
                        case "Van":
                            VehiculoHibrido vehiculoHibrido = new VanHibrido(marca, referencia, placa, kilometraje,
                                    velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo, enchufable,
                                    hibridoLigero, revisionTecnica, numeroCambios, cantidadPuertas, numeroBolsasAire,
                                    numeroPasajeros, transmisionManual, aireAcondicionado, camaraReversa, abs);
                            concesionario.agregarVehiculo(vehiculoHibrido);
                            banderilla = true;
                            break;
                        case "Sedán":
                            VehiculoHibrido vehiculoHibrido2 = new SedanHibrido(marca, referencia, placa, kilometraje,
                                    velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo, enchufable,
                                    hibridoLigero, revisionTecnica, numeroCambios, numeroPuertas, numeroPasajeros,
                                    capacidadMaletero, numeroBolsasAire, aireAcondicionado, camaraReversa,
                                    velocidadCrucero, frenosDeAire, sensorColision, sensorTraficoCruzado,
                                    asistentePermanenciaEnCarril);
                            concesionario.agregarVehiculo(vehiculoHibrido2);
                            banderilla = true;
                            break;
                        case "Pick-Up":
                            VehiculoHibrido vehiculoHibrido3 = new PickUpHibrida(marca, referencia, placa, kilometraje,
                                    velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo, enchufable,
                                    hibridoLigero, revisionTecnica, numeroCambios, numeroPuertas, numeroPasajeros,
                                    numeroBolsasAire, capacidadCajaDeCarga, aireAcondicionado, camaraReversa,
                                    frenosDeAire, es4x4);
                            concesionario.agregarVehiculo(vehiculoHibrido3);
                            banderilla = true;
                            break;
                        case "Moto":
                            VehiculoHibrido vehiculoHibrido4 = new MotoHibrida(marca, referencia, placa, kilometraje,
                                    velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo, enchufable,
                                    hibridoLigero, revisionTecnica, numeroCambios, tipoMotocicleta);
                            concesionario.agregarVehiculo(vehiculoHibrido4);
                            banderilla = true;
                            break;
                        case "Deportivo":
                            VehiculoHibrido vehiculoHibrido5 = new DeportivoHibrido(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    enchufable, hibridoLigero, revisionTecnica, numeroCambios, numeroPasajeros,
                                    numeroPuertas, numeroBolsasAire, caballosDeFuerza, tiempoQueAlcanza100kmh);
                            concesionario.agregarVehiculo(vehiculoHibrido5);
                            banderilla = true;
                            break;
                        case "Camioneta":
                            VehiculoHibrido vehiculoHibrido6 = new CamionetaHibrida(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    enchufable, hibridoLigero, revisionTecnica, numeroCambios, numeroPuertas,
                                    numeroPasajeros, capacidadMaletero, numeroBolsasAire, aireAcondicionado, abs,
                                    camaraReversa, velocidadCrucero, sensorColision, sensorTraficoCruzado,
                                    asistentePermanenciaEnCarril, es4x4);
                            concesionario.agregarVehiculo(vehiculoHibrido6);
                            banderilla = true;
                            break;
                        case "Camión":
                            VehiculoHibrido vehiculoHibrido7 = new CamionHibrido(marca, referencia, placa, kilometraje,
                                    velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo, enchufable,
                                    hibridoLigero, revisionTecnica, numeroCambios, tipoCamion, capacidadCajaDeCarga,
                                    numeroEjes, aireAcondicionado, frenosDeAire, abs);
                            concesionario.agregarVehiculo(vehiculoHibrido7);
                            banderilla = true;
                            break;
                        case "Bus":
                            VehiculoHibrido vehiculoHibrido8 = new BusHibrido(marca, referencia, placa, kilometraje,
                                    velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo, enchufable,
                                    hibridoLigero, revisionTecnica, numeroCambios, numeroPasajeros, numeroPuertas,
                                    capacidadMaletero, numeroBolsasAire, numeroEjes, numeroEjes, aireAcondicionado,
                                    camaraReversa, frenosDeAire);
                            concesionario.agregarVehiculo(vehiculoHibrido8);
                            banderilla = true;
                            break;
                        default:
                            throw new IllegalArgumentException("Tipo de vehículo híbrido no válido: " + tipoVehiculo);
                    }
                    break;

                case "Combustión":
                    switch (tipoVehiculo) {
                        case "Van":
                            VehiculoACombustible vehiculoACombustible = new VanACombustible(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje, revisionTecnica,
                                    numeroCambios, cantidadPuertas, numeroBolsasAire, numeroPasajeros,
                                    transmisionManual, aireAcondicionado, camaraReversa, abs);
                            concesionario.agregarVehiculo(vehiculoACombustible);
                            banderilla = true;
                            break;
                        case "Sedán":
                            VehiculoACombustible vehiculoACombustible2 = new SedanACombustible(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje, revisionTecnica,
                                    numeroCambios, numeroPuertas, numeroPasajeros, capacidadMaletero, numeroBolsasAire,
                                    aireAcondicionado, camaraReversa, velocidadCrucero, frenosDeAire, sensorColision,
                                    sensorTraficoCruzado, asistentePermanenciaEnCarril);
                            concesionario.agregarVehiculo(vehiculoACombustible2);
                            banderilla = true;
                            break;
                        case "Pick-Up":
                            VehiculoACombustible vehiculoACombustible3 = new PickUpACombustible(marca, referencia,
                                    placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia,
                                    modelo, tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje,
                                    revisionTecnica, numeroCambios, numeroPuertas, numeroPasajeros, numeroBolsasAire,
                                    capacidadCajaDeCarga, aireAcondicionado, camaraReversa, frenosDeAire, es4x4);
                            concesionario.agregarVehiculo(vehiculoACombustible3);
                            banderilla = true;
                            break;
                        case "Moto":
                            VehiculoACombustible vehiculoACombustible4 = new MotoACombustible(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje, revisionTecnica,
                                    numeroCambios, tipoMotocicleta);
                            concesionario.agregarVehiculo(vehiculoACombustible4);
                            banderilla = true;
                            break;
                        case "Deportivo":
                            VehiculoACombustible vehiculoACombustible5 = new DeportivoACombustible(marca, referencia,
                                    placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia,
                                    modelo, tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje,
                                    revisionTecnica, numeroCambios, numeroPasajeros, numeroPuertas, numeroBolsasAire,
                                    caballosDeFuerza, tiempoQueAlcanza100kmh);
                            concesionario.agregarVehiculo(vehiculoACombustible5);
                            banderilla = true;
                            break;
                        case "Camioneta":
                            VehiculoACombustible vehiculoACombustible6 = new CamionetaACombustible(marca, referencia,
                                    placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia,
                                    modelo, tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje,
                                    revisionTecnica, numeroCambios, numeroPuertas, numeroPasajeros, capacidadMaletero,
                                    numeroBolsasAire, aireAcondicionado, frenosDeAire, camaraReversa, velocidadCrucero,
                                    sensorColision, sensorTraficoCruzado, asistentePermanenciaEnCarril, es4x4);
                            concesionario.agregarVehiculo(vehiculoACombustible6);
                            banderilla = true;
                            break;
                        case "Camión":
                            VehiculoACombustible vehiculoACombustible7 = new CamionACombustible(marca, referencia,
                                    placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia,
                                    modelo, tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje,
                                    revisionTecnica, numeroCambios, tipoCamion, capacidadCajaDeCarga, numeroEjes,
                                    aireAcondicionado, frenosDeAire, frenosDeAire);
                            concesionario.agregarVehiculo(vehiculoACombustible7);
                            banderilla = true;
                            break;
                        case "Bus":
                            VehiculoACombustible vehiculoACombustible8 = new BusACombustible(marca, referencia, placa,
                                    kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                                    tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje, revisionTecnica,
                                    numeroCambios, numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasAire,
                                    numeroEjes, numeroEjes, aireAcondicionado, camaraReversa, frenosDeAire);
                            concesionario.agregarVehiculo(vehiculoACombustible8);
                            banderilla = true;
                            break;
                        default:
                            throw new IllegalArgumentException(
                                    "Tipo de vehículo de combustión no válido: " + tipoVehiculo);
                    }
                    break;

                default:
                    throw new IllegalArgumentException("Tipo de combustión no válido: " + tipoCombustion);
            }
        } catch (Exception e) {
            System.out.println("Error al crear vehículo: " + e.getMessage());
        }

        return banderilla; // Devuelve false si no se pudo crear el vehículo
    }
}
