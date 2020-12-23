package learning.datastructures.searchingsorting;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int[] array1 = {5, 4, 2, 6, 3, 1};
        out.println(Arrays.toString(selectionSort(array1)));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
