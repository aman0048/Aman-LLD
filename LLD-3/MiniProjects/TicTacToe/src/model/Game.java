package model;

import exception.InvalidBotCountException;
import exception.InvalidPlayerSizeException;
import exception.InvalidSymbolException;
import service.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Game {
    private Board board;
    private List<Player> players;
    private Player currentPlayer;
    private List<Move> moves;
    private GameStatus gameStatus;
    private List<Board> boardStates; // for undo part we will use this.
    private WinningStrategy winningStrategy;
    private int numberOfSymbols;

    public Game(Board board, List<Player> players, WinningStrategy winningStrategy) {
        this.board = board;
        this.players = players;
        this.currentPlayer = null;
        this.moves = new ArrayList<>(); // In the beginning there will be no moves
        this.boardStates = new ArrayList<>(); // In the beginning there will be no boardStates
        this.gameStatus = GameStatus.IN_PROGRESS; // creating a new game, it should be Inprogress
        this.winningStrategy = winningStrategy;
        this.numberOfSymbols = players.size();
    }

    public static Builder builder(){
        return new Builder();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public List<Board> getBoardStates() {
        return boardStates;
    }

    public void setBoardStates(List<Board> boardStates) {
        this.boardStates = boardStates;
    }

    public WinningStrategy getWinningStrategy() {
        return winningStrategy;
    }

    public void setWinningStrategy(WinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }

    public int getNumberOfSymbols() {
        return numberOfSymbols;
    }

    public void setNumberOfSymbols(int numberOfSymbols) {
        this.numberOfSymbols = numberOfSymbols;
    }

    public static class Builder{
        private Board board;
        private List<Player> players;
        private WinningStrategy winningStrategy;

        private int dimension;

        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        private void validateNumberOfPlayers(){
            // N, no bot present -> players = n-1
            // N, bot present -> players = n-2
           if(players.size() < board.getDimension() - 2 || players.size() >= board.getDimension()){
               throw new InvalidPlayerSizeException("Player size should be N-2 or N-1 as per the board size");
           }
        }

        private void validatePlayerSymbols(){
            // TODO : Convert the below code method into lambda expression using streams
           /* HashSet<Character> symbols = new HashSet<>();
            for(Player player : players){
                symbols.add(player.getSymbol());
            }
            if(symbols.size() != players.size()){
                throw new InvalidSymbolException("There should be unique numbers for all the players");
            }*/

            // Lambda Expression in two ways
            // 1) Using methods reference
            Set<Character> symbol = players.stream().map(Player::getSymbol).collect(Collectors.toSet());
            // Using lambda expression
            // 2) Set<Character> symbols1 = players.stream().map(player -> player.getSymbol()).collect(Collectors.toSet());
            if(symbol.size() != players.size()){
                throw new InvalidSymbolException("There should be unique numbers for all the players");
            }
        }

        private void validateBotCount(){
            // TODO : Convert the below code method into lambda expression using streams
/*            int botCount = 0;
            for (Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if (botCount> 1 || botCount < 0){
                throw new InvalidBotCountException("We can have maximum 1 bot per game");
            }
            */
            long botCount = players.stream()
                    .filter(player -> player.getPlayerType().equals(PlayerType.BOT))
                    .count();
            if (botCount> 1 || botCount < 0){
                throw new InvalidBotCountException("We can have maximum 1 bot per game");
            }
        }
        private void validate(){
            validateBotCount();
            validateNumberOfPlayers();
            validatePlayerSymbols();
        }

        public Game build(){
            validate();
            return new Game(new Board(dimension), players, winningStrategy);
        }
    }
}
