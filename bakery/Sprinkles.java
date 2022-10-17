package designpat.bakery;

public class Sprinkles implements Decorator {
   // Sprinkles are added add the end of the message.
   private final boolean atFront = false;
   private final int price = 2; 
   private final String description = " with sprinkles";
   
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