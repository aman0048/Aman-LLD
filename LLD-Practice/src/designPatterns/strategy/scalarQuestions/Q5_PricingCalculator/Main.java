package designPatterns.strategy.scalarQuestions.Q5_PricingCalculator;

public class Main {
    public static void main(String[] args) {
        // Create ride details
        RideDetails rideDetails = new RideDetails(10, 20); // 10 kilometers, 20 minutes

        // Distance-based pricing
        PricingManager distancePricingManager = new PricingManager(PricingType.DISTANCE_BASED, new DistanceBasedStrategy());
        double distancePrice = distancePricingManager.calculatePrice(rideDetails);
        System.out.println("Distance-based price: $" + distancePrice);

        // Time-based pricing
        PricingManager timePricingManager = new PricingManager(PricingType.TIME_BASED, new TimeBasedStrategy());
        double timePrice = timePricingManager.calculatePrice(rideDetails);
        System.out.println("Time-based price: $" + timePrice);

        // Surge pricing
        PricingManager surgePricingManager = new PricingManager(PricingType.SURGE, new SurgeBasedStrategy());
        double surgePrice = surgePricingManager.calculatePrice(rideDetails);
        System.out.println("Surge price: $" + surgePrice);
    }
}
