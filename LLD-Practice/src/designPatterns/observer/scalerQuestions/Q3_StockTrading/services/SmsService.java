package designPatterns.observer.scalerQuestions.Q3_StockTrading.services;

import designPatterns.observer.scalerQuestions.Q3_StockTrading.Subscriber;
import designPatterns.observer.scalerQuestions.Q3_StockTrading.utils.NotificationUtils;

public class SmsService implements Subscriber {
    @Override
    public void notifyStockPriceChange(String stockName, double currentPrice){
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }
}
