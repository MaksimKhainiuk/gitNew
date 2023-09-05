package trying_to_do_something;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        String s = "";
        while (!s.equals("exit")) {
            s = new Scanner(System.in).nextLine();
            System.out.println(numOfVowels(s));
        }
    }

    private static String numOfVowels(String text) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String s = text.toLowerCase();
        for (int i = 0; i < s.length() ; i++) {
            for (int j = 0; j < vowels.length ; j++) {
                if (s.charAt(i) == vowels[j]){
                    count++;
                }
            }
        }
        return ("num of vowels at the text: " + count);
    }
}
