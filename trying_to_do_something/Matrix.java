import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter number of lines: ");
        int lines = sc.nextInt();
        System.out.print("enter number of rows: ");
        int rows = sc.nextInt();

        int[][]oneArr = new int[lines][rows];
        int[][]twoArr = new int[lines][rows];
        int[][]resArr = new int[lines][rows];
        int[][]matrix = new int [lines][rows];

        fillMatrix(oneArr);
        fillMatrix(twoArr);

        outputMatrix(oneArr);
        System.out.println("+++++++++++++++++");
        outputMatrix(twoArr);
        for (int i = 0; i < resArr.length; i++) {
            for (int j = 0; j < resArr[i].length; j++) {
                resArr[i][j] = oneArr[i][j] + twoArr[i][j];
            }
        }
        System.out.println("===================");
        outputMatrix(resArr);
        fillMatrix(matrix);
        System.out.println();
        outputMatrix(matrix);
        transpositionMatrix(matrix);
        System.out.println();
        outputMatrix(matrix);

    }
    private static int[][] fillMatrix(int[][] tmpArr){
        System.out.print("enter the minimum number of the matrix: ");
        int min = sc.nextInt();
        System.out.print("enter the maximum number of the matrix: ");
        int max = sc.nextInt();
        for (int i = 0; i < tmpArr.length; i++) {
            for (int j = 0; j < tmpArr[i].length; j++) {
                tmpArr[i][j] = new Random().nextInt(min,max);
            }
        }
        return tmpArr;
    }
    private static void outputMatrix(int[][] tmpArr){
        for (int i = 0; i < tmpArr.length; i++) {
            for (int j = 0; j < tmpArr[i].length; j++) {
                System.out.print(tmpArr[i][j] + "\t ");
            }
            System.out.println();
        }
    }
    private static void transpositionMatrix(int[][]tmpArr){
        for (int i = 0; i < tmpArr.length-1; i++) {
            for (int j = i+1; j < tmpArr[i].length; j++) {
                int trans = tmpArr[i][j];
                tmpArr[i][j] = tmpArr[j][i];
                tmpArr[j][i] = trans;
            }
        }

    }
}
