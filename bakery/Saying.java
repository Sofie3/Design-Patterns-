package designpat.bakery;

public class Saying implements Decorator {
   // Sayings are added add the end of the message.
   private final boolean atFront = false;
   private final int price = 0; 
   private final String description;
   
   // Adjusts the description based on the saying.
   public Saying(String saying) {
      description = " with saying \"" + saying + "\""; 
   }
   
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