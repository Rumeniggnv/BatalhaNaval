package com.rnv.batalhaNaval.controller;

import com.rnv.batalhaNaval.domain.Jogo;
import com.rnv.batalhaNaval.domain.Tabuleiro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class BatalhaNaval {
    private Jogo jogo;
    private int jogadas = 1;
    private int acertosJogador = 0;
    private int acertosComputador = 0;

    public BatalhaNaval() {
        this.jogo = new Jogo(null, null);
    }
    public Jogo getJogo() {
        return jogo;
    }
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    public int getJogadas() {
        return this.jogadas;
    }
    public int getAcertosJogador() {
        return this.acertosJogador;
    }
    public int getAcertosComputador() {
        return this.acertosComputador;
    }
    public void prepareJogoAutomatico() {
        prepareTabuleiro(this.jogo.getJogador().getTabuleiro());
        prepareTabuleiro(this.jogo.getComputador().getTabuleiro());
    }

    private void prepareTabuleiro(Tabuleiro tabuleiro) {
        HashSet<ArrayList<Integer>> paresEscolhidos = new HashSet<>();

        //Gera 10 pares de valores inteiros randômicos sem repetição
        do {
            int linhaRandom = new Random().nextInt(Tabuleiro.NUM_LINHAS);
            int colunaRandom = new Random().nextInt(Tabuleiro.NUM_COLUNAS);
            ArrayList<Integer> par = new ArrayList<>(){{add(linhaRandom); add(colunaRandom);}};

            paresEscolhidos.add(par);
        } while (paresEscolhidos.size() < 10);

        //Adiciona 10 navios (submarinos) em posições aleatórias
        for (ArrayList<Integer> par: paresEscolhidos) {
            tabuleiro.setGridPosValue(par.get(0),par.get(1),'N');
        }
    }
    public void prepareTabuleiroManualComputador(){
        prepareTabuleiro(this.jogo.getComputador().getTabuleiro());
    }
    public void prepareTabuleiroManualJogador(Tabuleiro tabuleiro, int linha, int coluna){
        tabuleiro.setGridPosValue(linha, coluna, 'N');
    }

    //Verifica se ainda há navios posicionados
    //para indicar a continuação ou
    //finalização do jogo
    public boolean temNavio() {
        //Arrays.deepToString(this.getJogo().getComputador().getTabuleiro().getGrid()).contains("N")
        if ( this.acertosJogador == 10 || this.acertosComputador == 10 ) {
            return true;
        }
        return false;
    }

    public void checaTiroJogador( String pos ) {
        //Converte a letra da linha para a posição coorrespondente do array LABEL_LINHAS
        int linha = String.valueOf( Tabuleiro.LABEL_LINHAS ).indexOf( pos.toUpperCase().charAt(0) );
        //Pega o número da coluna
        int coluna = Integer.parseInt( pos.substring(1) );
        String vPosComputador = String.valueOf(this.getJogo().getComputador().getTabuleiro().getGridPosValue(linha, coluna));
        String vPosJogador = String.valueOf(this.getJogo().getJogador().getTabuleiro().getGridPosValue(linha, coluna));


        //Se na posição do tiro/jogada tiver um navio do computador
        if ( vPosComputador.equals("N") ) {
            this.acertosJogador++;
            //Se na posição do tiro/jogada também tiver um navio do jogador
            if ( vPosJogador.equals("N") ) {
                //Então foi um tiro certeiro com navio posicionado, o GRID do Jogador recebe 'X'
                this.getJogo().getJogador().getTabuleiro().getGrid()[linha][coluna] = 'X';
            } else {
                //Senão foi um tiro certeiro sem navio posicionado, o GRID do Jogador recebe '*'
                this.getJogo().getJogador().getTabuleiro().getGrid()[linha][coluna] = '*';
            }
        } else if ( vPosJogador.equals("N") ) {
                //Senão tiver posicionado navio do computador mas tiver posicionado navio do Jogador
                //Então foi tiro na água mas tem navio do Jogador, o GRID do Jogador recebe 'n'
                this.getJogo().getJogador().getTabuleiro().getGrid()[linha][coluna] = 'n';
            } else {
                //Senão foi tiro na água e não tem navio do Jogador posicionado
                this.getJogo().getJogador().getTabuleiro().getGrid()[linha][coluna] = '-';
            }
        this.jogadas++;
    }

    public void tiroComputador(){
        System.out.println(":::: O Computador atirou...");
        int linhaRandom = new Random().nextInt(Tabuleiro.NUM_LINHAS);
        int colunaRandom = new Random().nextInt(Tabuleiro.NUM_COLUNAS);
        String valorPosicao = String.valueOf(this.jogo.getJogador().getTabuleiro().getGridPosValue(linhaRandom, colunaRandom));
        System.out.printf(":::: Atirou na linha: %d, coluna: %d, que tem valor: %s", linhaRandom, colunaRandom, valorPosicao.isBlank() ? "VAZIO" : valorPosicao);
        if ( valorPosicao.isBlank() || valorPosicao.equals("N")) {
            this.checaTiroComputador(linhaRandom, colunaRandom);
        } else this.tiroComputador();

    }

    public void checaTiroComputador( int linha, int coluna ) {
        String vPosComputador = String.valueOf(this.getJogo().getComputador().getTabuleiro().getGridPosValue(linha, coluna));
        String vPosJogador = String.valueOf(this.getJogo().getJogador().getTabuleiro().getGridPosValue(linha, coluna));

        //Se na posição do tiro/jogada tiver um navio do Jogador
        if ( vPosJogador.equals("N") ) {
            this.acertosComputador++;
            //Se na posição do tiro/jogada também tiver um navio do Computador
            if ( vPosComputador.equals("N") ) {
                //Então foi um tiro certeiro com navio posicionado, o GRID do Computador recebe 'X'
                this.getJogo().getComputador().getTabuleiro().getGrid()[linha][coluna] = 'X';
            } else {
                //Senão foi um tiro certeiro sem navio posicionado, o GRID do Computador recebe '*'
                this.getJogo().getComputador().getTabuleiro().getGrid()[linha][coluna] = '*';
            }
        } else if ( vPosComputador.equals("N") ) {
            //Se não tiver posicionado navio do Jogador mas tiver posicionado navio do Computador
            //Então foi tiro na água mas tem navio do Computador, o GRID do Computador recebe 'n'
            this.getJogo().getComputador().getTabuleiro().getGrid()[linha][coluna] = 'n';
        } else {
            //Senão foi tiro na água e não tem navio do Computador posicionado
            this.getJogo().getComputador().getTabuleiro().getGrid()[linha][coluna] = '-';
        }
    }
}
