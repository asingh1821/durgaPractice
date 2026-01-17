package multithreading.waysToCreateThread.example1;

import multithreading.waysToCreateThread.example1.MyThread;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println("Thread running in main class: "+Thread.currentThread().getName());
        thread.start();
    }
}
