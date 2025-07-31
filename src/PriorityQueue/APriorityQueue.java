package PriorityQueue;

import java.util.PriorityQueue;

public class APriorityQueue {
    public static  void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)-> b-a);
        q.add(10);
        q.add(9);
        q.add(100);
        q.add(80);
        q.add(70);
        q.add(112);
        System.out.print(q+" ");
    }
}
