import java.util.List;

/**
 * Clase que extiende de Thread. Crea un guerrero para la batalla
 */
public class Guerrero extends Thread {

    //La lista de enemigos generada
    private List<Long> enemigos;

    //Nombre del guerrero
    private String nombre;

    /**
     * Método contructor que crea un guerrero
     * @param nombre - nombre que tendrá ese guerrero
     * @param enemigos - cantidad de enemigo con los que luchará
     */
    public Guerrero(String nombre, List<Long> enemigos) {
        this.nombre = nombre;
        this.enemigos = enemigos;
    }

    /**
     * Método que recorre un bucle for imprimiendo en pantalla cuándo ataca el guerrero y cuándo termina con él
     */
    @Override
    public void run() {
        this.setName(nombre);

        // Creamos un bucle for para ir enemigo a enemigo
        for (int i = 0; i < enemigos.size(); i++) {
            System.out.println("------------------------------------------------" +
                    "\n" + nombre + " ataca al orco nº" + (i + 1) + " )->        O");
            try {
                sleep(enemigos.get(i) * 100);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            System.out.println(nombre + " mata al orco nº" + (i + 1) + "  )        ->X");
        }

        //Una vez se finalice la lista de enemigos, se imprime en pantalla que se ha terminado en rojo
        System.out.println("\033[31m"+nombre+" ha terminado \033[0m");

        //Añadimos el nombre del guerrero a la lista de ganadores.
        Main.ganadores.add(nombre);


    }

}
