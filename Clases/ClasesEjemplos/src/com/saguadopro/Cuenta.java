package com.saguadopro;

/**
 * Clase para gestionar las operaciones de una cuenta bancaria
 */
public class Cuenta {

    private double numeroCuenta;
    private String dniTitular;
    private double deposito;

    /**
     * Al tener un constructor definido, el contructor por defecto deja de tener uso y no funcionaria:
     *
     * Cuenta cuenta = new Cuenta();   --> No podria instanciarse asi
     */


    /**
     * Contructor copia
     */
    public Cuenta(Cuenta cuenta) {
        this.numeroCuenta = cuenta.numeroCuenta;
        this.dniTitular = cuenta.dniTitular;
        this.deposito = cuenta.deposito;
    }

    /**
     * Contructor con parámetros
     */
    public Cuenta(double numeroCuenta, String dniTitular) {
        this.numeroCuenta = numeroCuenta;
        this.dniTitular = dniTitular;
    }

    public double getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(double numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void ingreso(double cantidad) {
        this.setDeposito(this.getDeposito() + cantidad);
    }

    public void reintegro(double cantidad) {
        this.setDeposito(this.getDeposito() - cantidad);
    }

    public void transferencia(double cantidad, Cuenta cuenta) {
        this.setDeposito(this.getDeposito() - cantidad);
        cuenta.ingreso(cantidad);
    }


}
