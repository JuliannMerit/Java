import java.util.ArrayList;
import java.util.List;

public abstract class RonYak implements Personnage{
    List<Cadeau> cadeaux;
    public RonYak(){
        this.cadeaux = new ArrayList<>();
    }

    public int poidsSac(){
        int poids = 0;
        for (Cadeau cadeau : this.cadeaux){
            poids += cadeau.getPoids();
        }
        return poids;
    }
}
