package designpat.bakery;

public class StrawberryCake extends Cake {
    // Changes the price from default to 20.
    private final int CAKE_COST = 20;
    @Override
    public int getCost() {
        return CAKE_COST;
    }
    
    @Override
    public String getDescription() {
        return "Strawberry cake";
    }
}
