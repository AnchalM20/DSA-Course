package com.binarySearch;

public class SearchInNearlySortedArray {
    static int nearlySortedArray(int[] arr,int target)
    {
        int n=arr.length;
        int s=0;
        int e=n-1;
        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
                return mid;
            else if (arr[mid-1]==target) {
                return mid-1;
            } else if (arr[mid+1]==target) {
                return mid+1;
            }
            else if (target>arr[mid]) {
                //right
                s=mid+2; //because mid+1 already checked
            }
            else
            {
                //left
                e=mid-2;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
    int[] arr = {20,10,30,50,40,70,60};
        System.out.println("Element found at index: "+nearlySortedArray(arr,70));
    }
}
