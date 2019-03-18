package com.saguadopro;

import java.io.*;
import java.net.URL;

/**
 * Clase que realiza las ooperaciones de entrada y salidad de datos
 */
public class Datos {

    private URL url;

    private File file;

    /**
     * Constructor que genera la ruta al archivo
     */
    public Datos() {
        url = getClass().getResource("/com/saguadopro/notas.dat");
        file = new File(url.getPath());
    }

    /**
     * Método que recoge y escribe las notas en el archivo en bytes
     * @param notas - String con las notas
     */
    public void recogerNotas(String notas) {

        // En esta primera parte pasamos el String a un array Double con todas las notas por separado
        String[] listaNotas = notas.split(",");
        double[] numerosNotas = new double[listaNotas.length];
        for (int i = 0; i < listaNotas.length; i++) {
            numerosNotas[i] = Double.parseDouble(listaNotas[i]);
        }

        // En la segunda parte, escribimos los datos en el archivo
        try {
            new FileOutputStream(file).close();
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            // Primero escribimos la cantidad de datos(como para inicializarlo) y luego los añadimos uno a uno
            dataOutputStream.writeDouble(numerosNotas.length);
            for (int i = 0; i < numerosNotas.length; i++) {
                dataOutputStream.writeDouble(numerosNotas[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Método que lee los datos del archivo, suma sus cifras y devuelve la media
     */
    public void calcularMedia() {

        double media = 0;
        int numeroNotasIntroducidas = 0;

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            /* Primero leemos la cantidad de datos(como para inicializarlo) y luego los leemos uno a uno.
               Introducimos un contador llamado numeroNotasIntroducida para calcular luego la media */
            double len = dataInputStream.readDouble();
            for (int i = 0; i < len; i++) {
                media += dataInputStream.readDouble();
                numeroNotasIntroducidas++;
            }
            media = media / numeroNotasIntroducidas;
            System.out.println("\n La nota media es: " + media + " \n");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
