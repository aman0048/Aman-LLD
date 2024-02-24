package model;

import service.botPlayingStrategy.BoltPlayingStrategyFactory;
import service.botPlayingStrategy.BotPlayingStrategy;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultLevel;

    public Bot(int id, char symbol, BotDifficultyLevel botDifficultLevel) {
        super(id, "CHITTI", symbol, PlayerType.BOT);
        this.botDifficultLevel = botDifficultLevel;
    }

    @Override
    public Move makeMove(Board board){
        return BoltPlayingStrategyFactory.randomBotPlayingStrategy().makeMove(board, this);
    }
}
