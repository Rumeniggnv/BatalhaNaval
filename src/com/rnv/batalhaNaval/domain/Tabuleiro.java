package com.rnv.batalhaNaval.domain;

public class Tabuleiro {
    public static final int NUM_LINHAS = 10;
    public static final int NUM_COLUNAS = 10;
    public static final char[] LABEL_LINHAS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    private char[][] grid = new char[NUM_LINHAS][NUM_COLUNAS];

    public Tabuleiro() {
        for (int l = 0; l < NUM_LINHAS; l++ )
            for (int c = 0; c < NUM_COLUNAS; c++ )
                this.grid[l][c] = ' ';
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }

    @Override
    public String toString() {
        String strTabuleiro = "";

        //Adiciona labels para as colunas ("|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |\n")
        strTabuleiro += "|   |";
        for ( int i = 0; i < NUM_COLUNAS; i++) {
            strTabuleiro = strTabuleiro.concat(" " + i + " |");
            if ( i == NUM_COLUNAS-1 ) strTabuleiro += "\n";
        }

        strTabuleiro = strTabuleiro.concat("---------------------------------------------\n");
        for (int l = 0; l < NUM_LINHAS; l++ ) {
            //Adiciona label da respectiva linha ("| A | B | C | D | E | F | G | H | I | J |")
            strTabuleiro = strTabuleiro.concat("| " + LABEL_LINHAS[l] + " |");
            for (int c = 0; c < NUM_COLUNAS; c++ ) {
                //Adiciona valor da posição do tabuleiro
                strTabuleiro = strTabuleiro.concat(" " + grid[l][c] + " |");
                if (c == NUM_COLUNAS-1) strTabuleiro += "\n";
            }
            strTabuleiro = strTabuleiro.concat("---------------------------------------------\n");
        }
        return strTabuleiro;
    }
}
