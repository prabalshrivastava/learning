package learning.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterPredicate {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(10,9,4,67,12);

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };

        System.out.println(l.stream().filter(p).reduce(0,Integer::sum));
        System.out.println(l.stream().filter(integer -> integer%2==0).reduce(0,Integer::sum));
        System.out.println(l.stream().filter(integer -> integer%2==0).map(i->i*2).reduce(0,Integer::sum));
    }
}