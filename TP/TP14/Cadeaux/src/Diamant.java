public class Diamant implements Cadeau{
    private double poids;
    public Diamant(double poids) {
        this.poids = poids;
    }
    public double getPoids() {
        return poids;
    }
    public String toString() {
        return "Diamant de " + poids + "g";
    }
}
