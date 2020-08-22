package learning.java.arrays;

import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {

        //singleDimensional Arrays
//        int[] a = new int();
//        int[] a = new int[];
        int[] a = new int[10];
        int a1[] = new int[10];
        int a2 [] = new int[10];
        int [] a3 = new int[10];
//        []int a4 = new int[10];
        int[] a5 = new int                [10];
//        int[] a6 = new [10]int;
        int[] a7 = {};
        int[] a8 = {1,2,3};
//        int[] a9 = {"1","2","3"};
//        int[] a10 = {1,2,"3"};
        int[] a11 = new int[]{1,2,3};
//        int[] a12 = 1,2,3;
        int[] a13 = new int                                  [            ]                               {1,2,3};
        int[] a14 = {1,2,3};
//        int[3] a15 = {1,2,3};
//        int[] a16 = new Object[];
        Object o = new Integer[10];
        System.out.println(o instanceof Array);
        System.out.println(o instanceof Object);
        System.out.println(o instanceof int[]);
        System.out.println(o instanceof Integer[]);

        Object[] o1 = new int[1][][][][];
        Object[] o2 = new int[3][3][3][3][3];
        Object[] o3 = new int[3][3];
        Object[] o4 = new int[3][];
        Object[] o5 = new int[3][2];
        Object o6 = new int[3][2];
//        Object[][][][][] o7 = new int[1][2][3][4][5];
//        Object[][] o8 = new int[1][2];
        Object[] o8 = new int[1][2];
        Object[] o9 = new int[1][2][3][4][5];
        System.out.println(java.util.Arrays.deepToString(o1));
        System.out.println(java.util.Arrays.deepToString(o2));
        System.out.println(java.util.Arrays.deepToString(o3));
        System.out.println(java.util.Arrays.deepToString(o4));
        System.out.println(java.util.Arrays.deepToString(o5));
        System.out.println(java.util.Arrays.deepToString((Object[]) o6));



        Number[] n = new Integer[2];
//        Integer[] n1 = new Number[2];

        Parent[] p = new Child[1];
//        Child[] c = new Parent[1];
        Parent[][] p1 = new Child[1][];
        Parent[][][] p2 = new Child[1][][];


        //doubleDimensional Arrays
        int[][] b0 = new int[3][];
        System.out.printf("%d%n",b0.length);
        System.out.printf("%d%n",b0[0]);
        System.out.printf("%d%n",b0[1]);
        System.out.printf("%d%n",b0[2]);

        int[][] b00 = new int[3][];
//        b00[0] = 10;
        b00[0] = new int[1];
        b00[0][0] = 10;

        System.out.println(b00.length);
        System.out.println(b00[0]);
        System.out.println(b00[1]);
        System.out.println(b00[2]);
        System.out.println(java.util.Arrays.deepToString(b00));
        System.out.println(java.util.Arrays.toString(b00));


//        int[][] b1 = new int[][1];
//        int[][] b2 = new int[]{};
//        int[][] b3 = new int[]{};
        int[][] b4 = new int[][]{};
        int b5[][] = new int[2][];
        int[] b6[] = new int[2][];
        int            [          ]     b7        [         ] = new int        [         2         ]        [         ];
//        int b8[[]] = new int[2][];
        int[] b9[] = new int[2][10];
        int[] b10[] = new int[2][10];
        int[][] b11 = {{}};
        int[] b12[] = {
                {

                }
        };
//        int[][] b13 = {}{};
        int[][] b14 = {{},{}};
//        int[][] b15 = new Integer[2][10];
//        Integer[][] b16 = new int[2][10];

    }
}

class Parent{

}
class Child extends Parent{

}
