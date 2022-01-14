import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        int [] banknotes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
        double remainder = 0;

        System.out.println("NOTAS:");
        for (int banknote: banknotes) {
            int count = (int) (n / banknote);
            remainder = n % banknote;
            System.out.printf("%d nota(s) de R$ %.2f" + "\n", count, (double)banknote);
            n = remainder;
        }

        System.out.println("MOEDAS:");
        for (double coin: coins) {
            int count = (int) (n / coin);
            remainder = remainder % coin;
            System.out.printf("%d moeda(s) de R$ %.2f" + "\n" ,count,coin);
            n = remainder;
        }
    }
}
