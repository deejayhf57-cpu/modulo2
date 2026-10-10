package com.anahuac.diplomado.interfases;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        FileWriter archivo;

        try {
            archivo = new FileWriter(nombreArchivo);
            PrintWriter pw = new PrintWriter(archivo);
            pw.println("Hola bienvenido al diplomado de programacion");
            pw.println("\ten Java");
            pw.println("\nEsta es otra linea");
            pw.close();
            System.out.println("Archivo creado correctamente: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: ");
            e.printStackTrace();
        }
    }
}
