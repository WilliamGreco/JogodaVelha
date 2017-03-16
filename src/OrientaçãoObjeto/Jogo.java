package OrientaçãoObjeto;

public class Jogo {//Tabuleiro do Jogo da Velha.

    private String[][] m = {{"1", "2", "3"}, 
                            {"4", "5", "6"}, 
                            {"7", "8", "9"}};

    public String Mostrar() {//Ciclo for para tabuleiro.
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("   " + m[linha][coluna]);

            }
            System.out.println("\n");

        }
        return null;

    }//-------------------------------------------------------------------------

    public boolean Correto(String local) {

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if(m[linha][coluna].equals(local))
                        return true;
            }
            
        }
        return false;
        
        
    }//-------------------------------------------------------------------------
    
    public void Jogada(String posiçao, String jogador){
        if(posiçao.equals("1"))
            m[0][0] = jogador;
        else if(posiçao.equals("2"))
            m[0][1] = jogador;
        else if(posiçao.equals("3"))
            m[0][2] = jogador;
        else if(posiçao.equals("4"))
            m[1][0] = jogador;
        else if(posiçao.equals("5"))
            m[1][1] = jogador;
        else if(posiçao.equals("6"))
            m[1][2] = jogador;
        else if(posiçao.equals("7"))
            m[2][0] = jogador;
        else if(posiçao.equals("8"))
            m[2][1] = jogador;
        else if(posiçao.equals("9"))
            m[2][2] = jogador;
           
    }//-------------------------------------------------------------------------
    
    public String Vencedor(int jogadas){
        String[] Vetor = new String[8];
        String win = "null";
        if(jogadas == 9){
            win = "EMPATE";
            
        }
        Vetor[0] = m[0][0] + m[0][1] + m[0][2];
        Vetor[1] = m[1][0] + m[1][1] + m[1][2];
        Vetor[2] = m[2][0] + m[2][1] + m[2][2];
        
        Vetor[3] = m[0][0] + m[1][0] + m[2][0];
        Vetor[4] = m[0][1] + m[1][1] + m[2][1];
        Vetor[5] = m[0][2] + m[1][2] + m[2][2];
        
        Vetor[6] = m[0][0] + m[1][1] + m[2][2];
        Vetor[7] = m[0][2] + m[1][1] + m[2][0];
        
        for (int i = 0; i <Vetor.length; i++) {
            if(Vetor[i].equals("XXX")){
                win = "Player 1";
            }else if(Vetor[i].equals("OOO")){
                win = "Player 2";
            }  
        }
        return win;
    }//-------------------------------------------------------------------------

}
