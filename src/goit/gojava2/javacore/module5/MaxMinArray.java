package goit.gojava2.javacore.module5;

public class MaxMinArray {
    private int maxArray;
    private int minArray;

    public static void main(String[] args) {
        int[] array = {78, 45, -96, 125, -13, 13};
        MaxMinArray maxMinArray = new MaxMinArray();
        maxMinArray.maxMinArray(array);
        System.out.println("maxArray = " + maxMinArray.maxArray + " minArray = " + maxMinArray.minArray);
    }

    private void maxMinArray(int[] array){
        maxArray = array[0];
        minArray = array[0];
        for (int i = 1; i < array.length; i++) {
          maxArray = Math.max(maxArray, array[i]);
          minArray = Math.min(minArray, array[i]);
        }
    }
}
