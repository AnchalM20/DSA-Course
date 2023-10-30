package com.recursion;

//Problem: A Derangement is a permutation of n elements, such that no element appears in its original position.
//        For example, a derangement of {0, 1, 2, 3} is {2, 3, 1, 0}.
//        Given a number n, find the total number of Derangements of a set of n elements.

public class DearrangementCount {
    static int countDeArrangement(int n)
    {
        //for one element
        if(n==1)
            return 0;
        if(n==2)
            return 1;

        int ans=(n-1)*(countDeArrangement(n-1)+countDeArrangement(n-2));

        return ans;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(countDeArrangement(n));
    }
}
