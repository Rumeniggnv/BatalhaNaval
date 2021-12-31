package com.rnv.batalhaNaval.domain;

public class Ship {
    private String linha;
    private int coluna;

    public Ship( String linha, int coluna ) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "linha='" + linha + '\'' +
                ", coluna=" + coluna +
                '}';
    }
}
