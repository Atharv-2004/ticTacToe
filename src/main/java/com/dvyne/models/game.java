package com.dvyne.models;

import com.dvyne.enums.GameState;


import java.util.*;
class game{
    board board;
    List<player> players;
    player winner;
    int nextPlayerIndex;
    List<move> moves;
    GameState gameState;

    public game(int boardSize, List<player> players) {

        this.board = new board(boardSize);


        this.players = new ArrayList<>(players);


        this.winner = null;


        this.nextPlayerIndex = 0;


        this.moves = new ArrayList<>();


        this.gameState = GameState.IN_PROGRESS;
    }
}