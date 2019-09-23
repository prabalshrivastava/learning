package learning.java8.interfaces.defaultmethod.diamondproblem;

public class Dia1a {
}

interface A1a{
    default void show(){
        System.out.println("A1a");
    }
}

interface B1a{}

class C1a{
    //case 1
    public void show(){
        System.out.println("C1a");
    }
    //case 2
    //protected void show(){
    //    System.out.println("C1a");
    //}

    //case 3
    //void show(){
    //    System.out.println("C1a");
    //}
}

class D1a extends C1a implements A1a,B1a{
    public static void main(String[] args) {
        D1a d = new D1a();
        d.show();
    }
}