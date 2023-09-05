public class Tie {
    public static void main(String[] args) {
        //����
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < i + 2; j++) {
                System.out.print(" ");
            }
            for (int j = 5 - 2 * i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        //������� �����
        for (int i = 0; i < 5; i++) {
            for (int j = 3 - i; j >= 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //������ �����
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <  i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 7 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
