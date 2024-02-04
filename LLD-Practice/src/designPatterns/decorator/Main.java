package designPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Icecream ic = new ChocolateScoup(
                            new VanilaScoop(
                                new OrangeCone(
                                    new ChocolateScoup(
                                        new ChocoCone()))));

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
