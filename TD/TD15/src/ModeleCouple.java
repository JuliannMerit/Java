public class ModeleCouple<T> {
    private T x;
    private Integer y;
    public ModeleCouple(T x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public T getFirst() {
        return this.x;
    }

    public Integer getSecond() {
        return this.y;
    }

    public void setFirst(T x) {
        this.x = x;
    }

    public void setSecond(Integer y) {
        this.y = y;
    }
}
