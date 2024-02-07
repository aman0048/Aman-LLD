package designPatterns.strategy;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Using Bike Transport to travel from " + source + " to " + destination);
    }
}
