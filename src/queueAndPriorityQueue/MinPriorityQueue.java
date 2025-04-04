package queueAndPriorityQueue;

import java.util.PriorityQueue;

public class MinPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        pq.add(5);
        pq.add(12);
        pq.add(7);
        pq.add(11);
        pq.add(6);
        pq.add(8);
        System.out.println(pq);
        while(!pq.isEmpty()){
            int value = pq.poll();
            System.out.println("remove from top : "+ value);
        }
    }
}
