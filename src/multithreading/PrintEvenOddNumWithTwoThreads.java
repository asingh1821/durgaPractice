package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EvenOddThread{
    private int minValue = 1;
    private final int maxValue = 50;

    public synchronized void checkOdd(){
        while (minValue <= maxValue) {
            if(minValue % 2 == 0) {
                try{
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }else{
                System.out.println(Thread.currentThread().getName() +"  " +minValue);
                minValue++;
                notify();
            }
        }
    }
    public synchronized void checkEven(){
        while(minValue <= maxValue) {
            if(minValue % 2 != 0){
                try{
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }else {
                System.out.println(Thread.currentThread().getName() +"    " +minValue);
                minValue++;
                notify();
            }

        }
    }

}
public class PrintEvenOddNumWithTwoThreads {
    public static void main(String[] args) {
        EvenOddThread eo = new EvenOddThread();
        Thread t1 = new Thread(()-> eo.checkEven());
        Thread t2 = new Thread(()-> eo.checkOdd());
        t1.start();
        t2.start();
    }
}
