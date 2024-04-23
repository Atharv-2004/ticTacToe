package com.dvyne.models;

import com.dvyne.enums.cellState;

public class Cell {
    int row ;
    int col;
    player p;
    cellState state;

    public  Cell(int row , int col, player p, cellState state){
        this.row = row;
        this.col = col;
        this.p = p;
        this.state = state;
    }
}
