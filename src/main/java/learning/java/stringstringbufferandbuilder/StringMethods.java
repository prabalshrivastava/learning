package learning.java.stringstringbufferandbuilder;

import static java.lang.System.out;

public class StringMethods {
    public static void main(String[] args) {
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
    }
}
