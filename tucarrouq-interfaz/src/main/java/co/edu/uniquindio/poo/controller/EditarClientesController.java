package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EditarClientesController {

    Concesionario concesionario = App.getConcesionario();


    public ObservableList<Cliente> obtenerClientes(){
        return FXCollections.observableArrayList(concesionario.getClientes());
    }

    public boolean crearCliente(String nombre,String identificacion,String direccion, String telefono ){
        boolean banderilla=false;

        Cliente cliente = new Cliente(nombre, identificacion, telefono, direccion);
        concesionario.agregarCliente(cliente);

        return banderilla;
    }

    public boolean eliminarCliente(String identificacion){

        boolean banderilla=false;

        concesionario.eliminarCliente(identificacion);

        return banderilla;
    }

    public boolean actulizarCliente(String nombre,String identificacion,String direccion, String telefono){
        boolean banderilla=false;
        concesionario.actualizarCliente(identificacion, nombre, telefono, direccion);
        return banderilla;
    }
    
}
