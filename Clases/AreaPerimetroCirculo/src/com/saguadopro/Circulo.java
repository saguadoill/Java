package com.saguadopro;

/**
 * Clase encargada de realizar las operaciones geométricas del círculo
 */
public class Circulo {

    /**
     * Método que realiza el cálculo del área del circulo
     * @param radio - longitud del radio
     */
    public void calcularArea(double radio){

        double area = Math.PI * (Math.pow(radio,2));
//      double area = Math.PI * (radio * radio);

        System.out.printf("\n Area: %.2f", area );

    }

    /**
     * Método que realiza el cálculo del perímetro del circulo
     * @param radio - longitud del radio
     */
    public void calcularPerimetro(double radio){

        double perimetro = 2 * Math.PI * radio;

        System.out.printf("\n Perimetro: %.2f", perimetro );
    }

}
