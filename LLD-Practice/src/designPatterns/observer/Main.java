package designPatterns.observer;

public class Main {
    public static void main(String[] args) {
        CustomerNotificationService customerNotificationService = new CustomerNotificationService();
        InvoiceGeneratorService invoiceGeneratorService = new InvoiceGeneratorService();

        Amazon amazon = new Amazon();
        amazon.addSubscriberOrderPlaced(customerNotificationService);
        amazon.addSubscriberOrderPlaced(invoiceGeneratorService);

        amazon.orderPlaced();

    }
}
