package multithreading.usingTwoThreadsFindLastValueAs500;

import java.util.concurrent.atomic.AtomicInteger;

public class UpdatedValue {
//    AtomicInteger i = new AtomicInteger(0);

   int i = 0;
    public void updateNumber(){
        i++;
    }
    public int getValue(){
        return i;
    }


}
