import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <n ; i++) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            double sum;
            sum = a*2 + b*3 + c*5;
            double avg = sum / 10;
            System.out.printf("%.1f"+"\n",avg);
        }
    }
}
