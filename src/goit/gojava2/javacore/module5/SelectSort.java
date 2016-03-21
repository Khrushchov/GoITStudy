package goit.gojava2.javacore.module5;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {42, 66, -53, -88, 0 , 13, 5/2, -3 };
        selectSort(array);

        for (int element : array){
            System.out.print(element + " ");
        }

    }
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length - 1 ; i++) {
            int min = array[i];
            for (int j = i + 1 ; j < array.length ; j++) {
                if (array[j] < min){
                    min = array[j];
                    array[j] = array[i];
                }
                array[i] = min;
            }
        }
    }

}
