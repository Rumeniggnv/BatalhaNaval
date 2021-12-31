package com.rnv.batalhaNaval.domain;

public class Jogo {
    private final Player jogador;
    private final Player computador;

    public Jogo(Player jogador, Player computador) {
        this.jogador = jogador;
        this.computador = computador;
    }

    public Player getComputador() {
        return computador;
    }

    public Player getJogador() {
        return jogador;
    }

}
