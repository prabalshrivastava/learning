package learning.interview.xebia;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static java.lang.System.*;

public class Xebia1 {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee("Aman", 1), "");
        map.put(new Employee("Aman", 1), "");
        map.put(new Employee("Aman", 1), "");
        map.put(new Employee("Aman", 1), "");
        map.get(new Employee("Aman", 1));

        out.println(IntStream.range(1, 4).sum());
    }
}

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

class LL {
    LL head;
    static class Node {
        int data;
        LL next;
    }
}



