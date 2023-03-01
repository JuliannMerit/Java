public class Bouteille {
    private String region;
    private String appellation;
    private int millesime;

    public Bouteille(String region, String appellation, int millesime) {
        this.region = region;
        this.appellation = appellation;
        this.millesime = millesime;
    }

    public String getRegion() {
        return this.region;
    }

    public String getAppellation() {
        return this.appellation;
    }

    public int getMillesime() {
        return this.millesime;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o.getClass() != getClass()) {
            return false;
        }
        Bouteille b = (Bouteille) o;
        return region.equals(b.region) && appellation.equals(b.appellation) && millesime == b.millesime;
    }
}
