import java.util.HashSet;

public class Accord extends HashSet<Note> implements ElementMusical{
    public Accord(){
        super();
    }

    public boolean estHarmonieux(){
        for (Note n : this){
            if (n.getFrequence() % 2 != 0){
                return false;
            }
        }
        return true;
    }

    public void jouer(){
        for (Note n : this){
            n.jouer();
        }
    }

     public static void main(String [] args){
        Accord accord = new Accord();
        accord.add(new Note (440, 1));
        accord.add(new Note (880, 1));
        accord.add(new Note (1760, 1));
        System.out.println(accord.estHarmonieux());
        accord.jouer();
     }
}
