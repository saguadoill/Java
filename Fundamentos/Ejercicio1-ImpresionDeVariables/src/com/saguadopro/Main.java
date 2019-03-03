package com.saguadopro;

/**
 * Ejercicio - 1
 *
 * Crear un sencillo programa que, dado un número definido en el interior de una variable, se muestre en
 * la pantalla el cuadrado de dicho número.
 */
public class Main {

    public static void main(String[] args) {

        int numero = 4;  // Podemo indicar cualquier numero entero

        //Forma sencilla
        System.out.println("El cuadrado del numero "+numero+" es: "+(numero*numero));

        //Usando clase Math.class
        System.out.println("El cuadrado del numero "+numero+" ,usando la clase Math, es: "+Math.round(Math.pow(numero,2)));

    }
}
