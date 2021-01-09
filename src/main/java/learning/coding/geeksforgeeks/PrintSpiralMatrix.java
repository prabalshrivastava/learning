package learning.coding.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class PrintSpiralMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
        };

        int rows = a.length;
        int columns = a[0].length;
        //output expected -> 1,2,3,4,5,6,12,18,17,16,15,14,13,7,8,9,10,11
        //travel
        //left to right -> i=0,0                to      0,columns-1
        //top to bottom -> i=0,columns-1        to      rows-1,columns-1
        //right to left -> i=rows-1,columns-1   to      rows-1,0
        //bottom to top -> i=rows-1,0           to      1,0

        int i = 0;
        int j = 0;
        List<String> visited = new ArrayList<>();
        out.println("\nrows : " + rows + "\ncolumns : " + columns + ",");
        while (rows > 0 || columns > 0) {
            for (; j < columns; j++) {
                if (visited.contains(i + "" + j))
                    break;
                visited.add(i + "" + j);
                out.print(a[i][j] + "|");
            }
            --j;
            ++i;
            for (; i < rows; i++) {
                if (visited.contains(i + "" + j))
                    break;
                visited.add(i + "" + j);
                out.print(a[i][j] + "|");
            }
            --i;
            --j;
            for (; j >= 0; j--) {
                if (visited.contains(i + "" + j))
                    break;
                visited.add(i + "" + j);
                out.print(a[i][j] + "|");
            }
            ++j;
            --i;

            for (; i > 0; i--) {
                if (visited.contains(i + "" + j))
                    break;
                visited.add(i + "" + j);
                out.print(a[i][j] + "|");
            }
            ++i;
            ++j;
            rows = rows - 1;
            columns = columns - 1;
        }
    }
}
