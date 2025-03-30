package multithreading.usingTwoThreadsFindLastValueAs500;

public class Main {
    public static void main(String[] args) {
        UpdatedValue obj = new UpdatedValue();

        Thread t1 = new Thread( () -> {
            for(int i =0 ;i <250 ; i++){
                obj.updateNumber();
            }
        });

        Thread t2 = new Thread( () -> {
            for(int i =0 ;i <500 ; i++){
                obj.updateNumber();
            }
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(obj.getValue());
    }
}
