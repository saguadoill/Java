package com.saguadopro;

/**
 * Ejercicio - 3
 *
 * Vamos a realizar un ejercicio en el que, dada una determinada cadena de caracteres, se
 * inserte una barra / adicional entre palabras.
 * Mediante el método indexOf() se irán buscando las posiciones donde se encuentran los espacios
 * para insertar el espacio adicional, operación esta que será́ realizada a través del método insert().
 */
public class InsertarBarra {

    public InsertarBarra(){

        String frase = "En un lugar de la Mancha..";

        System.out.println("==================================");
        System.out.println("Insertar \"/\" dentro de una frase");
        System.out.println("==================================");


        StringBuffer stringBuffer = new StringBuffer(frase);
        int longuitudFrase = stringBuffer.length();

        for (int i = 0; i < longuitudFrase; i++) {

            if (stringBuffer.charAt(i) == ' '){

                stringBuffer.insert(i,'/');
                i++;
            }

        }
        System.out.println("Frase original -> "+frase);
        System.out.println("Frase modificada -> "+stringBuffer.toString());

    }

}
