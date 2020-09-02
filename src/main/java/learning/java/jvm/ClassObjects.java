package learning.java.jvm;

import static java.lang.System.*;

public class ClassObjects {
    public static void main(String[] args) throws ClassNotFoundException {
//        out.println(Class.forName("Z") + " | " +  Class.forName("boolean")); //accessing primitive of boolean Z class type is not possible using Class.forName()
//        out.println(Class.forName("B") + " | " +  Class.forName("byte"));    //accessing primitive of byte B class type is not possible using Class.forName()
//        out.println(Class.forName("C") + " | " +  Class.forName("char"));    //accessing primitive of char C class type is not possible using Class.forName()
//        out.println(Class.forName("D") + " | " +  Class.forName("double"));  //accessing primitive of double D class type is not possible using Class.forName()
//        out.println(Class.forName("F") + " | " +  Class.forName("float"));   //accessing primitive of float F class type is not possible using Class.forName()
//        out.println(Class.forName("I") + " | " +  Class.forName("int"));     //accessing primitive of int I class type is not possible using Class.forName()
//        out.println(Class.forName("J") + " | " +  Class.forName("long"));    //accessing primitive of long J class type is not possible using Class.forName()
//        out.println(Class.forName("S") + " | " +  Class.forName("short"));   //accessing primitive of short S class type is not possible using Class.forName()

        out.println(Class.forName("[Z") + " | " + Class.forName("[Z").getSimpleName());//accessing primitive array of boolean Z class type
        out.println(Class.forName("[B") + " | " + Class.forName("[B").getSimpleName());//accessing primitive array of byte B class type
        out.println(Class.forName("[C") + " | " + Class.forName("[C").getSimpleName());//accessing primitive array of char C class type
        out.println(Class.forName("[D") + " | " + Class.forName("[D").getSimpleName());//accessing primitive array of double D class type
        out.println(Class.forName("[F") + " | " + Class.forName("[F").getSimpleName());//accessing primitive array of float F class type
        out.println(Class.forName("[I") + " | " + Class.forName("[I").getSimpleName());//accessing primitive array of int I class type
        out.println(Class.forName("[J") + " | " + Class.forName("[J").getSimpleName());//accessing primitive array of long J class type
        out.println(Class.forName("[S") + " | " + Class.forName("[S").getSimpleName());//accessing primitive array of short S class type
        out.println(Class.forName("[Ljava.lang.String;") + " | " + Class.forName("[Ljava.lang.String;").getSimpleName());//accessing Object array of class or interface Lclassname; class type
        out.println("");



        out.println(Class.forName("[[Z") + " | " + Class.forName("[[Z").getSimpleName());//accessing primitive double dimension array of boolean Z class type
        out.println(Class.forName("[[B") + " | " + Class.forName("[[B").getSimpleName());//accessing primitive double dimension array of byte B class type
        out.println(Class.forName("[[C") + " | " + Class.forName("[[C").getSimpleName());//accessing primitive double dimension array of char C class type
        out.println(Class.forName("[[D") + " | " + Class.forName("[[D").getSimpleName());//accessing primitive double dimension array of double D class type
        out.println(Class.forName("[[F") + " | " + Class.forName("[[F").getSimpleName());//accessing primitive double dimension array of float F class type
        out.println(Class.forName("[[I") + " | " + Class.forName("[[I").getSimpleName());//accessing primitive double dimension array of int I class type
        out.println(Class.forName("[[J") + " | " + Class.forName("[[J").getSimpleName());//accessing primitive double dimension array of long J class type
        out.println(Class.forName("[[S") + " | " + Class.forName("[[S").getSimpleName());//accessing primitive double dimension array of short S class type
        out.println(Class.forName("[[Ljava.lang.String;") + " | " + Class.forName("[[Ljava.lang.String;").getSimpleName());//accessing Object double dimension array of class or interface Lclassname; class type
        out.println("");


        out.println(boolean.class + " | " + boolean.class.getSimpleName());  //accessing primitive double dimension array of boolean Z class type
        out.println(byte.class + " | " + byte.class.getSimpleName());        //accessing primitive double dimension array of byte B class type
        out.println(char.class + " | " + char.class.getSimpleName());        //accessing primitive double dimension array of char C class type
        out.println(double.class + " | " + double.class.getSimpleName());    //accessing primitive double dimension array of double D class type
        out.println(float.class + " | " + float.class.getSimpleName());      //accessing primitive double dimension array of float F class type
        out.println(int.class + " | " + int.class.getSimpleName());          //accessing primitive double dimension array of int I class type
        out.println(long.class + " | " + long.class.getSimpleName());        //accessing primitive double dimension array of long J class type
        out.println(short.class + " | " + short.class.getSimpleName());      //accessing primitive double dimension array of short S class type
        out.println(void.class + " | " + void.class.getSimpleName());        //accessing primitive double dimension array of void class type
        out.println(String.class + " | " + String.class.getSimpleName());    //accessing Object double dimension array of class or interface Lclassname; class type
        out.println("");


        out.println(Boolean.TYPE + " | " + Boolean.TYPE.getSimpleName());    //accessing primitive of boolean Z class type using TYPE Keyword
        out.println(Byte.TYPE + " | " + Byte.TYPE.getSimpleName());          //accessing primitive of byte B class type using TYPE Keyword
        out.println(Character.TYPE + " | " + Character.TYPE.getSimpleName());//accessing primitive of char C class type using TYPE Keyword
        out.println(Double.TYPE + " | " + Double.TYPE.getSimpleName());      //accessing primitive of double D class type using TYPE Keyword
        out.println(Float.TYPE + " | " + Float.TYPE.getSimpleName());        //accessing primitive of float F class type using TYPE Keyword
        out.println(Integer.TYPE + " | " + Integer.TYPE.getSimpleName());    //accessing primitive of int I class type using TYPE Keyword
        out.println(Long.TYPE + " | " + Long.TYPE.getSimpleName());          //accessing primitive of long J class type using TYPE Keyword
        out.println(Short.TYPE + " | " + Short.TYPE.getSimpleName());        //accessing primitive of short S class type using TYPE Keyword
        out.println(Void.TYPE + " | " + Void.TYPE.getSimpleName());          //accessing primitive of void class type using TYPE Keyword
    }
}
