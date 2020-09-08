package learning.java.exception;

import java.io.IOException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {

        //case 1
        Scanner scn = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scn.nextLine());
            if (99 % n == 0)
                System.out.println(n + " is a factor of 99");
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic " + ex);
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception " + ex);
        }


        //case 2
        Scanner scn1 = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scn1.nextLine());
            if (99 % n == 0)
                System.out.println(n + " is a factor of 99");
        } catch (NumberFormatException | ArithmeticException | IndexOutOfBoundsException ex) {
            System.out.println("Exception encountered " + ex);
        }


        //case 3
        try {
            Class.forName("abcdefgj");
        } catch (NumberFormatException | ArithmeticException | IndexOutOfBoundsException | ClassNotFoundException ex) {
            System.out.println("Exception encountered " + ex);
        }
    }
}
