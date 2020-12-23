package learning.interview.techm;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class TechM {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("b", 20));
        employees.add(new Employee("a", 10));
        employees.add(new Employee("d", 5));
        employees.add(new Employee("e", 50));
        employees.add(new Employee("f", 40));
        employees.add(new Employee("c", 30));

        employees.sort((o1, o2) -> o1.age - o2.age);
        out.println(employees);
        out.println(binarySearch(employees, 5));

        //1. Sort based on age
        //2. Search employee with age > 20 using binary search
    }

    public static Employee binarySearch(List<Employee> employees, int age) {
        int left = 0;
        int right = employees.size();//5
        int mid = left + right / 2;
        Employee found = null;

        //searching 10
        //10,20,30,40,50
        while (true) {
            if (left >= 0 && right <= employees.size()) {
                if (employees.get(mid).age == age) {
                    found = employees.get(mid);
                    break;
                } else if (employees.get(mid).age > age) {
                    right = mid;
                    mid = left + right / 2;
                } else if (employees.get(mid).age < age) {
                    left = mid;
                    mid = left + right / 2;
                }
            } else
                break;
        }
        return found;
    }
}


class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //    @Override
//    public int compareTo(Employee o) {
//        return this.age - o.age;
//    }
}
