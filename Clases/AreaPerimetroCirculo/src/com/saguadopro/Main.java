package com.saguadopro;

/**
 * Ejercicio - 1
 *
 * Como primer ejercicio del tema y para afianzar los conceptos sobre creación de clases y
 * objetos, vamos a desarrollar un programa que nos permita realizar cálculos geométricos (área y
 * perímetro) sobre círculos.
 * El programa recibirá como argumento de la línea de comandos el radio de un círculo y nos
 * mostrará en pantalla el área y perímetro de la figura.
 * Para ello, vamos a dividir el programa en dos clases; por un lado tendremos la clase Circulo que
 * definirá las operaciones sobre un círculo y por otro lado tendremos una clase a la que
 * llamaremos Cliente que se encargará de recuperar el radio, crear el objeto Circulo y llamar a los
 * métodos del mismo, así como presentar los resultados en pantalla.
 * El poder aislar las operaciones sobre el círculo en una clase independiente nos permite reutilizar
 * esta clase en otros programas donde se requiera realizar este tipo de cálculos,
 * independientemente de cómo se obtenga el radio y donde se vayan a presentar los resultados.
 */
public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

    }
}
