package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ConcesionarioTest {

    private static final Logger LOG = Logger.getLogger(ConcesionarioTest.class.getName());

    @Test
    public void testExisteEmpleadoThrowsException() {
        LOG.info("Iniciando test testExisteEmpleadoThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        assertThrows(Throwable.class, () -> {
            concesionario.existeEmpleado(null);
        });
        LOG.info("Finalizando test testExisteEmpleadoThrowsException");
    }

    @Test
    public void testExisteEmpleadoTrue() {
        LOG.info("Iniciando test testExisteEmpleadoTrue");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        concesionario.agregarEmpleado(empleado);
        assertTrue(concesionario.existeEmpleado("123"));
        LOG.info("Finalizando test testExisteEmpleadoTrue");
    }

    @Test
    public void testExisteEmpleadoFalse() {
        LOG.info("Iniciando test testExisteEmpleadoFalse");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        assertFalse(concesionario.existeEmpleado("999"));
        LOG.info("Finalizando test testExisteEmpleadoFalse");
    }

    @Test
    public void testAgregarEmpleadoThrowsException() {
        LOG.info("Iniciando test testAgregarEmpleadoThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        assertThrows(Throwable.class, () -> {
            concesionario.agregarEmpleado(null);
        });
        LOG.info("Finalizando test testAgregarEmpleadoThrowsException");
    }

    @Test
    public void testAgregarEmpleado() {
        LOG.info("Iniciando test testAgregarEmpleado");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        concesionario.agregarEmpleado(empleado);
        assertTrue(concesionario.existeEmpleado("123"));
        LOG.info("Finalizando test testAgregarEmpleado");
    }

    /**
     * Prueba para el método existeAdministrador con assertThrows.
     */
    @Test
    public void testExisteAdministradorThrowsException() {
        LOG.info("Iniciando test testExisteAdministradorThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setAdministradores(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.existeAdministrador(null);
        });
        LOG.info("Finalizando test testExisteAdministradorThrowsException");
    }

    /**
     * Prueba para el método existeAdministrador con un administrador existente.
     */
    @Test
    public void testExisteAdministradorTrue() {
        LOG.info("Iniciando test testExisteAdministradorTrue");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setAdministradores(new ArrayList<>());
        Administrador administrador = new Administrador("Pedro", "456", "password", "pedro@example.com");
        concesionario.agregarAdministrador(administrador);
        assertTrue(concesionario.existeAdministrador("456"));
        LOG.info("Finalizando test testExisteAdministradorTrue");
    }

    /**
     * Prueba para el método existeAdministrador con un administrador no existente.
     */
    @Test
    public void testExisteAdministradorFalse() {
        LOG.info("Iniciando test testExisteAdministradorFalse");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setAdministradores(new ArrayList<>());
        assertFalse(concesionario.existeAdministrador("999"));
        LOG.info("Finalizando test testExisteAdministradorFalse");
    }

    /**
     * Prueba para el método agregarAdministrador con assertThrows.
     */
    @Test
    public void testAgregarAdministradorThrowsException() {
        LOG.info("Iniciando test testAgregarAdministradorThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setAdministradores(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.agregarAdministrador(null);
        });
        LOG.info("Finalizando test testAgregarAdministradorThrowsException");
    }

    /**
     * Prueba para el método agregarAdministrador agregando un nuevo administrador.
     */
    @Test
    public void testAgregarAdministrador() {
        LOG.info("Iniciando test testAgregarAdministrador");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setAdministradores(new ArrayList<>());
        Administrador administrador = new Administrador("Pedro", "456", "password", "pedro@example.com");
        concesionario.agregarAdministrador(administrador);
        assertTrue(concesionario.existeAdministrador("456"));
        LOG.info("Finalizando test testAgregarAdministrador");
    }

    /**
     * Prueba para el método agregarVehiculo con assertThrows.
     */
    @Test
    public void testAgregarVehiculoThrowsException() {
        LOG.info("Iniciando test testAgregarVehiculoThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.agregarVehiculo(null);
        });
        LOG.info("Finalizando test testAgregarVehiculoThrowsException");
    }

    /**
     * Prueba para el método agregarVehiculo agregando un nuevo vehículo.
     */
    @Test
    public void testAgregarVehiculo() {
        LOG.info("Iniciando test testAgregarVehiculo");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        VehiculoElectrico vehiculoElectrico = new VanElectrico("Tesla", "Model X", "ABC123", 0, 250, true, 80000, 200,
                2024, "500 km", "1 hora", true, 5, 6, 7, false, true, true, true);
        concesionario.agregarVehiculo(vehiculoElectrico);
        assertTrue(concesionario.getVehiculos().contains(vehiculoElectrico));
        LOG.info("Finalizando test testAgregarVehiculo");
    }

    /**
     * Prueba para el método venderVehiculo con assertThrows.
     */
    @Test
    public void testVenderVehiculoThrowsException() {
        LOG.info("Iniciando test testVenderVehiculoThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.venderVehiculo(null);
        });
        LOG.info("Finalizando test testVenderVehiculoThrowsException");
    }

    /**
     * Prueba para el método venderVehiculo vendiendo un vehículo.
     */
    @Test
    public void testVenderVehiculo() {
        LOG.info("Iniciando test testVenderVehiculo");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        concesionario.setVehiculosVendidos(new ArrayList<>());
        VehiculoHibrido vehiculoHibrido = new VanHibrido("Toyota", "Prius", "XYZ789", 10000, 180, true, 30000, 100,
                2022, true, false, true, 4, 5, 6, 8, false, true, true, false);
        concesionario.agregarVehiculo(vehiculoHibrido);
        concesionario.venderVehiculo(vehiculoHibrido);
        assertTrue(concesionario.getVehiculosVendidos().contains(vehiculoHibrido));
        assertFalse(concesionario.getVehiculos().contains(vehiculoHibrido));
        LOG.info("Finalizando test testVenderVehiculo");
    }

    /**
     * Prueba para el método alquilarVehiculo con assertThrows.
     */
    @Test
    public void testAlquilarVehiculoThrowsException() {
        LOG.info("Iniciando test testAlquilarVehiculoThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.alquilarVehiculo(null);
        });
        LOG.info("Finalizando test testAlquilarVehiculoThrowsException");
    }

    /**
     * Prueba para el método alquilarVehiculo alquilando un vehículo.
     */
    @Test
    public void testAlquilarVehiculo() {
        LOG.info("Iniciando test testAlquilarVehiculo");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        concesionario.setVehiculosAlquilados(new ArrayList<>());
        VehiculoACombustible vehiculoACombustible = new VanACombustible("Ford", "Transit", "LMN456", 5000, 160, false,
                35000, 150, 2023, "Diesel", 800, 100, 2000, true, 6, 5, 7, 8, false, true, true, true);
        concesionario.agregarVehiculo(vehiculoACombustible);
        concesionario.alquilarVehiculo(vehiculoACombustible);
        assertTrue(concesionario.getVehiculosAlquilados().contains(vehiculoACombustible));
        assertFalse(concesionario.getVehiculos().contains(vehiculoACombustible));
        LOG.info("Finalizando test testAlquilarVehiculo");
    }

    /**
     * Prueba para el método devolverVehiculoAlquilado con assertThrows.
     */
    @Test
    public void testDevolverVehiculoAlquiladoThrowsException() {
        LOG.info("Iniciando test testDevolverVehiculoAlquiladoThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculosAlquilados(new ArrayList<>());
        concesionario.setVehiculos(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.devolverVehiculoAlquilado(null);
        });
        LOG.info("Finalizando test testDevolverVehiculoAlquiladoThrowsException");
    }

    /**
     * Prueba para el método devolverVehiculoAlquilado devolviendo un vehículo.
     */
    @Test
    public void testDevolverVehiculoAlquilado() {
        LOG.info("Iniciando test testDevolverVehiculoAlquilado");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculosAlquilados(new ArrayList<>());
        concesionario.setVehiculos(new ArrayList<>());
        VehiculoACombustible vehiculoACombustible = new VanACombustible("Ford", "Transit", "LMN456", 5000, 160, false,
                35000, 150, 2023, "Diesel", 800, 100, 2000, true, 6, 5, 7, 8, false, true, true, true);
        concesionario.agregarVehiculo(vehiculoACombustible);
        concesionario.alquilarVehiculo(vehiculoACombustible);
        concesionario.devolverVehiculoAlquilado(vehiculoACombustible);
        assertTrue(concesionario.getVehiculos().contains(vehiculoACombustible));
        assertFalse(concesionario.getVehiculosAlquilados().contains(vehiculoACombustible));
        LOG.info("Finalizando test testDevolverVehiculoAlquilado");
    }

    /**
     * Prueba para el método buscarEmpleado con assertThrows.
     */
    @Test
    public void testBuscarEmpleadoThrowsException() {
        LOG.info("Iniciando test testBuscarEmpleadoThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.buscarEmpleado(null);
        });
        LOG.info("Finalizando test testBuscarEmpleadoThrowsException");
    }

    /**
     * Prueba para el método buscarEmpleado con un empleado existente.
     */
    @Test
    public void testBuscarEmpleadoExistente() {
        LOG.info("Iniciando test testBuscarEmpleadoExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        concesionario.agregarEmpleado(empleado);
        assertEquals(empleado, concesionario.buscarEmpleado("123"));
        LOG.info("Finalizando test testBuscarEmpleadoExistente");
    }

    /**
     * Prueba para el método buscarEmpleado con un empleado no existente.
     */
    @Test
    public void testBuscarEmpleadoNoExistente() {
        LOG.info("Iniciando test testBuscarEmpleadoNoExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        assertNull(concesionario.buscarEmpleado("999"));
        LOG.info("Finalizando test testBuscarEmpleadoNoExistente");
    }

    /**
     * Prueba para el método obtenerEmpleado con assertThrows.
     */
    @Test
    public void testObtenerEmpleadoThrowsException() {
        LOG.info("Iniciando test testObtenerEmpleadoThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.obtenerEmpleado("999");
        });
        LOG.info("Finalizando test testObtenerEmpleadoThrowsException");
    }

    /**
     * Prueba para el método obtenerEmpleado con un empleado existente.
     */
    @Test
    public void testObtenerEmpleadoExistente() {
        LOG.info("Iniciando test testObtenerEmpleadoExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        concesionario.agregarEmpleado(empleado);
        assertEquals(empleado, concesionario.obtenerEmpleado("123"));
        LOG.info("Finalizando test testObtenerEmpleadoExistente");
    }

    /**
     * Prueba para el método buscarAdministrador con assertThrows.
     */
    @Test
    public void testBuscarAdministradorThrowsException() {
        LOG.info("Iniciando test testBuscarAdministradorThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setAdministradores(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.buscarAdministrador(null);
        });
        LOG.info("Finalizando test testBuscarAdministradorThrowsException");
    }

    /**
     * Prueba para el método buscarAdministrador con un administrador existente.
     */
    @Test
    public void testBuscarAdministradorExistente() {
        LOG.info("Iniciando test testBuscarAdministradorExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setAdministradores(new ArrayList<>());
        Administrador administrador = new Administrador("Pedro", "456", "password", "pedro@example.com");
        concesionario.agregarAdministrador(administrador);
        assertEquals(administrador, concesionario.buscarAdministrador("456"));
        LOG.info("Finalizando test testBuscarAdministradorExistente");
    }

    /**
     * Prueba para el método buscarAdministrador con un administrador no existente.
     */
    @Test
    public void testBuscarAdministradorNoExistente() {
        LOG.info("Iniciando test testBuscarAdministradorNoExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setAdministradores(new ArrayList<>());
        assertNull(concesionario.buscarAdministrador("999"));
        LOG.info("Finalizando test testBuscarAdministradorNoExistente");
    }

    /**
     * Prueba para el método obtenerAdministrador con assertThrows.
     */
    @Test
    public void testObtenerAdministradorThrowsException() {
        LOG.info("Iniciando test testObtenerAdministradorThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setAdministradores(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.obtenerAdministrador("999");
        });
        LOG.info("Finalizando test testObtenerAdministradorThrowsException");
    }

    /**
     * Prueba para el método obtenerAdministrador con un administrador existente.
     */
    @Test
    public void testObtenerAdministradorExistente() {
        LOG.info("Iniciando test testObtenerAdministradorExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setAdministradores(new ArrayList<>());
        Administrador administrador = new Administrador("Pedro", "456", "password", "pedro@example.com");
        concesionario.agregarAdministrador(administrador);
        assertEquals(administrador, concesionario.obtenerAdministrador("456"));
        LOG.info("Finalizando test testObtenerAdministradorExistente");
    }

    /**
     * Prueba para el método eliminarVehiculo con assertThrows (vehículo nulo).
     */
    @Test
    public void testEliminarVehiculoThrowsExceptionIfNull() {
        LOG.info("Iniciando test testEliminarVehiculoThrowsExceptionIfNull");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.eliminarVehiculo(null);
        });
        LOG.info("Finalizando test testEliminarVehiculoThrowsExceptionIfNull");
    }

    /**
     * Prueba para el método eliminarVehiculo con assertThrows (vehículo no
     * encontrado).
     */
    @Test
    public void testEliminarVehiculoThrowsExceptionIfNotFound() {
        LOG.info("Iniciando test testEliminarVehiculoThrowsExceptionIfNotFound");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        VehiculoHibrido vehiculoHibrido = new VanHibrido("Toyota", "Prius", "XYZ789", 10000, 180, true, 30000, 100,
                2022, true, false, true, 4, 5, 6, 8, false, true, true, false);
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.eliminarVehiculo(vehiculoHibrido);
        });
        LOG.info("Finalizando test testEliminarVehiculoThrowsExceptionIfNotFound");
    }

    /**
     * Prueba para el método eliminarVehiculo eliminando un vehículo.
     */
    @Test
    public void testEliminarVehiculo() {
        LOG.info("Iniciando test testEliminarVehiculo");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        VehiculoHibrido vehiculoHibrido = new VanHibrido("Toyota", "Prius", "XYZ789", 10000, 180, true, 30000, 100,
                2022, true, false, true, 4, 5, 6, 8, false, true, true, false);
        concesionario.agregarVehiculo(vehiculoHibrido);
        concesionario.eliminarVehiculo(vehiculoHibrido);
        assertFalse(concesionario.getVehiculos().contains(vehiculoHibrido));
        LOG.info("Finalizando test testEliminarVehiculo");
    }

    /**
     * Prueba para el método buscarVehiculoPorPlaca con assertThrows (placa nula).
     */
    @Test
    public void testBuscarVehiculoPorPlacaThrowsExceptionIfNull() {
        LOG.info("Iniciando test testBuscarVehiculoPorPlacaThrowsExceptionIfNull");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.buscarVehiculoPorPlaca(null);
        });
        LOG.info("Finalizando test testBuscarVehiculoPorPlacaThrowsExceptionIfNull");
    }

    /**
     * Prueba para el método buscarVehiculoPorPlaca con assertThrows (placa vacía).
     */
    @Test
    public void testBuscarVehiculoPorPlacaThrowsExceptionIfEmpty() {
        LOG.info("Iniciando test testBuscarVehiculoPorPlacaThrowsExceptionIfEmpty");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.buscarVehiculoPorPlaca("");
        });
        LOG.info("Finalizando test testBuscarVehiculoPorPlacaThrowsExceptionIfEmpty");
    }

    /**
     * Prueba para el método buscarVehiculoPorPlaca con assertThrows (vehículo no
     * encontrado).
     */
    @Test
    public void testBuscarVehiculoPorPlacaThrowsExceptionIfNotFound() {
        LOG.info("Iniciando test testBuscarVehiculoPorPlacaThrowsExceptionIfNotFound");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        assertThrows(NoSuchElementException.class, () -> {
            concesionario.buscarVehiculoPorPlaca("XYZ789");
        });
        LOG.info("Finalizando test testBuscarVehiculoPorPlacaThrowsExceptionIfNotFound");
    }

    /**
     * Prueba para el método buscarVehiculoPorPlaca encontrando un vehículo.
     */
    @Test
    public void testBuscarVehiculoPorPlaca() {
        LOG.info("Iniciando test testBuscarVehiculoPorPlaca");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        VehiculoElectrico vehiculoElectrico = new VanElectrico("Tesla", "Model X", "ABC123", 0, 250, true, 80000, 200,
                2024, "500 km", "1 hora", true, 5, 6, 7, false, true, true, true);
        concesionario.agregarVehiculo(vehiculoElectrico);
        assertEquals(vehiculoElectrico, concesionario.buscarVehiculoPorPlaca("ABC123"));
        LOG.info("Finalizando test testBuscarVehiculoPorPlaca");
    }

    /**
     * Prueba para el método existeCliente con assertThrows.
     */
    @Test
    public void testExisteClienteThrowsException() {
        LOG.info("Iniciando test testExisteClienteThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.existeCliente(null);
        });
        LOG.info("Finalizando test testExisteClienteThrowsException");
    }

    /**
     * Prueba para el método existeCliente con un cliente existente.
     */
    @Test
    public void testExisteClienteTrue() {
        LOG.info("Iniciando test testExisteClienteTrue");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123");
        concesionario.agregarCliente(cliente);
        assertTrue(concesionario.existeCliente("123456789"));
        LOG.info("Finalizando test testExisteClienteTrue");
    }

    /**
     * Prueba para el método existeCliente con un cliente no existente.
     */
    @Test
    public void testExisteClienteFalse() {
        LOG.info("Iniciando test testExisteClienteFalse");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        assertFalse(concesionario.existeCliente("987654321"));
        LOG.info("Finalizando test testExisteClienteFalse");
    }

    /**
     * Prueba para el método eliminarCliente con assertThrows (cliente no
     * encontrado).
     */
    @Test
    public void testEliminarClienteThrowsExceptionIfNotFound() {
        LOG.info("Iniciando test testEliminarClienteThrowsExceptionIfNotFound");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.eliminarCliente("987654321");
        });
        LOG.info("Finalizando test testEliminarClienteThrowsExceptionIfNotFound");
    }

    /**
     * Prueba para el método eliminarCliente eliminando un cliente.
     */
    @Test
    public void testEliminarCliente() {
        LOG.info("Iniciando test testEliminarCliente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123");
        concesionario.agregarCliente(cliente);
        concesionario.eliminarCliente("123456789");
        assertFalse(concesionario.existeCliente("123456789"));
        assertNull(concesionario.obtenerCliente("123456789")); // Asumiendo que buscarCliente devuelve null si no
                                                               // encuentra el cliente
        LOG.info("Finalizando test testEliminarCliente");
    }

    /**
     * Prueba para el método actualizarCliente con assertThrows (cliente no
     * encontrado).
     */
    @Test
    public void testActualizarClienteThrowsExceptionIfNotFound() {
        LOG.info("Iniciando test testActualizarClienteThrowsExceptionIfNotFound");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.actualizarCliente("987654321", "Nombre Actualizado", "123-4567", "Calle Nueva 456");
        });
        LOG.info("Finalizando test testActualizarClienteThrowsExceptionIfNotFound");
    }

    /**
     * Prueba para el método actualizarCliente actualizando un cliente.
     */
    @Test
    public void testActualizarCliente() {
        LOG.info("Iniciando test testActualizarCliente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123");
        concesionario.agregarCliente(cliente);
        concesionario.actualizarCliente("123456789", "Juan Actualizado", "123-4567", "Calle Nueva 456");
        Cliente clienteActualizado = concesionario.obtenerCliente("123456789");
        assertEquals("Juan Actualizado", clienteActualizado.getNombre());
        assertEquals("123-4567", clienteActualizado.getTelefono());
        assertEquals("Calle Nueva 456", clienteActualizado.getDireccion());
        LOG.info("Finalizando test testActualizarCliente");
    }

    /**
     * Prueba para el método actualizarEmpleado con assertThrows (empleado no
     * encontrado).
     */
    @Test
    public void testActualizarEmpleadoThrowsExceptionIfNotFound() {
        LOG.info("Iniciando test testActualizarEmpleadoThrowsExceptionIfNotFound");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.actualizarEmpleado("Nombre Actualizado", "987654321", "nuevaContrasena", "nuevo@example.com");
        });
        LOG.info("Finalizando test testActualizarEmpleadoThrowsExceptionIfNotFound");
    }

    /**
     * Prueba para el método actualizarEmpleado actualizando un empleado.
     */
    @Test
    public void testActualizarEmpleado() {
        LOG.info("Iniciando test testActualizarEmpleado");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        Empleado empleado = new Empleado("Juan", "123456789", "password", "juan@example.com");
        concesionario.agregarEmpleado(empleado);
        concesionario.actualizarEmpleado("Juan Actualizado", "123456789", "nuevaContrasena", "nuevo@example.com");
        Empleado empleadoActualizado = concesionario.obtenerEmpleado("123456789");
        assertEquals("Juan Actualizado", empleadoActualizado.getNombre());
        assertEquals("nuevaContrasena", empleadoActualizado.getContrasena());
        assertEquals("nuevo@example.com", empleadoActualizado.getEmailDeRecuperacion());
        LOG.info("Finalizando test testActualizarEmpleado");
    }

    /**
     * Prueba para el método obtenerCliente con un cliente existente.
     */
    @Test
    public void testObtenerClienteExistente() {
        LOG.info("Iniciando test testObtenerClienteExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123");
        concesionario.agregarCliente(cliente);
        assertEquals(cliente, concesionario.obtenerCliente("123456789"));
        LOG.info("Finalizando test testObtenerClienteExistente");
    }

    /**
     * Prueba para el método obtenerCliente con un cliente no existente.
     */
    @Test
    public void testObtenerClienteNoExistente() {
        LOG.info("Iniciando test testObtenerClienteNoExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        assertNull(concesionario.obtenerCliente("987654321"));
        LOG.info("Finalizando test testObtenerClienteNoExistente");
    }

    /**
     * Prueba para el método agregarCliente con assertThrows (cliente nulo).
     */
    @Test
    public void testAgregarClienteThrowsExceptionIfNull() {
        LOG.info("Iniciando test testAgregarClienteThrowsExceptionIfNull");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.agregarCliente(null);
        });
        LOG.info("Finalizando test testAgregarClienteThrowsExceptionIfNull");
    }

    /**
     * Prueba para el método agregarCliente con assertThrows (cliente duplicado).
     */
    @Test
    public void testAgregarClienteThrowsExceptionIfDuplicate() {
        LOG.info("Iniciando test testAgregarClienteThrowsExceptionIfDuplicate");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123");
        concesionario.agregarCliente(cliente);
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.agregarCliente(cliente);
        });
        LOG.info("Finalizando test testAgregarClienteThrowsExceptionIfDuplicate");
    }

    /**
     * Prueba para el método agregarCliente agregando un nuevo cliente.
     */
    @Test
    public void testAgregarCliente() {
        LOG.info("Iniciando test testAgregarCliente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setClientes(new ArrayList<>());
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123");
        concesionario.agregarCliente(cliente);
        assertNotNull(concesionario.obtenerCliente("123456789"));
        assertEquals(cliente, concesionario.obtenerCliente("123456789"));
        LOG.info("Finalizando test testAgregarCliente");
    }

    /**
     * Prueba para el método eliminarEmpleado con assertThrows (identificación
     * nula).
     */
    @Test
    public void testEliminarEmpleadoThrowsExceptionIfNull() {
        LOG.info("Iniciando test testEliminarEmpleadoThrowsExceptionIfNull");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.eliminarEmpleado(null);
        });
        LOG.info("Finalizando test testEliminarEmpleadoThrowsExceptionIfNull");
    }

    /**
     * Prueba para el método eliminarEmpleado eliminando un empleado.
     */
    @Test
    public void testEliminarEmpleado() {
        LOG.info("Iniciando test testEliminarEmpleado");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
        Empleado empleado = new Empleado("Juan", "123456789", "password", "juan@example.com");
        concesionario.agregarEmpleado(empleado);
        concesionario.eliminarEmpleado("123456789");
        assertFalse(concesionario.existeEmpleado("123456789"));
        LOG.info("Finalizando test testEliminarEmpleado");
    }

    /**
     * Prueba para el método calcularPrecioTransaccionPrestamo con assertThrows
     * (días de préstamo menores o iguales a 0).
     */
    @Test
    public void testCalcularPrecioTransaccionPrestamoThrowsException() {
        LOG.info("Iniciando test testCalcularPrecioTransaccionPrestamoThrowsException");
        Concesionario concesionario = Concesionario.getInstance();
        DetalleTransaccion detalleTransaccion = new DetalleTransaccion(true, null);
        VehiculoElectrico vehiculo = new VanElectrico("Tesla", "Model X", "ABC123", 0, 250, true, 80000, 200,
                2024, "500 km", "1 hora", true, 5, 6, 7, false, true, true, true);
        detalleTransaccion.setDiasPrestamo(0); // Días de préstamo menores o iguales a 0
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.calcularPrecioTransaccionPrestamo(detalleTransaccion, vehiculo);
        });
        LOG.info("Finalizando test testCalcularPrecioTransaccionPrestamoThrowsException");
    }

    /**
     * Prueba para el método calcularPrecioTransaccionPrestamo calculando el precio
     * de un préstamo.
     */
    @Test
    public void testCalcularPrecioTransaccionPrestamo() {
        LOG.info("Iniciando test testCalcularPrecioTransaccionPrestamo");
        Concesionario concesionario = Concesionario.getInstance();
        DetalleTransaccion detalleTransaccion = new DetalleTransaccion(true, null);
        VehiculoElectrico vehiculo = new VanElectrico("Tesla", "Model X", "ABC123", 0, 250, true, 80000, 200,
                2024, "500 km", "1 hora", true, 5, 6, 7, false, true, true, true);
        detalleTransaccion.setDiasPrestamo(5); // Días de préstamo mayores a 0
        vehiculo.setPrecioAlquilerPorDia(100); // Precio por día de alquiler
        concesionario.calcularPrecioTransaccionPrestamo(detalleTransaccion, vehiculo);
        assertEquals(500, vehiculo.getPrecioAlquiler()); // 5 días * 100 por día = 500
        LOG.info("Finalizando test testCalcularPrecioTransaccionPrestamo");
    }

    /**
     * Prueba para el método crearTransaccion con assertThrows (cliente o empleado
     * nulos).
     */
    @Test
    public void testCrearTransaccionThrowsExceptionIfClientOrEmployeeNull() {
        LOG.info("Iniciando test testCrearTransaccionThrowsExceptionIfClientOrEmployeeNull");
        Concesionario concesionario = Concesionario.getInstance();
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.crearTransaccion(null, new Empleado("Juan", "123", "password", "juan@example.com"));
        });
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.crearTransaccion(new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123"), null);
        });
        LOG.info("Finalizando test testCrearTransaccionThrowsExceptionIfClientOrEmployeeNull");
    }

    /**
     * Prueba para el método crearTransaccion creando una nueva transacción.
     */
    @Test
    public void testCrearTransaccion() {
        LOG.info("Iniciando test testCrearTransaccion");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVentas(new ArrayList<>());
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123");
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        Transaccion transaccion = concesionario.crearTransaccion(cliente, empleado);
        assertNotNull(transaccion);
        assertEquals(cliente, transaccion.getCliente());
        assertEquals(empleado, transaccion.getEmpleado());
        assertTrue(concesionario.getVentas().contains(transaccion));
        LOG.info("Finalizando test testCrearTransaccion");
    }

    /**
     * Prueba para el método crearTransaccion retornando una transacción existente.
     */
    @Test
    public void testCrearTransaccionExistente() {
        LOG.info("Iniciando test testCrearTransaccionExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVentas(new ArrayList<>());
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123");
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        Transaccion transaccionExistente = concesionario.crearTransaccion(cliente, empleado);
        Transaccion transaccion = concesionario.crearTransaccion(cliente, empleado);
        assertEquals(transaccionExistente, transaccion);
        LOG.info("Finalizando test testCrearTransaccionExistente");
    }

    /**
     * Prueba para el método buscarTransaccionPorCliente con un cliente existente.
     */
    @Test
    public void testBuscarTransaccionPorClienteExistente() {
        LOG.info("Iniciando test testBuscarTransaccionPorClienteExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVentas(new ArrayList<>());
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123");
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        Transaccion transaccion = new Transaccion(cliente, empleado);
        concesionario.getVentas().add(transaccion);
        Transaccion transaccionEncontrada = concesionario.buscarTransaccionPorCliente(cliente);
        assertEquals(transaccion, transaccionEncontrada);
        LOG.info("Finalizando test testBuscarTransaccionPorClienteExistente");
    }

    /**
     * Prueba para el método buscarTransaccionPorCliente con un cliente no
     * existente.
     */
    @Test
    public void testBuscarTransaccionPorClienteNoExistente() {
        LOG.info("Iniciando test testBuscarTransaccionPorClienteNoExistente");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVentas(new ArrayList<>());
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123");
        assertNull(concesionario.buscarTransaccionPorCliente(cliente));
        LOG.info("Finalizando test testBuscarTransaccionPorClienteNoExistente");
    }

    /**
     * Prueba para el método agregarDetalleATransaccion con assertThrows
     * (transacción, detalle o vehículo nulos).
     */
    @Test
    public void testAgregarDetalleATransaccionThrowsExceptionIfNull() {
        LOG.info("Iniciando test testAgregarDetalleATransaccionThrowsExceptionIfNull");
        Concesionario concesionario = Concesionario.getInstance();
        DetalleTransaccion detalle = new DetalleTransaccion(true, null);
        VehiculoElectrico vehiculo = new VanElectrico("Tesla", "Model X", "ABC123", 0, 250, true, 80000, 200,
        2024, "500 km", "1 hora", true, 5, 6, 7, false, true, true, true);
        detalle.setVehiculo(vehiculo);
        Transaccion transaccion = new Transaccion(new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123"),
                new Empleado("Juan", "123", "password", "juan@example.com"));

        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.agregarDetalleATransaccion(null, detalle, true);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.agregarDetalleATransaccion(transaccion, null, true);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            detalle.setVehiculo(null);
            concesionario.agregarDetalleATransaccion(transaccion, detalle, true);
        });
        LOG.info("Finalizando test testAgregarDetalleATransaccionThrowsExceptionIfNull");
    }

    /**
     * Prueba para el método agregarDetalleATransaccion agregando un detalle a una
     * transacción de alquiler.
     */
    @Test
    public void testAgregarDetalleATransaccionAlquiler() {
        LOG.info("Iniciando test testAgregarDetalleATransaccionAlquiler");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        concesionario.setVehiculosAlquilados(new ArrayList<>());
        DetalleTransaccion detalle = new DetalleTransaccion(true, null);
        VehiculoElectrico vehiculo = new VanElectrico("Tesla", "Model X", "ABC123", 0, 250, true, 80000, 200,
        2024, "500 km", "1 hora", true, 5, 6, 7, false, true, true, true);
        detalle.setVehiculo(vehiculo);
        Transaccion transaccion = new Transaccion(new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123"),
                new Empleado("Juan", "123", "password", "juan@example.com"));
        concesionario.agregarDetalleATransaccion(transaccion, detalle, true);
        assertTrue(concesionario.getVehiculosAlquilados().contains(vehiculo));
        LOG.info("Finalizando test testAgregarDetalleATransaccionAlquiler");
    }

    /**
     * Prueba para el método agregarDetalleATransaccion agregando un detalle a una
     * transacción de venta.
     */
    @Test
    public void testAgregarDetalleATransaccionVenta() {
        LOG.info("Iniciando test testAgregarDetalleATransaccionVenta");
        Concesionario concesionario = Concesionario.getInstance();
        concesionario.setVehiculos(new ArrayList<>());
        concesionario.setVehiculosVendidos(new ArrayList<>());
        DetalleTransaccion detalle = new DetalleTransaccion(true, null);
        VehiculoElectrico vehiculo = new VanElectrico("Tesla", "Model X", "ABC123", 0, 250, true, 80000, 200,
        2024, "500 km", "1 hora", true, 5, 6, 7, false, true, true, true);
        detalle.setVehiculo(vehiculo);
        Transaccion transaccion = new Transaccion(new Cliente("Juan Pérez", "123456789", "555-1234", "Calle Falsa 123"),
                new Empleado("Juan", "123", "password", "juan@example.com"));
        concesionario.agregarDetalleATransaccion(transaccion, detalle, false);
        assertTrue(concesionario.getVehiculosVendidos().contains(vehiculo));
        LOG.info("Finalizando test testAgregarDetalleATransaccionVenta");
    }

    /**
     * Prueba para el método generarReportePorFechaEmpleado con assertThrows (fecha
     * o empleado nulos).
     */
    @Test
    public void testGenerarReportePorFechaEmpleadoThrowsExceptionIfNull() {
        LOG.info("Iniciando test testGenerarReportePorFechaEmpleadoThrowsExceptionIfNull");
        Concesionario concesionario = Concesionario.getInstance();
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        LocalDate fecha = LocalDate.now();
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.generarReportePorFechaEmpleado(null, empleado);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.generarReportePorFechaEmpleado(fecha, null);
        });
        LOG.info("Finalizando test testGenerarReportePorFechaEmpleadoThrowsExceptionIfNull");
    }

    /**
     * Prueba para el método generarReportePorFechaEmpleado generando un reporte sin
     * transacciones.
     */
    @Test
    public void testGenerarReportePorFechaEmpleadoSinTransacciones() {
        LOG.info("Iniciando test testGenerarReportePorFechaEmpleadoSinTransacciones");
        Concesionario concesionario = Concesionario.getInstance();
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        LocalDate fecha = LocalDate.now();
        String reporte = concesionario.generarReportePorFechaEmpleado(fecha, empleado);
        assertTrue(reporte.contains("No se encontraron transacciones"));
        LOG.info("Finalizando test testGenerarReportePorFechaEmpleadoSinTransacciones");
    }

    /**
     * Prueba para el método generarReportePorFechaEmpleado generando un reporte con
     * transacciones.
     */
    @Test
    public void testGenerarReportePorFechaEmpleadoConTransacciones() {
        LOG.info("Iniciando test testGenerarReportePorFechaEmpleadoConTransacciones");
        Concesionario concesionario = Concesionario.getInstance();
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        Cliente cliente = new Cliente("Pedro", "456", "555-6789", "Avenida Siempre Viva 742");
        Transaccion transaccion = new Transaccion(cliente, empleado);
        transaccion.setFechaTransaccion(LocalDate.now().atStartOfDay());
        empleado.getTransacciones().add(transaccion);
        concesionario.getVentas().add(transaccion);
        String reporte = concesionario.generarReportePorFechaEmpleado(LocalDate.now(), empleado);
        assertTrue(reporte.contains("Reporte de Transacciones para el empleado 'Juan'"));
        assertTrue(reporte.contains("Total de transacciones encontradas: 1"));
        LOG.info("Finalizando test testGenerarReportePorFechaEmpleadoConTransacciones");
    }

}
