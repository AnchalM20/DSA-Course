package com.array;

import java.util.Arrays;

public class BookAllocation {
    static boolean isPossibleCase(int[] A,int M,int N,int sol)
    {
        int pageSum=0;
        int c=1; //keeps count of student with allocation
        for(int i=0;i<N;i++)
        {
            if(A[i]>sol)
                return false;
            if(pageSum+A[i]>sol)
            {
                c++; //allocated to one student
                pageSum=A[i];
                //check is count of Student greater than Number of Student
                if(c>M)
                    return false;
            }
            else
            {
                pageSum+=A[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] A={12,34,67,90};
        int M=2;
        int N=4;
        //Your code here
//        if(M>N)
//            return -1;

        int start=0;
        int end=Arrays.stream(A).sum();
        int ans=-1;
        System.out.println(end);
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            System.out.println(mid);
            if(isPossibleCase(A,M,N,mid))
            {
                //store the answer and go to left
                ans=mid;
                end=mid-1;
            }
            else
            {
                //goto right
                start=mid+1;

            }
        }
        System.out.println(ans);

    }
}
