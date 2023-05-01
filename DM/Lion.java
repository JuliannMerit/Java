public class Lion extends Animal{
    private boolean criniere;

    public Lion(String nom, int poids, Enclo enclo, boolean blessure, boolean criniere) {
        super(nom, poids, enclo, blessure);
        this.criniere = criniere;
    }

    @Override
    public String toString() {
        return super.toString() + (this.criniere ? "a une crinière" : "n'a pas de crinière");
    }
}
