package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Controlador para gestionar las operaciones de edición de clientes.
 */
public class EditarClientesController {

    // Instancia del concesionario obtenida desde la clase App
    Concesionario concesionario = App.getConcesionario();

    /**
     * Obtiene una lista observable de clientes del concesionario.
     * 
     * @return una lista observable de clientes
     */
    public ObservableList<Cliente> obtenerClientes() {
        return FXCollections.observableArrayList(concesionario.getClientes());
    }

    /**
     * Crea un nuevo cliente y lo agrega al concesionario.
     * 
     * @param nombre el nombre del cliente
     * @param identificacion la identificación del cliente
     * @param direccion la dirección del cliente
     * @param telefono el teléfono del cliente
     * @return true si la creación del cliente fue exitosa, false en caso contrario
     */
    public boolean crearCliente(String nombre, String identificacion, String direccion, String telefono) {
        boolean banderilla = false;
        try {
            // Crear el cliente y agregarlo al concesionario
            Cliente cliente = new Cliente(nombre, identificacion, telefono, direccion);
            concesionario.agregarCliente(cliente);
            banderilla = true;  // Si no se lanza ninguna excepción, se marca como exitoso
        } catch (Exception e) {
            // Si ocurre algún error, se maneja aquí
            System.out.println("Error al crear cliente: " + e.getMessage());
        }
        return banderilla;
    }

    /**
     * Elimina un cliente del concesionario utilizando su identificación.
     * 
     * @param identificacion la identificación del cliente a eliminar
     * @return true si la eliminación del cliente fue exitosa, false en caso contrario
     */
    public boolean eliminarCliente(String identificacion) {
        boolean banderilla = false;
        try {
            // Intentar eliminar el cliente
            concesionario.eliminarCliente(identificacion);
            banderilla = true;  // Si no se lanza ninguna excepción, se marca como exitoso
        } catch (Exception e) {
            // Si ocurre algún error, se maneja aquí
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }
        return banderilla;
    }

    /**
     * Actualiza la información de un cliente existente.
     * 
     * @param nombre el nuevo nombre del cliente
     * @param identificacion la identificación del cliente
     * @param direccion la nueva dirección del cliente
     * @param telefono el nuevo teléfono del cliente
     * @return true si la actualización del cliente fue exitosa, false en caso contrario
     */
    public boolean actualizarCliente(String nombre, String identificacion, String direccion, String telefono) {
        boolean banderilla = false;
        try {
            // Intentar actualizar el cliente
            concesionario.actualizarCliente(identificacion, nombre, telefono, direccion);
            banderilla = true;  // Si no se lanza ninguna excepción, se marca como exitoso
        } catch (Exception e) {
            // Si ocurre algún error, se maneja aquí
            System.out.println("Error al actualizar cliente: " + e.getMessage());
        }
        return banderilla;
    }
}

