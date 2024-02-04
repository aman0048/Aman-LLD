package designPatterns.decorator;

public class VanilaScoop implements Icecream{
    private final Icecream icecream;

    public VanilaScoop(Icecream icecream){
        this.icecream = icecream; // this will always be a addon
    }

    @Override
    public int getCost() {
        return icecream.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Vanilla Scoop";
    }
}
