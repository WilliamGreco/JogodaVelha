package OrientaçãoObjeto;

import java.util.Scanner;

public class MetodoPrincipal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Jogo game = new Jogo();
        String posição;
        int valida = 0, jogadas = 0;

        while (true) {//--------------------------------------------------------
            System.out.println("#####Jogo da Velha#####");
            game.Mostrar();

            do {//player 1......................................................
                System.out.println("Jogador 1 informe uma posição... ");
                posição = ler.next();
                while (!game.Correto(posição)) {
                    System.out.println("Jogada invalida seu burro...");
                    System.out.print("Jogador 1 informe uma posição... ");
                    posição = ler.next();
                    valida = 0;
                }
                game.Jogada(posição, "X");
                valida = 1;

            } while (valida == 0);//Ultima jogada player 1......................

            jogadas++;
            game.Mostrar();
            valida = 0;
            if (!game.Vencedor(jogadas).equals("null")) {
                break;
            }

            do {//player 2......................................................
                System.out.println("Jogador 2 informe uma posição... ");
                posição = ler.next();
                while (!game.Correto(posição)) {
                    System.out.println("Jogada invalida seu burro...");
                    System.out.print("Jogador 2 informe uma posição... ");
                    posição = ler.next();
                    valida = 0;
                }
                game.Jogada(posição, "O");
                valida = 1;

            } while (valida == 0);//Ultima jogada player 2......................

            jogadas++;
            game.Mostrar();
            valida = 0;
            if (!game.Vencedor(jogadas).equals("null")) {
                break;
            }

        }//---------------------------------------------------------------------
        System.out.println("O " + game.Vencedor(jogadas) + ", venceu a partida!!!!!");

    }

}
