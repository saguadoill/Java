package com.saguadopro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ejercicio 1 - Captura de Excepciones
 * <p>
 * En este primer ejercicio sobre captura de excepciones, vamos a realizar un sencillo programa
 * que solicite al usuario la introducción de un número que represente el total de argumentos
 * suministrados por línea de comandos que hay que mostrar en pantalla. Después el programa
 * presentará tantos argumentos como se indique en dicho número.
 * <p>
 * En la codificación de este programa realizaremos la captura de tres excepciones:
 * <p>
 * IOException , que es la excepción que puede lanzar el método readLine() de la clase
 * BufferedReader.
 * <p>
 * NumberFormatException , que es la excepción que puede producirse si el valor suministrado por
 * el usuario no es numérico.
 * <p>
 * ArrayIndexOutOfBoundsException , que es la excepción que puede
 * producirse si el número de argumentos suministrados es menor al valor introducido por el usuario.
 */
public class Main {

    public static void main(String[] args) {

        int numeroArgumentos = 0;

        System.out.print("Introducir datos: ");

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            numeroArgumentos = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Error en la entrada de datos");
        } catch (NumberFormatException e) {
            System.out.println("EL dato introducido no es un numero");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Esta execpcion apareceria si al ejecutar el programa desde la consola,se introducien mas de un argumento
            System.out.println("Has introducido mas de un numero");
        } finally {
            System.out.println("\nSi finally está presente, se ejecutara siempre pase lo q pase");
        }

        System.out.println("\nGenerando argumentos..");
        for (int i = 0; i < numeroArgumentos; i++) {
            System.out.print(" argumento" + i);
        }
    }
}
