import java.util.Scanner;

public class Combiner {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i <n ; i++) {
            StringBuilder combined = new StringBuilder();
            String first = in.next();
            String second = in.next();
            char[] first1 = first.toCharArray();
            char[] second2 = second.toCharArray();
            int length = Math.min(first.length(), second.length());
            String end ="";
            for (int j = 0; j <length ; j++) {
                if (first.length()>second.length()) {
                    end = first.substring(second.length(), first.length());
                }
                else if (second.length()>first.length()) {
                    end = second.substring(first.length(), second.length());
                }
                combined.append(first1[j]);
                combined.append(second2[j]);

                }
            combined.append(end);
            System.out.println(combined);
        }
    }
}
