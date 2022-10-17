package designpat.telephone;

/**
 * Prints things out to the screen, when needed
 */
public class Screen {
    public Screen(PhoneModel model, int NUM_DIGITS) {
        Observer newDigit = new NewDigit(model);
        Observer dial = new Dial(model, NUM_DIGITS);
    }
}
