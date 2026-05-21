package org.example;

import java.util.Scanner;

public class TicTacToe {

    Player player1;
    Player player2;
    Player currentPlayer;
    Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.print();

            System.out.println("Current Player: " + currentPlayer.getMarker());

            System.out.print("Row (0-2): ");
            int row = scanner.nextInt();

            System.out.print("Column (0-2): ");
            int col = scanner.nextInt();

            if (board.isCellEmpty(row, col)) {
                board.place(row, col, currentPlayer.getMarker());
                switchCurrentPlayer();
            } else {
                System.out.println("Cell already occupied!");
            }
        }
    }

    public void switchCurrentPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public boolean hasWinner() {
        return false;
    }
}