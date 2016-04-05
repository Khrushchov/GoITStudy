package goit.gojava2.javacore.module8;

import goit.gojava2.javacore.module3.musicalInstruments.Guitar;
import goit.gojava2.javacore.module3.musicalInstruments.MusicalInstrument;
import goit.gojava2.javacore.module3.musicalInstruments.Piano;
import goit.gojava2.javacore.module3.musicalInstruments.Trumpet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortedCollection {
    public static void main(String[] args) {
        Set<MusicalInstrument> musInstr1 = new TreeSet<>(new SortedCollection().sortedByType);
       musInstr1.add(new Guitar(150, true));
       musInstr1.add(new Piano(240, false));
       musInstr1.add(new Trumpet(80, true));
       musInstr1.add(new Piano(550, true));
       musInstr1.add(new Piano(480, true));
       musInstr1.add(new Guitar(80, false));
       musInstr1.add(new Trumpet(30, false));
       musInstr1.add(new Trumpet(100, true));
       musInstr1.add(new Guitar(180, true));

        Set<MusicalInstrument> musInstr2 = new TreeSet<>(new SortedCollection().sortedByPrice);
        musInstr2.add(new Guitar(150, true));
        musInstr2.add(new Piano(240, false));
        musInstr2.add(new Trumpet(80, true));
        musInstr2.add(new Piano(550, true));
        musInstr2.add(new Piano(480, true));
        musInstr2.add(new Guitar(80, false));
        musInstr2.add(new Trumpet(30, false));
        musInstr2.add(new Trumpet(100, true));
        musInstr2.add(new Guitar(180, true));

       for (MusicalInstrument instr : musInstr1)
            System.out.println(instr.getClass().getSimpleName() + ": " + instr.getPrice());
        System.out.println();
       for (MusicalInstrument instr : musInstr2)
            System.out.println(instr.getClass().getSimpleName() + ": " + instr.getPrice());
    }


    Comparator<MusicalInstrument> sortedByPrice = new Comparator<MusicalInstrument>() {
        @Override
        public int compare(MusicalInstrument o1, MusicalInstrument o2) {
        int result = o2.getPrice() - o1.getPrice();
            if (result != 0){
                return result;
            }
            result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            if (result != 0){
                return result;
            }
            return 0;
        }
    };

    Comparator<MusicalInstrument> sortedByType = new Comparator<MusicalInstrument>() {
        @Override
        public int compare(MusicalInstrument o1, MusicalInstrument o2) {
            int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            if (result != 0){
                return result;
            }
            result = o2.getPrice() - o1.getPrice();
            if (result != 0){
                return result;
            }
            return 0;
        }
    };

}
