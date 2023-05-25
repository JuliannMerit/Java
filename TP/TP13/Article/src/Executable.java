public class Executable {
    public static void main(String[] args) {
        Article a1 = new Article("Pomme", 1.5, 1);
        Article a2 = new Article("Pomme", 1.5, 1);
        Article a3 = new Article("Poire", 2, 2);
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a3));
        System.out.println(a2.compareTo(a3));
        System.out.println(a3.compareTo(a2));


        Rayon r = new Rayon("Fruits");
        r.getArticles().add(a1);
        r.getArticles().add(a2);
        r.getArticles().add(a3);

        System.out.println(r.tierParPrix());
        System.out.println(r.quelArticle("Pomme"));
        System.out.println(r.quelArticle("Poire"));
        try {
            System.out.println(r.quelArticle("Banane"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(GestionRayon.moyenneDesPrix(r));
        try {
            System.out.println(GestionRayon.moyenneDesPrix(new Rayon("Vide")));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(GestionRayon.trierParNom(r));
    }
}
