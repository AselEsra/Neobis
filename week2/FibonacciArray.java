import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] fib = new long[100];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <61 ; i++) {
            fib[i] = fib[i-2] + fib[i-1];
        }
        for (int i = 0; i < n; i++) {
            int test = in.nextInt();
            System.out.println("Fib("+ test + ") = " + fib[test]);
        }
    }
}
