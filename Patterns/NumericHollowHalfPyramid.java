package com.Patterns;

import java.util.Scanner;

public class NumericHollowHalfPyramid {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                if(j==0||i==n-1||i==j)
//                    System.out.print(j+1);
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
        //Inverted Hollow half
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(i==0 || j==i+1||j==n)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
