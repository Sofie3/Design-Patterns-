package designpat.bakery;

import java.util.*;

/**
 * Cake bake class.
 */
public abstract class Cake {
    private final int CAKE_COST = 10;
    private ArrayList<Decorator> decorations = new ArrayList<>();

    public int getCost() {
        return CAKE_COST;
    }
    
    public void addDecoration(Decorator decoration) {
       decorations.add(decoration);
    }
    
    public ArrayList<Decorator> getDecorations() {
       return decorations;
    }

    public abstract String getDescription();
}
