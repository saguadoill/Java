package com.saguadopro;

/**
 * Ejercicio - 4
 *
 * En este ejercicio vamos a realizar un programa que nos muestre la suma de todos los números
 * enteros comprendidos entre dos números aleatorios generados por el propio programa. Los
 * números aleatorios serán mayores de 0 y menores de 100.
 */
public class Main {

    public static void main(String[] args) {

        int numero1 = 0;
        int numero2 = 0;
        int suma = 0;


        while (numero1 == numero2){
            numero1 = Math.round((float) (Math.random()*100));
            numero2 = Math.round((float) (Math.random()*100));
        }

        //FORMA SENCILLA

//        if (numero1<numero2){
//            System.out.println("Primer numero: "+numero1);
//            System.out.println("Segundo nuemro: "+numero2);
//            for (int i = numero1; i <= numero2 ; i++) {
//                System.out.print(i+" + ");
//                suma += i;
//            }
//
//        }else {
//            System.out.println("Primer numero: "+numero2);
//            System.out.println("Segundo nuemro: "+numero1);
//            for (int i = numero2; i <= numero1 ; i++) {
//                System.out.print(i+" + ");
//                suma += i;
//            }
//        };

        //Otra forma de hacerlo sin sepetir el bucle for para las dos opciones
        for (int i = numeroMenor(numero1,numero2); i <= numeroMayor(numero1,numero2); i++) {
            System.out.print(i + " + ");
            suma += i;
        }

        System.out.println("Suma total: "+suma);

    }

    public static int numeroMayor(int numero1,int numero2){
        if (numero1 > numero2){
            return numero1;
        }else {
            return numero2;
        }
    };

    public static int numeroMenor(int numero1,int numero2){
        if (numero1 < numero2){
            return numero1;
        }else {
            return numero2;
        }
    };
}
