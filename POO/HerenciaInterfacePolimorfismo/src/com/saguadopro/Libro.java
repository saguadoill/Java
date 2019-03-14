package com.saguadopro;


public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(int codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.setPrestado(false);
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro: " + getCodigo() +
                "\n Titulo: " + getTitulo() +
                "\n Fecha publicacion: " + getAñoPublicacion() +
                "\n En prestamo? " + (isPrestado() ? "Si" : "No");
    }

    @Override
    public void prestar() {
        this.setPrestado(true);
    }

    @Override
    public void devolver() {
        this.setPrestado(false);
    }

    @Override
    public Boolean prestado() {
        boolean estaPrestado;
        if (this.isPrestado()) {
            estaPrestado = true;
        } else {
            estaPrestado = false;
        }
        return estaPrestado;
    }
}
