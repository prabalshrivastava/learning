package learning.java.date;

import java.time.Instant;
import java.util.Date;

public class UtilDate {
    public static void main(String[] args) {
        Date a = new Date();
        Date b = new Date(600000);
        System.out.println("a-> " + a);
        System.out.println("b-> " + b);

        System.out.println(a.after(b));
        System.out.println(a.before(b));

        Object c = b.clone();
        System.out.println("c-> " + c);
        System.out.println(c==b);
        System.out.println(c instanceof Date);
        System.out.println(c.equals(b));
        System.out.println(a.compareTo(b));
        System.out.println(a.hashCode());
        a.setTime(1597847389000l);
        System.out.println(a.getTime());
        System.out.println(a);
        System.out.println(a.toString());
        Instant x = a.toInstant();
        System.out.println(x);
        Date d = Date.from(Instant.now());
    }
}
