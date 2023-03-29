// Classe représentant une personne
public class Personne {
    private String prenom;
    private int age;

    // Constructeur
    //@param prenom le prénom de la personne
    public Personne(String prenom, int age) {
        this.prenom = prenom;
        this.age = age;
    }

    // Retourne le prénom de la personne
    //@return le prénom de la personne
    public String getPrenom() {
        return this.prenom;
    }
}
