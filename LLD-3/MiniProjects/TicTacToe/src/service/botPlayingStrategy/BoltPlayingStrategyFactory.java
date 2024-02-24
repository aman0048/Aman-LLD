package service.botPlayingStrategy;

public class BoltPlayingStrategyFactory {
    public static BotPlayingStrategy randomBotPlayingStrategy(){
        return new RandomBotPlayingStrategy();
    }
}
