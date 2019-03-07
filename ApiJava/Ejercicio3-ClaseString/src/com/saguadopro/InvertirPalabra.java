package com.saguadopro;

import java.util.Scanner;

/**
 * Clase que dad una palabra o frase , invierte sus caracteres y los  imprime por pantalla
 */
public class InvertirPalabra {

    public InvertirPalabra(){

        // Creamos objeto Scanner para controlar la entrada por consola
        Scanner scanner = new Scanner(System.in);

        // Variable que contendrá lo que introduzca el usuario
        String cadena;

        // Variable donde almacenaremos la cadena anterior invertida
        String cadeaInvertida;

        // Solicitamos datos al usuario
        System.out.println("=================");
        System.out.println("INVERTIR PALABRAS");
        System.out.println("=================");
        System.out.print("Introduzca palabra o frase: ");

        cadena = scanner.nextLine();

        // Realizamos la operacion usando StringBuilder
        System.out.println("---------------------");
        System.out.println("Usando StringBuilder:");
        StringBuilder cadenaSB = new StringBuilder();

        // Recorremos cada caracter de la frase o palabra
        for (char c: cadena.toCharArray()) {
            // Insertamos siempre en la posicion cero, el caracter por el que pasamos
            cadenaSB.insert(0,c);

        }
        cadeaInvertida = cadenaSB.toString();
        System.out.println(cadeaInvertida);

        // Realizamos la operacion usando String
        System.out.println("-------------");
        System.out.println("Usando String");

        // Volvemos a poner el valor de cadenaInvertida  vacio
        cadeaInvertida = "";
        // En este caso lo que hacemos es recorrer la frase o palabra desde el final hacia el principio, añadiendo cada caracter al string cadenaInvertida
        for (int i = cadena.length()-1; i >= 0 ; i--) {

          cadeaInvertida += cadena.charAt(i);

        }
        System.out.println(cadeaInvertida);
    }

}
