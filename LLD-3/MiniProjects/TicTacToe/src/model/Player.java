package model;

import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private char symbol;

    private PlayerType playerType;

    public Player() {
    }

    public Player(int id, String name, char symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move makeMove(Board board){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row for the target cell");
        int row = sc.nextInt();
        System.out.println("Enter the col for the target cell");
        int col = sc.nextInt();

        // Need to do the validation to check the player.
        // TODO : In bound check, filled or not filled
        if ((row >= board.getDimension() || col >= board.getDimension()) || (row < 0 || col <0)){
            throw new ArrayIndexOutOfBoundsException("Placing values outside the dimensions");
        }
        Cell playedMovedCell = board.getMatrix().get(row).get(col);
        playedMovedCell.setCellState(CellState.FILLED);
        playedMovedCell.setPlayer(this); // current player

        return new Move(playedMovedCell, this);
    }
    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

}
