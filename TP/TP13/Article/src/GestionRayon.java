import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionRayon {

    private GestionRayon() {}
    public static double moyenneDesPrix(Rayon r) throws IllegalArgumentException{
        if(r.combien() == 0) {
            throw new IllegalArgumentException("Le rayon '"+r.getNom()+"' est vide !");
        }
        double res = 0;
        for (Article a : r.getArticles()) {
            res += a.getPrix();
        }
        return res / r.combien();
    }

    public static List<Article> trierParNom(Rayon r) {
        if(r.combien() == 0) {
            throw new IllegalArgumentException("Le rayon "+r.getNom()+" est vide !");
        }
        List<Article> res = new ArrayList<>(r.getArticles());
        res.sort(new ComparatorNom());
        return res;
    }
}
