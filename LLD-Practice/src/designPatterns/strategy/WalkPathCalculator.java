package designPatterns.strategy;

public class WalkPathCalculator implements PathCalculator{

    @Override
    public void findPath(String source, String destination){
        System.out.println("Using Walk Transport to travel from " + source + " to " + destination);
    }
}
