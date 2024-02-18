package designPatterns.strategy.scalarQuestions.Q5_PricingCalculator;

public interface PricingStrategy {
    PricingType supportsType();
    Double CalculateRidePrice(RideDetails rideDetails);
}
