package learning.java.stringstringbufferandbuilder;

import static java.lang.System.out;

public class StringConstructorAndMethods {
    public static void main(String[] args) {

        //Constructors
        out.println(new String());                                          //creates an empty string object
        out.println(new String("prabal"));                           //for a given string literal creates a String object
        out.println(new String(new StringBuffer()));                        //for a given string buffer creates a String object
        out.println(new String(new StringBuilder()));                       //for a given string builder creates a String object
        out.println(new String(new char[]{'j','a','v','a'}));               //for a given character array creates a String object
        out.println(new String(new byte[]{97,98,99,100}));                  //for a given character array creates a String object


        out.println("prabal".substring(0, 3));                            //pra
        out.println("prabal".substring(3));                              //bal
        out.println("".isEmpty());                                       //true
        out.println("a".isEmpty());                                      //false
        out.println("abcsde".contains("ab"));                            //true
        out.println("abcsde".contains(""));                              //true
        out.println("abcsde".contains("asdasdasd"));                     //false
        out.println("      abcsde        \t\n".trim());                  //abcsde
        out.println("abcsde".indexOf("cs"));                             //2
        out.println("abcsde cs".lastIndexOf("cs"));                  //7
        out.println("abcsde cs".replaceAll("cs", "-"));   //"ab-de -"
        out.println("abcsde".toCharArray());                             //abcsde
        out.println("def".concat("abc"));                                //defabc
        int roll = 100;
        out.println(String.format("this is my roll number " + roll));
        out.println(String.format("this is my roll number %d" , roll));
        out.println(String.format("this is my roll number %s" , "10"));

//        out.println(" hello \n\t<".replaceAll(" ", ""));
        out.println(" hello \n\t<".replaceAll("\\s",""));
        out.println(String.valueOf(10));
        out.println(String.valueOf(10.1));
        out.println(String.valueOf(true));
        out.println(String.valueOf('a'));
        out.println(Integer.parseInt("10"));
        out.println(Float.parseFloat("10"));
//        out.println(Float.parseFloat("sanjeevani"));

//        "learning.java.stringstringbufferandbuilder.StringMethods";
//        "learning.java.stringstringbufferandbuilder.PrabalKiStringMethods";
    }
}
