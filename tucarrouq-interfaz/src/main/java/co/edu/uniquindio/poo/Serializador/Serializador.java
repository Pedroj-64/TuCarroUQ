package co.edu.uniquindio.poo.Serializador;

import java.io.*;

import co.edu.uniquindio.poo.model.Concesionario;

public class Serializador {

    /**
     * Guarda el estado de un objeto Concesionario en un archivo.
     * @param concesionario El objeto Concesionario a serializar.
     * @param archivo La ruta del archivo donde se guardará el objeto.
     * @throws IOException Si ocurre un error durante la escritura del archivo.
     */
    public static void guardarEstado(Concesionario concesionario, String archivo) throws IOException {
        File file = new File(archivo);
        System.out.println("Guardando el archivo en: " + file.getAbsolutePath());
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(concesionario);
        }
    }

 

    /**
     * Carga el estado de un objeto Concesionario desde un archivo.
     * @param archivo La ruta del archivo desde donde se cargará el objeto.
     * @return El objeto Concesionario deserializado.
     * @throws IOException Si ocurre un error durante la lectura del archivo.
     * @throws ClassNotFoundException Si no se encuentra la clase del objeto deserializado.
     */
    public static Concesionario cargarEstado(String archivo) throws IOException, ClassNotFoundException {
        File file = new File(archivo);
        System.out.println("Cargando el archivo desde: " + file.getAbsolutePath());
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Concesionario) ois.readObject();
        }
    }
}








