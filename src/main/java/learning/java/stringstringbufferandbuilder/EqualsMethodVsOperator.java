package learning.java.stringstringbufferandbuilder;

public class EqualsMethodVsOperator {
    public static void main(String[] args) {
        String s1 = new String("durga");
        String s2 = new String("durga");
        System.out.println(s1 == s2);                       //false -   because == is used for reference comparison and when creating the String using constructor (eg new String("durga");) new object in the heap is created every time here String constant pooling is not applied
        System.out.println(s1.equals(s2));                  //true  -   because equals() of String method is overridden for content comparison

        StringBuffer sb1 = new StringBuffer("durga");
        StringBuffer sb2 = new StringBuffer("durga");
        System.out.println(sb1 == sb2);                     //false -   because == is used for reference comparison
        System.out.println(sb1.equals(sb2));                //false -   because equals() of StringBuffer method is not overridden for content comparison and hence object's class equals() is called. - https://stackoverflow.com/questions/11112602/why-does-stringbuffer-stringbuilder-not-override-equals-or-hashcode

        StringBuilder sbld1 = new StringBuilder("durga");
        StringBuilder sbld2 = new StringBuilder("durga");
        System.out.println(sbld1 == sbld2);                     //false -   because == is used for reference comparison
        System.out.println(sbld1.equals(sbld2));                //false -   because equals() of StringBuilder method is not overridden for content comparison and hence object's class equals() is called. - https://stackoverflow.com/questions/11112602/why-does-stringbuffer-stringbuilder-not-override-equals-or-hashcode

        //Why does StringBuffer/StringBuilder does not override the equals(), hashcode() methods from object?
    }
}
