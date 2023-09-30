import java.util.*;

public class RepeatingLetters {
    public static void main(String[] args) {
        System.out.println(isUnique("1234567")); //-> true
        System.out.println(isUnique("abcade")); //-> false
        System.out.println(isUnique("abcABC")); //-> true
        System.out.println(isUnique("aaA")); //-> false
    }
    private static boolean isUnique(String text){
        Set<Character>set = new HashSet<>();
        char[] c = text.toCharArray();
        for (int i = 0; i < c.length; i++) {
            set.add(c[i]);
            if(set.size()==text.length())  return true;
        }
        return false;
    }
}
