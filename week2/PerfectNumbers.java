import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i <n ; i++) {
            int num = in.nextInt();
            int sum = 0;
            for (int j = 1; j <num-1; j++) {
                if (num % j == 0) {
                    sum+=j;
                }
            }
            if(sum == num){
                System.out.println(num + " eh perfeito");
            }
            else {
                System.out.println(num + " nao eh perfeito");
            }
        }
    }
}
