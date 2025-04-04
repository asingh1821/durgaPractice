package multithreading.monitorLock1WithoutLambda;

public class ProducerTask implements Runnable{

    SharedResource sharedResource;

    ProducerTask(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run(){
        System.out.println("Producer Thread: "+ Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }
        sharedResource.addItems();
    }
}
