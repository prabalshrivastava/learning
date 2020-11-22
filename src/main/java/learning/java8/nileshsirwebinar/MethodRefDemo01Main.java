package learning.java8.nileshsirwebinar;

import java.util.function.Consumer;
import java.util.function.Supplier;

class FirstClass {
    private String msg;

    public FirstClass() {
        this.msg = "Nothing";
    }

    public FirstClass(String msg) {
        this.msg = msg;
    }

    public static void staticShow(String s) {
        System.out.println("FirstClass.staticShow() : " + s);
    }

    public void nonStaticShow1(String s) {
        System.out.println("FirstClass.nonStaticShow1() : " + s);
    }

    public void nonStaticShow2() {
        System.out.println("FirstClass.nonStaticShow2() : " + msg);
    }

    @Override
    public String toString() {
        return "FirstClass.toString() : " + msg;
    }
}

public class MethodRefDemo01Main {
    public static void main(String[] args) {
        // method reference to static method of class
        Consumer<String> ref1 = s -> FirstClass.staticShow(s);
        ref1.accept("One");
        ref1 = FirstClass::staticShow;
        ref1.accept("One");

        // method reference to non-static method of existing object
        FirstClass testObj1 = new FirstClass();
        Consumer<String> ref2 = s -> testObj1.nonStaticShow1(s);
        ref2.accept("Two");

        // method reference to non-static method of class (given object)
        Consumer<FirstClass> ref3 = obj -> obj.nonStaticShow2();
        ref3.accept(new FirstClass("Three"));

        // method reference to constructor of class
        Supplier<FirstClass> ref4 = () -> new FirstClass();
        System.out.println(ref4.get());
    }
}
