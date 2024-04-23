package com.dvyne.models;

import com.dvyne.enums.playerType;

public class player {
    String name;
    symbol s;
    playerType p;

    public player(String name, symbol s, playerType p) {
        this.name = name;
        this.s = s;
        this.p = p;
    }
}
