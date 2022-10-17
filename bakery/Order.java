package designpat.bakery;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a collection of cakes being ordered by a customer
 */
public class Order {
    private final List<Cake> cakes = new ArrayList<>();

    public void addCake(Cake cake) {
        cakes.add(cake);
    }

    public void printOrder() {
        for (Cake cake : cakes) {
           ArrayList<Decorator> decorations = cake.getDecorations();
           int price = cake.getCost();
           String txt = cake.getDescription();
           
           // Adds all the decorations to the txt String and sums up the costs.
           for (Decorator decoration : decorations) {
              price += decoration.getCost();
              
              // Checks the postion of the description of the decoration.
              if (decoration.printAtFront()) {
                 txt = decoration.getDescription() + txt;
              }
              else {
                 txt += decoration.getDescription();
              }
           }
           System.out.println( price + "  " + txt);
        }
    }
}
