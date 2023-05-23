import java.util.ArrayList;

public class Statistiques extends ArrayList<Integer>{
    private int nbAjouTotal;
    private int nbNegatifs;
    private int somme;

    public Statistiques(){
        super();
        this.nbAjouTotal = 0;
        this.nbNegatifs = 0;
        this.somme = 0;
    }

    @Override
    public boolean add(Integer v){
        this.nbAjouTotal ++;
        if (v < 0){
            this.nbNegatifs++;
        }
        this.somme += v;
        return super.add(v);
    }

    @Override
    public Integer remove(int index) throws IndexOutOfBoundsException{
        if (index < 0 || index > this.size()){
            throw new IndexOutOfBoundsException(index);
        }
        Integer v = this.get(index);
        if (v < 0){
            nbNegatifs--;
        }
        somme -= v;
        return super.remove(index);
    }

    @Override
    public Integer set(int index, Integer nv) throws IndexOutOfBoundsException{
        if (index < 0 || index > this.size()){
            throw new IndexOutOfBoundsException(index);
        }
        Integer v = this.get(index);
        if (v < 0){
            nbNegatifs --;
        }
        if (nv < 0){
            nbNegatifs ++;
        }
        somme -= v;
        somme += nv;
        return super.set(index, nv);
    }

    @Override
    public String toString(){
        return super.toString() + " nbAjout " + nbAjouTotal + " nbNégatifs " + nbNegatifs + " somme " + somme;
    }
}