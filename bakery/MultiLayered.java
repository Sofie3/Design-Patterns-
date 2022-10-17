package designpat.bakery;

public class MultiLayered implements Decorator {
   // Multi-layered is printed at the beginning of the message.
   private final boolean atFront = true;
   private final int price = 5; 
   private final String description = "Multi-layered ";
   
   public boolean printAtFront() {
      return atFront;
   }
   
   public int getCost() {
      return price;
   }
   
   public String getDescription() {
      return description;
   }
}