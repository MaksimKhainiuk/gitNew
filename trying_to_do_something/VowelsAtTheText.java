package trying_to_do_something;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsAtTheText {
    public  static void main(String[]args){
        String s = "";
        while (!s.equals("exit")) {
            s = new Scanner(System.in).nextLine();
            Vowels(s);
        }
    }

    private static void Vowels(String text) {
            Pattern p = Pattern.compile("([������Ũ�����������])");//windows1251
            Matcher m = p.matcher(text);
        while(m.find()) {
            System.out.printf("������� ����� � ���� ������: %s\n ", m.group());//windows1251
            if (m.group().isEmpty()) break;
        }
    }
}
