import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i <n ; i++) {
            String sentence = in.next();
            int shift = in.nextInt();
            String low = sentence.toLowerCase();
            char[] letters = low.toCharArray();
            StringBuilder newString = new StringBuilder();
            for (int j = 0; j <low.length() ; j++) {
                int curPos = letters[j] - 'z';
                int newPos = (curPos - shift) % 26;
                letters[j] = (char) ('z' + newPos);
                newString.append(letters[j]);

            }
            String upper = newString.toString().toUpperCase();
            System.out.println(upper);
        }
    }
}
