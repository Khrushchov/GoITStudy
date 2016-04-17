package goit.gojava2.javacore.project14;

public class Validation {
    public int isValid(String number){

        try{
            int integerNumber = Integer.parseInt(number);
            if (integerNumber > 0) return 1;
            else if (integerNumber == 0) return 0;
            else if (integerNumber < 0) return -1;
        } catch (NumberFormatException e){
            return -2;
        }
        return -2;
    }
}
