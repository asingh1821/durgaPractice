import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
/**
while iterating in collection when we change the collection
 then we get error this is called fail safe iteration
 this designs prevents our application
 */
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                // This line will cause a ConcurrentModificationException
                fruits.remove(fruit);
            }
        }
    }
}
