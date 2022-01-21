import java.util.Scanner;

public class Huaauhahhuahau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String laugh = in.next();
        StringBuilder funny = new StringBuilder();

        for(int i=0 ; i<laugh.length() ; i++)
            if (laugh.charAt(i) == 'a' || laugh.charAt(i) == 'e' || laugh.charAt(i) == 'i' || laugh.charAt(i) == 'o' || laugh.charAt(i) == 'u')
                funny.append(laugh.charAt(i));

        String reverseFunny = new StringBuilder(funny.toString()).reverse().toString();

        if (funny.toString().equals(reverseFunny))
            System.out.println("S");
        else
            System.out.println("N");

    }
}
