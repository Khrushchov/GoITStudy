package goit.gojava2.javacore.module3.musicalInstruments;

public abstract class MusicalInstrument {
    private int price;
    private boolean firstHand;

    abstract public int getPrice();

    abstract public boolean isFirstHand();
}
