package src;

public class Executable{
    public static void main(String[] args)
    {
        Produit salade1 = new Produit("Salade", 1.5);
        Produit brocolis = new Produit("Brocolis", 2.75);
        System.out.println(salade1);
        // Salade pour 1.50 euro(s).

        Achats achats = new Achats();
        //
        // Ajouts d'achats (à voir dans la suite)
        //
        achats.ajouter(salade1);
        achats.ajouter(salade1);
        achats.ajouter(brocolis);
        System.out.println(achats);
        // 2 Salades pour 3 euros
        // 1 Baguette pour 1 euro(s)
    }
}
