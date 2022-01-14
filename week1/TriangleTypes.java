import java.util.Scanner;
import java.util.Arrays;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double[] sides = {a,b,c};
        Arrays.sort(sides);
        a = sides[2];
        b = sides[1];
        c = sides[0];

        if (a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if (a*a == b*b + c*c){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if (a*a > b*b + c*c){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if (a*a < b*b + c*c){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if(((a == b  && c!=a ) || (a == c  && b!= a ) || (c == b  && a!=b ))){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
