package designPatterns.observer;

public class CustomerNotificationService implements OrderPlacedSubscriber{
    @Override
    public void orderPlacedEvent() {
        System.out.println("Send SMS Notification");
        System.out.println("Send Email Notification");
    }
}
