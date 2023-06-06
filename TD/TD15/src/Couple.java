public class Couple {
    public String x;
    public Integer y;

    public Couple(String x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public String getFirst() {
        return this.x;
    }

    public Integer getSecond() {
        return this.y;
    }

    public void setFirst(String x) {
        this.x = x;
    }

    public void setSecond(Integer y) {
        this.y = y;
    }

}
