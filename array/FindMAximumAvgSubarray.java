package com.array;
//Leetcode:643
public class FindMAximumAvgSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double MaxSum=0;
        int i=0;
        int j=k-1;
        double sum=0;
        for(int a=0;a<k;a++)
        {
            sum+=nums[a];
        }
        MaxSum=sum;
        j++;
        while(j<nums.length)
        {
            sum-=nums[i++];
            sum+=nums[j++];
            if(MaxSum<sum)
                MaxSum=sum;
        }
        double maxAvg = MaxSum/k;
        return maxAvg;
    }

    public static void main(String[] args) {
//        Input: nums = [1,12,-5,-6,50,3], k = 4
//        Output: 12.75000
        int nums[]={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));

    }
}
