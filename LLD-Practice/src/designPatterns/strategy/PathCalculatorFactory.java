package designPatterns.strategy;

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculator(Mode mode){
        switch (mode) {
            case CAR : return new CarPathCalculator();
            case BIKE : return new BikePathCalculator();
            case WALK : return new WalkPathCalculator();
            default : return null;
        }
    }
}
