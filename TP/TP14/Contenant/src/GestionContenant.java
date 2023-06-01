import java.util.List;

public class GestionContenant {
    private GestionContenant(){}

    public static <T> boolean contiennentTous(List<Contenant<T>> conteneurs, T element){
        for(Contenant<T> contenant : conteneurs){
            if(!contenant.contient(element)){
                return false;
            }
        }
        return true;
    }
}
