import java.util.ArrayList;
import java.util.List;

public class Enclo {
    private String nom;
    private int superficie;

    private String type;
    private List<Animal> animaux;

    public Enclo(String nom, int superficie, String type) {
        this.nom = nom;
        this.superficie = superficie;
        this.type = type;
        this.animaux = new ArrayList<Animal>();
    }

    public String getNom() {
        return this.nom;
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public String getType() {
        return this.type;
    }

    public List<Animal> getAnimaux() {
        return this.animaux;
    }

    public void addAnimal(Animal animal) {
        this.animaux.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animaux.remove(animal);
    }

    public String toString() {
        for (Animal animal : this.animaux) {
            System.out.print("dans l'enclos des " + this.type + " (" + this.superficie + " m2) "+ animal.getNom() + ", " + (animal.getBlessure() ? "blessé, pèse " : "pas blessé, pèse ") + animal.getPoids() + " kg,");
        }
        return "\n";
    }
}
