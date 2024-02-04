package designPatterns.decorator;

public class ChocolateScoup implements Icecream{
    private final Icecream icecream;

    public ChocolateScoup(Icecream icecream){
        this.icecream = icecream; // this will always be a addon
    }

    @Override
    public int getCost() {
        return icecream.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Chocolate Scoop";
    }
}
