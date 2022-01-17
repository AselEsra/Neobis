import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n ; i++) {
            int num = in.nextInt();
            int[] divider = new int[num];
            int count = 0;
            for (int j = 2; j < num ; j++) {
                if(num % j == 0){
                    divider[count] = j;
                    count++;
                }
            }
            if(divider[0]==0){
                System.out.println(num + " eh primo");
            }
            else {
                System.out.println(num + " nao eh primo");
            }
        }
    }
}
