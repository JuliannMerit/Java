package src;

import java.util.List;
import java.util.Arrays;

public class Executable {
    public static void main(String [] args) throws PasDEcartMin {
        Personne jean = new Personne(21, "Jean");
        Personne pierre = new Personne(18, "Pierre");
        Personne paul = new Personne(15, "Paul");
        Personne jack = new Personne(35, "Jack");
        Personne julie = new Personne(19, "Julie");
        List<Personne> listP = Arrays.asList(jean,pierre,paul,jack,julie);
        System.out.println(BibPersonne.ecartMinimum(listP));
    }
}
