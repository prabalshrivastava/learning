package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex1Way1ToCreateThread {
    static class MyThread extends Thread{
        @Override
        public void run() {
            out.println("MyThread running");
            out.println("MyThread finished");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
