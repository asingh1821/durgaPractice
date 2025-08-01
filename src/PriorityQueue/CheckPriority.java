package PriorityQueue;
import java.util.*;

public class CheckPriority {
    public static void main(String[] args) {
        Queue<Integer> p = new PriorityQueue<>();

        // Adding items to the pQueue using add()
        p.add(100);
        p.add(20);
        p.add(1500);

        // Printing the top element of PriorityQueue
        System.out.println(p.poll());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(p.poll());

        // Printing the top element again
        System.out.println(p.peek());

    }
}
