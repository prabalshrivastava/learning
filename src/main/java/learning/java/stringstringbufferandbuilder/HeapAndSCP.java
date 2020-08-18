package learning.java.stringstringbufferandbuilder;

public class HeapAndSCP {
    public static void main(String[] args) {
//        Case 1
//        String s  = "durga";              //1 object gets created - 1 object in scp
//        String s  = new String("durga");  //2 objects gets created - 1 object in scp and 1 in heap
//
//        Case 2
//        String s  = "durga";              //**
//        String s  = new String("durga");  //2 objects gets created - 1 in heap and 1 object in scp(the object in scp was already created at ** but this time only the reference to the same is returned.)


//        case 3
//        String s1  = new String("durga"); //2 objects gets created - 1 object in scp and 1 in heap
//        String s2  = new String("durga"); //1 objects gets created - 1 in heap and 0 object in scp (the object in scp was already created but this time only the reference to the same is returned.)
//        String s3  = "durga";             //0 object gets created - 0 object in scp (the object in scp was already created but this time only the reference to the same is returned.)
//        String s4  = "durga";             //0 object gets created - 0 object in scp (the object in scp was already created but this time only the reference to the same is returned.)


//        case 3
//        String s = new String("durga");        //2 objects gets created - 1 object in scp and 1 in heap
//        s.concat("software");                  //2 objects gets created - 1 object in scp (for "software") and 1 in heap ("durga software")
//        s = s.concat("solution");              //2 objects gets created - 1 object in scp (for "solution") and 1 in heap ("durga solution")


//        case 4
//        String s1 = new String("Spring");              //2 objects gets created - 1 object in scp and 1 in heap
//        s1.concat("Fall");                             //2 objects gets created - 1 object in scp and 1 in heap
//        String s2 = s1.concat("Winter");               //2 objects gets created - 1 object in scp and 1 in heap
//        s2.concat("Summer");                           //2 objects gets created - 1 object in scp and 1 in heap
//        System.out.println(s1);                        //Spring
//        System.out.println(s2);                        //Winter


//        case 5
        String s1 = new String("You cannot change Me");  //2 objects gets created - 1 object in scp and 1 in heap
        String s2 = new String("You cannot change Me");  //1 object gets created in heap
        System.out.println(s1 == s2);                           //false
        String s3 = "You cannot change Me";                     //Reference of the already created object gets returned.
        System.out.println(s1 == s3);                           //false
        String s4 = "You cannot change Me";                     //Reference of the already created object gets returned.
        System.out.println(s3 == s4);                           //true
        String s5 = "You cannot " + " change Me";               //Reference of the already created object gets returned.-because "You cannot " & " change Me" is a constant hence this operation happens in the compile time. hence "You cannot change Me" gets formed.
        System.out.println(s4 == s5);                           //false
        String s6 = "You cannot ";                              //Reference of the already created object gets returned.
        String s7 = s6 + " change Me";                          //1 objects gets created in heap
        System.out.println(s4 == s7);                           //false
        final String s8 = "You cannot ";                        //Reference of the already created object gets returned.
        String s9 = s8 + " change Me";                          //Reference of the already created object gets returned.-because s8 is final hence - s8 & " change Me" is a constant hence this operation happens in the compile time. hence "You cannot change Me" gets formed.
        System.out.println(s4 == s9);                           //false

    }
}
