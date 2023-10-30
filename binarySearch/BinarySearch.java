package com.binarySearch;

public class BinarySearch {
    static int binarySearch(int[] arr,int key)
    {
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]==key)
            {
                ans=mid;
                break;
            }

            else if (arr[mid]<key) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={10,20,20,30,35,45,47,50,60};
        int key=47;
        System.out.println(key+" found at index "+binarySearch(arr,key));
    }
}
