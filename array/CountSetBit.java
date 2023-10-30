package com.array;

import java.util.Scanner;

public class CountSetBit {
    public static void main(String[] args) {

        //Method1 first find binary and count 1 bit
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        while(n!=0)
        {
            int bit=n%2;
            if(bit==1)
                count++;
            n=n/2;

        }
        System.out.println("Total SetBit: "+count);

        //Method2 using shift operator (>>)
        n=85;
        int countBit=0;
        while(n!=0)
        {
            if((n&1)==1)
                countBit++;
            n=n>>1;
            System.out.println("CountBit: "+countBit+" "+"n&1: "+(n&1)+" "+"n: "+n);
        }
        System.out.println("Total bits using Method-2: "+countBit);

        //Method-3 n&(n-1)
    }
}
