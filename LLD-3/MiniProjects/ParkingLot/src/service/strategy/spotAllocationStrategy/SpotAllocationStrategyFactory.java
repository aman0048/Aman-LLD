package service.strategy.spotAllocationStrategy;

public class SpotAllocationStrategyFactory {
    public static SpotAllocationStrategy getSpotAllocation(){
        return new LinearSpotAllocationStrategy();
    }
}
