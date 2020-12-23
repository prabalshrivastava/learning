package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex9JvmRunsEvenAfterMainTerminates {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            //"The Runnable Thread" is a non-daemon thread Will keep running infinitely
            // and JVM will not terminate until the non-daemon thread runs
            while (true) {
                sleep(1000);
                out.println(Thread.currentThread().getName() + " running");
            }
        };
        Thread thread = new Thread(runnable, "The Runnable Thread");
        thread.start();
        sleep(3000);
        //Main thread will be exiting in sometime.
        out.println(Thread.currentThread().getName() + " exiting");
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

