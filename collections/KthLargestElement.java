package com.collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static int kthLarg(int k,int arr[])
    {
        int ans=0;
        PriorityQueue<Integer> pq = new PriorityQueue(Comparator.reverseOrder());
        for (int i=0;i<arr.length;i++)
            pq.add(arr[i]);

        while(k!=0)
        {
            ans=pq.peek();
            pq.poll();
           k-- ;
        }
        return ans;
    }
    public static void main(String[] args) {
 //        PriorityQueue<Integer> que = new PriorityQueue<>();
//        que.add(23);
//        que.add(45);
//        que.add(47);
        int arr[]={23,34,12,67,25};
        System.out.println(kthLarg(4,arr));
    }
}
