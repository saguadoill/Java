package com.saguadopro;

import java.util.Scanner;

/**
 * Ejercicio - 2
 *
 * Realizar un programa que dado un determinado número entero almacenado en una variable nos
 * muestre un mensaje en la consola indicando si el número es par o impar.
 * El programa lo escribiremos dentro del método main() de la clase.
 * PISTA: Para saber si un número es par o impar debemos comprobar el resto de la división entre ese
 * número y 2. Si el resultado es 0 el número es par, sino es impar.
 */
public class Main {

    public static void main(String[] args) {

        //Variable donde almacenaremos el número introducido
        int numero;

        //Solicitamos por consola un número entero
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introducir numero entero: ");
        numero = entrada.nextInt();

        //Comprobamos si el numero dividiendolo entre 2, el resto da 0
        if (numero%2 == 0){
            System.out.println("El numero "+numero+" es: PAR");
        }else {
            System.out.println("El numero "+numero+" es: IMPAR");
        }

    }
}
