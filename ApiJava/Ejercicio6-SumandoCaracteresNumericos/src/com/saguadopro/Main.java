package com.saguadopro;

/**
 * Ejercicio - 6
 *
 * Vamos a realizar un programa que, dado una lista de números existentes en una cadena de
 * caracteres separados por una coma (“,”), realice la suma de todos los números contenidos en la
 * misma y muestre el resultado en pantalla.
 */
public class Main {

    public static void main(String[] args) {

        String cadena = "2,4,6,8,1,0,4";

        String[] numeros = cadena.split(",");

        int suma = 0;

        for (String numero:numeros) {
            System.out.print(numero+" ");
            suma += Integer.parseInt(numero);
        }

        System.out.print("= "+suma);

    }
}
