import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            int popA = in.nextInt();
            int popB = in.nextInt();
            double growthA = in.nextDouble();
            double growthB = in.nextDouble();

            int years = 0;
            int endPopA = popA;
            int endPopB = popB;

            while (endPopA <= endPopB) {
                endPopA += (int) ((popA * growthA)/100);
                endPopB += (int) ((popB * growthB)/100);
                years++;

                if (years>=100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            System.out.println(years + " anos.");
        }
    }
}