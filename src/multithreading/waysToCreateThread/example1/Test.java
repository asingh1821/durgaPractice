package multithreading.waysToCreateThread;

class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("thread running is: "+ Thread.currentThread().getName());
    }
}
public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println("Thread running in main class: "+Thread.currentThread().getName());
        thread.start();
    }
}
