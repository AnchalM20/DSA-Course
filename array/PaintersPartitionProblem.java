package com.array;

public class PaintersPartitionProblem {
}

class Solution{
    static boolean isPossible(int[] arr,int n,int k,long sol)
    {
        long timeSum=0;
        int c=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>sol)
                return false;
            else if(timeSum+arr[i]>sol)
            {
                c++; //increase painter's count
                timeSum=arr[i]; //update timesum
                if(c>k)
                    return false;
            }
            else
            {
                timeSum+=arr[i];
            }
        }
        return true;
    }
    static long minTime(int[] arr,int n,int k){
        //code here
        long start=0;
        long end =0;
        for(int i=0;i<n;i++)
        {
            end+=arr[i];
        }
        long ans=-1;
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            if(isPossible(arr,n,k,mid))
            {
                ans=mid;
                //left
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
}


