package com.recursion;
//Given an integer N denoting the Length of a line segment.
//You need to cut the line segment in such a way that the cut length of a
//line segment each time is either x , y or z. Here x, y, and z are integers.
// After performing all the cut operations, your total number of cut segments must be maximum.
// Note: if no segment can be cut then return 0.
// Example 1:
// Input:
// N = 4
// x = 2, y = 1, z = 1
// Output: 4

public class MAximizeCutSegment {
    public int maximizeCuts(int n, int x, int y, int z)
    {
        //Your code here
        //if rod size is 0
        if(n==0)
        {
            return 0;
        }

        //if negative value
        if(n<0)
        {
            return Integer.MIN_VALUE;
        }

        int xSegment=1+maximizeCuts(n-x,x,y,z);

        int ySegment=1+maximizeCuts(n-y,x,y,z);

        int zSegment=1+maximizeCuts(n-z,x,y,z);

        int ans=Math.max(xSegment,ySegment);

        ans=Math.max(ans,zSegment);

        return ans;
    }
}
