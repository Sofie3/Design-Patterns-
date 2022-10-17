package designpat.telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    
    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyAllObservers();
    }
    
    // Adds a new observer to the list.
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public List<Integer> getDigits() {
        return digits;
    }
    
    private void notifyAllObservers() {
       for (Observer observer : observers) {
          observer.update();
       }
    }
}
