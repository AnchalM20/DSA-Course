package com.collections;
import java.util.*;

public class LearnQueue {

    //To find Kth largest element
    public static void KthLargest(int arr[],int k)
    {
        //50 78 23 14 59 32 11
        Queue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
        int ele=0;
        for(int element : arr)
            que.offer(element);
        System.out.println(que);
        for(int i=0;i<k;i++)
            ele=que.poll();
        System.out.println(k+" Largest element: "+ele);
    }
    public static void main(String[] args) {
//      Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        KthLargest(arr,4);
//        Queue<Integer> queue = new PriorityQueue<>();
//        queue.offer(500);         // offer() to add elements in the queue
//        queue.offer(200);
//        queue.offer(700);
//        queue.offer(400);
//        queue.offer(100);
//        queue.offer(600);
//        System.out.println(queue);
//
//        System.out.println(queue.poll());  //poll() to remove element from queue
//        System.out.println(queue);
//        queue.add(2000);                //add() to add element at rear-end but throw exception
//        System.out.println(queue);
//
//        System.out.println(queue.element());
    }
}
