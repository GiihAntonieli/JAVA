
package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int pernas =  tec.nextInt();
        String tipo;
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2: 
                tipo = "Bípede";
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
    
}
