package learning.interview.connectwise;

public class ConnectWise2 {
    public static void main(String[] args) {
        int num[][] = {
                {10, 15, 20, 25, 30},
                {35, 40, 45, 50, 55},
                {60, 65, 70, 75, 80},
                {85, 90, 95, 100, 105},
                {110, 115, 120, 125, 130}
        };
        System.out.println(findnum(num, 0, 0, 1));
    }

    static boolean findnum(int num[][], int row, int col, int numTofind) {
        boolean elementExists = false;
        for (int i = 0; i < num.length; i++) {
            if (binarySearch(num[i], 0, num[i].length, numTofind)) {
                elementExists = true;
                break;
            }
        }
//        System.out.println(binarySearch(num[0], 0, num[0].length, numTofind));
        return elementExists;
    }

    static boolean binarySearch2D(int[][] arr, int left, int right, int numToFind) {
        int size = arr[0].length;

        int mid = (left + right) / 2;
        int midi = mid / size;
        int midj = mid % size;

        if (arr[midi][midj] == numToFind) {
            return true;
        } else if (numToFind >= arr[midi][midj]) {
            //search in right side
            return binarySearch2D(arr, mid, right, numToFind);
        } else
            //search in left side array
            return binarySearch2D(arr, left, mid, numToFind);
    }

    static boolean binarySearch(int[] arr, int left, int right, int numToFind) {
        int mid = (left + right) / 2;
        if (left > right) {
            return false;
        }
        if (arr[mid] == numToFind) {
            return true;
        } else if (numToFind >= arr[mid]) {
            //search in right side
            return binarySearch(arr, mid + 1, right, numToFind);
        } else
            //search in left side array
            return binarySearch(arr, left, mid - 1, numToFind);
    }
}
