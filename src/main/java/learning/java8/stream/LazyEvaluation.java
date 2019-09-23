package learning.java8.stream;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(10,9,4,67,12);
        Integer result = 0;
        for (Integer i : l){
            if(i%2==0){
                System.out.println(i);
                result = i*2;
                break;
            }
        }
        System.out.println(result);
//        System.out.println(
//                l.stream()
//                 .filter(integer -> integer%2==0)
//                 .map(i->i*2)
//                 .findFirst()
//                 .orElse(0));
        System.out.println(
                l.stream()
                 .filter(LazyEvaluation::isDivisible)
                 .map(LazyEvaluation::multiply)
                 .findFirst()
                 .orElse(0));
    }

    static boolean isDivisible(Integer dividend){
        System.out.println("isDivisible : " + dividend);
        return dividend%2==0;
    }
    static Integer multiply(Integer f){
        System.out.println("multiply : " + f);
        return f*2;
    }
}
