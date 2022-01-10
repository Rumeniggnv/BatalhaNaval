package com.rnv.batalhaNaval.view;

import com.rnv.batalhaNaval.domain.Jogo;
import com.rnv.batalhaNaval.domain.Player;
import com.rnv.batalhaNaval.domain.Tabuleiro;

import java.util.Scanner;

public class NovoJogoView {

    private Jogo jogo;
    private Player jogador;
    private Player computador;

    private Scanner scan;

    private static String posicao;
    //private static char[][] grid = new char[10][10];

    public NovoJogoView(Jogo jogo) {
        this.jogo = jogo;
        scan = new Scanner( System.in );

    }

    public String askNome() {
        System.out.print("Digite o nome do jogador: ");
        return scan.next();
    }

    public Jogo create() {
        this.jogador = new Player(askNome());
        this.computador = new Player("Computer 1");

        this.jogo = new Jogo(jogador, computador);

        return jogo;
    }

    public String askPosicao(Integer pos) {
        //Se 'pos' possuir um valor, quer dizer que os navios
        // estão sendo posicionados e o valor representa o número de navios
        if ( pos != null ) {
            System.out.printf("Informe a posição do %dº navio. Ex.(A0/a0): ", pos + 1);
            posicao = scan.next();
            boolean letra = String.valueOf( Tabuleiro.LABEL_LINHAS ).contains( String.valueOf( posicao.toUpperCase().charAt(0) ));

            if ( !(posicao.length() == 2 && letra) ) {
                System.out.println("A posição informada não existe no Tabuleiro, infome novamente!");
                askPosicao(pos);
            } else if ( !this.checaSetPosicao(posicao) ) {
                        System.out.println("Um Navio já foi posicionado nessa corrdenada, escolha outra!");
                        askPosicao(pos);
                }
        } else {
            //Senão quer dizer que é a coordenada de ataque
            System.out.print("Informe a coordenada de ataque. Ex.(A0/a0): ");
            posicao = scan.next();
            boolean letra = String.valueOf( Tabuleiro.LABEL_LINHAS ).contains( String.valueOf( posicao.toUpperCase().charAt(0) ));

            if ( !(posicao.length() == 2 && letra) ) {
                System.out.println("A posição informada não existe no Tabuleiro, infome novamente!");
                askPosicao(pos);
            } else if (!this.checaTiroPosicao(posicao)) {
                    System.out.println("Já foi feito um ataque nessa coordenada, escolha outra!");
                    askPosicao(pos);
                }
            }


        //boolean letra = String.valueOf( Tabuleiro.LABEL_LINHAS ).contains( String.valueOf( posicao.toUpperCase().charAt(0) ));

        /*if ( !(posicao.length() < 3 && letra || (int) posicao.charAt(1) < 10) )  {
            System.out.println("A posição informada não existe no Tabuleiro, infome novamente!");
            askPosicao(pos);
        }*/
        return posicao;
    }

    public boolean checaSetPosicao(String posicao) {
        //Pega o número da linha
        int linha = String.valueOf( Tabuleiro.LABEL_LINHAS ).indexOf( posicao.toUpperCase().charAt(0) );
        //Pega o número da coluna
        int coluna = Integer.parseInt( posicao.substring(1) );
        if ( String.valueOf(this.jogo.getJogador().getTabuleiro().getGridPosValue(linha, coluna)).isBlank() ) {
            //Indica que um navio ainda não foi posicionado, que a coordenada está em branco
            return true;
        } else return false;
    }

    public boolean checaTiroPosicao(String posicao) {
        int linha = String.valueOf( Tabuleiro.LABEL_LINHAS ).indexOf( posicao.toUpperCase().charAt(0) );
        int coluna = Integer.parseInt( posicao.substring(1) );
        if ( String.valueOf(this.jogo.getJogador().getTabuleiro().getGridPosValue(linha, coluna)).isBlank() ||
            String.valueOf(this.jogo.getJogador().getTabuleiro().getGridPosValue(linha, coluna)).equals("N")) {
            return true;
        } else return false;
    }
}
