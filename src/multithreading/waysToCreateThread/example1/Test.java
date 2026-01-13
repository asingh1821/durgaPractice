package multithreading.waysToCreateThread.example1;

class MyThread extends Thread{
    @Override
    public synchronized void run(){
        System.out.println("name of thread in MyThread class : "+ Thread.currentThread().getName());
    }
}
public class Test{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        System.out.println("name of thread inside main class is: "+ Thread.currentThread().getName());
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}