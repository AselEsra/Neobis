import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double matrix[][] = new double[12][12];
        int n = in.nextInt();
        String s = in.next();
        double sum = 0;
        if (n >= 0 && n <= 11) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = in.nextDouble();
                    if (n == j) {
                        sum += matrix[i][j];
                    }
                }
            }
            if ("S".equals(s)) {
                System.out.printf("%.1f\n", sum);
            } else if ("M".equals(s)) {
                System.out.printf("%.1f\n", (sum / 12));
            }
        }
    }
}