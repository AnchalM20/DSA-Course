package com.array;

public class ExponentialSearch {
    static int exponentialSearch(int arr[],int x)
    {
        int n=arr.length;
        if(arr[0]==x)
            return 0;
        int i=1;
        while (i<n && arr[i]<=x)
        {
            i=i*2;
        }
        System.out.println(i/2+" "+(i-1));

        //now apply binary search on subArray
        int low=i/2;
        int high=Math.min(i,n-1);
        while (low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
                return mid;
            else if (arr[mid]<x) {
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={3,4,5,6,10,23,33,35,38,41,52};
        System.out.println(exponentialSearch(arr,38));
    }
}
