// Classe représentant une dépense
public class Depense {
    private double montant;
    private String produit;
    private Personne payeur;

    // Constructeur
    //@param personne le payeur de la dépense
    //@param montant le montant de la dépense
    public Depense (Personne personne, double montant, String produit) {
        this.payeur = personne;
        this.montant = montant;
        this.produit = produit;
    }

    // Retourne le produit acheté
    //@return le produit acheté
    public String getProduit() {
        return this.produit;
    }

    // Retourne le montant de la dépense
    //@return le montant de la dépense
    public double getMontant() {
        return this.montant;
    }

    // Retourne le payeur de la dépense
    //@return le payeur de la dépense
    public Personne getPayeur() {
        return this.payeur;
    }
}
