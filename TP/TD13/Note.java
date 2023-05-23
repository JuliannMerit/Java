public class Note implements ElementMusical{
    int frequence;
    int duree;
    public Note(int frequence, int duree){
        this.frequence = frequence;
        this.duree = duree;
    }
    public int getFrequence(){
        return this.frequence;
    }
    public int getDuree(){
        return this.duree;
    }
    public void jouer(){
        System.out.println("Je joue la note " + this.frequence + " pendant " + this.duree + " secondes");
    }
    public int hashCode(){
        return this.frequence + this.duree;
    }

}
