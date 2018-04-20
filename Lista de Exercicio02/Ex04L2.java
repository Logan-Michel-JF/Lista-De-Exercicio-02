import javax.swing.JOptionPane;

public class Ex04L2{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Numero: "));
        
        if(numero % 2 == 0){

            JOptionPane.showMessageDialog(null,
            numero + " e Par." );
        
        }else {
            JOptionPane.showMessageDialog(null,
            numero + " Nao e Par." );

        }
    }
}