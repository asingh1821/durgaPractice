package multithreading.testWaitSleepSupendAndResumeMethod;

public class SharedResources {
    boolean isAvailable = false;

    public synchronized void produce() {
        System.out.println("Lock acquired");
        isAvailable = true;
        try{
            Thread.sleep(10000);   // it will hold the lock for 10 seconds.
        }catch (Exception e){

        }
        System.out.println("Lock released");
    }
}
