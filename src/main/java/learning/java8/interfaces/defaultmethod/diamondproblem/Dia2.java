package learning.java8.interfaces.defaultmethod.diamondproblem;

public class Dia2 {
}

interface A2{
    default void show(){
        System.out.println("A2");
    }
}
interface B2{
    default void show(){
        System.out.println("B2");
    }

}
class C2{
}

class D2 extends C2 implements A2,B2{
    public void show(){
        System.out.println("D2");
    }
    public static void main(String[] args) {
        D2 d = new D2();
        d.show();
    }
}