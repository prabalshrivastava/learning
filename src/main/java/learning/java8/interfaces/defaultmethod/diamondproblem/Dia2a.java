package learning.java8.interfaces.defaultmethod.diamondproblem;

public class Dia2a {
}

interface A2a{
    default void show(){
        System.out.println("A2a");
    }
}

interface B2a{
    default void show(){
        System.out.println("B2a");
    }

}

class C2a{
}

//class D2a extends C2a implements A2a,B2a{
//}