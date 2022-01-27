package week2;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class perfectNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int n2 = scan.nextInt();
            int tot = 1;
            for (int j = 2; j < n2; j++) {
                if (n2%j == 0 ){tot += j;}
            }
            if (tot == n2 && n2 != 1){
                System.out.printf("%d eh perfeito\n",n2);
            }
            else {
                System.out.printf("%d nao eh perfeito\n",n2);
            }
        }

    }
}
