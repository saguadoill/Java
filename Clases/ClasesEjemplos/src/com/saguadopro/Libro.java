package com.saguadopro;

/**
 * Clase que gestiona la informacion de un libro
 */
public class Libro {

    private String titulo;
    private String autor;
    private String editorial;
    private Boolean estaPrestado;

    public Libro() {

    }

    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Boolean getEstaPrestado() {
        return estaPrestado;
    }

    public void setEstaPrestado(Boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    public void prestamo() {
        this.setEstaPrestado(true);
    }

    public void devolucion() {
        this.setEstaPrestado(false);
    }

    @Override
    public String toString() {
        return "" + getTitulo() + " de " + getAutor() + " ,editado por " + getEditorial();
    }
}
