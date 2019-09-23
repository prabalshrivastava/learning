package learning.java8.interfaces.defaultmethod;

public interface DefaultMethodWithModifiers{
    //private default void show1(){System.out.println("private");}
      default void show2(){System.out.println("default");}
    //protected default void show3(){System.out.println("protected");}
      public default void show4(){System.out.println("public");}
    //final default void show5(){System.out.println("final");}
    //abstract default void show6(){System.out.println("abstract");}
    //static default void show7(){System.out.println("static");}
    //synchronized default void show8(){System.out.println("synchronized");}
      strictfp default void show9(){System.out.println("strictfp");}
    //transient default void show10(){System.out.println("transient");}
    //volatile default void show11(){System.out.println("volatile");}
    //native default void show12(){System.out.println("native");}
}