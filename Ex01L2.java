import javax.swing.JOptionPane;

public class Ex01L2{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Número: "));
        if (numero >0){
            JOptionPane.showMessageDialog(null, numero + " É Positivo.");
        }else{
            JOptionPane.showMessageDialog(null, numero + " Não é Positivo.");
        }
    
    }
}