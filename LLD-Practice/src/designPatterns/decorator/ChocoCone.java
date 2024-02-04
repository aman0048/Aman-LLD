package designPatterns.decorator;
// base addons
// we need an empty constructor and a parameterized constructor
public class ChocoCone implements Icecream {
    private Icecream icecream;
    public ChocoCone() { // when the cone is a base
    }

    public ChocoCone(Icecream icecream){
        this.icecream = icecream; // when cone is an addon
    }

    @Override
    public int getCost() {
        if(icecream != null){
            return icecream.getCost() + 20;
        }else{
            return 20;
        }
    }

    @Override
    public String getDescription() {
        if (icecream != null){
            return icecream.getDescription() + ", Chocolate Cone";
        }else{
            return "Chocolate Cone";
        }
    }
}
