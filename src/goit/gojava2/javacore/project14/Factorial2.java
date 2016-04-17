package goit.gojava2.javacore.project14;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Factorial2 {

    public static void main(String[] args) {
        Factorial2 item = new Factorial2();
        item.start();
    }

    public void start(){
        int enteredInteger = 0;
        long result;
        try {
            enteredInteger = connectUser();
            checkInteger(enteredInteger);
            result = getFactorial(enteredInteger);
            System.out.println("Factorial of " + enteredInteger + " = " + result);
        } catch (InputMismatchException ime){
            System.out.println("[Error]: Entered data isn't integer.");
        } catch (NumberFormatException nfe){
            System.out.println("[Error]: Entered number is " + enteredInteger + ". Number should " +
                    "be > 0.");
        } catch (Exception ex){
            System.out.println("[Error]: Entered number is " + enteredInteger + ". Number should" +
                    " " +
                    "be <= 20.");
        }
    }

    private int connectUser()throws InputMismatchException {
        int enteredInteger;
        try(Scanner in = new Scanner(System.in)){
            System.out.println("\t FACTORIAL \t");
            System.out.println("Enter positive integer <= 20");
        if(!in.hasNextInt()){
            throw new InputMismatchException();
        }
        enteredInteger = in.nextInt();
        }
        return enteredInteger;
    }

    public void checkInteger(int enteredInteger)throws  Exception {
        if (enteredInteger < 1){
            throw new NumberFormatException();
        }

        if (enteredInteger > 20){
            throw new Exception();
        }
    }

    public long getFactorial(int positiveInteger){
        long result = 1;
        for (int i = 1; i <=positiveInteger ; i++) {
            result *= i;
        }
        return result;
    }

}
