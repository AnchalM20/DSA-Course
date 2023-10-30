package com.Patterns;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        int n = row / 2;
        for (int i = 0; i < n; i++) {
            //pyramid1
            for (int j = 0; j < n - i; j++)
                System.out.print("*");
            //spaces between pyramid
            for (int j = 0; j < 2 * i; j++)
                System.out.print(" ");
            //pyramid2
            for (int j = 0; j < n - i; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {

                //pyramid1
                for (int j = 0; j<=i; j++)
                    System.out.print("*");
                //spaces between pyramid
                for (int j = 0; j < 2*n -2*i-2; j++)
                    System.out.print(" ");
                //pyramid2
                for (int j = 0; j <=i; j++)
                    System.out.print("*");
                System.out.println();
        }
    }
}
