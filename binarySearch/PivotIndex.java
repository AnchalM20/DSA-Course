package com.binarySearch;
//In Rotated and sorted Array
//Time Complexity: O(log(n))
public class PivotIndex {
    static int pivotIndexToFindMinValue(int[] arr) //Time Complexity: log(n)
    {
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<=e)
        {
            if(s==e)
                return s;
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid-1]&&(mid-1>=0))
                return mid;
            else if (arr[mid]>arr[mid+1] && (mid+1<n)) {
                return mid+1;
            }
            else if (arr[s]>arr[mid]) {
                //goto left
                e=mid-1;
            }
            else{
                //goto right
                s=mid+1;
            }
        }
        return -1;
    }

    static int pivotIndexToFindMax(int[] arr)  //Time Complexity: O(log(n))
    {
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<=e)
        {
            if(s==e)
                return s;
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid-1]&&(mid-1>=0))
                return mid-1;
            else if (arr[mid]>arr[mid+1] && (mid+1<n)) {
                return mid;
            }
            else if (arr[s]>arr[mid]) {
                //goto left
                e=mid-1;
            }
            else{
                //goto right
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] arr = {9,10,11,2};
        System.out.println("Maximum element is: "+arr[pivotIndexToFindMax(arr)]);
        System.out.println("Minimum element is: "+arr[pivotIndexToFindMinValue(arr)]);
    }
}
