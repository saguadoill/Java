package com.saguadopro;

/**
 * Ejercicio 5
 *
 * Realizar un programa que, dado un array de números enteros, calcule la suma de todos los números
 * contenidos en el mismo y la muestre por pantalla.
 * Se empleará una instrucción foreach para realizar el recorrido del array.
 */
public class Main {

    public static void main(String[] args) {

        // Array de enteros al cual sumaremos su contenido
        int[] listaNumeros = {1,2,3,4,5};

        // Resultado de la suma de todos los numeros del array
        int suma = 0;

        System.out.println("=========================================");
        System.out.println("Sumando coontenido de un array de enteros");
        System.out.println("=========================================");

        // Mediante un bucle foreach recorremos el array sumando sus componentes
        System.out.print("array: ");
        for (int numero: listaNumeros) {
            System.out.print(numero+" ");
            suma += numero;
        }

        // Imprimimos por consola el resultado
        System.out.println();
        System.out.println("suma: "+suma);

    }
}
