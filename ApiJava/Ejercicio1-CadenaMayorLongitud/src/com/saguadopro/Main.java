package com.saguadopro;

/**
 * Ejercicio - 1
 * <p>
 * En este ejercicio vamos a crear un programa que de todas las cadenas de caracteres
 * suministradas desde la línea de comandos al iniciar la ejecución del programa (recordemos que
 * cada cadena se separa de la siguiente por un espacio), nos muestre la cadena de mayor
 * longitud.
 */
public class Main {

    public static void main(String[] args) {

        /*La entrada de datos por consola seria algo parecido a esto:

           java main casa murcielago coche amarillo

          Para simularlo creamos un array de Strings llamado cadena que equivaldria a String[] args del metodo Main
         */
        String listaPalabras[] = {"casa", "murcielago", "coche", "amarillo"};

        // Creamos un string donde almacenaremos la palabra mas larga
        String palabraMasLarga = "";

        // Recorremos todas las palabras y si la palabra en la que estemos es mas larga que la variable palabraMasLarga, la guardamos e esta, sustituyendo siempre la que sea mas larga
        for (String palabra : listaPalabras) {

            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        //Imprimimos por consola el resultado
        System.out.println("La palabra mas larga es: " + palabraMasLarga);

    }
}
