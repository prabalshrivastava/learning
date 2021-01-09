package learning.datastructures.timecomplexity;

import static java.lang.System.*;

public class BinaryNumber {
    public static void main(String[] args) {
        out.println(binaryString(4));
    }

    public static String binaryString(int integer) {
        StringBuilder returnValueBuilder = new StringBuilder();
        while (integer > 0) {
            returnValueBuilder.append(integer % 2);
            integer /= 2;
        }
        return returnValueBuilder.reverse().toString();
    }
}
