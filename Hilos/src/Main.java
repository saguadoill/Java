import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Aplicacion de consola en forma de juego para ver una de las muchas utilizaciones de los hilos en Java
 * @author saguadopro
 */
public class Main {

    //Lista de ganadores donde se iran añadiendo el nombre de los guerreros segun vayan terminando
    public static List<String> ganadores;

    //Nombre del guerrero elegido por el usuario
    private static String guerreroElegido;

    private static int eleccion;

    /**
     * Creamos un menu que se ejecutará hasta que seleccionemos la opcion de Salir
     *
     * @param args
     */
    public static void main(String[] args) {

        while (eleccion != 3) {
            menu();
        }

    }

    /**
     * Método que genera un sencillo menú para seleccionar qué guerrero va a ganar
     */
    private static void menu() {

        ganadores = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.println("Bienvenido al evento...QUIEN MATA MAS RAPIDO AL ORCO!!!!");
        System.out.println("Adivina quien de entre Legolas o Gimli matar los orcos más rápido");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1 - Legolas");
        System.out.println("2 - Gimli");
        System.out.println("3 - Los orcos ganan(Salir)");
        System.out.print("Elije un numero(1-3): ");

        // Controlamos la entrada que ponga el usuario
        try {
            eleccion = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Error de selección, Golum te quita el anillo!!! Vuelve a intentarlo");
        }

        //Comenzamos la batalla, segun la eleccion del usuario
        switch (eleccion) {
            case 1:
                guerreroElegido = "Legolas";
                comenzarBatalla();
                break;
            case 2:
                guerreroElegido = "Gimbli";
                comenzarBatalla();
                break;
            case 3:
                System.out.println("Gracias por jugar!!");
                break;
        }
    }

    /**
     * Método que genera la ejecución de los hilos
     */
    private static void comenzarBatalla() {

        // Creamos 2 hilos, uno con cada guerrero, indicamos el nombre y cuantos enemigos vamos a lanzarle
        Guerrero legolas = new Guerrero("Legolas", GeneradorEnemigos.enemigos(10));
        Guerrero gimbli = new Guerrero("Gimbli", GeneradorEnemigos.enemigos(10));

        // Comenzamos la ejecucion de cada hilo
        legolas.start();
        gimbli.start();

        // Esperamos a que ambos hilos terminen e imprimimos al ganador, que sera siempre el que esté en la posicion 0 del arraylist
        try {
            legolas.join();
            gimbli.join();
            System.out.println("=========================================");
            System.out.println("HA GANADO......."+ganadores.get(0)+"!!!!!");
            System.out.println("=========================================");
            System.out.println();

            if (ganadores.get(0).equalsIgnoreCase(guerreroElegido)){
                System.out.println("ENHORABUENA!!!");
            }else {
                System.out.println("Vuelve a intentarlo Frodo!!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
