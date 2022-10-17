package designpat.telephone;

import java.util.List;

/**
 * Shows which new digit is pressed.
 */
public class NewDigit implements Observer {
   
   private PhoneModel model;
   
   public NewDigit(PhoneModel model) {
      this.model = model;
      this.model.attach(this);
   }
   
   // Prints the newest digit.
   public void update() {
      List digits = model.getDigits();
      int n = digits.size();
      System.out.println(digits.get(n-1));
   }
}