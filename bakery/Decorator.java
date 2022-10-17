package designpat.bakery;

/**
 * An interface for different kinds of decorations.
 */
interface Decorator {
   public boolean printAtFront();
   public int getCost();
   public String getDescription();
}