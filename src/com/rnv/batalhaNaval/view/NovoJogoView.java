package com.rnv.batalhaNaval.view;

import com.rnv.batalhaNaval.domain.Player;

import java.util.Scanner;

public class NovoJogoView {

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
}
