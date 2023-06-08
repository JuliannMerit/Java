import java.util.ArrayList;
import java.util.List;

public class HashMapVersion0{
    private List<Couple> map;
    private int taille;

    public HashMapVersion0(){
        this.map = new ArrayList<Couple>();
        this.taille = 10;
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
        int indice = Math.abs(clef.hashCode()) % this.taille;
        Integer ancienneValeur = this.get(clef);
        this.map.set(indice,new Couple(clef, valeur));
        return ancienneValeur;
    }
}
