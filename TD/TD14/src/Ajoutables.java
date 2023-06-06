import java.util.List;

public class Ajoutables<T> {

    public static <T extends Ajoutable<T>> T somme(List<T> list){
        if (list.isEmpty()) {
            return null;
        }
        T sommesT = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sommesT = sommesT.ajoute(list.get(i));
        }
        return sommesT;
    }
}
