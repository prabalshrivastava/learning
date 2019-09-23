package learning.java8.interfaces.defaultmethod.diamondproblem;

public class Dia1 {
}
interface A1{
    default void show(){
        System.out.println("A1");
    }
}
interface B1{}
class C1{
    void show(){
        System.out.println("C1");
    }
}

class D1 extends C1 implements A1,B1{
    public void show(){
        System.out.println("D1");
    }
    public static void main(String[] args) {
        D1 d = new D1();
        d.show();
    }
}