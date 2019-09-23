package learning.java8.interfaces.defaultmethod.diamondproblem;

public class Dia3 {
}

interface A3{
    default void show(){
        System.out.println("A3");
    }
}
interface B3{
    default void show(){
        System.out.println("B3");
    }
}
class C3{
    void show(){
        System.out.println("C3");
    }
}

class D3 extends C3 implements A3,B3{
    public void show(){
        System.out.println("D3");
    }
    public static void main(String[] args) {
        D3 d = new D3();
        d.show();
    }
}