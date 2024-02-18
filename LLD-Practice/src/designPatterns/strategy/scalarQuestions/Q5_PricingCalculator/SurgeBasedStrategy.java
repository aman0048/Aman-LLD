package designPatterns.strategy.scalarQuestions.Q5_PricingCalculator;

public class SurgeBasedStrategy implements PricingStrategy{
    @Override
    public PricingType supportsType() {
        return PricingType.SURGE;
    }
    @Override
    public Double CalculateRidePrice(RideDetails rideDetails) {
        return Constants.BASE_FARE * Constants.SURGE_MULTIPLIER;
    }
}
