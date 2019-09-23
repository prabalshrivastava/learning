package learning.java8.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface ConsumerInterface {
    List<Integer> al = Arrays.asList(4,5,6,7,8);
    public static void main(String[] args) {
        al.forEach(l-> System.out.println(l+"-"));
    }
}

class Main{
    static Consumer<Integer> c = new Consumer<Integer>() {
        @Override
        public void accept(Integer o) {
            System.out.println(o + "---------");
        }
    };
    static List<Integer> al = Arrays.asList(4,5,6,7,8);
    public static void main(String[] args) {
        al.forEach(l-> System.out.println(c));
    }
}


//case 1
//interface ConsumerInterface {
//    List<Integer> al = Arrays.asList(4,5,6,7,8);
//    public static void main(String[] args) {
//        al.forEach(l-> System.out.println(l+"-"));
//    }
//}
//
//class Main{
//    static List<Integer> al = Arrays.asList(4,5,6,7,8);
//    public static void main(String[] args) {
//        al.forEach(l-> System.out.println(l));
//    }
//}