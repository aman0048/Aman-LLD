package designPatterns.decorator;

public class ChocoChip implements Icecream{
    private final Icecream icecream;

    public ChocoChip(Icecream icecream){
        this.icecream = icecream; // this will always be a addon
    }

    @Override
    public int getCost() {
        return icecream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Chocolate Chip";
    }
}
