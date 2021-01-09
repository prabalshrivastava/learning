package learning.trickyquestions;

public class StringVsObject {
    public static void main(String[] args) {
        a("");
        a(null);
    }

    public static void a(String s) {
        System.out.println("String");
    }

    public static void a(Object s) {
        System.out.println("Object");
    }
}
