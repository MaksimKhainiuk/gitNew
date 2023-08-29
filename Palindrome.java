package RegularExpression.taskB;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s = "";
        while(!s.equals("exit")){
            s = new Scanner(System.in).nextLine();
            System.out.println(isPalindrome(s));
        }
    }

    private static String isPalindrome(String text) {
        String s = text.toUpperCase().replaceAll("^a-zA-Z0-9","");
        StringBuilder sb = new StringBuilder(s).reverse();
        return (s.equals(sb.toString()) ? "Its Palindrome" : "Just a text");
    }
}
