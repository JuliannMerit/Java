import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nom;
    private List<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<Animal>();
    }

    public String getNom() {
        return this.nom;
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

    public String soiger(String nomAnimal) {
        for (Animal animal : this.animaux) {
            if (animal.getNom().equals(nomAnimal)) {
                if (!animal.getBlessure()) {
                    return "L'animal " + animal.getNom() + " n'est pas blessé";
                }
                animal.setBlessure(false);
                return "L'animal " + animal.getNom() + " a été soigné";
            }
        }
        return "L'animal " + nomAnimal + " n'existe pas";
    }

    public String listerAnimauxDansEnclos(String nomEnclos) {
        for (Animal animal : this.animaux) {
            if (animal.getEnclo().getNom().equals(nomEnclos)) {
                return animal.toString();
            }
        }
        return "L'enclos " + nomEnclos + " n'existe pas";
    }

    public List<Animal> trieParNom(){
        List<Animal> animauxTries = new ArrayList<Animal>();
        for (Animal animal : this.animaux) {
            animauxTries.add(animal);
        }
        for (int i = 0; i < animauxTries.size(); i++) {
            for (int j = i + 1; j < animauxTries.size(); j++) {
                if (animauxTries.get(i).getNom().compareTo(animauxTries.get(j).getNom()) > 0) {
                    Animal temp = animauxTries.get(i);
                    animauxTries.set(i, animauxTries.get(j));
                    animauxTries.set(j, temp);
                }
            }
        }
        return animauxTries;
    }

    public Animal animalLePlusLourd(){
        Animal animalLePlusLourd = this.animaux.get(0);
        for (Animal animal : this.animaux) {
            if (animal.getPoids() > animalLePlusLourd.getPoids()) {
                animalLePlusLourd = animal;
            }
        }
        return animalLePlusLourd;
    }

    public String toString() {
        return "Le zoo de " + this.nom + " contient";
    }
}
