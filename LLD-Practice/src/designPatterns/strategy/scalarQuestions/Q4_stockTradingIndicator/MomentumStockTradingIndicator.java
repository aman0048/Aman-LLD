package designPatterns.strategy.scalarQuestions.Q4_stockTradingIndicator;

    public class MomentumStockTradingIndicator implements TradingIndicatorStrategy{
    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOMENTUM;
    }

    @Override
    public Double calculateStockIndicator(Stock stock) {
        return stock.getPrice() - stock.getPreviousPrice();
    }
}
