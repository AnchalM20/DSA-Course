package com.binarySearch;

//For given sorted Array in O(logn) complexity
public class MissingNumInSorted {
    static  int missingNumber(int[] arr)
    {
        int n= arr.length;
        int s=0;
        int e= arr.length-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int diff=arr[mid]-mid;
            if(diff==1)
            {
                //+1 pattern then go to right check for pattern change
                s=mid+1;
            }
            else{
                //store the ans and go to left
                ans=mid;
                e=mid-1;
            }
        }
        if(ans+1==0)
            return n+1;
        return ans+1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("Missing element is: "+missingNumber(arr));
    }
}
