package com.Patterns;

import java.util.Scanner;

public class StarNumber1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
//            for(int j=0;j<2*i+1;j++)
//            {
//                if(j%2==0)
//                    System.out.print(i+1);
//                else
//                    System.out.print("*");
//            }
            for(int j=0;j<=i;j++)
            {
                if(j==i)
                System.out.print(i+1);
                else
                    System.out.print(i+1+"*");
            }

            System.out.println();
        }
        n=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(j==n-i-1)
                    System.out.print(n-i);
                else
                    System.out.print(n-i+"*");
            }
            System.out.println();
        }
    }
}
