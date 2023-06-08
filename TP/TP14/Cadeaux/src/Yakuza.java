import java.util.ArrayList;
import java.util.List;

public class Yakuza extends RonYak {
    public Yakuza(){}
    @Override
    public String entendre(String message) {
        while (!cadeaux.isEmpty()) {
            cadeaux.remove(0);
        }
        return "J'ai perdu tous mes cadeaux";
    }
    @Override
    public String recevoir(Cadeau cadeau) {
        if (cadeaux.isEmpty()) {
            cadeaux.add(cadeau);
        }
        else if (this.poidsCadeau() + cadeau.getPoids() >= 50) {
            return "J'ai perdu le cadeau, mon cadeaux est trop lourd";
        }
        else { cadeaux.add(cadeau); }
        return "Merci pour le cadeau";
    }
    @Override
    public String interagir(Personnage personnage) {
        personnage.recevoir(cadeaux.get(0));
        return "Voici un cadeau";
    }
    @Override
    public String toString() {
        String res = "Je suis un Yakuza\n Et mon cadeaux [";
        for (Cadeau c : cadeaux) {
           res += c.toString() + ",\n";
        }
        res = res.substring(0, res.length()-2) + "]";
        return res;
    }
}
