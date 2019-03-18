package com.saguadopro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        init();
    }

    public static void init() {

        Scanner scanner = new Scanner(System.in);
        Fichero fichero = new Fichero();
        int opcion = 0;

        do {
            System.out.println("=================================");
            System.out.println("Programa modificacion archivo TXT");
            System.out.println("=================================");

            System.out.println("1 - Leer");
            System.out.println("2 - Escribir");
            System.out.println("0 - Salir");
            System.out.print("Elegir opcion: ");
            try {
                opcion = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("\n \033[0;31m Por favor introduce el NUMERO de la opcion deseada \033[0m \n");
                init();
            }

            switch (opcion) {
                case 1:
                    fichero.leer();
                    break;
                case 2:

                    fichero.escribir();
                    break;
                default:
                    System.out.println("Esa opción no está disponible!!");
            }

        } while (opcion != 0);
        System.out.println("Adios!!");
    }
}
