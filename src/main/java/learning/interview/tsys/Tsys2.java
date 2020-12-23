package learning.interview.tsys;

import java.util.*;

public class Tsys2 {
    public static void main(String[] args) {
        int[] num = {4, 6, 8, 1, -4, -7, -3, 3, -8, -11};
        List<Integer> positive = new LinkedList<>();
        List<Integer> negative = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            if (curr > 0)
                positive.add(curr);
            else
                negative.add(curr);
        }
        Collections.sort(positive, (o1, o2) -> o2 - o1);
//        System.out.println(positive);
        Collections.sort(negative, (o1, o2) -> o1 - o2);
//        System.out.println(negative);
        positive.addAll(negative);
        System.out.println(positive);
    }
}
