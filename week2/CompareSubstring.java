
import java.util.Scanner;

public class CompareSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String first = in.nextLine();
            String second = in.nextLine();
            int start = 0;
            int end = 1;
            int counter = 0;

            for (int i = 0; i < first.length(); i++) {
                String current = first.substring(start, end);
                if (second.contains(current)) {
                    end++;
                    counter = current.length();
                } else {
                    start++;
                    end++;
                }
            }
            System.out.println(counter);
        }
    }
}