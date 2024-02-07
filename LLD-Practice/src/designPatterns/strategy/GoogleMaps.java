package designPatterns.strategy;

public class GoogleMaps {
    public void findPath(String source, String destination, Mode mode){
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.findPath(source,destination);
    }
}
