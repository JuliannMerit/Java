public class Executable {
    public static void main(String[] args) {
        MapIUT mapIUT = new MapIUT();
        mapIUT.put("Bonjour", 7);
        mapIUT.put("toto",5);
        mapIUT.put("salut",20);
        mapIUT.put("Bonjour",8);
        try {
            System.out.println(mapIUT.get("toto"));
        } catch (ClefInconnueExection e) {
            System.out.println("Clef inconnue");
        }
    }
}
