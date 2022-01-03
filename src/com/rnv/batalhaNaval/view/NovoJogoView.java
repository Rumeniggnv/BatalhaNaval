package com.rnv.batalhaNaval.view;

import com.rnv.batalhaNaval.domain.Jogo;
import com.rnv.batalhaNaval.domain.Player;

import java.util.Scanner;

public class NovoJogoView {

    private Jogo jogo;
    private Player jogador;
    private Player computador;

    private Scanner scan;

    public NovoJogoView() {
        scan = new Scanner( System.in );

    }

    public void setComputerShips() {

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
}
