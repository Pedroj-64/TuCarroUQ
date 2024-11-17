package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EditarClientesController {

    Concesionario concesionario = App.getConcesionario();

    // Método para obtener la lista de clientes
    public ObservableList<Cliente> obtenerClientes() {
        return FXCollections.observableArrayList(concesionario.getClientes());
    }

    // Método para crear un cliente
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

    // Método para eliminar un cliente
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

    // Método para actualizar un cliente
    public boolean actulizarCliente(String nombre, String identificacion, String direccion, String telefono) {
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

