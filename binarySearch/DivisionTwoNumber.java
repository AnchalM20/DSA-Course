package com.binarySearch;

public class DivisionTwoNumber {
    static int findQuotient(int dividend,int divisor)
    {
       int s=0;
       int e=dividend;
       int ans=0;
       while (s<=e)
       {
           int mid=s+(e-s)/2;
           if(mid*divisor<=dividend)
           {
               ans=mid;
               //right
               s=mid+1;
           }
           else
           {
               //left
               e=mid-1;
           }
       }
       return ans;
    }



    public static void main(String[] args) {
        System.out.println("result of division: "+findQuotient(26,4));
    }
}
