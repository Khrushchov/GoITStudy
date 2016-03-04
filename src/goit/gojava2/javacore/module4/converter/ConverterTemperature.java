package goit.gojava2.javacore.module4.converter;

public class ConverterTemperature {

    public static void main(String[] args) {
       converterFahrenheitToCelsius(10);
       converterCelsiusToFahrenheit(20);
    }

    public static double converterFahrenheitToCelsius(int fahrenheit) {
        System.out.println(fahrenheit + " Fahrenheit degrees = " + (fahrenheit - 32)
                / 1.8 + " Celsius degrees" );
        return (fahrenheit - 32) / 1.8;
    }

    public static double converterCelsiusToFahrenheit(int celsius) {
        System.out.println(celsius + " Celsius degrees = " + (celsius * 1.8 + 32) + " Fahrenheit" +
                        " degrees" );
        return (celsius * 1.8 + 32);
    }

    ;
}

