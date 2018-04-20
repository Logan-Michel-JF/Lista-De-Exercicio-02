import javax.swing.JOptionPane;

public class Ex08L2{

    public static void main(String[] args){

        String escolha = JOptionPane.showMessageDialog("Escolha os Tipos De Comda.");
        String comida = JOptionPane.showInpuDialog(
                            "TIPO              NOME                           VALOR" + 
                            "\nBolos           Bolo Brigadeiro                R$ 29,50" + 
                            "\nBolos           Bolo Floresta Negra            R$ 2,00" +
                            "\nBolos           Bolo Leite com Nutella         R$ 29,23" +
                            "\nBolos           Bolo Mousse de Chocolate       R$ 7,10" +
                            "\nBolos           Bolo Nega Maluca               R$ 19,33" +
                            "\nDoces           Bomba de Creme                 R$ 17,71" +
                            "\nDoces           Bomba de Morango               R$ 4,82" +
                            "\nSanduíches      Filé-mignon com                R$ 21,16
                                               Fritas e Cheddar"+
                            
                        );

    }
}