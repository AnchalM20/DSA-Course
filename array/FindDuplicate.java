package com.array;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and uses only constant extra space.

import java.util.Arrays;

public class FindDuplicate {
//    Method:1
    static int findDuplicateNumber(int[] nums)
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
    }

//    Method:2
    static int findDuplicateNumber2(int[] nums)
    {
        int ans=-1;
        for(int i=0;i<nums.length;i++)
        {
            int index = Math.abs(nums[i]);

            //check for already -ve marking
            if(nums[index]<0)
            {
                ans=index;
                break;
            }

            //visited mark
            nums[index]*=-1;
        }
        return ans;
    }

    //Method:3
    static int findDuplicateNumber3(int[] arr)
    {
        while (arr[0]!=arr[arr[0]])
        {
            int temp=arr[0];
            arr[0]=arr[arr[0]];
            arr[arr[0]]=temp;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
//        System.out.println("Method1: "+ findDuplicateNumber(arr));
//        System.out.println("Method2: "+findDuplicateNumber2(arr));
        int[] arr1={3,1,3,4,2};
        int ans=findDuplicateNumber3(arr1);
        System.out.println("Method3: "+ans);
    }
}
