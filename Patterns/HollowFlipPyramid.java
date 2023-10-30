package com.Patterns;

import java.util.Scanner;

public class HollowFlipPyramid {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=n-1-i;j>0;j--)
            {
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++)
            {
                if(j==0||j==2*i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*n-2*i-1;j++)
            {
                if(j==0||j==2*n-2*i-2)
                System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }




    }
}

