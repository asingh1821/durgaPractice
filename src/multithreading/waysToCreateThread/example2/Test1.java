package multithreading.waysToCreateThread.example2;

class MyRun implements Runnable{
    @Override
    public void run(){
        System.out.println("Running thread in Myrun is: "+ Thread.currentThread().getName());
    }
}
public class Test1{
    public static void main(String[] args) {
        System.out.println("Running thread in test1 is: "+Thread.currentThread().getName());
        MyRun run1 = new MyRun();
        Thread thread = new Thread(run1);
        thread.start();
    }
}
