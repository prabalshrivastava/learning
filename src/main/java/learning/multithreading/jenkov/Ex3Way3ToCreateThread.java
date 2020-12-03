package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex3Way3ToCreateThread {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                out.println("Runnable running");
                out.println("Runn>able finished");
            }
        };
        Thread thread  = new Thread(runnable);
        thread.start();
    }
}

