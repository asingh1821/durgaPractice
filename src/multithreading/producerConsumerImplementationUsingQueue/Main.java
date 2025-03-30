package multithreading.producerConsumerImplementationUsingQueue;



public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);
        Thread consumeThread = new Thread( () ->{
            try{
                 for(int i = 1; i <= 6; i++){
                    sharedResource.produce(i);
                }
            }catch (Exception e){

            }
        });
        Thread produceThread = new Thread( () -> {
            try {
                for(int i = 1; i <= 6; i++){
                    sharedResource.consume();
                }
            }catch (Exception e){

            }
        });
        consumeThread.start();
        produceThread.start();
        System.out.println("Main method end");
    }
}
