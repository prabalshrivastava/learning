package learning.multithreading.jenkov;

public class Ex12SharedObjects {
    public static void main(String[] args) {
        Runnable runnable1 = new MyRunnable();

        // Here the count field does gets shared between different threads as each thread has same MyRunnable
        // and hence count field in same object space.
        Thread thread1 = new Thread(runnable1, "Thread 1");
        Thread thread2 = new Thread(runnable1, "Thread 2");

        thread1.start();
        thread2.start();
    }
}

