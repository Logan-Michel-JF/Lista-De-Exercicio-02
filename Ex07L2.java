import javax.swing.JOptionPane;

public class Ex07L2{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite Seu Numero: "));
        if (numero == 0){ 
            JOptionPane.showMessageDialog(null, numero + ": É Neutro.");
        }else if (numero % 2 == 0){
            JOptionPane.showMessageDialog(null, numero + ": É par");
        }else if (numero % 2 !=0){
            JOptionPane.showMessageDialog(null, numero + ": É Ìmpar.");
        }
        
        if (numero <0){
            JOptionPane.showMessageDialog(null, numero + ": É Negativo.");
        }else if (numero >0){
            JOptionPane.showMessageDialog(null, numero + ": É Positivo.");
        }

        if (numero >10){
            JOptionPane.showMessageDialog(null, numero + ": É Maior que 10.");
        }else if (numero <10){
            JOptionPane.showMessageDialog(null, numero + ": Não é Maior que 10."); 
        }

        if (numero == 50){
            JOptionPane.showMessageDialog(null, numero + ": É igual a 50.");
        }else if (numero <= 50){
            JOptionPane.showMessageDialog(null, numero + ": É Menor que 50.");
        }else if (numero >= 50){
            JOptionPane.showMessageDialog(null, numero + ": Não é Menor que 50.");
        }

        if (numero >= -10){
            JOptionPane.showMessageDialog(null, numero + ": Não é Menor que -10.");
        }else if (numero <= -10){
            JOptionPane.showMessageDialog(null, numero + ": É Menor que -10.");
        }

        if (numero == 30){
            JOptionPane.showMessageDialog(null, numero + ": É Igual a 30.");
        }else if (numero >= 30){
            JOptionPane.showMessageDialog(null, numero + ": É Maior que 30.");
        }else if (numero <= 30){
            JOptionPane.showMessageDialog(null, numero + ": Não é Maior que 30.");
        }

        if (numero != 1){
            JOptionPane.showMessageDialog(null, numero + ": É Diferente de 1.");
        }else {
            JOptionPane.showMessageDialog(null, numero + ": Não é Diferente de 1.");
        }
    }
}