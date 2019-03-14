package com.saguadopro;

public class Revista extends Publicacion {

    private int numero;


    public Revista(int codigo, String titulo, int añoPublicacion, int numero) {
        super(codigo, titulo, añoPublicacion);
        this.setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
