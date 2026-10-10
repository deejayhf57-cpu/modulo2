package com.anahuac.diplomado.interfases;

public class EscuelaIdiomas extends Escuela implements Certificable {

    public EscuelaIdiomas(String nombre) {
        super(nombre);
    }

    @Override
    public void ENSENIAR() {
        System.out.println("Enseñando idiomas");
    }

    @Override
    public void evaluar() {
        System.out.println("Evaluando conocimientos de idiomas");
    }

    @Override
    public void emitirCertificado() {
        System.out.println("Emitiendo certificado de idiomas");
    }

}
