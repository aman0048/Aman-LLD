package designPatterns.observer.scalerQuestions.Q3_StockTrading;

import designPatterns.observer.scalerQuestions.Q3_StockTrading.services.AppService;
import designPatterns.observer.scalerQuestions.Q3_StockTrading.services.EmailService;
import designPatterns.observer.scalerQuestions.Q3_StockTrading.services.SmsService;

public class Main {
    public static void main(String[] args) {
        StockTradingManager stockManager = new StockTradingManager("Tata Stock", 200.00, 300.00);

        EmailService emailService = new EmailService();
        SmsService smsService = new SmsService();
        AppService appService = new AppService();

        stockManager.addSubscriber(emailService);
        stockManager.addSubscriber(smsService);
        stockManager.addSubscriber(appService);

        stockManager.updateStockPrice(200.00);
    }
}
