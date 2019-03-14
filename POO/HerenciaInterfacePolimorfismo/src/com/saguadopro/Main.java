package com.saguadopro;

import java.time.LocalDate;

/**
 * Programa para una biblioteca que contenga libros y revistas.
 * <p>
 * 1- Las características comunes que se almacenan tanto para las revistas como para los libros son el código, el título, y el año de publicación.
 * Estas tres características se pasan por parámetro en el momento de crear los objetos.
 * <p>
 * 2- Los libros tienen además un atributo prestado. Los libros, cuando se crean, no están prestados.
 * <p>
 * 3- Las revistas tienen un número. En el momento de crear las revistas se pasa el número por parámetro.
 * <p>
 * 4- Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() que devuelve
 * el valor de todos los atributos en una cadena de caracteres. También tienen un método que devuelve el año de publicación, y otro el código.
 * <p>
 * 5- Para prevenir posibles cambios en el programa se tiene que implementar una interfaz Prestable
 * con los métodos prestar(), devolver() y prestado. La clase Libro implementa esta interfaz
 */
public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro(1, "La Celestina", 1499);
        Libro libro2 = new Libro(2, "Don Quijote", 1605);

        System.out.println("Movimientos libro 1");
        System.out.println("===================");

        movimiento(libro1);

        System.out.println();
        System.out.println("Movimientos libro 2");
        System.out.println("===================");

        movimiento(libro2);

    }

    private static void movimiento(Publicacion publicacion) {

        Prestable prestable = (Prestable) publicacion;

        System.out.println(publicacion);

        prestable.prestar();

        System.out.println(publicacion);

        prestable.devolver();

        System.out.println(publicacion);


    }
}
