package learning.java8.interfaces.staticmethod;

interface StaticMethodWithModifiers {
    //private static void show1(){System.out.println("private");}
    static void show2(){System.out.println("nothing-->its default access modifier");}
    //protected static void show3(){System.out.println("protected");}
    public static void show4(){System.out.println("public");}
    //final static void show5(){System.out.println("final");}
    //abstract static void show6(){System.out.println("abstract");}
    //default static void show7(){System.out.println("static");}
    //synchronized static void show8(){System.out.println("synchronized");}
    //strictfp static void show9(){System.out.println("strictfp");}
    //transient static void show10(){System.out.println("transient");}
    //volatile static void show11(){System.out.println("volatile");}
    //native static void show12(){System.out.println("native");}
}

class Main{
    public static void main(String[] args) {
        StaticMethodWithModifiers.show2();
        StaticMethodWithModifiers.show4();
    }
}
