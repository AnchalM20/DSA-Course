package com.collections;
import java.util.Comparator;
import java.util.PriorityQueue;


public class PriorityQqueue {
    public static void main(String[] args) {
//      PriorityQueue<Integer> pq= new PriorityQueue();   //MinHeap
        PriorityQueue<Integer> pq= new PriorityQueue(Comparator.reverseOrder()); //MaxHeap
        pq.add(23);
        pq.add(12);
        pq.add(45);
        pq.add(4);
        pq.add(89);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
