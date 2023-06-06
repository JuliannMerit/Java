public class Entier implements Ajoutable<Entier>{
    private int valeur;
    public Entier(){
        this.valeur = 0;
    }
    public Entier(int val){
        this.valeur = val;
    }
    public void setEntier(int val){
        this.valeur = val;
    }

    @Override
    public Entier ajoute(Entier i) {
        return new Entier(this.valeur+i.valeur);
    }
}
