package com.array.bitwise;

import java.util.Scanner;

public class BitwisePrograms {

    //function to find binary of a number
    static void bin(int n)
    {
        if(n>0)
            bin(n>>1); //n>>1 means dividing number n by 2
        System.out.print(n%2);
    }

    //Swapping of two number using Bitwise XOR
    static void bitwiseSwap(int a,int b)
    {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("\nAfter swapping: ");
        System.out.print("a: "+a +"\t"+" b: "+b);
    }
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(~a);
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //To check for even-odd
//        if((n&1)==0)
//            System.out.println("Even");
//        else
//            System.out.println("Odd");
//        bin(n);
//
//        int a=10;
//        int b=23;
//        bitwiseSwap(a,b);
        int []a,h,v;

        int[] b;
        int[] c;
        int[]d;


        System.out.println("Number is: "+n);
        bin(n);
        int pos=2;
        int mask = ~(1<<pos);  //to find mask
        System.out.println("\nMask is: "+mask);
        bin(mask);
        int res = n&mask;  //clear ith bit
        System.out.println("\nAfter clearing ith bit is: "+res);
        bin(res);

        
        //System.out.println("result: "+a);

    }
}
