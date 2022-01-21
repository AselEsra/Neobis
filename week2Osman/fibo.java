package week2;

import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] fib = new long[61];
        fib[0] =  0;
        fib[1] =  1;
        fib[2] =  1;
        for (int i = 3; i <= 60; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }


        for (int i = 0; i < n; i++) {
            int n2 =scan.nextInt();
            System.out.printf("Fib(%d) = %d\n",n2,fib[n2]);
        }
    }
}
