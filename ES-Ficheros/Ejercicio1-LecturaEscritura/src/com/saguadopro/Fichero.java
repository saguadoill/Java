package com.saguadopro;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * Clase encargada de leer y escribir en un fichero
 */
public class Fichero {

    // Ruta absoluta del archivo que vamos a manipular
    private URL url;
    // Objeto que referencia al archivo
    private File file;

    /**
     * Contructor que al inicializar genera la reeferencia al archivo
     */
    public Fichero(){
        url = getClass().getResource("/com/saguadopro/notas.txt");
        file = new File(url.getPath());
    }

    /**
     * Matodo que lee el contenido del archivo de texto
     */
    public void leer(){

        // Variable que contendra cada linea del archivo
        String cadena;

        // Dentro de un bloque try/catch para capturar las posibles excepciones
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("\n - Salida fichero -");
            while ((cadena = bufferedReader.readLine()) != null){
                System.out.println(cadena);
            }

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo que añade contenido dentro del fichero
     */
    public void escribir(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introducir frase para añadir al archivo:");
            String frase = scanner.nextLine();

            // Al crear el FileWriter hay q añadir el parametro 'true', para que escriba a contionuacion y no borre nada del contenido.
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append("\n"+frase);
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
