public class Exec {
    public static void main(String [] args){
        Statistiques stat = new Statistiques();
        stat.add(4);
        stat.add(-5);
        stat.add(3);
        stat.add(-3);
        stat.remove(2);
        stat.set(2, -6);
        System.out.println(stat);
    }
}
