import java.util.ArrayList;
import java.util.List;

public class ModeleMapIUT<T>{
    private List<ModeleCouple<T>> couple;

    public ModeleMapIUT() {
        this.couple = new ArrayList<ModeleCouple<T>>();
    }

    public boolean contains(T clef){
        for (ModeleCouple<T> c : this.couple){
            if (c.getFirst().equals(clef)){
                return true;
            }
        }
        return false;
    }

    public Integer get(T clef) throws ClefInconnueExection{
        if (!this.contains(clef)){
            throw new ClefInconnueExection();
        }
        for (ModeleCouple<T> c : this.couple){
            if (c.getFirst().equals(clef)){
                return c.getSecond();
            }
        }
        return null;
    }

    public Integer put(T s, Integer i){
        if(!this.contains(s)){
            this.couple.add(new ModeleCouple<T>(s,i));
            return null;
        }
        for (ModeleCouple<T> c : this.couple){
            if (c.getFirst().equals(s)){
                c.setSecond(i);
                return c.getSecond();
            }
        }
        return null;
    }

}
