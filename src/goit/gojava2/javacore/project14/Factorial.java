package goit.gojava2.javacore.project14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Factorial item = new Factorial();
        item.start();
//        System.out.println((item.getFactorial(enteredInteger)));
    }

    public void start(){
        int enteredInteger;
        long result;
        try {
            enteredInteger = connectUser();
            result = getFactorial(enteredInteger);
            System.out.println("Factorial of " + enteredInteger + " = " + result);
        } catch (InputMismatchException ime){
            System.out.println("[Error]: Entered data isn't integer");
        }
    }

    private int connectUser()throws InputMismatchException {
        int enteredInteger;
        try(Scanner in = new Scanner(System.in)){
            System.out.println("\t FACTORIAL \t");
            System.out.println("Enter positive integer < 20");
        if(!in.hasNextInt()){
            throw new InputMismatchException();
        }
        enteredInteger = in.nextInt();
        }
        return enteredInteger;
    }

    public long getFactorial(int positiveInteger){
        long result = 1;
        for (int i = 1; i <=positiveInteger ; i++) {
            result *= i;
        }
        return result;
    }

}
