import java.util.Objects;

public class Article implements Comparable<Article>{
    private String nom;
    private double prix;
    private double poids;

    public Article (String nom, double prix, double poids) {
        this.nom = nom;
        this.prix = prix;
        this.poids = poids;
    }

    public String getNom() {
        return this.nom;
    }

    public double getPoids() {
        return poids;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public int compareTo(Article o) {
        return Double.compare(this.getPrix(), o.getPrix());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof Article) {
            Article article = (Article) o;
            return Double.compare(article.prix, this.prix) == 0 && Double.compare(article.poids, this.poids) == 0 && this.nom.equals(article.getNom());

        }
        return false;
    }

    @Override
    public String toString() {
        return this.nom + " (" + this.prix + "€, " + this.poids + "kg)";
    }
}
