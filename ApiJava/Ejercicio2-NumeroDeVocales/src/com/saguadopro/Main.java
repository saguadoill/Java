package com.saguadopro;

import java.util.Scanner;

/**
 * Ejercicio - 2
 * <p>
 * El siguiente ejercicio consiste en realiza un programa que nos muestre el número de vocales
 * existentes en una cadena de caracteres dada.
 * En este ejercicio utilizaremos los dos métodos de la clase String vistos anteriormente para extraer
 * cada uno de los caracteres de la cadena, realizándose la comparación a través de una
 * estructura tipo switch:
 */
public class Main {

    public static void main(String[] args) {

        // Creamos un objeto Scanner para la entrada de datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable que recogera la palabra que ingrese el usuario
        String palabra;

        //Creamos un contador para saber las vocales que tiene la palabra
        int contadorVocales = 0;

        //Solicitamos los datos
        System.out.println("==================================");
        System.out.println("CUANTAS VOCALES TIENE UNA PALABRA?");
        System.out.println("==================================");

        System.out.print("Introduce una palabra: ");
        //La palabra que ingrese el usuario la ponemos en minuscula para que el switch funcione de forma correcta
        palabra = scanner.next().toLowerCase();

        // Recorrremos cada caracter del String uno a uno
        for (Character c : palabra.toCharArray()) {
            //Evaluamos si es una vocal o no. En caso afirmativo sumamos uno al contador
            switch (c) {
                case 'a':
                    contadorVocales++;
                    break;
                case 'e':
                    contadorVocales++;
                    break;
                case 'i':
                    contadorVocales++;
                    break;
                case 'o':
                    contadorVocales++;
                    break;
                case 'u':
                    contadorVocales++;
                    break;
            }
        }

        //Imprimimos el resultado por consola
        System.out.println("La palabra contriene " + contadorVocales + " vocales.");

    }
}
