import java.util.HashMap;

public class AnnuaireTelephonique extends HashMap<String, String> {
    public AnnuaireTelephonique(){
        super();
    }

    public void ajouterContact(String nom, String numero) throws IllegalArgumentException{
        if (numero.trim().replaceAll("\\s", "").length() != 10){
            throw new IllegalArgumentException("Le numéro doit avoir 10 chiffres");
        }
        super.put(nom, numero);
    }

    public String get(String nom){
        return super.get(nom);
    }

    public static void main(String [] args){
        AnnuaireTelephonique annuaire = new AnnuaireTelephonique();
        annuaire.ajouterContact("Bob", "06 12 34 56 78");
        annuaire.ajouterContact("Alice", "06 98 76 54 32");
        annuaire.ajouterContact("Eve", "0687654321");
        //annuaire.ajouterContact("Mallory", "06 12 34 56");
        System.out.println(annuaire.get("Bob"));
        System.out.println(annuaire.get("Alice"));
        System.out.println(annuaire.get("Eve"));
    }
}
