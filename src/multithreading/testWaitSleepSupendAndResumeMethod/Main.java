package multithreading.testWaitSleepSupendAndResumeMethod;

import multithreading.monitorLock1WithoutLambda.SharedResource;

public class Main {
    public static void main(String[] args) {
        SharedResources resource = new SharedResources();
        System.out.println("Main thread started");
        Thread th1 = new Thread( () -> {
            System.out.println("Thread1 calling produce method");
            resource.produce();
        });

        Thread th2 = new Thread( () -> {
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
            System.out.println("Thread 2 calling produce method");
            resource.produce();
        });
        th1.start();
        th2.start();
        try{
            th1.join();
        }catch(Exception e){
        }
        System.out.println("Main thread finished");
    }
}
