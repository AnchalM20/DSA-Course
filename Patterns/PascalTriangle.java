package com.Patterns;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int C=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(C+" ");
                C=C*(i-j)/j;
            }
            System.out.println();
        }
    }
}
