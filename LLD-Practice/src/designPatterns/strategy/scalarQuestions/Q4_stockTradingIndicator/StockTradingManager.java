package designPatterns.strategy.scalarQuestions.Q4_stockTradingIndicator;

public class StockTradingManager {

    private final TradingIndicatorStrategy tradingIndicatorStrategy;

    public StockTradingManager(TradingIndicatorStrategy tradingIndicatorStrategy) {
        this.tradingIndicatorStrategy = tradingIndicatorStrategy;
    }

    public Double calculateIndicator(Stock stock) {
        return tradingIndicatorStrategy.calculateStockIndicator(stock);
    }
}
