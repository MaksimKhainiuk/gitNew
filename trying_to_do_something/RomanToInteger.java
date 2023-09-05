package trying_to_do_something;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[]sChar = s.toCharArray();

        map.put('I',1);
        map.put('V',1);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;

        for (int i = 0; i < s.length()-1; i++) {

            if((map.get(sChar[i + 1]) <= map.get(sChar[i]))){
                sum = sum + map.get(sChar[i]);
            }else{
                sum = sum - map.get(sChar[i]);
            }
        }
        return  sum + map.get(sChar[s.length()-1]);
    }
    public static void main(String[] args) {
        System.out.println(romanToInteger("MMXXIII"));
    }

}
