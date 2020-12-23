package learning.datastructures.searchingsorting;

import java.util.Arrays;

import static java.lang.System.out;

public class InsertionTechnique {
    public static void main(String[] args) {
        insertionTechnique1();
        insertionTechnique2();
    }

    private static void insertionTechnique1() {
        //almost sorted array
        int[] array = {1, 3, 4, 5, 6, 7, 8, 9, 2};
        out.println(Arrays.toString(array));
        for (int i = array.length - 2; i > 0; i--) {
            if (array[i + 1] < array[i]) {
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
        out.println(Arrays.toString(array));
    }

    private static void insertionTechnique2() {
        //almost sorted array
        int[] array = {1, 3, 4, 5, 6, 7, 8, 9, 2};
        out.println(Arrays.toString(array));

        int i = array.length - 1;
//        for (int i = array.length - 1; i > 0; i--) {
        int temp = array[i];
        int j;
        for (j = array.length - 2; j >= 0 && array[j] > temp; j--) {
            array[j + 1] = array[j];
        }
        array[j + 1] = temp;
//        }
        out.println(Arrays.toString(array));
    }

}
