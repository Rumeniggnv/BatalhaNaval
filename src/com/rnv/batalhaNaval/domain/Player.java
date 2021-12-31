package com.rnv.batalhaNaval.domain;

import java.util.List;

public class Player {
    private String name;
    private List<Ship> navios;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ship> getNavios() {
        return navios;
    }

    public void setNavios(List<Ship> navios) {
        this.navios = navios;
    }
}
