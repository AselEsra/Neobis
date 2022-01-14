public class SequenceIJ4 {

    public static void main(String[] args){

        double i;
        double j;
        for (i = 0; i <= 2; i += 0.2) {
            for (j = 1; j <= 3; j++) {
                if (i == 0 || i == 1 || i >= 1.9) {
                    System.out.println("I=" + Math.round(i) + " J=" + Math.round((i + (j % 10))));
                } else {
                    System.out.printf("I=%.1f", i);
                    System.out.printf("J=%.1f", (i + (j % 10)));
                    System.out.println();
                }
            }
        }
    }
}