package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.*;

public class ConcesionarioTest {

    private static final Logger LOG = Logger.getLogger(ConcesionarioTest.class.getName());
    private Concesionario concesionario;

    @BeforeEach
    public void setUp() {
        concesionario = concesionario.getInstance();
        concesionario.setEmpleados(new ArrayList<>());
    }

    /**
     * Prueba para el método existeEmpleado con assertThrows.
     */
    @Test
    public void testExisteEmpleadoThrowsException() {
        LOG.info("Iniciando test testExisteEmpleadoThrowsException");
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.existeEmpleado(null);
        });
        LOG.info("Finalizando test testExisteEmpleadoThrowsException");
    }

    /**
     * Prueba para el método existeEmpleado con un empleado existente.
     */
    @Test
    public void testExisteEmpleadoTrue() {
        LOG.info("Iniciando test testExisteEmpleadoTrue");
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        concesionario.agregarEmpleado(empleado);
        assertTrue(concesionario.existeEmpleado("123"));
        LOG.info("Finalizando test testExisteEmpleadoTrue");
    }

    /**
     * Prueba para el método existeEmpleado con un empleado no existente.
     */
    @Test
    public void testExisteEmpleadoFalse() {
        LOG.info("Iniciando test testExisteEmpleadoFalse");
        assertFalse(concesionario.existeEmpleado("999"));
        LOG.info("Finalizando test testExisteEmpleadoFalse");
    }

    /**
     * Prueba para el método agregarEmpleado con assertThrows.
     */
    @Test
    public void testAgregarEmpleadoThrowsException() {
        LOG.info("Iniciando test testAgregarEmpleadoThrowsException");
        assertThrows(IllegalArgumentException.class, () -> {
            concesionario.agregarEmpleado(null);
        });
        LOG.info("Finalizando test testAgregarEmpleadoThrowsException");
    }

    /**
     * Prueba para el método agregarEmpleado agregando un nuevo empleado.
     */
    @Test
    public void testAgregarEmpleado() {
        LOG.info("Iniciando test testAgregarEmpleado");
        Empleado empleado = new Empleado("Juan", "123", "password", "juan@example.com");
        concesionario.agregarEmpleado(empleado);
        assertTrue(concesionario.existeEmpleado("123"));
        LOG.info("Finalizando test testAgregarEmpleado");
    }
}
