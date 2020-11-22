package learning.java8.nileshsirwebinar;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;

public class StreamDemo01Main {
    public static void main(String[] args) {
        String[] names = {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Sandeep", "Pradnya", "Rohan", "Sarika", "Prerana"};

        // 1. convert all names in upper case
        // 2. sort all names
        // 3. take all names which ends with 'A'
        // 4. print all

        // stream operations:
        Stream<String> stream = Stream.of(names);
        Stream<String> stream1 = stream.map(s -> s.toUpperCase());
        Stream<String> stream2 = stream1.sorted();
        Stream<String> stream3 = stream2.filter(s -> s.endsWith("A"));
//        stream3.forEach(out::println);

        Stream.of(names)
                .map(String::toUpperCase)
                .sorted()
//                .filter(s -> s.endsWith("A"))
                .skip(3)
                .limit(2)
//                .forEach(out::println)
        ;


        Stream<String> strm3 = Stream.of(names);
        strm3
                .map(str -> {
                    System.out.println("map upper case: " + str);
                    return str.toUpperCase();
                })
                .sorted((x, y) -> {
                    System.out.println("comparing: " + x + " - " + y);
                    return x.compareTo(y);
                })
                .filter(str -> {
                    System.out.println("filtering: " + str);
                    return str.endsWith("A") || str.endsWith("a");
                })
//                .forEach(str -> System.out.println("printing: " + str))
        ;
        Stream<String> strm4 = Stream.of(names);
        strm4
                .map(str -> {
                    System.out.println("map upper case: " + str);
                    return str.toUpperCase();
                })
                .filter(str -> {
                    System.out.println("filtering: " + str);
                    return str.endsWith("A") || str.endsWith("a");
                })
                .sorted((x, y) -> {
                    System.out.println("comparing: " + x + " - " + y);
                    return x.compareTo(y);
                })
//                .forEach(str -> System.out.println("printing: " + str))
        ;
//        strm4.toArray();

        Stream<Double> stream4 = Stream.generate(Math::random).limit(10);
        Stream<Integer> stream5 = Stream.iterate(1, integer -> integer + 1).limit(5);
        IntStream intStream = IntStream.rangeClosed(1, 5);
        Stream.Builder<Object> objectBuilder = Stream.builder().add("A").add("B").add("C");
        Stream<Object> build = objectBuilder.build();

        Stream<Integer> strm2 = Stream.iterate(1, i -> i + 1).limit(5);
        //Integer res2 = strm2.reduce(0, (a,i) -> a + i);
        Integer res2 = strm2.reduce(0, (a, i) -> {
            System.out.println(a + " + " + i);
            return a + i;
        });
        System.out.println("Result 2: " + res2);

//        Integer res3 = Stream.iterate(1, i -> i + 1).limit(5).reduce(1, (a, i) -> {
//            return a * i;
//        }).;

        Stream<Object> strm7 = Stream.concat(Stream.builder().add(0).build(),Stream.generate(Math::random).limit(10));
//        Double res7 = strm7.reduce(1.0, StreamDemo01Main::divide);
//        System.out.println("Result: " + res7);

        // stream operations: map(), sorted(), filter(), limit(), skip(), forEach()

        // stream processing internals
    }

    public static Double divide(Object a, Object b) {
        try {
            return (Double) a / (Double) b;
        } catch (Exception e) {
            return (Double) a;
        }
    }
}