package learning.datastructures.searchingsorting;

import static java.lang.System.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int left = 0;
        int right = array.length - 1;
        Integer index = binarySearch(array, left, right, 99);
        out.println(index);
        if (index != null) {
            out.println(array[index]);
        }
    }

    public static Integer binarySearch(int[] array, int left, int right, int elementToBeSearched) {
        int mid = (left + right) / 2;
        if (left > right) {
            return null;
        } else if (array[mid] == elementToBeSearched) {
            return mid;
        } else if (elementToBeSearched > array[mid]) {
            return binarySearch(array, mid + 1, right, elementToBeSearched);
        } else {
            return binarySearch(array, left, mid - 1, elementToBeSearched);
        }
    }
}
