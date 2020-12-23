package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex10ThreadJoin {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                sleep(1000);
                out.println(Thread.currentThread().getName() + " running");
            }
        };
        Thread thread = new Thread(runnable, "The Runnable Thread");
        //Marking "The Runnable Thread" as daemon
        thread.setDaemon(true);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

