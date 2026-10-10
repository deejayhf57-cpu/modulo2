package com.anahuac.diplomado.interfases;

import java.util.ArrayList;

public abstract class Escuela { 
    private ArrayList<String> alumnos = new ArrayList<>();
    private ArrayList<String> maestros = new ArrayList<>();
    private String nombre;

    public Escuela(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getAlumnos() {
        return alumnos;
    }

    public ArrayList<String> getMaestros() {
        return maestros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAlumnos(ArrayList<String> alumnos) {
        this.alumnos = alumnos;
    }

    public void setMaestros(ArrayList<String> maestros) {
        this.maestros = maestros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pagar(String alumno) {
        alumnos.add(alumno);
    }

    public void pagar() {
        System.out.println("El alumno ha pagado");
    }

    abstract public void ENSENIAR();
}
