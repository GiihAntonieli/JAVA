
package funcao01;

public class Factorial {
    
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public void setValor(int n){
        num = 0;
        int f = 1;
        String s = "";
        for (int c = n; c > 1; c--){
            f += c;//Resultado
            s += c + " x ";//Mostra a conta
        }
        s += "1 = ";//Termina de mostra a conta
        fat = f;//Resultado
        formula = s;//Mostra a conta
    }
    public int getFatorial(){
        return fat;//Resultado
    }
    public String getFormula(){
        return formula;//Mostra a conta
    }
}
