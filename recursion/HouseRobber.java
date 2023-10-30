package com.recursion;

public class HouseRobber {
    static int totalMoney(int[] nums,int start,int end)
    {
        //out of bound
        if(start>end)
            return 0;

        int opt1=nums[start]+totalMoney(nums,start+2,end);
        int opt2=totalMoney(nums,start+1,end);

        int ans=Math.max(opt1,opt2);
        return ans;


    }
    public int rob(int[] nums) {
        int ans=totalMoney(nums,0,nums.length-1);
        return ans;
    }
}

                //House Robber II
                //Circular House
//static int totalMoney(int[] nums,int start,int end)
//{
//    //out of bound
//    if(start>end)
//        return 0;
//
//    int opt1=nums[start]+totalMoney(nums,start+2,end);
//    int opt2=totalMoney(nums,start+1,end);
//
//    int ans=Math.max(opt1,opt2);
//    return ans;
//
//
//}
//    public int rob(int[] nums) {
//        int ans=totalMoney(nums,0,nums.length-1);
//        return ans;
//    }