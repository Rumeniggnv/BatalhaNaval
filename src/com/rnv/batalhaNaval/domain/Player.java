package com.rnv.batalhaNaval.domain;

import java.util.List;

public class Player {
    private String name;
    private Tabuleiro tabuleiro;
//    private List<Ship> navios;

    public Player(String name) {
        this.name = name;
        this.tabuleiro = new Tabuleiro();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    //    public List<Ship> getNavios() {
//        return navios;
//    }
//
//    public void setNavios(List<Ship> navios) {
//        this.navios = navios;
//    }
}
