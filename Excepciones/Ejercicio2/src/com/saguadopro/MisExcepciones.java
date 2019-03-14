package com.saguadopro;

import java.io.IOException;

public class MisExcepciones extends Exception {

    public MisExcepciones() {
        super("Excepcion general");
    }

    public MisExcepciones(String mensaje){
//        super(mensaje);
        System.out.println(mensaje);
    }

}
