import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rayon implements Comptable{

    private String nom;
    private List<Article> articles;

    public Rayon(String nom) {
        this.nom = nom;
        this.articles = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public List<Article> tierParPrix(){
        List<Article> res = new ArrayList<>(this.articles);
        Collections.sort(res);
        return res;
    }

    public Article quelArticle(String nom) throws IllegalArgumentException{
        for (Article a : this.articles) {
            if (a.getNom().equals(nom)) {
                return a;
            }
        }
        throw new IllegalArgumentException("L'Article '"+nom+ "' non trouvé");
    }

    @Override
    public int combien() {
        return this.articles.size();
    }

    @Override
    public String toString() {
        return "Dans le rayon " + this.nom + " il y a " + this.articles.toString();
    }
}
