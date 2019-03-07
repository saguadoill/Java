package com.saguadopro;

import java.util.Scanner;

/**
 * Clase que dado un objeto de la clase String cuente diferentes tipos de caracteres.
 * En particular, el método deberá imprimir el número de letras, dígitos y espacios en blanco de la cadena
 */
public class CuantosTipoCaracteres {

    public CuantosTipoCaracteres(){

        // Creamos objeto Scanner para controlar la entrada por consola
        Scanner scanner = new Scanner(System.in);

        // Variable que contendrá lo que introduzca el usuario
        String cadena;

        // Solicitamos datos al usuario
        System.out.println("=================");
        System.out.println("CUANTOS TIPOS DE CARACTERES TIENE TU FRASE");
        System.out.println("=================");
        System.out.print("Introduzca frase: ");

        cadena = scanner.nextLine();

        int letras = 0,digitos = 0,espacios = 0,otraCosa = 0;

        // Recorremos el String y usando la clase nevoltorio Character, comprobamos si el caracter indicado es una letra, numero o espacio en blanco.
        for (char c : cadena.toCharArray()) {
            if (Character.isLetter(c)){
                letras++;
            }else if (Character.isDigit(c)){
                digitos++;
            }else if (Character.isWhitespace(c)){
                espacios++;
            }else {
                otraCosa++;
            }
        }

        // Imprimimos los resultados por consola
        System.out.println("La frase tiene:");
        System.out.println(letras+" letras");
        System.out.println(digitos+" numeros");
        System.out.println(espacios+" espacios en blanco");
    }

}
