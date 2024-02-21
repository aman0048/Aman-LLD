package model;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultLevel;

    public Bot(int id, String name, char symbol, BotDifficultyLevel botDifficultLevel) {
        super(id, "CHITTI", symbol, PlayerType.BOT);
        this.botDifficultLevel = botDifficultLevel;
    }

    @Override
    public Move makeMove(Board board){
        return null;
    }

    public BotDifficultyLevel getBotDifficultLevel() {
        return botDifficultLevel;
    }

    public void setBotDifficultLevel(BotDifficultyLevel botDifficultLevel) {
        this.botDifficultLevel = botDifficultLevel;
    }
}
