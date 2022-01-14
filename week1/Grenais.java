import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inter = in.nextInt();
        int gremio = in.nextInt();
        System.out.println("Novo grenal (1-sim 2-nao)");

        int interWins = 0;
        int gremioWins = 0;

        int plays = 1;
        int draw = 0;

        if (inter == gremio){
            draw++;
        }
        else if (gremio < inter) {
            interWins++;
        }
        else if (inter < gremio){
            gremioWins++;
        }

        while (in.hasNextInt()){
            int continuee = in.nextInt();
            if (continuee == 1) {
                int inter2 = in.nextInt();
                int gremio2 = in.nextInt();

                if (inter2 == gremio2){
                    draw++;
                }
                else if (gremio2 < inter2) {
                    interWins++;
                }
                else if (inter2 < gremio2){
                    gremioWins++;
                }
                System.out.println("Novo grenal (1-sim 2-nao)");
                plays++;
            }
            else if (continuee==2){
                break;
            }
        }

        System.out.println(plays + " grenais");
        System.out.println("Inter: " + interWins);
        System.out.println("Gremio: " + gremioWins);
        System.out.println("Empates: "+ draw);

        if(interWins == gremioWins){
            System.out.println("Não houve vencedor");
        }else if (interWins>gremioWins){
            System.out.println("Inter venceu mais");
        }else {
            System.out.println("Gremio venceu mais");
        }
    }
}
