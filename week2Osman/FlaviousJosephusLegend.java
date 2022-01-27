package week2;

import java.util.ArrayList;
import java.util.Scanner;

public class FlaviousJosephusLegend {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {

            int people = scan.nextInt();
            int stepSize = scan.nextInt();
            int countedSteps = 0;
            int current = 0;
            ArrayList<Integer> dead = new ArrayList<>();

            while (dead.size() != people-1){

                if (!dead.contains(current)){
                    countedSteps++;
                }

                current += 1;
                current = current % people;
                if (current == 0){
                    current++;
                }

                if (countedSteps % stepSize  ==0 && current != 0){
                    dead.add(current);
                }



            }

            System.out.println(dead);


        }
    }
}
