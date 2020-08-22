package learning.java.date;

import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.Date;

public class UtilInstant {
    public static void main(String[] args) {
        Instant i = Instant.now();
        System.out.println(i);

        System.out.println(i.adjustInto(i));
    }
}
