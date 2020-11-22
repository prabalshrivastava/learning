package learning.java8.nileshsirwebinar;
/*************************************************************************
 * Java8 Functional Programming Webinar at Sunbeam Infotech.
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Demo: InterfaceDemo03Main.java
 * Date: 24-Oct-2020
 *************************************************************************/

interface Displayable {
    default void show() {
        System.out.println("Displayble show().");
    }
}

interface Printable {
    default void show() {
        System.out.println("Printable show().");
    }
}

class SuperClass implements Displayable {
    @Override
    public void show() {
        System.out.println("SuperClass show()");
    }
}

class SubClass extends SuperClass implements Printable {
}

public class InterfaceDemo03Main {
    public static void main(String[] args) {
        new SuperClass().show(); // SuperClass.show()
        new SubClass().show(); // SuperClass.show()
    }
}