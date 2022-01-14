import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] banknotes = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(n);

        for (int banknote: banknotes) {
            int count = n / banknote;
            int remainder = n % banknote;
            System.out.println(count + " nota(s) de R$ " + banknote + ",00");
            n = remainder;
        }
    }
}
