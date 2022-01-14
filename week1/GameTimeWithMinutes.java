import java.util.Scanner;

public class GameTimeWithMinutes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inHour = in.nextInt();
        int inMin = in.nextInt();
        int finHour = in.nextInt();
        int finMin = in.nextInt();

        int durHour = finHour - inHour;

        if (durHour < 0) {
            durHour = 24 + (finHour - inHour);
        }

        int durMin = finMin - inMin;
        if (durMin < 0) {
            durMin = 60 + (finMin - inMin);
            durHour--;
        }
        if (inHour == finHour && inMin == finMin) {
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)" + "\n");
        }
        else
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)" + "\n", durHour, durMin);
    }
}