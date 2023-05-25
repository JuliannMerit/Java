import java.util.Comparator;

public class ComparatorNom implements Comparator<Article> {
    @Override
    public int compare(Article o1, Article o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
