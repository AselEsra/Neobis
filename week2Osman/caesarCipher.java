package week2;

import java.util.ArrayList;
import java.util.Scanner;

public class caesarCipher {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String s = scan.next();
            int n2 = scan.nextInt();
            String news = "";
            int[] chars = s.chars().toArray();
            ArrayList<String> arr  = new ArrayList<>();
            for (int c: chars
                 ) {
//                System.out.println(c);
                arr.add((String.copyValueOf(Character.toChars(c-(n2%25)))));
            }
            for (String a: arr
                 ) {
                System.out.print(a);

            }
            System.out.println();

        }
    }

}
