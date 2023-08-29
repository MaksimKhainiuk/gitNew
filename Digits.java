import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Digits {
    public static void main(String[] args) {
        int[] digits = {1, 2, 4, 8, 16, 32, 0};
        System.out.println("Digits: " + Arrays.toString((digits)));
        System.out.println(Arrays.toString(sumOfTwo(digits, 16)));
        System.out.println(Arrays.toString(sumOfTwo2(digits, 35)));
    }

    public static int[] sumOfTwo(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (target == numbers[i] + numbers[j]) {
                    return new int[]{numbers[i], numbers[j]};
                }
            }
        }
        throw new IllegalArgumentException("numbers not found");
    }

    public static int[] sumOfTwo2(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int requiredNumber = target - numbers[i];
            if (map.containsKey(requiredNumber) && map.get((requiredNumber)) != i) {
                return new int[]{i, map.get(requiredNumber)};
            }
        }
        throw new IllegalAccessError("numbers not found");
    }
}
