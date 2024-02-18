package designPatterns.strategy.scalarQuestions.Q4_stockTradingIndicator;

public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();
    Double calculateStockIndicator(Stock stock);
}