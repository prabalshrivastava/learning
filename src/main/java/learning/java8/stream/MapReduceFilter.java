package learning.java8.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapReduceFilter {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(10,9,4,67,12);
        Stream<Integer> stream = l.stream();

        Function<Integer,Integer> f= new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };
        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        System.out.println(stream);
        //stream.map(f).forEach(System.out::println);
        Stream<Integer> stream1 = stream.map(f);
        Integer reducedVal = stream1.reduce(0,b);
        System.out.println(reducedVal);
        System.out.println(l.stream().map(i->i*2).reduce(0,(i,j)->i+j));
        System.out.println(l.stream().map(i->i*2).reduce(0,(i,j)->Integer.sum(i,j)));
        System.out.println(l.stream().map(i->i*2).reduce(0,Integer::sum));


    }
}
