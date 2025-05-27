package multithreading.monitorLock;

public class TestMonitorClass {
    public static void main(String[] args) {
        MonitorLockExample monitor = new MonitorLockExample();
        Thread t1 = new Thread(() -> monitor.task1());
        Thread t2 = new Thread(() -> monitor.task2());
        Thread t3 = new Thread(() -> monitor.task3());
        t1.start();
        t2.start();
        t3.start();
    }
}
