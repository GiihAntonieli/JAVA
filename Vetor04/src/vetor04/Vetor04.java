
package vetor04;

import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Colocando em Ordem
        /*int num[] = {3,5,1,8,4};
        Arrays.sort(num);
        for(int valor:num ){
            System.out.print(valor + " ");
        }*/
        
        //Busca
        /*int num[] = {3,5,1,8,4};
        int pos = Arrays.binarySearch(num, 8);
        for(int v:num){
            System.out.print(v + " ");
        }
        System.out.println("");
        System.out.println("Encontrei o valor na posição " + pos);*/
        
        //Preenchendo o Vetor
        int num[] = new int[20];
        Arrays.fill(num, 5);
        for(int v:num){
            System.out.print(v + " ");
        }
        
    }
    
}
