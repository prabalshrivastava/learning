package learning.coding.zsassociates;

import java.util.LinkedHashMap;
import java.util.Map;

public class ZS {
    public static void main(String[] args) {
        String[] a1 = {"apple", "apple", "mango", "banana", "guava"};
        String[] a2 = {"fig", "orange", "chiku", "pineapple", "apple"};

        Map<String, Integer> map = new LinkedHashMap<>();
//        fillMap(a1, map);
//        fillMap(a2, map);

        for (int i = 0; i < a1.length; i++) {
            String currentKey = a1[i];
            if (map.containsKey(currentKey)) {
                Integer value = map.get(currentKey);
                map.put(currentKey, value++);
            } else
                map.put(currentKey, 1);
        }
        for (int i = 0; i < a1.length; i++) {
            String currentKey = a1[i];
            if (map.containsKey(currentKey)) {
            } else
                map.put(currentKey, 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

        }

//        Car c = new Car();
//        Car sc = new SuperCar();
//        Car mc = new MiniCar();
//        sc.applybreak();
    }

    private static void fillMap(String[] a1, Map<String, Integer> map) {
        for (int i = 0; i < a1.length; i++) {
            String currentKey = a1[i];
            if (map.containsKey(currentKey)) {
                Integer value = map.get(currentKey);
                map.put(currentKey, value++);
            } else
                map.put(currentKey, 1);
        }
    }
}