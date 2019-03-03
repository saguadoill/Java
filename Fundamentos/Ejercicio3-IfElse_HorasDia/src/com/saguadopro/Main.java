package com.saguadopro;

import java.util.Scanner;

/**
 * Ejercicio - 3
 * <p>
 * Realizar un programa que a partir de un número almacenado en una determinada variable entera, que
 * representará la hora del día y por tanto estará́ comprendido entre 1 y 24, nos de los buenos días, las
 * buenas tardes o las buenas noches.
 * El programa deberá́ ser capaz de comprobar si el número está realmente comprendido entre ese rango
 * pues, en caso contrario, nos mostrará un mensaje de error.
 */
public class Main {

    public static void main(String[] args) {

        //Variable donde se almacenara la hora que introduzca el usuario
        int hora;

        //Creamos la entrada del usuario y solicitamos el dato
        Scanner entrada = new Scanner(System.in);

        System.out.println("Que hora es?");
        System.out.print("Son las (0-23): ");
        hora = entrada.nextInt();

        /*Realizamos la lógica if else
         * 6-12   -> buenos dias
         * 13-20  -> buenas tardes
         * 20 -24 y 0- 5 -> buenas noches
         */

        if (hora >= 6 & hora <= 12) {
            System.out.println("Hola, buenos dias!");
        } else if (hora >= 13 & hora <= 20) {
            System.out.println("Hola, buneas tardes!");
        } else {
            System.out.println("Hola, buneas noches!!");
        }

    }
}
