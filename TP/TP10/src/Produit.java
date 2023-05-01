package src;

public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }


    @Override
    public String toString() {
        return this.nom + " pour " + this.prix + " euro(s).";
    }
}
