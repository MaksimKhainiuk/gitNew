
import java.util.Scanner;

public class NumOfWordsAtTheLines {
    public static void main(String[] args) {
        String s = "";
        while(!s.equals("exit")) {
            s = new Scanner(System.in).nextLine();
            System.out.println(numOfWorlds(s));
        }
    }

    private static String numOfWorlds(String text) {
        int count = 0;
        if(text.length() != 0){
            count++;
            for (int i = 0; i < text.length()-1; i++) {
                if(text.charAt(i) == ' '&& text.charAt(i+1)!=' '){
                    count++;
                }
            }
        }
        return ("� ���� ������ " + count + " c���(a)");
    }
}
