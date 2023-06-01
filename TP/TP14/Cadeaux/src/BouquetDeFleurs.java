public class BouquetDeFleurs implements Cadeau{
    private int nbDalhias;
    private int nbRoses;
    public BouquetDeFleurs(int nbDalhias, int nbRoses) {
        this.nbDalhias = nbDalhias;
        this.nbRoses = nbRoses;
    }
    public double getPoids() {
        return nbDalhias * 5 + nbRoses * 3;
    }
    public String toString() {
        return "Bouquet de " + nbDalhias + " Dalhia(s) et de " + nbRoses + " Rose(s)";
    }
}
