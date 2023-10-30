package com.Problems;

//     peak
//      /\
//   A /  \ B
//    /    \
//Complexity: O(log(n))
public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr={10,20,50,40,30};  //monotonic array 1. ascending_order - Peak - Descending_order
        int start=0;
        int end=arr.length-1;
        System.out.println(end);
        int mid=0;
        while(start<end)    //to avoid infinite loop occurrence
        {
            mid = start+(end-start)/2;

            //when element is in A part
            //goto right to check peak element
            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            //element exist on B side OR Peak
            else
            {
                end=mid;
            }
        }
        System.out.println(arr[start]);

    }
}
