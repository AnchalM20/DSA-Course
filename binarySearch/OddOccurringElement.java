package com.binarySearch;

public class OddOccurringElement {
    static int findOddOccurIndex(int[] arr)
    {
        int n=arr.length;
        int ans=-1;
        int s=0;
        int e= arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            //check mid is even or Odd
            if((mid&1)==0)  //Even
            {
                if((mid+1<n)&&arr[mid+1]==arr[mid])
                {
                    //right
                    s=mid+2;
                }
                else if ((mid-1>=0)&&arr[mid-1]==arr[mid])
                {
                    //left
                    e=mid-2;
                }
                else
                {
                    ans=mid;
                    return ans;
                }
            }
            else    //Odd mid
            {
                if((mid+1<n)&&arr[mid+1]==arr[mid])
                {
                    //right
                    s=mid+1;
                }
                else if ((mid-1>=0)&&arr[mid-1]==arr[mid])
                {
                    //left
                    e=mid-1;
                }
                else
                {
                    ans=mid;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //         0 1 2 3 4 5 6 7 8 9 10 11 12  index
        int[] arr={1,1,5,5,2,2,6,6,3,3, 2, 6, 6};
        System.out.println("Odd occurred element is: "+arr[findOddOccurIndex(arr)]);
    }
}
