package queueAndPriorityQueue;

import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        pq.add(10);
        pq.add(50);
        pq.add(35);
        pq.add(52);
        pq.add(45);
        System.out.println(pq);
        while(!pq.isEmpty()){
            int value = pq.poll();
            System.out.println(value);
        }
    }
}
