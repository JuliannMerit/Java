public class Serpent extends Animal{
    private boolean venimeux;

    public Serpent(String nom, int poids, Enclo enclo, boolean blessure, boolean venimeux) {
        super(nom, poids, enclo, blessure);
        this.venimeux = venimeux;
    }

    @Override
    public String toString() {
        return super.toString() + (this.venimeux ? "est venimeux" : "n'est pas venimeux");
    }
}
