
package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0 , par=0, impar=0, cem=0, num=0, m;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um número: <br><i>(Valor 0 INTERROMPE)</i></br></html>"));
            
            //Pares e ímpares
            if (n % 2 == 0 ){
                par++;
            }else{
                impar++;
            }
            
            //acima de 100
            if (n > 100){
                cem++;
            }
            
            //média dos valores
            s += n;
            num++;
            
        }while (n != 0);
        m = s / num;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final </hr>"+ 
                "<br>Somatório vale: "+ s + "<br>Total de Pares: "+ par + 
                "<br>Total de Ímpares: "+ impar+ "<br>Acima de 100: "+ cem + "<br>Média dos Valores: "+ 
                m +"</html> ");
    }
    
}
