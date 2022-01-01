package com.rnv.batalhaNaval.controller;

import com.rnv.batalhaNaval.domain.Jogo;
import com.rnv.batalhaNaval.domain.Tabuleiro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

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
        prepareTabuleiro(this.jogo.getJogador().getTabuleiro());
    }

    private void prepareTabuleiro(Tabuleiro tabuleiro) {
        HashSet<ArrayList<Integer>> paresEscolhidos = new HashSet<>();

        //Gera 11 pares de valores inteiros randômicos sem repetição
        do {
            int linhaRandom = new Random().nextInt(Tabuleiro.NUM_LINHAS);
            int colunaRandom = new Random().nextInt(Tabuleiro.NUM_COLUNAS);
            ArrayList<Integer> par = new ArrayList<>(){{add(linhaRandom); add(colunaRandom);}};

            paresEscolhidos.add(par);
        } while (paresEscolhidos.size() < 11);

        //Adiciona 11 navios (submarinos) em posições aleatórias
        for (ArrayList<Integer> par: paresEscolhidos) {
            tabuleiro.setGridPosValue(par.get(0),par.get(1),'N');
            System.out.println(par);
        }
    }
}
