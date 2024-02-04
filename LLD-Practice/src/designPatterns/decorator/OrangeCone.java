package designPatterns.decorator;
// base addons
// we need an empty constructor and a parameterized constructor
public class OrangeCone implements Icecream {
    private Icecream icecream;
    public OrangeCone() { // when the cone is a base
    }

    public OrangeCone(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream != null){
            return icecream.getCost() + 10;
        }else{
            return 10;
        }
    }

    @Override
    public String getDescription() {
        if (icecream != null){
            return icecream.getDescription() + ", Orange Cone";
        }else{
            return "Orange Cone";
        }
    }
}
