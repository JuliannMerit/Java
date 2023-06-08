import java.util.List;
import java.util.ArrayList;

public class Ronin implements Personnage {
    private List<Cadeau> cadeaux;
    private String motDePasse;
    public Ronin() {
        this.cadeaux = new ArrayList<Cadeau>();
        this.motDePasse = null;
    }
    @Override
    public String entendre(String message) {
        this.motDePasse = message;
        return this.motDePasse;
    }
    @Override
    public String recevoir(Cadeau cadeau) {
        int poids = 0;
        if (this.cadeaux.isEmpty()) { this.cadeaux.add(cadeau); }
        else {
            for (Cadeau c : this.cadeaux) {
                poids += c.getPoids();
            }
            if (poids + cadeau.getPoids() >= 30) {
                return "J'ai perdu le cadeau";
            }
        }
        return "Merci pour le cadeau";
    }
    @Override
    public String interagir(Personnage personnage) {
        int poids = 0;
        for (Cadeau c : this.cadeaux) {
            poids += c.getPoids();
        }
        if (poids >= 20) {
            this.cadeaux.remove(this.cadeaux.size()-1);
            personnage.recevoir(this.cadeaux.get(this.cadeaux.size()-1));
            return "Mon sac est trop lourd, voici un cadeau";
        }
        return "Je suis Ronin et je n'ai pas de cadeaux à offrir";
    }
    @Override
    public String toString() {
        String res;
        if (this.motDePasse != null) {
            res = "Je suis Ronin et mon mot de passe est " + this.motDePasse + "\n Et mon sac [";
        }
        else {
            res = "Je suis ronin mais je n'ai pas encore de mot de passe" + "\n Et mon sac [";
        }
        for (Cadeau c : cadeaux) {
            res += c.toString() + ",\n";
        }
        res = res.substring(0, res.length()-2) + "]";
        return res;
    }
}
