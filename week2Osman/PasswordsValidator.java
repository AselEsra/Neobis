package week2;

import java.util.Scanner;

public class PasswordsValidator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()){
                String s = scan.nextLine();
                boolean ok = true;
                if (s.length() < 6 ||s.length() > 32 ){
                    ok = false;
                }

                else if (s.matches("[^a-zA-Z0-9]") || s.contains(" ")){
                    ok =false;
                }
                else if (!containsAtleast(s))  {
                    ok = false;
                }
            System.out.println(ok);
        }
    }

    public static boolean containsAtleast(String inp){
        boolean number = false;
        boolean lower = false;
        boolean upper= false;

        number = inp.matches("[\\d]");
        System.out.println("num "+number);
        return number && lower && upper;
    }
}
