package com.saguadopro;

/**
 * Clase que gestiona un contador
 */
public class Contador {

    private int contador;

    public Contador() {
    }

    public Contador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void incrementar() {
        contador++;
    }

    public void decrementar() {
        contador--;
    }
}
