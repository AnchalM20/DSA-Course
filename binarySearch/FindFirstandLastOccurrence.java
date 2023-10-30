package com.binarySearch;


//In sorted Array only

public class FindFirstandLastOccurrence {

    public static int totalOccurrence(int[] arr,int target)
    {
        int first=findFirstOcc(arr, target);
        int last=lastOccurrence(arr, target);
        return last-first+1;
    }

    public static int lastOccurrence(int[] arr,int target)
    {
    int n=arr.length;
    int s=0;
    int e=n-1;
    int ans=-1;
    while(s<=e)
    {
        int mid=s+(e-s)/2;

        if(arr[mid]==target)
        {
            ans=mid;
            s=mid+1;
        }

        else if (arr[mid]<target) {
            s=mid+1;
        }
        else {
            e=mid-1;
        }
    }
    return ans;
    }
    public static int findFirstOcc(int[] arr,int target)
    {
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;

         if(arr[mid]==target)
         {
             ans=mid;
             e=mid-1;
         }

         else if (arr[mid]<target) {
            s=mid+1;
         }
         else {
             e=mid-1;
         }
        }
        return ans;
    }
    public static void main(String[] args) {
    int[] arr={10,20,20,30,35,40,40,40,50,50};
    int indx=findFirstOcc(arr,40);
    int indx1=lastOccurrence(arr,40);
    System.out.println("First occurrence found at "+indx);
        System.out.println("Last Occurrence found at "+indx1);
        System.out.println("Total occurrence of target "+totalOccurrence(arr,40));
    }
}
