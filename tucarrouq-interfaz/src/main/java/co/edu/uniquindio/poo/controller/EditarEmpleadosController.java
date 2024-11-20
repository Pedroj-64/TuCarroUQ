package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Controlador para gestionar las operaciones de edición de empleados.
 */
public class EditarEmpleadosController {
    
    // Instancia del concesionario obtenida desde la clase App
    Concesionario concesionario = App.getConcesionario();

    /**
     * Obtiene una lista observable de empleados del concesionario.
     * 
     * @return una lista observable de empleados
     */
    public ObservableList<Empleado> obtenerEmpleados() {
        return FXCollections.observableArrayList(concesionario.getEmpleados());
    }

    /**
     * Crea un nuevo empleado y lo agrega al concesionario.
     * 
     * @param nombre el nombre del empleado
     * @param contrasena la contraseña del empleado
     * @param identificacion la identificación del empleado
     * @param emailRecuperacion el correo electrónico de recuperación del empleado
     * @param rangoEmpleado el rango del empleado (puede ser "empleado" o "administrador")
     * @return true si la creación del empleado fue exitosa, false en caso contrario
     */
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

    /**
     * Elimina un empleado del concesionario utilizando su identificación.
     * 
     * @param identificacion la identificación del empleado a eliminar
     * @return true si la eliminación del empleado fue exitosa, false en caso contrario
     */
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

    /**
     * Actualiza la información de un empleado existente.
     * 
     * @param nombre el nuevo nombre del empleado
     * @param identificacion la identificación del empleado
     * @param contrasena la nueva contraseña del empleado
     * @param emailDeRecuperacion el nuevo correo electrónico de recuperación del empleado
     * @param cargo el nuevo cargo del empleado (puede ser "empleado" o "administrador")
     * @return true si la actualización del empleado fue exitosa, false en caso contrario
     */
    public boolean actualizarEmpleado(String nombre, String identificacion, String contrasena, String emailDeRecuperacion, String cargo) {
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
            if(cargo.toLowerCase().equals("administrador")){
                Administrador administrador = new Administrador(nombre, identificacion, contrasena, emailDeRecuperacion);
                concesionario.agregarAdministrador(administrador);
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar empleado: " + e.getMessage());
        }
        return banderilla;
    }

}
