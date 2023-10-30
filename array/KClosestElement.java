package com.array;

import java.util.ArrayList;
import java.util.HashMap;

public class KClosestElement {

    public static void main(String[] args) {
        //HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1};
        int x=1;
        int k=1;
        ArrayList<Integer> list = new ArrayList<>();
        //Two pointer method
        int low=0;
        int high=arr.length-1;
        System.out.println(low+" "+high);
        while(high-low>=k) {
            //if left side differrence is greater than right
            if (x - arr[low] > arr[high] - x) {
                low++;
            } else {
                high--;
            }

        }
            System.out.println(low+" "+high);
            for(int i=low;i<=high;i++)
            {

                System.out.println(arr[i]);
                list.add(arr[i]);
            }

        System.out.println(list);

    }
}
