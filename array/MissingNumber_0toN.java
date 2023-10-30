package com.array;
import java.util.*;
//missing number in an array of range [0,n]
public class MissingNumber_0toN {
    public static int missingNumber(int[] nums) {
        //Time complexity: O(n)
        int n=nums.length;
        // int totalSum=(n*(n+1))/2;
        // int arrSum=0;
        // for(int i=0;i<n;i++)
        //     arrSum+=nums[i];
        // return totalSum-arrSum;

               //OR

        //Time Complexity:O(nlog(N))+O(n)=O(nlog(n))
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length;i++)
//        {
//            if(i!=nums[i])
//            {
//                return i;
//            }
//            if(i==nums.length-1)
//            {
//                return nums.length;
//            }
//
//        }
//        return -1;

        //Method:3  using XOR
        int xorResult=0;
        for(int i=0;i<n;i++)
        {
            xorResult^=nums[i];  //XOR of all elements
        }
        for(int i=0;i<=n;i++)
        {
            xorResult^=i;     //XOR of all index
        }
        return xorResult;

    }

    public static void main(String[] args) {
        int[] arr={3,4,0,1,2};
        System.out.println(missingNumber(arr));
    }
}


