public class Executable {
    public static void main(String[] args) {
        WeekEnd weekends = new WeekEnd("mai-2023");

        Personne davy = new Personne("Davy", 37);
        Personne gaby = new Personne("Gaby", 24);
        Personne elie = new Personne("Elie", 27);
        Personne anna = new Personne("Anna", 31);

        weekends.ajouteParticipant("Davy", 37);
        weekends.ajouteParticipant("Gaby", 24);
        weekends.ajouteParticipant("Elie", 27);
        weekends.ajouteParticipant("Anna", 31);

        weekends.ajouteDepense(12, "pain", "Davy");
        weekends.ajouteDepense(100, "pizza", "Elie");
        weekends.ajouteDepense(70, "essence", "Davy");
        weekends.ajouteDepense(15, "vin", "Gaby");
        weekends.ajouteDepense(10, "vin", "Elie");

        WeekEnd weekends2 = new WeekEnd("juin-2023");

        Personne billy = new Personne("Billy", 16);
        Personne sasha = new Personne("Sasha", 21);

        weekends2.ajouteParticipant("Davy", 37);
        weekends2.ajouteParticipant("Gaby", 24);
        weekends2.ajouteParticipant("Billy", 16);
        weekends2.ajouteParticipant("Anna", 31);
        weekends2.ajouteParticipant("Sasha", 21);

        weekends2.ajouteDepense(15, "fromage", "Davy");
        weekends2.ajouteDepense(12, "pain", "Davy");
        weekends2.ajouteDepense(20, "vin", "Gaby");
        weekends2.ajouteDepense(34, "glace", "Gaby");
        weekends2.ajouteDepense(52, "pizza", "Anna");
        weekends2.ajouteDepense(8, "film", "Davy");
        weekends2.ajouteDepense(3, "popcorn", "Davy");
        weekends2.ajouteDepense(8, "apero", "Billy");

        assert weekends.totalDepense() == 207;
        assert weekends.totalDepense("pain") == 12;
        assert weekends.totalDepense("pizza") == 100;
        assert weekends.totalDepense("essence") == 70;
        assert weekends.totalDepense("vin") == 25;
        assert weekends.totalDepense("biere") == 0;
        assert weekends.totalDepense("Davy") == 82;
        assert weekends.totalDepense("Gaby") == 25;
        assert weekends.totalDepense("Elie") == 10;
        assert weekends.totalDepense("Anna") == 0;
        assert weekends.avoirPersonne(davy) == 82 - 207 / 4;
        assert weekends.avoirPersonne(gaby) == 25 - 207 / 4;
        assert weekends.avoirPersonne(elie) == 10 - 207 / 4;
        assert weekends.avoirPersonne(anna) == 0 - 207 / 4;
    }
}
