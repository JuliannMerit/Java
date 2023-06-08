public class MaitreDesClefs implements Personnage{
    public String motDePasse;

    
    public MaitreDesClefs(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public String entendre(String message) {
        return "je suis sourd";
    }

    @Override
    public String recevoir(Cadeau cadeau) {
        return "je refuse les cadeaux!";
    }

    @Override
    public String interagir(Personnage personnage) {
        personnage.entendre(motDePasse);
        return "";
    }

    public String coder(){
        String code = "";
        for (int i = 0; i < motDePasse.length(); i++) {
            code += this.motDePasse.hashCode()*31+(int)motDePasse.charAt(i);
        }
        return code;
    }

    @Override
    public String toString() {
        return "Moi Maître des clefs "+entendre("")+recevoir(null)+"\n voici mon mot de passe codé\n" + coder() + "\n";
    }
}
