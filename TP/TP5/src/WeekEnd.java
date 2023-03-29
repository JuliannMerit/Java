import java.util.List;
import java.util.ArrayList;

// Classe représentant un week-end
public class WeekEnd {
    private String dateDuWeekEnd;
    private List<Depense> lesDepenses;
    private List<Personne> participants;

    // Constructeur
    //@param dateDuWeekEnd la date du week-end
    public WeekEnd(String dateDuWeekEnd) {
        this.dateDuWeekEnd = dateDuWeekEnd;
        this.lesDepenses = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    // Ajoute un participant au week-end
    //@param prenom le prénom du participant
    //@param age l'âge du participant
    public void ajouteParticipant(String prenom, int age) {
        this.participants.add(new Personne(prenom, age));
    }

    // Ajoute une dépense au week-end
    //@param montant le montant de la dépense
    //@param produit le produit acheté
    //@param prenom le prénom du participant qui a payé la dépense
    public void ajouteDepense(double montant, String produit, String prenom) {
        for (Personne personne : this.participants) {
            if (personne.getPrenom().equals(prenom)) {
                this.lesDepenses.add(new Depense(personne, montant, produit));
            }
        }
    }

    // Retourne le montant total des dépenses d'un personne
    //@parm personne la personne dont on veut le montant total des dépenses
    //@return le montant total des dépenses d'un personne
    public double totalDepense(Personne personne) {
        double total = 0;
        for (Depense depense : this.lesDepenses) {
            if (depense.getPayeur().equals(personne)) {
                total += depense.getMontant();
            }
        }
        return total;
    }

    // Retourne le montant total des dépenses
    //@return le montant total des dépenses
    public double totalDepense() {
        double total = 0;
        for (Depense depense : this.lesDepenses) {
            total += depense.getMontant();
        }
        return total;
    }

    // Retourne le montant total des dépenses d'un produit
    //@parm produit le produit dont on veut le montant total des dépenses
    //@return le montant total des dépenses d'un produit
    public double totalDepense(String produit) {
        double total = 0;
        for (Depense depense : this.lesDepenses) {
            if (depense.getProduit().equals(produit)) {
                total += depense.getMontant();
            }
        }
        return total;
    }

    // Retourne le montant qu'une personne doit donner ou recevoir
    //@parm personne la personne dont on veut le montant qu'elle doit donner ou recevoir
    //@return le montant qu'une personne doit donner ou recevoir
    public double avoirPersonne(Personne personne) {
        return this.totalDepense(personne) - this.totalDepense() / this.participants.size();
    }
}
