package com.saguadopro;

import java.util.Scanner;

/**
 * Ejercicio - 4
 *
 * Realizar un programa que calcule el factorial de un número existente en una determinada variable
 * entera.
 * El factorial de un número es el resultado de multiplicar entre sí todos los números naturales menores
 * comprendidos entre 1 y el número en cuestión.
 */
public class Main {

    public static void main(String[] args) {

        // Variable donde se guardará el número que indique el usuario
        int numero;

        // Creamos una variable donde guardar los resultados, se inicializa con el valor 1 para que la multiplicacion no salga 0
        int factorial = 1;

        //Creamos la solicitud de los datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("Cáculo del Factorial");
        System.out.println("====================");
        System.out.print("Introducir número entero y positivo: ");
        numero = entrada.nextInt();

        // Creamos la salida y realizamos las operaciones
        System.out.println();
        System.out.print(numero+"! = ");
        for (int i = 1; i <= numero ; i++) {
            System.out.print(i+" x ");
            factorial *=  i;
        }
        System.out.print("= "+factorial);
    }
}
