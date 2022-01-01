package com.rnv.batalhaNaval.controller;

import com.rnv.batalhaNaval.domain.Jogo;
import com.rnv.batalhaNaval.domain.Tabuleiro;

public class BatalhaNaval {
    private Jogo jogo;

    public BatalhaNaval() {
        this.jogo = new Jogo(null, null);
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public void prepareJogo() {
        this.jogo.getJogador().getTabuleiro();
    }

    public void prepareTabuleiro() {
        Tabuleiro localTabuleiro = new Tabuleiro();
        char[][] localGrid = localTabuleiro.getGrid();

        //Adiciona 11 navios (submarinos) em posições aleatórias
        for (int i = 0; i < 11; i++) {

        }


    }
}
