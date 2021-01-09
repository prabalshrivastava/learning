package learning.datastructures.searchingsorting;

import java.util.Arrays;

import static java.lang.System.out;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
//        int[] array1 = {5, 4, 2, 6, 3, 1};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        array2 = new int[]{11, 22, 33, 55, 44, 66, 77, 88, 99};
        array2 = new int[]{6, 5, 3, 2, 8, 10, 9};
//        array2 = new int[]{10, 9, 8, 7, 4, 70, 60, 50};
        out.println(Arrays.toString(bubbleSort(array2)));
        out.println(Arrays.toString(bubbleSortImproved(array2)));
        out.println(Arrays.toString(bubbleSortFurtherImproved(array2)));
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

    public static int[] bubbleSortFurtherImproved(int[] array) {
        out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    flag = false;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (flag)
                break;
        }
        out.println("bubbleSortFurtherImproved : " + count);
        return array;
    }
}
