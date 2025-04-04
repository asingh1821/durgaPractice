package multithreading.monitorLock1WithoutLambda;

public class SharedResource {

    boolean itemAvailable = false;



    public synchronized void addItems(){
        itemAvailable = true;
        System.out.println("Item added by: " + Thread.currentThread().getName() + "and invoking all the threads which are waiting");
        notifyAll();
    }

    public synchronized void consumeItems(){
        System.out.println("ConsumeItem method is invoked by "+ Thread.currentThread().getName());
        while(!itemAvailable){
            try{
                System.out.println("Thread "+ Thread.currentThread().getName() + "is waiting now");
                wait();
            }catch (Exception e){

            }
            System.out.println("Item consumed by "+ Thread.currentThread().getName());
            itemAvailable = false;
        }
    }
}
