package multithreading.monitorLock1WithoutLambda;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResourceObj = new SharedResource();
        Thread producerThread = new Thread(new ProducerTask(sharedResourceObj));
        Thread consumerThread = new Thread(new ConsumeTask(sharedResourceObj));

        producerThread.start();
        consumerThread.start();
        System.out.println("Main method end");
    }
}
