package multithreading.UsingRunnable;

import multithreading.UsingRunnable.ImplementingRunnableInterface;

public class TestRunnable {
    public static void main(String[] args) {
        ImplementingRunnableInterface imp = new ImplementingRunnableInterface();
        Thread th = new Thread(imp);
        th.start();
        System.out.println("thread name - "+ Thread.currentThread().getName());
    }
}
