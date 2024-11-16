package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EditarEmpleadosController {
    
    Concesionario concesionario = App.getConcesionario();

    public ObservableList<Empleado> obtenerEmpleados() {
        return FXCollections.observableArrayList(concesionario.getEmpleados());
    }

    public boolean crearEmpleado(String nombre, String contrasena, String identificacion, String emailRecuperacion, String rangoEmpleado) {
        boolean banderilla = false;
        try {
            switch (rangoEmpleado.toLowerCase()) {
                case "empleado":
                    Empleado nuevoEmpleado = new Empleado(nombre, identificacion, contrasena, emailRecuperacion);
                    concesionario.agregarEmpleado(nuevoEmpleado);
                    banderilla = true;
                    break;
                case "administrador":
                    if (concesionario.existeEmpleado(identificacion)) {
                        Administrador nuevoEmpleadoAdmin = new Administrador(nombre, identificacion, contrasena, emailRecuperacion);
                        concesionario.agregarAdministrador(nuevoEmpleadoAdmin);
                        banderilla = true;
                    } else {
                        System.out.println("El administrador debe ser un empleado existente.");
                    }
                    break;
                default:
                    System.out.println("Rango de empleado no válido.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error al crear empleado: " + e.getMessage());
        }
        return banderilla;
    }

    public boolean eliminarEmpleado(String identificacion) {
        boolean banderilla = false;
        try {
            concesionario.eliminarEmpleado(identificacion);
            banderilla = true;
        } catch (Exception e) {
            System.out.println("Error al eliminar empleado: " + e.getMessage());
        }
        return banderilla;
    }

    public boolean actualizarEmpleado(String nombre, String identificacion, String contrasena, String emailDeRecuperacion) {
        boolean banderilla = false;
        try {
            Empleado empleadoExistente = concesionario.obtenerEmpleado(identificacion);
            if (empleadoExistente != null) {
                empleadoExistente.setNombre(nombre);
                empleadoExistente.setContrasena(contrasena);
                empleadoExistente.setEmailDeRecuperacion(emailDeRecuperacion);
                banderilla = true;
            } else {
                System.out.println("El empleado no existe.");
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar empleado: " + e.getMessage());
        }
        return banderilla;
    }
}
