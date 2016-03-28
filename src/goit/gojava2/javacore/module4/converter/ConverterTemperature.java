package goit.gojava2.javacore.module4.converter;

import java.util.Scanner;

public class ConverterTemperature {

    public static void main(String[] args) {
        tempConverter();
    }

    public static double tempConverter() {
        double result = 0;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.println("Enter temperature. Example -11  or 22 ");
            int temp = in.nextInt();
            System.out.println("Enter scale. Example C or F ");
            String scale = in.next();
            if (scale.equalsIgnoreCase("F")) {
                if (temp < -459){
                    throw new IllegalTemperatureException(temp, scale);
                }
                result = converterFahrenheitToCelsius(temp);
            } else if (scale.equalsIgnoreCase("C")) {
            if (temp < -273){
                        throw new IllegalTemperatureException(temp, scale);
                    }
                    result = converterCelsiusToFahrenheit(temp);
                }else{
                    System.out.println("Wrong data");
                }
        } catch (IllegalTemperatureException e) {
            System.out.println("[Error]: Entered temp is " + e.getTempValue() + " " + e.getScale() +
                            ". Temperature should be > -274C or -459F.");
        }
         finally {
            in.close();
        }
        return result;
    };

    static double converterFahrenheitToCelsius(int fahrenheit) {
        System.out.println(fahrenheit + " Fahrenheit degrees = " + (fahrenheit - 32)
                / 1.8 + " Celsius degrees");
        return (fahrenheit - 32) / 1.8;
    }

    static double converterCelsiusToFahrenheit(int celsius) {
        System.out.println(celsius + " Celsius degrees = " + (celsius * 1.8 + 32) + " Fahrenheit" +
                " degrees");
        return (celsius * 1.8 + 32);
    }

    ;
}

