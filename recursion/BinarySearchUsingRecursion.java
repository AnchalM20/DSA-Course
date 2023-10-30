package com.recursion;

public class BinarySearchUsingRecursion {
    static int binarySearch(int[] arr,int start,int end,int target)
    {
        if(start>end)
            return -1;
        int mid=start+(end-start)/2;
        //base condition
        if(arr[mid]==target)
            return mid;
        if(arr[mid]<target)
            return binarySearch(arr,mid+1,end,target);
        else
            return binarySearch(arr,start,mid-1,target);

    }
    public static void main(String[] args) {
        int[] arr={23,45,67,88,98,203};
        System.out.println(binarySearch(arr,0,arr.length-1,97));
    }
}
