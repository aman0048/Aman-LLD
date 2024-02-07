package designPatterns.strategy;

public class CarPathCalculator implements PathCalculator{

    @Override
    public void findPath(String source, String destination){
        System.out.println("Using Car Transport to travel from " + source + " to " + destination);
    }
}
