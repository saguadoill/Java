package com.saguadopro;


/**
 * Ejercicio 2 - Lanzamiento de Excepciones
 */
public class Main {

    public static void main(String[] args) throws MisExcepciones {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i>5){
                throw new MisExcepciones("Ya es mayor que 6");
            }
        }

    }
}
