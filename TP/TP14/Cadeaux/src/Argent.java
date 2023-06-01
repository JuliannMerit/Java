public class Argent implements Cadeau{
    private int nbPieces;
    public Argent(int nbPieces) {
        this.nbPieces = nbPieces;
    }
    public double getPoids() {
        return nbPieces * 5;
    }
    public String toString() {
        return nbPieces + " pièces de 5 g chacune";
    }
}
