import java.util.Comparator;

public class CompareReel implements Comparator<Complexe> {
    @Override
    public int compare(Complexe c1, Complexe c2){
        return Double.compare(c1.getReel(), c2.getReel());
    }
    
}
