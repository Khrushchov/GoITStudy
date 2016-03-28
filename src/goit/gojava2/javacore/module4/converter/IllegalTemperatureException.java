package goit.gojava2.javacore.module4.converter;

public class IllegalTemperatureException extends Exception{
      private int tempValue;
      private String scale;

    public IllegalTemperatureException(int tempValue, String scale) {
        this.tempValue = tempValue;
        this.scale = scale.toUpperCase();

    }

    public String getScale() {
        return scale;
    }

    public int getTempValue() {
        return tempValue;
    }
}
