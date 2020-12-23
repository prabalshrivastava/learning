package learning.datastructures.searchingsorting;

import java.util.Arrays;

import static java.lang.System.out;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int[] array1 = {5, 4, 2, 6, 3, 1};
        out.println(Arrays.toString(bubbleSort(array1)));
        out.println(Arrays.toString(bubbleSortImproved(array1)));
    }

    public static int[] bubbleSortImproved(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        out.println("bubbleSortImproved : " + count);
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        out.println("bubbleSort : " + count);
        return array;
    }
}
