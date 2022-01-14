import java.util.Scanner;

public class LogicalSequence2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int column = in.nextInt();
        int row = in.nextInt();
        int[][] matrix = new int[row][column];

        int num = 1;
        for (int i = 0; i <row/column ; i++) {
            for (int j = 0; j <column ; j++) {
                matrix[i][j] = num;
                num++;
                if (j==column-1) {
                    System.out.print(matrix[i][j]);
                }
                else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
