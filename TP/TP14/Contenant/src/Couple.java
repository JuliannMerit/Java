public class Couple implements Contenant<Integer>{
    private Integer x;
    private Integer y;

    public Couple(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean contient(Integer element){
        return element.equals(x) || element.equals(y);
    }
}
