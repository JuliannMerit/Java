package src;

public class Personne{
    private int age;
    private String nom;

    public Personne(int age, String nom){
        this.age = age;
        this.nom = nom;
    }
    public int getAge(){
        return this.age;
    }
    public String getNom(){
        return this.nom;
    }
}