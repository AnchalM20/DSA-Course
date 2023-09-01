package com.Patterns;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int n1=n/2;
        for(int row=0;row<n1;row++)
        {
            //inverted * Pyramid 1
            for(int j=0;j<n1-row;j++)
                System.out.print("*");
            //full space pyramid
            for(int j=0;j<2*row-1;j++)
                System.out.print(" ");

            //inverted * Pyramid 2
            for(int j=0;j<n1-row;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
