package com.array;

import java.util.*;

public class First_Repeating_Element {
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int ans=-1;
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int element:arr)
        {
            if(map.containsKey(element))
            {
                int count=map.get(element);
                map.put(element,count+1);
            }

            else
                map.put(element,1);
        }
        int indx=1;
        for(int element:map.keySet())
        {
            if(map.get(element)>1)
            {
                return indx;
            }
            indx++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr,arr.length));
    }
}
