package multithreading.waysToCreateThread.example3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i = 0; i < 10; i++) {
            executor.submit(() ->
                    System.out.println("Test 1 executing: " + Thread.currentThread().getName()));
//            executor.submit(() ->
//                    System.out.println("Test 2 executing: " + Thread.currentThread().getName()));
        }
        executor.shutdown();
    }
}
