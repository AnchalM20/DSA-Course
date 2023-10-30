package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimesBetweenLandR {
    static boolean[] Sieve(int n)
    {
        //Create a sieve array of a size telling isPrime
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0]=primes[1]=false;
        for (int i=2;i<n;i++)
        {
            if(primes[i]==true)
            {
                //Optimisation 1:first unmarked number would be i*i,
                //as others have been marked by 2 to (i-1)
                int j=i*i;

                while(j<n)
                {
                    primes[j]=false;
                    j+=i;
                }
            }
        }
        return primes;
    }

    static boolean[] segSieve(int L,int R)
    {
    //get me prime array.I will use it to mark seg sieve.
        boolean[] sieve=Sieve((int) Math.sqrt(R));
//        System.out.println("Sieve "+sieve[0]+" "+sieve[1]+" "+sieve[2]);
        int[] basePrimes=new int[sieve.length];
        ArrayList<Integer> arr=new ArrayList<>();
        int indx=0;
        for(int i=0;i<sieve.length;i++)
        {
            if(sieve[i])
            {
                arr.add(i);
                basePrimes[indx]=i;
                System.out.println(basePrimes[indx]);
                indx++;
            }
        }
        boolean[] segSieves=new boolean[R-L+1];
        Arrays.fill(segSieves,true);
        if(L==1||L==0)
        {
            segSieves[L]=false;
        }
//        System.out.println(basePrimes[0]+" "+basePrimes[1]);
         for(int prime:arr)
         {
             //System.out.println(prime);
             int first_multi=(L/prime)*prime;
             if(first_multi<L)
             {
                 first_multi+=prime;
             }
             int j=Math.max(first_multi,prime*prime);
             while (j<=R)
             {
                 segSieves[j-L]=false;
                 j+=prime;
             }

         }
         return segSieves;

    }

    public static void main(String[] args) {
        int L=110;
        int R=130;
        boolean[] segSieve=segSieve(110,130);

        for (int i=0;i<segSieve.length;i++)
        {
            if (segSieve[i])
            System.out.println(i+L);
        }
    }

}
