package trying_to_do_something;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operator {
    public static void main(String[] args) {
        String s = " ";
        while (!s.equals("exit")) {
            System.out.print("enter code and phone number: ");
            s = new Scanner(System.in).nextLine();
            System.out.println(whichOperator(s));

        }
    }

    private static String whichOperator(String number) {
        Pattern life = Pattern.compile("^((\\+?37525)([0-9]{7}))$");
        Pattern welcome = Pattern.compile("^((\\+?37529)([0-9]{7}))$");
        Pattern mtc = Pattern.compile("^((\\+?37533)([0-9]{7}))$");
        Matcher matcherl = life.matcher(number);
        Matcher matcherw = welcome.matcher(number);
        Matcher matcherm = mtc.matcher(number);
        String operatorLife = "Its Life";
        String operatorWelcome = "Its Welcome";
        String operatorMTC = "Its MTC";
        if (matcherl.matches()) {
            return operatorLife;
        } else if (matcherw.matches()) {
            return operatorWelcome;
        } else if (matcherm.matches()) {
            return operatorMTC;
        } else return "incorrect number, try again";

    }
}
