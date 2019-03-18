package com.saguadopro;

import java.util.Scanner;

/**
 * En este ejercicio daremos la opcion de introducir las notas de un alumno y calcular su nota media
 */
public class Main {

    /**
     * Método Main que genera el menu y solicita los datos al usuario
     * @param args
     */
    public static void main(String[] args) {

        Datos datos = new Datos();
        Scanner scanner = new Scanner(System.in);
        int seleccion;

        do {
            System.out.println("==================");
            System.out.println("CALCULO NOTA MEDIA");
            System.out.println("==================");
            System.out.println("1- Introducir notas:");
            System.out.println("2- Calcular Media");
            System.out.println("0- Salir");
            System.out.print("->:");

            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Introducir notas separadas por comas (5,6.25,7....)");
                    String notas = entrada.nextLine();
                    datos.recogerNotas(notas);
                    break;
                case 2:
                    datos.calcularMedia();
                    break;
                case 0:
                    System.out.println("Gracias por usar este preograma!!");
                    break;
                default:
                    System.out.println("Esa opcion no está disponible!");
            }
        } while (seleccion != 0);

    }
}
