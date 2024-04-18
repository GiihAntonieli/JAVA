
package testefucao01;

public class TesteFucao01 {
    
    //Procedimento ou 
    /*static  void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é "+ s);
    }*/
    
    //Método 
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa!");
        //soma(5,2);
        int sm = soma(5,4);
        System.out.println(sm);
    }
    
}
