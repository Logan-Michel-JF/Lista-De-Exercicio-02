import javax.swing.JOptionPane;

public class Ex08L2{

    public static void main(String[] args){
      
        String comida1 = JOptionPane.showInputDialog("Escolha Comida." +
            "\nTIPO                  NOME                                          VALOR"    + 
            "\nBolos                 Bolo Brigadeiro                               R$ 29,50" + 
            "\nBolos                 Bolo Floresta Negra                           R$ 2,00"  +
            "\nBolos                 Bolo Leite com Nutella                        R$ 29,23" +
            "\nBolos                 Bolo Mousse de Chocolate                      R$ 7,10"  +
            "\nBolos                 Bolo Nega Maluca                              R$ 19,33" +
            "\nDoces                 Bomba de Creme                                R$ 17,71" +
            "\nDoces                 Bomba de Morango                              R$ 4,82"  +
            "\nSanduíches            Filé-Mignon com Fritas e Cheddar              R$ 21,16" +                                                           
            "\nSanduíches            Hamburguer com Queijos, Champignon e Rúcula   R$ 12,70" +                
            "\nSanduíches            Provolone com Salame                          R$ 19,70" +
            "\nSanduiches            Vegetariano de Berinjela                      R$ 28,22" +
            "\nPizzas                Calabresa                                     R$ 8,98"  +
            "\nPizzas                Napolitana                                    R$ 0,42"  +
            "\nPizzas                Peruana                                       R$ 18,36" +
            "\nPizzas                Portuguesa                                    R$ 27,50"
            );

        double preco1 = 0;
        if(comida1.equals("Bolo Brigadeiro")){
            preco1 = 29.50;
        }else if(comida1.equals("Bolo Floresta Negra")){
            preco1 = 2.00;
        }else if(comida1.equals("Bolo Leite com Nutella")){
            preco1 = 29.23;
        }else if(comida1.equals("Bolo Mousse de Chocolate")){
            preco1 = 7.10;
        }else if(comida1.equals("Bolo Nega Maluca")){
            preco1 = 19.33;
        }else if(comida1.equals("Bomba de Creme")){
            preco1 = 17.71;
        }else if(comida1.equals("Bomba de Morango")){
            preco1 = 4.82;
        }else if(comida1.equals("Filé-Mignon com Fritas e Cheddar")){
            preco1 = 21.16;
        }else if(comida1.equals("Hamburguer com Queijos, Champignon e Rúcula")){
            preco1 = 12.70;
        }else if(comida1.equals("Provolone com Salame")){
            preco1 = 19.70;
        }else if(comida1.equals("Vegetariano de Beringela")){
            preco1 = 28.22;
        }else if(comida1.equals("Calabresa")){
            preco1 = 8.98;
        }else if(comida1.equals("Napolitana")){
            preco1 = 0.42;
        }else if(comida1.equals("Peruana")){
            preco1 = 18.36;
        }else if(comida1.equals("Portuguesa")){
            preco1 = 27.50;
        }

        String comida2 = JOptionPane.showInputDialog("Escolha Outra Comida." +
            "\nTIPO                  NOME                                          VALOR"    + 
            "\nBolos                 Bolo Brigadeiro                               R$ 29,50" + 
            "\nBolos                 Bolo Floresta Negra                           R$ 2,00"  +
            "\nBolos                 Bolo Leite com Nutella                        R$ 29,23" +
            "\nBolos                 Bolo Mousse de Chocolate                      R$ 7,10"  +
            "\nBolos                 Bolo Nega Maluca                              R$ 19,33" +
            "\nDoces                 Bomba de Creme                                R$ 17,71" +
            "\nDoces                 Bomba de Morango                              R$ 4,82"  +
            "\nSanduíches            Filé-Mignon com Fritas e Cheddar              R$ 21,16" +                                                           
            "\nSanduíches            Hamburguer com Queijos, Champignon e Rúcula   R$ 12,70" +                
            "\nSanduíches            Provolone com Salame                          R$ 19,70" +
            "\nSanduiches            Vegetariano de Berinjela                      R$ 28,22" +
            "\nPizzas                Calabresa                                     R$ 8,98"  +
            "\nPizzas                Napolitana                                    R$ 0,42"  +
            "\nPizzas                Peruana                                       R$ 18,36" +
            "\nPizzas                Portuguesa                                    R$ 27,50"
            );

        double preco2 = 0;
        if(comida2.equals("Bolo Brigadeiro")){
            preco2 = 29.50;
        }else if(comida2.equals("Bolo Floresta Negra")){
            preco2 = 2.00;
        }else if(comida2.equals("Bolo Leite com Nutella")){
            preco2 = 29.23;
        }else if(comida2.equals("Bolo Mousse com Chocolate")){
            preco2 = 7.10;
        }else if(comida2.equals("Bolo Nega Maluca")){
            preco2 = 19.33;
        }else if(comida2.equals("Bomba de Creme")){
            preco2 = 17.71;
        }else if(comida2.equals("Bomba de Morango")){
            preco2 = 4.82;
        }else if(comida2.equals("Filé-Mignon com Fritas e Cheddar")){
            preco2 = 21.16;
        }else if(comida2.equals("Hamburguer com Queijos, Champignon e Rúcula")){
            preco2 = 12.70;
        }else if(comida2.equals("Provolone com Salame")){
            preco2 = 19.70;
        }else if(comida2.equals("Vegetariano de Beringela")){
            preco2 = 28.22;
        }else if(comida2.equals("Calabresa")){
            preco2 = 8.98;
        }else if(comida2.equals("Napolitana")){
            preco2 = 0.42;
        }else if(comida2.equals("Peruana")){
            preco2 = 18.36;
        }else if(comida2.equals("Portuguesa")){
            preco2 = 27.50;
        }
    }
}