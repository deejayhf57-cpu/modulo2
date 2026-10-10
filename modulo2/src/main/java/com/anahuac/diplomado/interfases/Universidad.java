package com.anahuac.diplomado.interfases;

public class Universidad extends Escuela implements Certificable {

    public Universidad(String nombre) {
        super(nombre);
    }

    @Override
    public void ENSENIAR() {
        System.out.println("Enseñando en la universidad");
    }

    @Override
    public void evaluar() {
        System.out.println("Evaluando conocimientos en la universidad");
    }

    @Override
    public void emitirCertificado() {
        System.out.println("Emitiendo certificado de la universidad");
    }
}
