package com.anahuac.diplomado.interfases;

public class EscuelaNatacion extends Escuela {

    public EscuelaNatacion(String nombre) {
        super(nombre);
    }

    @Override
    public void ENSENIAR() {
        System.out.println("Enseñando natación");
    }

}
