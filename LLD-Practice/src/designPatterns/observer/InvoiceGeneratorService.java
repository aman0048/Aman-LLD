package designPatterns.observer;

public class InvoiceGeneratorService implements OrderPlacedSubscriber{
    @Override
    public void orderPlacedEvent() {
        System.out.println("Generate Invoice");
    }
}
