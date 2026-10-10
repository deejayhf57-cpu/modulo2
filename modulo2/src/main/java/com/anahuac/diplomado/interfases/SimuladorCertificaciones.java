package com.anahuac.diplomado.interfases;

import java.util.ArrayList;

public class SimuladorCertificaciones {
    public  void certificar (ArrayList<Certificable> escuelas) {
        for (Certificable escuela : escuelas) {
            escuela.evaluar();
            escuela.emitirCertificado();
        }
    }

}
