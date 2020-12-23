package learning.datastructures.searchingsorting;

import java.util.Arrays;

import static java.lang.System.out;

public class InsertionSort {
    public static void main(String[] args) {
        insertionSort();
    }

    private static void insertionSort() {
        //almost sorted array
        int[] array = {1, 3, 4, 5, 6, 7, 8, 9, 2};
        array = new int[]{10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
        out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        out.println(Arrays.toString(array));
    }

}
