import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RendezVous implements Comparable<RendezVous>{
    private Date debut;
    private Date fin;
    public RendezVous(String deb, String fin) throws ParseException {
        SimpleDateFormat lecteur = new SimpleDateFormat("HH:mm/dd/MM/yyyy");

        this.debut = lecteur.parse(deb);
        this.fin = lecteur.parse(fin);

        if(this.debut.compareTo(debut) > 0){
            this.debut = null;
            this.fin = null;
            throw new IllegalArgumentException("La date de début doit être avant la date de fin");
        }
    }
    @Override
    public String toString() {
        SimpleDateFormat lecteur = new SimpleDateFormat("HH:mm/dd/MM/yyyy");
        return "RendezVous{" +
                "debut=" + lecteur.format(this.debut) +
                ", fin=" + lecteur.format(this.fin) +
                '}';
    }

    @Override
    public int compareTo(RendezVous rendezVous) {
        return this.debut.compareTo(rendezVous.debut);
    }

    public boolean intersecte(RendezVous rendezVous) {
    // Renvoie vrai si this et rendezVous 'tombent en même temps'
        return
            this.debut.compareTo(rendezVous.debut) * this.debut.compareTo(rendezVous.fin) < 0 ||
            this.fin.compareTo(rendezVous.debut) * this.fin.compareTo(rendezVous.fin) < 0 ||
            this.debut.compareTo(rendezVous.debut) == 0 && this.fin.compareTo(rendezVous.fin) == 0;
    }
}