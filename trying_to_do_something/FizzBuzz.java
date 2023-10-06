import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(fizzBizz(n));
    }
    private static List<String> fizzBizz(int n){
        List<String>answer = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if(divisibleBy3 && divisibleBy5){
                answer.add("FizzBuzz");
            } else if (divisibleBy3) {
                answer.add("Fizz");
            } else if (divisibleBy5) {
                answer.add("Buzz");
            }else answer.add(String.valueOf(i));
        }
        return answer;
    }
}
