package Controller;

import model.*;
import service.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> player, WinningStrategy winningStrategy){
        return null;
    }

    // For whatever game is going on display the board
    public void displayBoard(Game game){
        game.getBoard().displayBoard();
    }

    // Get the status of the game
    public GameStatus gameStatus(Game game){
        return null;
    }

    public Player getWinner(Game game){
        return null;
    }

    public Player checkWinner(Game game, Move lastPlayedMove){
        return null;
    }

    public Move executeMove(Game game, Player player){
        return null;
    }

    // For the Doraemon approach
    public Board undoMove(Game game, Move lastPlayedMove){
        return null;
    }

    public void replayGame(Game game){

    }
}
