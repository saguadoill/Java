package com.saguadopro;

import java.util.Scanner;

/**
 * Clase encargada de solicitar el radio al usuario
 */
public class Cliente {

    public Cliente() {

        // Creamos un objeto Scanner para controlar la entrada por consola
        Scanner scanner  = new Scanner(System.in);

        // Creamos un objeto Circulo para poder usar sus metodos
        Circulo circulo = new Circulo();

        // Variable que contendrá la longitud del círculo dada por el usuario
        double radio;

        // Solicitamos los datos
        System.out.println("==================================");
        System.out.println("CALCULOS GEOMETRICOS DE UN CIRCULO");
        System.out.println("==================================");
        System.out.println();
        System.out.print("Introducir radio del circulo: ");
        radio = scanner.nextDouble();

        // Realizamos los calculos usando lso metodos del objeto Circulo creado anteriormente
        circulo.calcularArea(radio);
        circulo.calcularPerimetro(radio);
    }
}
