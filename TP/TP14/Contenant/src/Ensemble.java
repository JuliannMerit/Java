import java.util.HashSet;
import java.util.List;

public class Ensemble extends HashSet<Integer> implements Contenant<Integer>{
    public Ensemble(){
        super();
    }

    @Override
    public boolean contient(Integer element) {
        return super.contains(element);
    }
}
