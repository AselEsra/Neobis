package week2;

import java.util.Scanner;

public class primeNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int n2 =scan.nextInt();
            boolean prime = true;
            for (int j = 2; j < (n2/2)+1; j++) {
                if (n2 % j == 0){
                    prime = false;
                    break;
                }
            }

            if (prime){
                System.out.printf("%d eh primo\n", n2 );
            }
            else{
                System.out.printf("%d nao eh primo\n", n2 );
            }


        }
    }
}
