import java.util.ArrayList;
import java.util.List;

public class GeneradorEnemigos {

    public static List<Long> enemigos(int unidades){

        List<Long> enemigos = new ArrayList<>();

        for (int i = 0; i < unidades; i++) {
            enemigos.add(Math.round(Math.random()*10));
        }

        return enemigos;
    }

}
