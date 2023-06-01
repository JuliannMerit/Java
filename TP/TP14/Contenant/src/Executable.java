import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Executable {
    public static void main(String[] args) {
        List<Contenant<Integer>> conteneurs = new ArrayList<>();
        Couple couple = new Couple(0, 1);
        Ensemble ensemble = new Ensemble();
        ensemble.add(0);
        ensemble.add(1);
        ensemble.add(2);
        ensemble.add(3);
        ensemble.add(4);
        Couple couple2 = new Couple(0, 2);
        conteneurs.add(couple);
        conteneurs.add(ensemble);
        conteneurs.add(couple2);
        System.out.println(GestionContenant.<Integer>contiennentTous(conteneurs, 0));
        System.out.println(GestionContenant.<Integer>contiennentTous(conteneurs, 1));
    }
}
