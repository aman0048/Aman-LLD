package designPatterns.strategy.scalarQuestions.Q4_stockTradingIndicator;

public class VolatalityStockTradingIndicator implements TradingIndicatorStrategy{
    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.VOLATILITY;
    }

    @Override
    public Double calculateStockIndicator(Stock stock) {
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }
}
