package goit.gojava2.javacore.module5;

public class MaxMinArray {
    private int maxArray;

    public int getMaxArray() {
        return maxArray;
    }

    public int getMinArray() {
        return minArray;
    }

    private int minArray;

    public static void main(String[] args) {
        int[] array = {78, 45, -976, 125, -13, 13};
        MaxMinArray item1 = new MaxMinArray();
        item1.maxMinArray(array);
        System.out.println("maxArray = " + item1.getMaxArray() + " minArray = " +
                item1.getMinArray());
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
