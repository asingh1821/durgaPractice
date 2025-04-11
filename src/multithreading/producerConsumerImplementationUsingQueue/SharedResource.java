package multithreading.producerConsumerImplementationUsingQueue;

import java.util.LinkedList;
import java.util.Queue;
//import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<Integer>();
        this.bufferSize = bufferSize;
    }
    public synchronized void produce(int item) throws Exception {
        // if buffer is full wait consumer to consume item
        while(sharedBuffer.size() == bufferSize){
            System.out.println("Buffer is full, producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced item: "+ item);
        notify();
    }
    public synchronized int consume() throws Exception{
        //Buffer is empty, wait for the producer to produce item
        while(sharedBuffer.isEmpty()){
               System.out.println("Buffer is empty, Consumer is waiting for producer");
               wait();
           }
        int item = sharedBuffer.poll();
        System.out.println("Consumed : "+ item);
        notify();
        return  item;
    }

}
