package com.saguadopro;

/**
 * Ejercicio - 6
 * <p>
 * Realizar un programa que, dado un determinado array de números enteros, realice el recorrido de éste
 * y muestre cada uno de estos números hasta que se encuentre un número negativo, momento en el
 * cual se finalizará el recorrido del array y se indicará el total de números recuperados.
 * Para realizar este recorrido utilizaremos una instrucción while en vez de for, ya que se desconoce el
 * número de iteraciones que debemos realizar.
 */
public class Main {

    public static void main(String[] args) {

        // Array de números que recorreremos hasta encontrar un número negativo
        int[] numeros = {5, 12, 34, 0, -4, 55, 46, 17};

        // Total de números que hemos recorrido hasta encontrar el negativo
        int totalNumerosRecuperados = 0;

        // Un contador para recorrer cada posicion del array (0, 1, 2...7 en este caso)
        int posicion = 0;

        System.out.println("============================");
        System.out.println("Comenzando la recuperacion..");
        System.out.println("============================");

        // Mientras el número dentro de la posicion indicada sea mayor o igual que cero, incrementamos el totalNumerosEncontrados para contarlos,
        // y también la variable posicion para pasar al siguiente numero. Al encontrar un numero negativo, el bucle while se detiene y el programa
        // continua su ejecución
        while (numeros[posicion] >= 0) {
            System.out.println(numeros[posicion]+" recuperado");
            totalNumerosRecuperados++;
            posicion++;
        }

        // Imprimimos en consola el resultado
        System.out.println();
        System.out.println("Numeros recuperados: " + totalNumerosRecuperados);

    }
}
