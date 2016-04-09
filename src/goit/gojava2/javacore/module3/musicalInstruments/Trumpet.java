package goit.gojava2.javacore.module3.musicalInstruments;

public class Trumpet extends MusicalInstrument {
    private int price;
    private  boolean firstHand;

    public Trumpet(int price, boolean firstHand) {
        this.price = price;
        this.firstHand = firstHand;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFirstHand() {
        return firstHand;
    }

    @Override
    public String toString() {
        return "Trumpet";
    }
}
