package multithreading.monitorLockImplementationWithLambda;

public class SharedResource {

    boolean itemAvailable = false;

    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item added by Thread : "+ Thread.currentThread().getName()+"and invoking all the threads which are waiting");
        notifyAll();
    }
    public synchronized void consumeItem(){
        System.out.println("consume item method invoked by: "+ Thread.currentThread().getName());
        try{
            while(!itemAvailable){
                System.out.println("Thread: " + Thread.currentThread().getName()+ "is waiting now");
                wait();
            }
        }catch (Exception e){

        }
        System.out.println("Item consumed by: "+ Thread.currentThread().getName());
        itemAvailable = false;
    }
}
