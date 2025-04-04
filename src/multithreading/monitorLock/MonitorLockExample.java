package multithreading.monitorLock;

public class MonitorLockExample {

    public synchronized void task1() {
        try {
            System.out.println("inside task1");
            Thread.sleep(5000);
            System.out.println("task1 completed");
        } catch (Exception e) {

        }
    }
    public void task2(){
        System.out.println("task2, but before synchronized block");
        synchronized (this){
            System.out.println("task2, inside synchronized block");
        }
    }
    public void task3(){
        System.out.println("task3 completed");
    }
}
