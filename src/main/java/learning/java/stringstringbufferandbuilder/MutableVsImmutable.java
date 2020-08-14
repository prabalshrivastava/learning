package learning.java.stringstringbufferandbuilder;

public class MutableVsImmutable {
    public static void main(String[] args) {
        String s = new String("durga");     //immutable object
        s.concat("software");                      //trying to modify the immutable object
        System.out.println(s);                     //"durga" is printed


        StringBuffer sb = new StringBuffer("durga ");    //mutable object
        sb.append("software");                          //trying to modify the mutable object
        System.out.println(sb);                         //"durga software" is printed
    }
}
