package com.example.tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {

    // gleiche Logik wie im JS übertragen (vereinfacht als Java Testmodell)

    boolean checkWinner(String[] board) {
        int[][] wins = {
                {0,1,2},
                {3,4,5},
                {6,7,8},
                {0,3,6},
                {1,4,7},
                {2,5,8},
                {0,4,8},
                {2,4,6}
        };

        for (int[] w : wins) {
            if (!board[w[0]].isEmpty() &&
                    board[w[0]].equals(board[w[1]]) &&
                    board[w[1]].equals(board[w[2]])) {
                return true;
            }
        }
        return false;
    }

    @Test
    void detectsWinnerRow() {
        String[] board = {
                "X","X","X",
                "","","",
                "","",""
        };

        assertTrue(checkWinner(board));
    }

    @Test
    void detectsNoWinner() {
        String[] board = {
                "X","O","X",
                "O","X","O",
                "O","X",""
        };

        assertFalse(checkWinner(board));
    }
}