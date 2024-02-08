package designPatterns.observer.scalerQuestions.Q3_StockTrading;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
   private List<Subscriber> subscriberList = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber){
        this.subscriberList.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        this.subscriberList.remove(subscriber);
    }

    public void notifySubscribers(String stockName, double currentPrice){
        subscriberList.forEach(subscriber -> subscriber.notifyStockPriceChange(stockName, currentPrice));
    }
}
