package com.saguadopro;

import java.io.*;
import java.util.Scanner;

/**
 * Ejercicio - 5
 * <p>
 * En este ejercicio crearemos un sencillo programa que solicite al usuario la introducción de dos
 * números y muestre en la consola un mensaje indicando cual es el mayor y cual el menor de los
 * números suministrados.
 */
public class Main {

    private static int numero1;
    private static int numero2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // La forma mas sencilla seria la clase Scanner

        System.out.println("Introduce el primer numero: ");
        numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo numero: ");
        numero2 = scanner.nextInt();


        // Otra de las forma, por ejemplo, serí con BufferedReader

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.println("Introduce el primer numero: ");
            numero1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Introduce el segundo numero: ");
            numero2 = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


        // El siguiente código evalua cual de los dos numero es mayor
        if (numero1 > numero2) {
            System.out.println("EL mayor de los numeros es " + numero1 + " y el menos es " + numero2);
        } else {
            System.out.println("EL mayor de los numeros es " + numero2 + " y el menos es " + numero1);
        }

    }
}
