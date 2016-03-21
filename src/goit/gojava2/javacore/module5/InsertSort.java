package goit.gojava2.javacore.module5;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {15, -96, 25, 0, 0, 44, -69};
        insertSort(array);
        System.out.println();
        for (int element : array){
            System.out.print(element + " ");
        }
    }
    public static void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0 ; j--) {
                if(array[j+1] < array[j]){
                    int buffer = array[j+1];
                    array[j+1] = array[j];
                    array[j] = buffer;
                } else {
                    break; }
            }
        }
    }
}
