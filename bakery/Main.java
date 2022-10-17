package designpat.bakery;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        
        // Add cake 1
        Cake cake1 = new ChocolateCake();
        order.addCake(cake1);
        
        // Add cake 2
        Cake cake2 = new VanillaCake();
        cake2.addDecoration(new Saying("PLAIN!"));
        order.addCake(cake2);
        
        // Add cake 3
        Cake cake3 = new VanillaCake();
        cake3.addDecoration(new Sprinkles());
        cake3.addDecoration(new Saying("FANCY"));
        order.addCake(cake3);
        
        // Add cake 4
        Cake cake4 = new StrawberryCake();
        cake4.addDecoration(new MultiLayered());
        cake4.addDecoration(new Sprinkles());
        cake4.addDecoration(new Sprinkles());
        cake4.addDecoration(new Saying("One of"));
        cake4.addDecoration(new Saying("EVERYTHING"));
        order.addCake(cake4);
        
        // Print the order
        order.printOrder();
    }
}
