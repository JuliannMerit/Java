package src;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BibPersonne {
    private BibPersonne(){}
    public static List<Personne> trierAgeCroissant(List<Personne> listePersonnes){
        Comparator<Personne> compareAge = new CompareAge();
        List<Personne> listeTriee = new ArrayList<>(listePersonnes);
        Collections.sort(listeTriee, compareAge);
        return listeTriee;
    }
    public static Integer ecartMinimum(List<Personne> listP) throws PasDEcartMin{
        if (listP.size() < 2){
            throw new PasDEcartMin();
        }
        List<Personne> trie = trierAgeCroissant(listP);
        int ecartMin = 0;
        int ecrat;
        Personne precedente = null;
        for (Personne personne : trie){
            if (precedente == null){
                ecartMin = personne.getAge();
            } else {
                ecrat = personne.getAge() - precedente.getAge();
                if (ecrat < ecartMin){
                    ecartMin = ecrat;
                }
            }
            precedente = personne;
        }
        return ecartMin;
    }
}
