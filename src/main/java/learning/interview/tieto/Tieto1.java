package learning.interview.tieto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.System.*;

public class Tieto1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        out.println(list.stream().mapToInt(Integer::intValue).sum());

        Predicate predicate = (curr) -> curr.equals(1);
        out.println(list.stream().filter(predicate).collect(Collectors.toList()));

        int n = 50;
        int sum = (n * (n + 1)) / 2;
        out.println(sum);

        sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        out.println(sum);

        out.println(IntStream.range(0, 50).sum());
    }
}
