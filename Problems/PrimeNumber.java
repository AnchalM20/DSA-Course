package com.Problems;

import java.util.Arrays;

public class PrimeNumber {

    //using sqrt approach
    static boolean isPrime(int n)
    {
        //for 0 and 1 which is non-prime
        if(n<=1)
            return false;
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    static int countPrime(int n)
    {
        int count=0;
        for (int i=1;i<n;i++)
        {
            if(isPrime(i))
                count++;
        }
        return count;
    }
    static int sieveOfEratothenes(int n)
    {
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true); //assume all numbers from 0 to n-1 are prime
        arr[0]=arr[1]=false; //0 and 1 are non-prime number
        int ans=0;
        for(int i=2;i<n;i++)  //starting loop from 2 to n-1
        {
            if(arr[i])   //if true i.e. prime then increment answer by one
                ans++;
            int j=2*i;
            while (j<n)
            {
                arr[j]=false;  //assign all multiples of a prime number to non-prime
                j+=i;
            }
        }
        return ans;
    }


    //Optimized sieveOf Eratothenes
    //Optimization 1:
    static long primeProduct(long L, long R){
        int n= (int) (R-L);
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true); //assume all numbers from 0 to n-1 are prime
        arr[0]=arr[1]=false; //0 and 1 are non-prime number
        long ans=1;
        for(int i = (int) (L+1); i<R-1; i++)  //starting loop from 2 to n-1
        {
            if(arr[i])   //if true i.e. prime then increment answer by one
            {
                ans=ans*i;
                System.out.println(ans);
            }
            int j=2*i;
            while (j<n)
            {
                arr[j]=false;  //assign all multiples of a prime number to non-prime
                j+=i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=10;
//        int ans=sieveOfEratothenes(n);
//        System.out.println(ans);
//        int count=countPrime(n);
//        System.out.println(count);
        long a=1;
        long b=30;
        primeProduct(a,b);
    }
}
