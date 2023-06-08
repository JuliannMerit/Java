import java.util.ArrayList;
import java.util.List;

public class Yakuza implements Personnage {
    public List<Cadeau> sac;
    public Yakuza() {
        sac = new ArrayList<Cadeau>();
    }
    @Override
    public String entendre(String message) {
        while (!sac.isEmpty()) {
            sac.remove(0);
        }
        return "J'ai perdu tous mes cadeaux";
    }
    @Override
    public String recevoir(Cadeau cadeau) {
        int poids = 0;
        for (Cadeau c : sac) {
            poids += c.getPoids();
        }
        if (sac.isEmpty()) { sac.add(cadeau); }
        else if (poids + cadeau.getPoids() >= 50) {
            return "J'ai perdu le cadeau, mon sac est trop lourd";
        }
        else { sac.add(cadeau); }
        return "Merci pour le cadeau";
    }
    @Override
    public String interagir(Personnage personnage) {
        personnage.recevoir(sac.get(0));
        return "Voici un cadeau";
    }
    @Override
    public String toString() {
        String res = "Je suis un Yakuza\n Et mon sac [";
        for (Cadeau c : sac) {
           res += c.toString() + ",\n";
        }
        res = res.substring(0, res.length()-2) + "]";
        return res;
    }
}
