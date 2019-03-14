package com.saguadopro;

/**
 * Clase principal para probrar la sobrecarga de metodos.
 */
public class Main {

    public static void main(String[] args) {

        Imprimir imprimir = new Imprimir();

        imprimir.porConsola();

        imprimir.porConsola(5);

        imprimir.porConsola("amarillo");

        imprimir.porConsola("rosa",29);

        System.out.println(imprimir.porConsola("margarita",4,true));

    }
}
