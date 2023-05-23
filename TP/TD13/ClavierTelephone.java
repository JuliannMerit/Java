import java.util.List;
import java.util.Arrays;

public class ClavierTelephone {
    List<String> touches;
    public ClavierTelephone(){
        this.touches = Arrays.asList(" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
    }

    public char getCharactere(int touche, int nbAppuis){
        return this.touches.get(touche).charAt(nbAppuis-1);
    }

    public static void main(String [] args){
        ClavierTelephone clavier = new ClavierTelephone();
        System.out.println(clavier.getCharactere(2, 1));//a
        System.out.println(clavier.getCharactere(2, 2));//b
        System.out.println(clavier.getCharactere(2, 3));//c
        System.out.println(clavier.getCharactere(9, 4));//z
        System.out.println(clavier.getCharactere(3, 1));//d
    }
}
