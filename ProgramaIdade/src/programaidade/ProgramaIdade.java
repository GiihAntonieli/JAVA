
package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = t.nextInt();
        int i = 2015 - nasc;
        System.out.println("Sua idade é "+ i);
        if (i >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
    
}
