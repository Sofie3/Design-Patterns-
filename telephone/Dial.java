package designpat.telephone;

import java.util.List;

/**
 * Observer which will print "dial".
 * This means it will print the complete phone number after NUM_DIGITS digits.
 */
public class Dial implements Observer {
   
   private PhoneModel model;
   private final int NUM_DIGITS;
   
   public Dial(PhoneModel model, int NUM_DIGITS) {
      this.model = model;
      this.model.attach(this);
      this.NUM_DIGITS = NUM_DIGITS;
   }
   
   // Checks if the number of digits is obtained and then dials.
   public void update() {
      List digits = model.getDigits();
      int n = digits.size();
      if (n == NUM_DIGITS) {
         System.out.print("Now dialing ");
         for (int i = 0; i < NUM_DIGITS; i++) {
            System.out.print(digits.get(i));
         }
         System.out.println("...");
      }
   }
}