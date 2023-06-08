import java.util.ArrayList;
import java.util.List;

public class HashMapVersion1{
    private List<Couple> map;
    private int taille;

    public HashMapVersion1(int taille){
        this.map = new ArrayList<Couple>();
        this.taille = taille;
        for (int i = 0; i < this.taille; i++){
            this.map.add(null);
        }
    }

    public boolean containsKey(String clef){
        return this.map.get(Math.abs(clef.hashCode()) % this.taille) != null;
    }

    public Integer get(String clef) throws IllegalArgumentException{
        if (!this.containsKey(clef)){
            throw new IllegalArgumentException("La clef n'existe pas");
        }
        return this.map.get(Math.abs(clef.hashCode()) % this.taille).getSecond();
    }

    public Integer put(String clef, Integer valeur){
        return null;
    }
}
