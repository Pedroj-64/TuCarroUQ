package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.*;

public class RegistroVehicularController {

    Concesionario concesionario = App.getConcesionario();

    public boolean crearVehiculo(
            String tipoDeCombustion, String tipoDeVehiculo, String marca, String placa, String referencia, int cambios,
            int velocidadMax, int kilometraje, int modelo, double precioVenta, double precioAlquilerDia,
            boolean esNuevo, int cilindraje, int cantidadPuertas, int numeroBolsasAire, int numeroPasajeros,
            boolean transmisionManual, boolean aireAcondicionado, boolean camaraReversa, boolean abs,
            boolean velocidadCrucero, boolean sensorColision, boolean sensorTraficoCruzado, boolean asistenteCarril,
            boolean revisionTecnica, boolean frenosAire, boolean es4x4, boolean esEnchufable, boolean esHibridoLigero,
            String autonomiaCargaCompleta, int autonomiaTanqueLleno, int capacidadDeCarga, int capacidadDeMaletero,
            int numeroDeEjes, int numeroSalidasEmergencia, String tiempoPromedioPorCarga, double tiempoQueAlcanza100kmh,
            String tipoDeCamion, String tipoDeMoto) {
        boolean banderilla = false;

        try {
            // Identificar el tipo de combustible
            switch (tipoDeCombustion) {
                case "Eléctrico":
                    switch (tipoDeVehiculo) {
                        case "Van":
                            VehiculoElectrico vehiculoElectrico = new VanElectrico(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, cantidadPuertas,
                                    numeroBolsasAire, numeroPasajeros, transmisionManual, aireAcondicionado,
                                    camaraReversa, abs);
                            concesionario.agregarVehiculo(vehiculoElectrico);
                            banderilla = true;
                            break;
                        case "Sedán":
                            VehiculoElectrico vehiculoElectrico2 = new SedanElectrico(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, numeroDeEjes,
                                    numeroPasajeros, numeroSalidasEmergencia, numeroBolsasAire, aireAcondicionado,
                                    camaraReversa, velocidadCrucero, abs, sensorColision, sensorTraficoCruzado,
                                    asistenteCarril, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoElectrico2);
                            banderilla = true;
                            break;
                        case "Pick-Up":
                            VehiculoElectrico vehiculoElectrico3 = new PickUpElectrica(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, numeroDeEjes,
                                    numeroPasajeros, numeroBolsasAire, numeroSalidasEmergencia, aireAcondicionado,
                                    camaraReversa, abs, es4x4, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoElectrico3);
                            banderilla = true;
                            break;
                        case "Moto":
                            VehiculoElectrico vehiculoElectrico4 = new MotoElectrica(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, tipoDeMoto,
                                    transmisionManual);
                            concesionario.agregarVehiculo(vehiculoElectrico4);
                            banderilla = true;
                            break;
                        case "Deportivo":
                            VehiculoElectrico vehiculoElectrico5 = new DeportivoElectrico(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, numeroPasajeros,
                                    numeroDeEjes, numeroBolsasAire, numeroSalidasEmergencia, tiempoQueAlcanza100kmh,
                                    transmisionManual);
                            concesionario.agregarVehiculo(vehiculoElectrico5);
                            banderilla = true;
                            break;
                        case "Camioneta":
                            VehiculoElectrico vehiculoElectrico6 = new CamionetaElectrica(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, numeroDeEjes,
                                    numeroPasajeros, numeroSalidasEmergencia, numeroBolsasAire, aireAcondicionado, abs,
                                    camaraReversa, velocidadCrucero, sensorColision, sensorTraficoCruzado,
                                    asistenteCarril, es4x4, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoElectrico6);
                            banderilla = true;
                            break;
                        case "Camión":
                            VehiculoElectrico vehiculoElectrico7 = new CamionElectrico(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, tipoDeCamion,
                                    capacidadDeMaletero, numeroSalidasEmergencia, aireAcondicionado, frenosAire, abs,
                                    transmisionManual);
                            concesionario.agregarVehiculo(vehiculoElectrico7);
                            banderilla = true;
                            break;
                        case "Bus":
                            VehiculoElectrico vehiculoElectrico8 = new BusElectrico(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica, numeroPasajeros,
                                    capacidadDeCarga, capacidadDeMaletero, numeroBolsasAire, numeroDeEjes,
                                    numeroSalidasEmergencia, aireAcondicionado, camaraReversa, abs, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoElectrico8);
                            banderilla = true;
                            break;
                        default:
                            throw new IllegalArgumentException(
                                    "Tipo de vehículo eléctrico no válido: " + tipoDeVehiculo);
                    }
                    break;

                case "Híbrido":
                    switch (tipoDeVehiculo) {
                        case "Van":
                            VehiculoHibrido vehiculoHibrido = new VanHibrido(marca, referencia, placa, kilometraje,
                                    velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo, esEnchufable,
                                    esHibridoLigero, revisionTecnica, cambios, cantidadPuertas, numeroBolsasAire,
                                    numeroPasajeros, transmisionManual, aireAcondicionado, camaraReversa, abs);
                            concesionario.agregarVehiculo(vehiculoHibrido);
                            banderilla = true;
                            break;
                        case "Sedán":
                            VehiculoHibrido vehiculoHibrido2 = new SedanHibrido(marca, referencia, placa, kilometraje,
                                    velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo, esEnchufable,
                                    esHibridoLigero, revisionTecnica, cambios, numeroDeEjes, numeroPasajeros,
                                    numeroSalidasEmergencia, numeroBolsasAire, aireAcondicionado, camaraReversa,
                                    velocidadCrucero, abs, sensorColision, sensorTraficoCruzado, asistenteCarril,
                                    transmisionManual);
                            concesionario.agregarVehiculo(vehiculoHibrido2);
                            banderilla = true;
                            break;
                        case "Pick-Up":
                            VehiculoHibrido vehiculoHibrido3 = new PickUpHibrida(marca, referencia, placa, kilometraje,
                                    velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo, esEnchufable,
                                    esHibridoLigero, revisionTecnica, cambios, numeroDeEjes, numeroPasajeros,
                                    numeroBolsasAire, numeroSalidasEmergencia, aireAcondicionado, camaraReversa, abs,
                                    es4x4, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoHibrido3);
                            banderilla = true;
                            break;
                        case "Moto":
                            VehiculoHibrido vehiculoHibrido4 = new MotoHibrida(marca, referencia, placa, kilometraje,
                                    velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo, esEnchufable,
                                    esHibridoLigero, revisionTecnica, cambios, tipoDeMoto, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoHibrido4);
                            banderilla = true;
                            break;
                        case "Deportivo":
                            VehiculoHibrido vehiculoHibrido5 = new DeportivoHibrido(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    esEnchufable, esHibridoLigero, revisionTecnica, cambios, numeroPasajeros,
                                    numeroDeEjes, numeroBolsasAire, numeroSalidasEmergencia, tiempoQueAlcanza100kmh,
                                    transmisionManual);
                            concesionario.agregarVehiculo(vehiculoHibrido5);
                            banderilla = true;
                            break;
                        case "Camioneta":
                            VehiculoHibrido vehiculoHibrido6 = new CamionetaHibrida(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    esEnchufable, esHibridoLigero, revisionTecnica, cambios, numeroDeEjes,
                                    numeroPasajeros, numeroSalidasEmergencia, numeroBolsasAire, aireAcondicionado, abs,
                                    camaraReversa, velocidadCrucero, sensorColision, sensorTraficoCruzado,
                                    asistenteCarril, es4x4, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoHibrido6);
                            banderilla = true;
                            break;
                        case "Camión":
                            VehiculoHibrido vehiculoHibrido7 = new CamionHibrido(marca, referencia, placa, kilometraje,
                                    velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo, esEnchufable,
                                    esHibridoLigero, revisionTecnica, cambios, tipoDeCamion, capacidadDeMaletero,
                                    numeroSalidasEmergencia, aireAcondicionado, frenosAire, abs, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoHibrido7);
                            banderilla = true;
                            break;
                        case "Bus":
                            VehiculoHibrido vehiculoHibrido8 = new BusHibrido(marca, referencia, placa, kilometraje,
                                    velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo, esEnchufable,
                                    esHibridoLigero, revisionTecnica, cambios, numeroPasajeros, capacidadDeCarga,
                                    capacidadDeMaletero, numeroBolsasAire, numeroDeEjes, numeroSalidasEmergencia,
                                    aireAcondicionado, camaraReversa, abs, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoHibrido8);
                            banderilla = true;
                            break;
                        default:
                            throw new IllegalArgumentException("Tipo de vehículo híbrido no válido: " + tipoDeVehiculo);
                    }
                    break;

                case "Combustión":
                    switch (tipoDeVehiculo) {
                        case "Van":
                            VehiculoACombustible vehiculoACombustible = new VanACombustible(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    tipoDeMoto, autonomiaTanqueLleno, capacidadDeMaletero, cilindraje, revisionTecnica,
                                    cambios, cantidadPuertas, numeroBolsasAire, numeroPasajeros, transmisionManual,
                                    aireAcondicionado, camaraReversa, abs);
                            concesionario.agregarVehiculo(vehiculoACombustible);
                            banderilla = true;
                            break;
                        case "Sedán":
                            VehiculoACombustible vehiculoACombustible2 = new SedanACombustible(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    tipoDeMoto, autonomiaTanqueLleno, capacidadDeMaletero, cilindraje, revisionTecnica,
                                    cambios, numeroDeEjes, numeroPasajeros, numeroSalidasEmergencia, numeroBolsasAire,
                                    aireAcondicionado, camaraReversa, velocidadCrucero, abs, sensorColision,
                                    sensorTraficoCruzado, asistenteCarril, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoACombustible2);
                            banderilla = true;
                            break;
                        case "Pick-Up":
                            VehiculoACombustible vehiculoACombustible3 = new PickUpACombustible(marca, referencia,
                                    placa, kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    tipoDeMoto, autonomiaTanqueLleno, capacidadDeMaletero, cilindraje, revisionTecnica,
                                    cambios, numeroDeEjes, numeroPasajeros, numeroBolsasAire, numeroSalidasEmergencia,
                                    aireAcondicionado, camaraReversa, abs, es4x4, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoACombustible3);
                            banderilla = true;
                            break;
                        case "Moto":
                            VehiculoACombustible vehiculoACombustible4 = new MotoACombustible(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    tipoDeCamion, autonomiaTanqueLleno, capacidadDeMaletero, cilindraje,
                                    revisionTecnica, cambios, tipoDeMoto, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoACombustible4);
                            banderilla = true;
                            break;
                        case "Deportivo":
                            VehiculoACombustible vehiculoACombustible5 = new DeportivoACombustible(marca, referencia,
                                    placa, kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    tipoDeMoto, autonomiaTanqueLleno, capacidadDeMaletero, cilindraje, revisionTecnica,
                                    cambios, numeroPasajeros, numeroDeEjes, numeroBolsasAire, numeroSalidasEmergencia,
                                    tiempoQueAlcanza100kmh, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoACombustible5);
                            banderilla = true;
                            break;
                        case "Camioneta":
                            VehiculoACombustible vehiculoACombustible6 = new CamionetaACombustible(marca, referencia,
                                    placa, kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    tipoDeMoto, autonomiaTanqueLleno, capacidadDeMaletero, cilindraje, revisionTecnica,
                                    cambios, numeroDeEjes, numeroPasajeros, numeroSalidasEmergencia, numeroBolsasAire,
                                    aireAcondicionado, abs, camaraReversa, velocidadCrucero, sensorColision,
                                    sensorTraficoCruzado, asistenteCarril, es4x4, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoACombustible6);
                            banderilla = true;
                            break;
                        case "Camión":
                            VehiculoACombustible vehiculoACombustible7 = new CamionACombustible(marca, referencia,
                                    placa, kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    tipoDeMoto, autonomiaTanqueLleno, capacidadDeCarga, cilindraje, revisionTecnica,
                                    cambios, tipoDeCamion, capacidadDeMaletero, numeroSalidasEmergencia,
                                    aireAcondicionado, frenosAire, abs, transmisionManual);
                            concesionario.agregarVehiculo(vehiculoACombustible7);
                            banderilla = true;
                            break;
                        case "Bus":
                            VehiculoACombustible vehiculoACombustible8 = new BusACombustible(marca, referencia, placa,
                                    kilometraje, velocidadMax, esNuevo, precioVenta, precioAlquilerDia, modelo,
                                    tipoDeMoto, autonomiaTanqueLleno, capacidadDeMaletero, cilindraje, revisionTecnica,
                                    cambios, numeroPasajeros, capacidadDeCarga, capacidadDeMaletero, numeroBolsasAire,
                                    numeroDeEjes, numeroSalidasEmergencia, aireAcondicionado, camaraReversa, abs,
                                    transmisionManual);
                            concesionario.agregarVehiculo(vehiculoACombustible8);
                            banderilla = true;
                            break;
                        default:
                            throw new IllegalArgumentException(
                                    "Tipo de vehículo de combustión no válido: " + tipoDeVehiculo);
                    }
                    break;

                default:
                    throw new IllegalArgumentException("Tipo de combustión no válido: " + tipoDeCombustion);
            }
        } catch (Exception e) {
            System.out.println("Error al crear vehículo: " + e.getMessage());
        }

        return banderilla; // Devuelve false si no se pudo crear el vehículo
    }

}
