package com.Patterns;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
