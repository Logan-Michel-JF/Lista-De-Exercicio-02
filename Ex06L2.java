import javax.swing.JOptionPane;

public class Ex06L2{

    public static void main(String[] args){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Numero: "));

        if(numero !=1){

            JOptionPane.showMessageDialog(null,
            numero + " e Diferente de 1.");

        }else { 
            JOptionPane.showMessageDialog(null,
            numero + " Nao e Diferente de 1.");
        }
    }
}