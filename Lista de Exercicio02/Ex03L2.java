import javax.swing.JOptionPane;

public class Ex03L2{

    public static void main(String[] args){

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Outro Numero: "));

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha Um Numero: \n1- Somar \n2- Subtrair \n3- Multiplicar \n4- Dividir"));
        
        if(opcao == 1){
   
            JOptionPane.showMessageDialog(null,
                numero1  + numero2 );

        }else if (opcao == 2){
            JOptionPane.showMessageDialog(null, numero1 - numero2 );

        }else if (opcao == 3){
            JOptionPane.showMessageDialog(null, numero1 * numero2);

        }else if (opcao == 4){
            JOptionPane.showMessageDialog(null, numero1 / numero2);
        }

    }
}