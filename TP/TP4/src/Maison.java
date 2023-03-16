import java.util.List;

import org.ietf.jgss.Oid;

import java.util.ArrayList;

public class Maison {
    private String nom;
    private List<Sorcier> eleves;

    public Maison(String nomMaison){
        this.nom = nomMaison;
        this.eleves = new ArrayList<>();
    }

    public boolean ajouter(String nomSorcier, int courage, int sagasse){
        for (Sorcier sorcier:this.eleves){
            if (sorcier.getNom().equals(nomSorcier)){
                return false;
            }
        }
        this.eleves.add(new Sorcier(nomSorcier,courage, sagasse));
        return true;
    }

    public int nombreEleve(){
        return this.eleves.size();
    }

    public boolean contientCourageux(){
        if (this.eleves.isEmpty()){
            return false;
        }

        for(Sorcier sorcier:this.eleves){
            if (sorcier.estCourageux()){
                return true;
            }
        }
        return false;
    }

    public Sorcier leMoinsCourageux(){
        if (this.eleves.isEmpty()){
            return null;
        }
        Sorcier moinsCourageux = this.eleves.get(0);
        for(Sorcier sorcier:this.eleves){
            if(sorcier.getCourage() < moinsCourageux.getCourage()){
                moinsCourageux = sorcier;
            }
        }
        return moinsCourageux;
    }

    public Sorcier lePlusSage(){
        if (this.eleves.isEmpty()){
            return null;
        }
        Sorcier plusSage = this.eleves.get(0);
        for(Sorcier sorcier:this.eleves){
            if(sorcier.getSagesse() > plusSage.getCourage()){
                plusSage = sorcier;
            }
        }
        return plusSage;
    }

    public void trierParCourage(){
    }
}
