import java.util.ArrayList;

public class Partition extends ArrayList<ElementMusical> {
    public Partition(){
        super();
    }
    public void jouer(){
        for (ElementMusical e : this){
            e.jouer();
        }
    }

    public static void main(String [] args){
        Partition p = new Partition();
        p.add(new Note (440, 1));
        p.add(new Note (880, 1));
        p.add(new Note (1760, 1));
        Accord accord = new  Accord();
        accord.add(new Note (440, 1));
        accord.add(new Note (880, 1));
        accord.add(new Note (1760, 1));
        p.add(accord);
        p.jouer();
    }
}
