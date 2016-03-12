package goit.gojava2.javacore.module4.converter;

import java.util.Scanner;

public class ConverterTemperature {

    public static void main(String[] args) {
        converterTemperature();
    }

    public static double converterTemperature(){
        double result = 0;
        Scanner in = null;
        try {
           in = new Scanner(System.in);
           System.out.println("Enter temperature. Example -11  or 22 ");
           int temperature = in.nextInt();
           System.out.println("Enter scale. Example C or F ");
           String scale = in.next();
        if (scale.equalsIgnoreCase("F")){
           result = converterFahrenheitToCelsius(temperature);
        } else if (scale.equalsIgnoreCase("C")){
            result = converterCelsiusToFahrenheit(temperature);
        } else {
            System.out.println("Wrong data");
        }
        return result;} finally {
            in.close();
        }
    }

    static double converterFahrenheitToCelsius(int fahrenheit) {
        System.out.println(fahrenheit + " Fahrenheit degrees = " + (fahrenheit - 32)
                / 1.8 + " Celsius degrees" );
        return (fahrenheit - 32) / 1.8;
    }

    static double converterCelsiusToFahrenheit(int celsius) {
        System.out.println(celsius + " Celsius degrees = " + (celsius * 1.8 + 32) + " Fahrenheit" +
                        " degrees" );
        return (celsius * 1.8 + 32);
    }

    ;
}

