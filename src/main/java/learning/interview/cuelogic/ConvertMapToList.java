package learning.interview.cuelogic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class ConvertMapToList {

    public static void main(String[] args) {
        //before
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        String s = "apple";
        String s1 = "apple";
        String s2 = new String("apple");
        out.println(s == s1);
        out.println(s == s2);


// Complete the code
        List<Integer> keys = new LinkedList<>();
        List<String> values = new LinkedList<>();
        for (Integer key : map.keySet()) {
            keys.add(key);
            values.add(map.get(key));
        }
        out.println(values);
        out.println(keys);

        values.forEach(out::println);
        out.println("\n\n");
        values.stream().filter(s3 -> s3.contains("l")).collect(Collectors.toList()).forEach(out::println);
        //after
    }
}