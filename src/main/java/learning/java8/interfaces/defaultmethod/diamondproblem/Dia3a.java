package learning.java8.interfaces.defaultmethod.diamondproblem;

public class Dia3a {
}

interface A3a{
    default void show(){
        System.out.println("A3a");
    }
}

interface B3a{
    default void show(){
        System.out.println("B3a");
    }
}

class C3a{
    //case 0

    //case 1
    public void show(){
        System.out.println("C3a");
    }
    ////case 2
    //protected void show(){
    //    System.out.println("C3a");
    //}
    ////case 3
    //void show(){
    //    System.out.println("C3a");
    //}
    ////case 4
    //private void show(){
    //    System.out.println("C3a");
    //}
}

class D3a extends C3a implements A3a,B3a{
    public static void main(String[] args) {
        D3a d = new D3a();
        d.show();
    }
}