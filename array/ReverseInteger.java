package com.array;

public class ReverseInteger {
    class Solution {
        public int reverse(int x)
        {
            int ans=0;
            boolean isNegative=false;

            if(x<=Integer.MIN_VALUE)
                return 0;

            if(x<0)
            {
                isNegative = true;
                x=-x;
            }

            while(x>0)
            {
                if(ans>(Integer.MAX_VALUE/10))
                    return 0;
                int rem=x%10;
                ans=rem+ans*10;
                x=x/10;
            }
            return isNegative?-ans:ans;

        }
    }
}
