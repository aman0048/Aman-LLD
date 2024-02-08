package designPatterns.observer.scalerQuestions.Q3_StockTrading;

public interface Subscriber {
    void notifyStockPriceChange(String stockName, double stockValue);
}
