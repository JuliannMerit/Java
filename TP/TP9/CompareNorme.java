import java.util.Comparator;

public class CompareNorme implements Comparator<Complexe> {
    @Override
    public int compare(Complexe c1, Complexe c2){
        double norme1 = Math.pow(c1.getReel(),2) + Math.pow(c1.getReel(),2);
        double norme2 = Math.pow(c2.getReel(),2) + Math.pow(c2.getReel(),2);
        return Double.compare(norme1, norme2);
    }
}
