package multithreading.raceCondition;

import java.util.concurrent.atomic.AtomicInteger;

class RaceCondition {
    int count = 0;
    public void increaseCount(){
        count++;
    }
    public int readCount(){
        return count;
    }
}
public class Test{
    public static void main(String[] args) throws InterruptedException {
        RaceCondition rc = new RaceCondition();

            Thread t1 = new Thread(()-> {
                for (int i = 0; i < 100000; i++) {
                    rc.increaseCount();

                }
            });
            Thread t2 = new Thread(()-> {
                for (int i = 0; i < 1000; i++) {
                    rc.increaseCount();

                }
            });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("counter reached at: "+ rc.count);
        }

    }


