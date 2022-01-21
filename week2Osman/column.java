package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class column {

    public static void main(String[] args) {


        ArrayList<Double> nums = new ArrayList<>();

        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();
        String a = scan.next();


        for (int i = 0; i < n; i++) { nums.add(scan.nextDouble()); }


        double tot = 0;
        if (a.toLowerCase().equals("s")){
            for (double num:nums) {tot += num; }

        }

        else if (a.toLowerCase().equals("m")) {
            for (double num:nums) { tot += num; }
            tot = tot/nums.size();
        }

        System.out.println(tot);




    }


}
