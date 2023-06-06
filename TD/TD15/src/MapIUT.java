import java.util.ArrayList;
import java.util.List;

public class MapIUT {
    private List<Couple> couple;

    public MapIUT() {
        this.couple = new ArrayList<Couple>();
    }

    public boolean contains(String clef){
        for (Couple c : this.couple){
            if (c.getFirst().equals(clef)){
                return true;
            }
        }
        return false;
    }

    public Integer get(String clef) throws ClefInconnueExection {
        if (!this.contains(clef)){
            throw new ClefInconnueExection();
        }
        for (Couple c : this.couple){
            if (c.getFirst().equals(clef)){
                return c.getSecond();
            }
        }
        return null;
    }

    public Integer put(String s, Integer i){
        if(!this.contains(s)){
            this.couple.add(new Couple(s,i));
            return null;
        }
        for (Couple c : this.couple){
            if (c.getFirst().equals(s)){
                c.setSecond(i);
                return c.getSecond();
            }
        }
        return null;
    }
}
