package designPatterns.strategy;

public class Main {
    public static void main(String[] args) {
        GoogleMaps maps = new GoogleMaps();
        maps.findPath("Paschim Vihar", "Gurgoan", Mode.BIKE);
    }
}
