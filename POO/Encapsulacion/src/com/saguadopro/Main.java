package com.saguadopro;

/**
 * Ejemplo de encapsulacion en java
 */
public class Main {

    public static void main(String[] args) {


        System.out.println("Ejemplo gato sin encapsular");
        System.out.println("===========================");

        GatoNormal gatoNormal = new GatoNormal();

//      Podemos acceder a las variablesde l objeto directamente

        gatoNormal.nombre = "Wiskas";

        gatoNormal.raza = "siames";

        gatoNormal.edad = 5;

        System.out.println("Mi gato se llama: " + gatoNormal.nombre + ", es un " + gatoNormal.raza + " y tiene " + gatoNormal.edad + " años");

        System.out.println();
        System.out.println("Ejemplo gato encapsulado");
        System.out.println("========================");

        GatoEncapsulado gatoEncapsulado = new GatoEncapsulado();

        // Solo podemos acceder a las variables a través de sus metodos get y set.
        // gatoEncapsulado.nombre = "Wiskas II"   -> esta instruccion no seria posible
        gatoEncapsulado.setNombre("Wiskas II");
        gatoEncapsulado.setRaza("siames");
        gatoEncapsulado.setEdad(5);

        System.out.println("Mi gato se llama: " + gatoEncapsulado.getNombre() + ", es un " + gatoEncapsulado.getRaza() + " y tiene " + gatoEncapsulado.getEdad() + " años");

    }
}
