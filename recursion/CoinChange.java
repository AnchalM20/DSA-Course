package com.recursion;

//You are given an integer array coins representing coins of different denominations
//and an integer amount representing a total amount of money.
//Return the fewest number of coins that you need to make up that amount.
//If that amount of money cannot be made up by any combination of the coins, return -1.

public class CoinChange {

    //for 3 fixed coin
    static int findMinimumCoin1(int amount,int c1,int c2,int c3)
    {
        //when amount is zero
        if(amount==0)
            return 0;
        int ans=Integer.MAX_VALUE;
        int mini=Integer.MAX_VALUE;
        if(c1<=amount && c2<=amount && c3<=amount) {
            int opt1 = 1 + findMinimumCoin1(amount - c1, c1, c2, c3);
            int opt2 = 1 + findMinimumCoin1(amount - c2, c1, c2, c3);
            int opt3 = 1 + findMinimumCoin1(amount - c3, c1, c2, c3);
            mini = Math.min(opt3, Math.min(opt1, opt2));
        }
        return mini;
    }

    static int findMinimumCoin(int[] coins,int amount)
    {
        //when amount is zero
        if(amount==0)
            return 0;
        int ans=Integer.MAX_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
            int coin=coins[i];
            //coin value always less or equal to Amount
            if(coin<=amount)
            {
                int recAns=findMinimumCoin(coins,amount-coin);
                if(recAns!=Integer.MAX_VALUE)
                    ans=1+recAns;
            }
            mini=Math.min(ans,mini);
        }
        return mini;
    }

    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=23;
        System.out.println(findMinimumCoin1(amount,1,2,5));
    }
}
