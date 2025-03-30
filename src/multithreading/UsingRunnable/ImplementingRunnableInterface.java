package multithreading.UsingRunnable;

public class ImplementingRunnableInterface implements  Runnable{

    public void run(){
        System.out.println("Hello from custom class");
        System.out.println("thread name in custom class : "+ Thread.currentThread().getName());
    }

}
