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
    private static char[][] grid = new char[10][10];

    public NovoJogoView() {
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

    public String askPosicao(int pos) {

        System.out.printf("Informe a posição do %dº navio. Ex.(A0/a0): ", pos+1);
        posicao = scan.next();

        boolean letra = String.valueOf( Tabuleiro.LABEL_LINHAS ).contains( String.valueOf( posicao.toUpperCase().charAt(0) ));

        if (posicao.length() < 3 && letra || (int) posicao.charAt(1) < 10)  {
            return posicao;
        } else {
            System.out.println("A posição informada não existe no Tabuleiro, infome novamente!");
            askPosicao(pos);
        }
        return posicao;
    }
}
