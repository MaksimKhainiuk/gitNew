package RegularExpression6.taskA;

import java.util.Scanner;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Cat1";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = s3.intern();
        System.out.println(s1 == s2 + "s1 == s2");
        System.out.println(s1 == s3 + "s1 == s3");
        System.out.println(s1 == s4 + "s1 == s4");

        System.out.println("------------------");

        String h = "Дом";
        System.out.println(h.length());
        String h2 = h.toUpperCase();
        System.out.println(h2);
        String h3 = h.replace('Д', 'С');
        System.out.println(h3);

        System.out.println("------------------");

        String s = new Scanner(System.in).nextLine();

        switch (s) {
            case ("1"):
                System.out.println("скаляр");
                break;

            case ("{1, 2, 3}"):
                System.out.println("вектор");
                break;

            case ("{{1, 2}, {3, 4}}"):
                System.out.println("матрица");
                break;
        }

    }
}
