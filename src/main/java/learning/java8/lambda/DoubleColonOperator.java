package learning.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class DoubleColonOperator {
    public static void main(String... args) {
        Person[] people = new Person[]{
                new Person("Ted", "Neward", 41),
                new Person("Charlotte", "Neward", 41),
                new Person("Michael", "Neward", 19),
                new Person("Matthew", "Neward", 13)
        };
        // Sort by first name
        //Traditional way of passing the comparator object
        Arrays.sort(people, (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName));
        System.out.println(Arrays.deepToString(people));

        //The way functional programmers prefer
        Arrays.sort(people, Person.compareLastName);
        System.out.println(Arrays.deepToString(people));

        //New way of passing method names to be used as a comparator implementation for SAM(Single Abstract Method)
        //here compareFirstNames will be used as the implementation for comparator compare method
        Arrays.sort(people, Person::compareFirstNames);
        System.out.println(Arrays.deepToString(people));

        //Storing the comparator object
        Comparator<Person> comparator = Person::compareFirstNames;
        Arrays.sort(people, comparator);
        System.out.println(Arrays.deepToString(people));
    }
}


class Person {
    public String firstName;
    public String lastName;
    public int age;
    public final static Comparator<Person> compareFirstName = (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName);
    public final static Comparator<Person> compareLastName = (lhs, rhs) -> lhs.lastName.compareTo(rhs.lastName);

    public static int compareFirstNames(Person lhs, Person rhs) {
        return lhs.firstName.compareTo(rhs.firstName);
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
