package src;

import java.util.HashMap;
import java.util.Map;

public class Achats {

    private Map<Produit, Integer> achats;

    public Achats() {
        this.achats = new HashMap<Produit, Integer>();
    }

    public void ajouter(Produit produit) {
        if (this.achats.containsKey(produit)) {
            this.achats.put(produit, this.achats.get(produit) + 1);
        } else {
            this.achats.put(produit, 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Produit, Integer> entry : this.achats.entrySet()) {
            Produit produit = entry.getKey();
            Integer quantite = entry.getValue();
            result.append(quantite).append(" ").append(produit).append("\n");
        }
        return result.toString();
    }
}
