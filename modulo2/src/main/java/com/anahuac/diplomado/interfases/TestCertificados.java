package com.anahuac.diplomado.interfases;

import java.util.ArrayList;

public class TestCertificados {
    public static void main(String[] args) {
        Certificable escuela1 = new EscuelaIdiomas("Escuela de ingles");
        Certificable escuela2 = new EscuelaIdiomas("Acuatica Patito");
        Certificable escuela3 = new EscuelaIdiomas("Universidad Patito");

        SimuladorCertificaciones simulador = new SimuladorCertificaciones();
        simulador.certificar(new ArrayList<Certificable>() {{
            add(escuela1);
            add(escuela2);
            // La escuela de natación no implementa Certificable, por lo que no se puede agregar aquí
        }});
    }

}
