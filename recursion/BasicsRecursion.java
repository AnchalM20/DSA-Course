package com.recursion;

import java.util.ArrayList;

public class BasicsRecursion {

    //To find minimum element from an Array
    public static int findMin(int[] arr, int n, int index) {
        if (index >= n) {
            return Integer.MAX_VALUE;
        }
        int minInRest = findMin(arr, n, index + 1);
        return Math.min(minInRest, arr[index]);
    }

    //To find even number from an array
    static void solve(int[] arr,int n,int index,ArrayList<Integer> ans)
    {
        //index greater than size of the array
        if(index>=n)
            return ;
        if(arr[index]%2==0)
            ans.add(arr[index]);

        solve(arr,n,index+1,ans);
    }


    //find all occurrence of target
    static void findOccur(int[] arr,int n,int index,int target)
    {
        if(index>=n)
            return;
        if(arr[index]==target)
            System.out.println(index);
        findOccur(arr,n,index+1,target);
    }

    //print digit of a number
    //if we call recursion after print statement then it will print in reverse order
    static void printDigit(int n)
    {
        if(n==0)
            return;
        int rem=n%10;

        n=n/10;
        printDigit(n);
        System.out.print(rem+" ");

    }

    //Check whether array is sorted or not
    static boolean checkSorted(int[] arr,int n,int index)
    {
        //base condition
        if(index>=n)
            return true;
        //compare current with previous element
       if(arr[index]>arr[index-1])
       {
           //continue checking
           boolean checkAns=checkSorted(arr,n,index+1);
           return checkAns;
       }
       else {
           return false;  //not sorted order
       }
    }

    public static void main(String[] args) {
        int[] arr={1,7,3,4,6,8,7,2,34,7};
//        ArrayList<Integer> ans = new ArrayList<>();
//        solve(arr, arr.length,0,ans);
//        System.out.println(ans);

        int min =findMin(arr,arr.length,0);
        System.out.println(min);

//        findOccur(arr,arr.length,0,7);
//        printDigit(123);

        //Check sorted array
        int[] ar = {34,56,78,98,704};
        boolean isSorted=checkSorted(ar,ar.length,1);
        if (isSorted)
            System.out.println("Sorted");
        else
            System.out.println("Unsorted");


    }
}
