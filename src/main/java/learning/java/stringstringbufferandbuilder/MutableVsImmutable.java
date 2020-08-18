package learning.java.stringstringbufferandbuilder;

public class MutableVsImmutable {


//    String vs StringBuffer vs StringBuilder
//    When to use String , StringBuffer and StringBuilder?
//    1. If the content is fixed and won't change frequently then we should go for String.
//    2. If the content is not fixed and keep on changing but Thread Safety is required then we should go for StringBuffer.
//    3. If the content is not fixed and keep on changing and thread safety is not required then we should go for String Builder.

    public static void main(String[] args) {
//        String s = new String("durga");     //immutable object
//        s.concat("software");                      //trying to modify the immutable object
//        System.out.println(s);                     //"durga" is printed
//
//
//        StringBuffer sb = new StringBuffer("durga ");    //mutable object
//        sb.append("software");                          //trying to modify the mutable object
//        System.out.println(sb);                         //"durga software" is printed
//
//
//        String sp ="prabal";
//        String sr="richa";
//        sp = sr+sp;
//        sp.concat(sr);


        String s1 = new String("JAVA");
        String s2 = s1.intern();                //Creating String Intern
        System.out.println(s1 == s2);           //Output : false
        System.out.println(s1 == "JAVA");       //Output : false
        System.out.println(s2 == "JAVA");       //Output : true
        System.out.println(s1.intern() == s2);  //Output : true
        System.out.println(s1.equals(s2));      //Output : true


        String s1a = "JAVA";
        String s2a = new String("JAVA");
        String s3a = s2a.intern();                                              //Creating String Intern
        System.out.println(s1a == s3a);                                         //true
    }
}
