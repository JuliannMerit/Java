public class Animal{
    private String nom;
    private int poids;
    private Enclo enclo;
    private boolean blessure;

    public Animal(String nom, int poids, Enclo enclo, boolean blessure) {
        this.nom = nom;
        this.poids = poids;
        this.enclo = enclo;
        this.blessure = blessure;
    }
    public String getNom() {
        return this.nom;
    }

    public int getPoids() {
        return this.poids;
    }

    public Enclo getEnclo() {
        return this.enclo;
    }

    public boolean getBlessure() {
        return this.blessure;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setEnclo(Enclo enclo) {
        this.enclo = enclo;
    }

    public void setBlessure(boolean blessure) {
        this.blessure = blessure;
    }

    public String toString() {
        return "Le zoo de " + this.nom + " contient" + enclo.toString();
    }
}
