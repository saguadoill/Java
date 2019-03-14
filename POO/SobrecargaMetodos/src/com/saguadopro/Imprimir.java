package com.saguadopro;

/**
 * Clase que imprime por consola una frase. Ejemplo sobrecarga de métodos
 */
public class Imprimir {

    public void porConsola(){
        System.out.println("Imprimo nada");
    }

    public void porConsola(String palabra){
        System.out.println("Imprimo una palabra: "+palabra);
    }

    public void porConsola(int numero){
        System.out.println("Imprimo un numero: "+numero);
    }

    public void porConsola(String palabra,int numero){
        System.out.println("Imprimo una palabra: "+palabra+". Y un numero: "+numero);
    }

    public String porConsola(String palabra,int numero,boolean condicion){
        return "Retorno la palabra: "+palabra+", el numero: "+numero+" y la condicion: "+condicion;
    }
}
