package com.array;

//The pivot index is the index where the sum of all the numbers
//strictly to the left of the index is equal to the sum of
//all the numbers strictly to the index's right.

public class PivotIndex {

    //BruteForce Approach : O(n^2)
    public static int findPivotIndex(int arr[])
    {
        int Lsum,Rsum;
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            Lsum=0;
            Rsum=0;

            //sum of Left element excluding current
            for(int j=0;j<i;j++)
                Lsum+=arr[j];

            //sum of Right element excluding current
            for (int j=i+1;j<n;j++)
                Rsum+=arr[j];

            if(Lsum==Rsum)
                return i;
            i++;

        }
        return -1;

    }

    //Using two Array Lsum[] and Rsum[] and then check for same value in both
    //Time complexity: O(n)
    static int findPivotIndex2(int[] arr)
    {
    int n=arr.length;
    int[] Lsum = new int[n];
    int[] Rsum=new int[n];

    //To store left sum of ith index
     for(int i=1;i<n;i++)
     {
         Lsum[i]=Lsum[i-1]+arr[i-1];
     }

     //To store Right sum of ith index
        for(int i=n-2;i>=0;i--)
        {
            Rsum[i]=Rsum[i+1]+arr[i+1];
        }

        //Compare elements of Lsum and Rsum
        for(int i=0;i<n;i++)
        {
            if(Lsum[i]==Rsum[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        System.out.println("Pivot Index: "+findPivotIndex(arr));
        System.out.println("Pivot Index: "+findPivotIndex2(arr));
    }
}
