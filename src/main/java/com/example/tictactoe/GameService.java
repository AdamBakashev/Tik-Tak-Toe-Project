package com.example.tictactoe;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    public String getGameInfo() {
        return "TicTacToe läuft";
    }
}