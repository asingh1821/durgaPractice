package multithreading.monitorLock1WithoutLambda;

public class ConsumeTask implements Runnable{

    SharedResource sharedResource;

    ConsumeTask(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run(){
        System.out.println("consumer thread : "+ Thread.currentThread().getName());
        sharedResource.consumeItems();
    }
}
