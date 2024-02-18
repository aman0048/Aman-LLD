package designPatterns.strategy.scalarQuestions.Q4_stockTradingIndicator;

public class MovingAvengersStockTradingIndicator implements TradingIndicatorStrategy{
    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOVING_AVERAGES;
    }

    @Override
    public Double calculateStockIndicator(Stock stock) {
        return (stock.getPrice() + stock.getPreviousPrice()) / 2;
    }
}
